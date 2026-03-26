package com.jdbc.repository;

import com.jdbc.dto.StudentDTO;

import java.util.List;

public interface StudentRepository {
    List<StudentDTO> findAllStudents();
}
