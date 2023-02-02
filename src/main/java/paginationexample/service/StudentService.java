package paginationexample.service;

import paginationexample.dto.GenericPaginatedResponseDto;
import paginationexample.entity.Student;

public interface StudentService {
    GenericPaginatedResponseDto<Student, Student> getPaginatedList(int page, int size);
}
