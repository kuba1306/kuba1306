package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfForumUsers = theForum.getList().stream()
                .filter(user -> user.getGender() == 'm')
                .filter(user -> user.getDateOfBirth().getYear() <= 2003)
                .filter(user -> user.getPostsNumber() > 0)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));


        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}