package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum theForum = new Forum();


        Map<Integer, ForumUser> theResultMapOfForumUsers = theForum.getList().stream()
                .filter(user -> user.getGender() == 'm')
                .filter(user -> Period.between(user.getDateOfBirth(), LocalDate.now()).getYears() >= 20)
                .filter(user -> user.getPostsNumber() > 0)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));


        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}