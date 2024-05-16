package com.example.java5_s3_forms_databinding_sd18314.controllers;

import com.example.java5_s3_forms_databinding_sd18314.entities.Student;
import com.example.java5_s3_forms_databinding_sd18314.services.StudentService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class BasicController {

    final
    StudentService studentService;

    public BasicController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/students")
    public String showStudents(Model model){ // Model, ModelMap, ModelAndView
        // chuyen data tu service ve view
        List<Student> students = studentService.getStudents();
        model.addAttribute("students", students);

        return "home";
    }


}
