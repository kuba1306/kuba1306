package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;


@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LIST_NAME = "first List";
    private static final String DESCRIPTION = "Test: Learn Hibernate";



    @Test
    void testFindByListName() {

        //Given
        TaskList newTaskList = new TaskList(LIST_NAME, DESCRIPTION);
        taskListDao.save(newTaskList);
        String listName = newTaskList.getListName();

        //When
        List<TaskList> expectedTaskList = taskListDao.findByListName(listName);

        //Then
        assertEquals(1,expectedTaskList.size());

        //CleanUp
        taskListDao.deleteAll();
    }
}





