package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User stevenMillenials = new Millenials("The oldest user");
        User johnYGeneration = new YGeneration("middle age user");
        User markZGeneration = new ZGeneration("the youngest user");

        //When
        String millenialsUse = stevenMillenials.sharePost();
        System.out.println("steven use: " + millenialsUse);
        String yGenarationUse = johnYGeneration.sharePost();
        System.out.println("John use: " + yGenarationUse);
        String zGenerationUse = markZGeneration.sharePost();
        System.out.println("mark use " + zGenerationUse);

        //Then
        assertEquals("Facebook", millenialsUse );
        assertEquals("Twitter", yGenarationUse);
        assertEquals("Snapchat", zGenerationUse);
    }

    @Test
    void testIndividualSharingStrategies() {
        //Given
        User arnold2000 = new Millenials("Arnold Millenials");

        //When
        String arnoldUse = arnold2000.sharePost();
        System.out.println("Arnold use: " + arnoldUse);
        arnold2000.setSocialPublisher(new SnapchatPublisher());
        arnoldUse = arnold2000.sharePost();
        System.out.println("Arnold change social media and now use: " + arnoldUse);

        //Then
        assertEquals("Snapchat", arnoldUse);
    }
}
