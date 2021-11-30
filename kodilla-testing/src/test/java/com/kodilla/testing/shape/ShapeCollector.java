package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: Shape Test Suite")
public class ShapeCollector {
    private static int testCounter = 0;


    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for Square")
    class TestForSquare {

        @Test
        void testAddNewSquare() {
            //Given
            List<Shape> shapeCollection = new ArrayList<Shape>();

            //When
            shapeCollection.add(new Square("square1", 7));

            //Then
            Assertions.assertEquals(1, shapeCollection.size());
        }

        @Test
        void TestRemoveSquare() {
            //Given
            List<Shape> shapeCollection = new ArrayList<Shape>();
            shapeCollection.add(new Square("square1", 7));

            //When
            shapeCollection.remove(0);

            //Then
            Assertions.assertEquals(0, shapeCollection.size());

        }

        @Test
        void getSquareField() {
            //Given
            Square square2 = new Square("squere2", 7);

            //When
            square2.getField();
            double expected = square2.squareSide * square2.squareSide;

            //Then
            Assertions.assertEquals(expected, square2.getField());

        }

        @Test
        void getSquareName() {
            //Given
            Square square2 = new Square("squere2", 7);

            //When
            square2.getShapeName();

            //Then
            Assertions.assertEquals(square2.name, square2.getShapeName());

        }
    }

    @Nested
    @DisplayName("Tests for Circle")
    class TestForCircle {

        @Test
        void testAddNewCircle() {
            //Given
            List<Shape> shapeCollection = new ArrayList<Shape>();

            //When
            shapeCollection.add(new Circle("circle1", 7));

            //Then
            Assertions.assertEquals(1, shapeCollection.size());

        }

        @Test
        void TestRemoveCircle() {
            //Given
            List<Shape> shapeCollection = new ArrayList<Shape>();
            shapeCollection.add(new Circle("circle1", 7));

            //When
            shapeCollection.remove(0);

            //Then
            Assertions.assertEquals(0, shapeCollection.size());

        }

        @Test
        void getCircleField() {
            //Given
            Circle circle5 = new Circle("circle5", 8);

            //When
            circle5.getField();
            double expected = 3.14 * circle5.radius * circle5.radius;

            //Then
            Assertions.assertEquals(expected, circle5.getField());

        }

        @Test
        void getCircleName() {
            //Given
            Circle circle5 = new Circle("circle5", 8);

            //When
            circle5.getShapeName();

            //Then
            Assertions.assertEquals(circle5.name, circle5.getShapeName());

        }
    }

    @Nested
    @DisplayName("Tests for Triangle")
    class TestTriangle {

        @Test
        void testAddNewTriangle() {
            //Given
            List<Shape> shapeCollection = new ArrayList<Shape>();

            //When
            shapeCollection.add(new Triangle("triangle1", 7, 9));

            //Then
            Assertions.assertEquals(1, shapeCollection.size());

        }

        @Test
        void TestRemoveTriangle() {
            //Given
            List<Shape> shapeCollection = new ArrayList<Shape>();
            shapeCollection.add(new Triangle("triangle1", 7, 9));

            //When
            shapeCollection.remove(0);

            //Then
            Assertions.assertEquals(0, shapeCollection.size());
        }

        @Test
        void getTriangleField() {
            //Given
            Triangle triangle2 = new Triangle("triangle", 5, 5);

            //When
            triangle2.getField();

            //Then
            Assertions.assertEquals(12.5, triangle2.getField());

        }

        @Test
        void getTriangleName() {
            //Given
            Triangle triangle2 = new Triangle("triangle", 5, 5);

            //When
            triangle2.getShapeName();

            //Then
            Assertions.assertEquals(triangle2.name, triangle2.getShapeName());

        }
    }
}
