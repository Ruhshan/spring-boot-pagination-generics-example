package paginationexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import paginationexample.dto.GenericPaginatedResponseDto;
import paginationexample.dto.TeacherSummaryDto;
import paginationexample.entity.Teacher;
import paginationexample.service.TeacherService;

@RestController
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping(value = "/teachers/{page}/{size}")
    GenericPaginatedResponseDto<TeacherSummaryDto> getStudentList(@PathVariable("page") int page, @PathVariable("size") int size){
        return teacherService.getPaginatedList(page, size);
    }
}
