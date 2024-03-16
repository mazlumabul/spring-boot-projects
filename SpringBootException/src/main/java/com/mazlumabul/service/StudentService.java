package com.mazlumabul.service;

import com.mazlumabul.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    /*
    getAllStudent;
    getOneStudent;
    createStudent;
    deleteOneStudent;
    updateOneStudent;


     */
}
