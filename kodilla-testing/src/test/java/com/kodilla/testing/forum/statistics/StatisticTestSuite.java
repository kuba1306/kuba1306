package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.library.Book;
import com.kodilla.testing.library.BookLibrary;
import com.kodilla.testing.library.LibraryDatabase;
import com.kodilla.testing.library.LibraryUser;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class StatisticTestSuite {

    private StatisticCalculator statisticCalculator;

    private static int testCounter = 0;

    private List<String> generateListOfUsers (int numberOfUsers) {
        List<String> listOfUsers = new ArrayList<>();
        for (int n = 1; n <= numberOfUsers; n++) {
            listOfUsers.add("User" + n);
        }
        return listOfUsers;
    }


    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    public void beforeEveryTest() {
        statisticCalculator = new StatisticCalculator();
        testCounter++;
        System.out.println("");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Preparing to execute test #" + testCounter);
        statisticCalculator.showStatistics();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("");
    }

    @Nested
    @DisplayName("Tests for 6.7 Kodilla Statistics additional exercise")
    class allTests {

        @DisplayName("calculateAdvStatisticsWith0Posts")
        @Test
        void calculateAdvStatisticsWith0Posts() {
            //Given
            List<String> listOfUsers = generateListOfUsers(12);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(0);

            //When
            statisticCalculator.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(12, statisticCalculator.getUsersListQuantity());
            assertEquals(0, statisticCalculator.getPostQuantity());
            assertEquals(0, statisticCalculator.getCommentsQuantity());
            assertEquals(0.0, statisticCalculator.getAveragePostsNumberPerUser());
            assertEquals(0.0, statisticCalculator.getAverageCommentsNumberPerUser());
            assertEquals(0.0, statisticCalculator.getAverageCommentsNumberPerPost());
        }

        @DisplayName("calculateAdvStatisticsWith1000Posts")
        @Test
        void calculateAdvStatisticsWith1000Posts() {
            //Given
            List<String> listOfUsers = generateListOfUsers(100);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(2000);

            //When
            statisticCalculator.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(100, statisticCalculator.getUsersListQuantity());
            assertEquals(1000, statisticCalculator.getPostQuantity());
            assertEquals(2000, statisticCalculator.getCommentsQuantity());
            assertEquals(10.0, statisticCalculator.getAveragePostsNumberPerUser());
            assertEquals(20.0, statisticCalculator.getAverageCommentsNumberPerUser());
            assertEquals(2.0, statisticCalculator.getAverageCommentsNumberPerPost());
        }

        @DisplayName("calculateAdvStatisticsWith0Comments")
        @Test
        void calculateAdvStatisticsWith0Comments() {
            //Given
            List<String> listOfUsers = generateListOfUsers(1);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(10);
            when(statisticsMock.commentsCount()).thenReturn(0);

            //When
            statisticCalculator.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(1, statisticCalculator.getUsersListQuantity());
            assertEquals(10, statisticCalculator.getPostQuantity());
            assertEquals(0, statisticCalculator.getCommentsQuantity());
            assertEquals(10.0, statisticCalculator.getAveragePostsNumberPerUser());
            assertEquals(0.0, statisticCalculator.getAverageCommentsNumberPerUser());
            assertEquals(0.0, statisticCalculator.getAverageCommentsNumberPerPost());
        }

        @DisplayName("calculateAdvStatisticsWithLessCommentsThanPosts")
        @Test
        void calculateAdvStatisticsWithLessCommentsThanPosts() {
            //Given
            List<String> listOfUsers = generateListOfUsers(10);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(10);
            when(statisticsMock.commentsCount()).thenReturn(5);

            //When
            statisticCalculator.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(10, statisticCalculator.getUsersListQuantity());
            assertEquals(10, statisticCalculator.getPostQuantity());
            assertEquals(5, statisticCalculator.getCommentsQuantity());
            assertEquals(1.0, statisticCalculator.getAveragePostsNumberPerUser());
            assertEquals(0.5, statisticCalculator.getAverageCommentsNumberPerUser());
            assertEquals(0.5, statisticCalculator.getAverageCommentsNumberPerPost());
        }

        @DisplayName("calculateAdvStatisticsWithMoreCommentsThanPosts")
        @Test
        void calculateAdvStatisticsWithMoreCommentsThanPosts() {
            //Given
            List<String> listOfUsers = generateListOfUsers(10);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(20);
            when(statisticsMock.commentsCount()).thenReturn(100);

            //When
            statisticCalculator.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(10, statisticCalculator.getUsersListQuantity());
            assertEquals(20, statisticCalculator.getPostQuantity());
            assertEquals(100, statisticCalculator.getCommentsQuantity());
            assertEquals(2.0, statisticCalculator.getAveragePostsNumberPerUser());
            assertEquals(10.0, statisticCalculator.getAverageCommentsNumberPerUser());
            assertEquals(5.0, statisticCalculator.getAverageCommentsNumberPerPost());
        }

        @DisplayName("calculateAdvStatisticsWithoutUsers")
        @Test
        void calculateAdvStatisticsWithoutUsers() {
            //Given
            List<String> listOfUsers = generateListOfUsers(0);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(0);

            //When
            statisticCalculator.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(0, statisticCalculator.getUsersListQuantity());
            assertEquals(0, statisticCalculator.getPostQuantity());
            assertEquals(0, statisticCalculator.getCommentsQuantity());
            assertEquals(0.0, statisticCalculator.getAveragePostsNumberPerUser());
            assertEquals(0.0, statisticCalculator.getAverageCommentsNumberPerUser());
            assertEquals(0.0, statisticCalculator.getAverageCommentsNumberPerPost());
        }

        @DisplayName("calculateAdvStatisticsWithOneHundred")
        @Test
        void calculateAdvStatisticsWithOneHundred() {
            //Given
            List<String> listOfUsers = generateListOfUsers(100);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(500);
            when(statisticsMock.commentsCount()).thenReturn(1000);

            //When
            statisticCalculator.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(100, statisticCalculator.getUsersListQuantity());
            assertEquals(500, statisticCalculator.getPostQuantity());
            assertEquals(1000, statisticCalculator.getCommentsQuantity());
            assertEquals(5.0, statisticCalculator.getAveragePostsNumberPerUser());
            assertEquals(10.0, statisticCalculator.getAverageCommentsNumberPerUser());
            assertEquals(2.0, statisticCalculator.getAverageCommentsNumberPerPost());
        }
    }
}


