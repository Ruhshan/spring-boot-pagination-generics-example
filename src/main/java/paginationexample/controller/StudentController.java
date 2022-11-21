package paginationexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import paginationexample.dto.StudentPaginatedResponseDto;
import paginationexample.service.StudentService;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/students/{page}/{size}")
    StudentPaginatedResponseDto getStudentList(@PathVariable("page") int page, @PathVariable("size") int size){
        return studentService.getPaginatedList(page, size);
    }
}
