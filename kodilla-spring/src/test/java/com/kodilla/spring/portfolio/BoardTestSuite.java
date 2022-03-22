package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.doneList.addTask("zrobione");
        board.inProgressList.addTask("w trakcie roboty");
        board.toDoList.addTask("do wykonania");
        //Then
        board.doneList.showTasks();
        board.inProgressList.showTasks();
        board.toDoList.showTasks();
    }
}