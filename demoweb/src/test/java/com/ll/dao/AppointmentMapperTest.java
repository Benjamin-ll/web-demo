package com.ll.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ll.BaseTest;
import com.ll.entity.Appointment;

public class AppointmentMapperTest extends BaseTest {
    
    @Autowired
    private AppointmentMapper appointmentDao;
    
    @Test
    public void testInsertAppointment() {
        long bookId = 1000;
        long studentId = 12345678910L;
        int insert = appointmentDao.insertAppointment(bookId, studentId);
        System.out.println("insert=" + insert);
    }

    @Test
    public void testQueryByKeyWithBook() {
        long bookId = 1000;
        long studentId = 12345678910L;
        Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
        System.out.println(appointment);
        System.out.println(appointment.getBook());
    }

}
