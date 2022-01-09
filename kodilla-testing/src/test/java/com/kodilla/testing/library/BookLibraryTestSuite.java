package com.kodilla.testing.library;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookLibraryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Titlle " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Nested
    @DisplayName("Tests for 6.7 Kodilla")
    class testListBooksInHansOf {

        @Test
        @DisplayName("Test 0 books")
        void testListBooksInHandsOf0Books() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListNoBooks = generateListOfNBooks(0);
            LibraryUser userWithNoBooks = new LibraryUser("Adam", "Adamiak", "87061905620");
            when(libraryDatabaseMock.listBooksInHandsOf(userWithNoBooks)).thenReturn(resultListNoBooks);
            //When
            List<Book> testListOfNoBooks = bookLibrary.listBooksInHandsOf(userWithNoBooks);
            //Then
            assertEquals(0, testListOfNoBooks.size());
        }

        @Test
        @DisplayName("Test 1 book")
        void testListBooksInHandsOfOneBook() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOneBook = generateListOfNBooks(1);
            LibraryUser userWithOneBook = new LibraryUser("Michał", "Nowak", "650107220");
            when(libraryDatabaseMock.listBooksInHandsOf(userWithOneBook)).thenReturn(resultListOneBook);
            //When
            List<Book> testListOfOneBook = bookLibrary.listBooksInHandsOf(userWithOneBook);
            //Then
            assertEquals(1, testListOfOneBook.size());
        }

        @Test
        @DisplayName("Test 5 books")
        void testListBooksInHandsOfFiveBooks() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListFiveBooks = generateListOfNBooks(5);
            LibraryUser userWithFiveBooks = new LibraryUser("Jan", "Kowalski", "45112207222");
            when(libraryDatabaseMock.listBooksInHandsOf(userWithFiveBooks)).thenReturn(resultListFiveBooks);
            //When
            List<Book> testListOfFiveBooks = bookLibrary.listBooksInHandsOf(userWithFiveBooks);
            //Then
            assertEquals(5, testListOfFiveBooks.size());
        }
    }
}