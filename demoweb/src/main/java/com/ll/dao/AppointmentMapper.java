package com.ll.dao;

import com.ll.entity.Appointment;
import org.apache.ibatis.annotations.Param;

public interface AppointmentMapper {
    int deleteByPrimaryKey(@Param("bookId") Long bookId, @Param("studentId") Long studentId);

    int insert(Appointment record);

    int insertSelective(Appointment record);

    Appointment selectByPrimaryKey(@Param("bookId") Long bookId, @Param("studentId") Long studentId);

    int updateByPrimaryKeySelective(Appointment record);

    int updateByPrimaryKey(Appointment record);
    
    /**
     * 插入预约图书记录
     * 
     * @param bookId
     * @param studentId
     * @return 插入的行数
     */
    int insertAppointment(@Param("bookId") long bookId, @Param("studentId") long studentId);

    /**
     * 通过主键查询预约图书记录，并且携带图书实体
     * 
     * @param bookId
     * @param studentId
     * @return
     */
    Appointment queryByKeyWithBook(@Param("bookId") long bookId, @Param("studentId") long studentId);
}