package com.elastic.es;

import com.elastic.es.bean.Book;
import com.elastic.es.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test01() {
        Book book = new Book();
        book.setId(3);
        book.setAuthor("Satan");
        book.setBookName("Unf");
        bookRepository.index(book);

    }

}
