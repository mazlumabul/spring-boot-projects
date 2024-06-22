package com.mazlumabul.controller;

import com.mazlumabul.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    //01:04


}
