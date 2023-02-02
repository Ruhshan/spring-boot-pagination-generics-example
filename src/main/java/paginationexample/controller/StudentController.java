package paginationexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import paginationexample.dto.GenericPaginatedResponseDto;
import paginationexample.entity.Student;
import paginationexample.service.StudentService;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/students/{page}/{size}")
    GenericPaginatedResponseDto< Student> getStudentList(@PathVariable("page") int page, @PathVariable("size") int size){
        return studentService.getPaginatedList(page, size);
    }
}
