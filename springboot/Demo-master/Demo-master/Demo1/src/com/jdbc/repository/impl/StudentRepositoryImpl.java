package com.jdbc.repository.impl;

import com.jdbc.config.DatabaseConfig;
import com.jdbc.dto.StudentDTO;
import com.jdbc.exception.InternalServiceException;
import com.jdbc.repository.StudentRepository;
import com.jdbc.util.MapperUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {

    @Override
    public List<StudentDTO> findAllStudents() {
       String sql="select * from stu_details";
       List<StudentDTO> studentList=new ArrayList<StudentDTO>();
        try (Connection connection = DatabaseConfig.getConnection();
             Statement statement = connection.createStatement();)
        {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                StudentDTO student = MapperUtil.convertStudentResultSetToDto(resultSet);
                studentList.add(student);
            }
        } catch (ClassNotFoundException | SQLException exception) {
            throw new InternalServiceException(exception.getMessage());
        }
        return studentList;

    }
}
