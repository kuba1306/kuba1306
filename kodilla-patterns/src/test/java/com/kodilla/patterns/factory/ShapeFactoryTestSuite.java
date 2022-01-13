package com.kodilla.patterns.factory;

import com.kodilla.patterns.factory.tasks.DrivingTask;
import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.setTask(TaskFactory.DrivingTask);
        //Then
        assertEquals("Next holidays", drivingTask.getTaskName());
    }

    @Test
    void testFactoryPaitingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.setTask(TaskFactory.PaintingTask);
        //Then
        assertEquals("Paint your living room", paintingTask.getTaskName());
    }


    @Test
    void testFactoryShopingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopingTask = factory.setTask(TaskFactory.ShoppingTask);
        //Then
        assertEquals("Shooping in grocer", shopingTask.getTaskName());
    }
}