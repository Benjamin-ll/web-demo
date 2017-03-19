package com.ll.service.impl;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ll.BaseTest;
import com.ll.dto.AppointExecution;
import com.ll.service.BookService;

public class BookServiceImplTest extends BaseTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testAppoint() throws Exception {
        long bookId = 1001;
        long studentId = 12345678911L;
        AppointExecution execution = bookService.appoint(bookId, studentId);
        System.out.println(execution);
    }
}

