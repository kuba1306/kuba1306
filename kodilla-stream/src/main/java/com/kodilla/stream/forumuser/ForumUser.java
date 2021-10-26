package com.kodilla.stream.forumuser;

public final class ForumUser {

    private final int id;
    private final String name;
    private final char gender;
    private final int age;
    private final int postsNumber;

    public ForumUser(final int id, final String name, final char gender, final int age, final int postsNumber) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.postsNumber = postsNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
