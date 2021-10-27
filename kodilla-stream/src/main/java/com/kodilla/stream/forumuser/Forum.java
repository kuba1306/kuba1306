package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1, "Alex", 'm', LocalDate.of(1999,12,15) , 15));
        theForumUserList.add(new ForumUser(2,"Arek",'m', LocalDate.of(2008,10,12), 65));
        theForumUserList.add(new ForumUser(3,"Max",'m', LocalDate.of(1977,4,18),33));
        theForumUserList.add(new ForumUser(4,"Dawid",'m',LocalDate.of(1949, 1,1),56));
        theForumUserList.add(new ForumUser(5,"Wojtek",'m',LocalDate.of(2012,9,19), 0));
        theForumUserList.add(new ForumUser(6,"Ania",'k',LocalDate.of(1988, 2, 28), 31));
        theForumUserList.add(new ForumUser(7,"Basia",'k',LocalDate.of(2005,12, 30),  88));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUserList);
    }
}
