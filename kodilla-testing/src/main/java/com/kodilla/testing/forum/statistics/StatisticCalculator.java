package com.kodilla.testing.forum.statistics;

public class StatisticCalculator {

    private int postQuantity;
    private int commentsQuantity;
    private int usersListQuantity;
    private double averagePostsNumberPerUser;
    private double averageCommentsNumberPerUser;
    private double averageCommentsNumberPerPost;


    public int getPostQuantity() {
        return postQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public int getUsersListQuantity() {
        return usersListQuantity;
    }

    public double getAveragePostsNumberPerUser() {
        return averagePostsNumberPerUser;
    }

    public double getAverageCommentsNumberPerUser() {
        return averageCommentsNumberPerUser;
    }

    public double getAverageCommentsNumberPerPost() {
        return averageCommentsNumberPerPost;
    }


    public void calculateAdvStatistics(Statistics statistics) {
        usersListQuantity = statistics.usersNames().size();
        postQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();

        if (usersListQuantity == 0) {
            averageCommentsNumberPerUser = 0.0;
            averagePostsNumberPerUser = 0.0;
        } else {
                averagePostsNumberPerUser = (double) postQuantity / (double) usersListQuantity;
                averageCommentsNumberPerUser = (double) commentsQuantity / (double) usersListQuantity;
        }
        if (postQuantity == 0) {
            averageCommentsNumberPerPost = 0.0;
        } else {
            averageCommentsNumberPerPost = (double) commentsQuantity / (double) postQuantity;
        }
    }

    public void showStatistics() {
        System.out.println("Users quantity = " + usersListQuantity);
        System.out.println("post quantity = " + postQuantity);
        System.out.println("comments quantity = " + commentsQuantity);
        System.out.println("average posts number per user = " + averagePostsNumberPerUser);
        System.out.println("average comments number per user = " + averageCommentsNumberPerUser);
        System.out.println("average comments number per post = " + averageCommentsNumberPerPost);
    }

}
