package com.jdbc.service.impl;

import com.jdbc.dto.StudentDTO;
import com.jdbc.repository.StudentRepository;
import com.jdbc.repository.impl.StudentRepositoryImpl;
import com.jdbc.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl() {
        this.studentRepository = new StudentRepositoryImpl();
    }

    @Override
    public List<StudentDTO> findAllStudents() {
        return studentRepository.findAllStudents();
    }
}
