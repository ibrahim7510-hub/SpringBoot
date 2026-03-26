package com.jdbc.util;

import com.jdbc.dto.StudentDTO;
import com.jdbc.enums.Gender;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapperUtil {

   public static StudentDTO convertStudentResultSetToDto(ResultSet rs) throws SQLException {
       StudentDTO student = new StudentDTO();
       student.setId(rs.getInt("id"));
       student.setName(rs.getString("name"));
       student.setRegno(rs.getInt("regno"));
       student.setGender(Gender.valueOf(rs.getString("gender")));
       student.setEmail(rs.getString("email"));
       student.setDateOfBirth(rs.getDate("dob").toLocalDate());
       return student;
    }
}
