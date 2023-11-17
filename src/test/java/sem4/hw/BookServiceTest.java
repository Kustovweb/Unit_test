package sem4.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sem4.hw.book.Book;
import sem4.hw.book.BookService;
import sem4.hw.book.InMemoryBookRepository;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class BookServiceTest {
    Book stubBook = new Book("1", "Book1", "Author1");
    InMemoryBookRepository mockBookRepository;
    BookService bookService;
    @BeforeEach
    void initEach() {
        mockBookRepository = mock(InMemoryBookRepository.class);
        bookService = new BookService(mockBookRepository);
    }
    @Test
    void testFindById() {
        when(mockBookRepository.findById("1")).thenReturn(stubBook);
        Assertions.assertEquals(stubBook, bookService.findBookById("1"));
        verify(mockBookRepository, times(1)).findById("1");
    }

    @Test
    void testFindAll() {
        ArrayList<Book> stubBooks = new ArrayList<Book>();
        stubBooks.add(stubBook);
        when(mockBookRepository.findAll()).thenReturn(stubBooks);
        assertThat(bookService.findAllBooks()).isEqualTo(stubBooks);
        verify(mockBookRepository, times(1)).findAll();
    }
}
