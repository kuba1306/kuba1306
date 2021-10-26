package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1,"Adam",'m', 7, 7));
        theForumUserList.add(new ForumUser(2,"Arek",'m' , 18, 12));
        theForumUserList.add(new ForumUser(3,"Max",'m', 20, 333));
        theForumUserList.add(new ForumUser(4,"Dawid",'m',12, 56));
        theForumUserList.add(new ForumUser(5,"Wojtek",'m',44, 79));
        theForumUserList.add(new ForumUser(6,"Ania",'k',88, 2));
        theForumUserList.add(new ForumUser(7,"Basia",'k',34, 18));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUserList);
    }
}
