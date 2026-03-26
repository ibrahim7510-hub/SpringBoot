package com.jdbc.service;
import com.jdbc.dto.StudentDTO;
import java.util.List;

public interface StudentService {
   List<StudentDTO> findAllStudents();
}
