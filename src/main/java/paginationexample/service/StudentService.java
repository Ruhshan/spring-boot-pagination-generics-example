package paginationexample.service;

import org.springframework.data.domain.Page;
import paginationexample.dto.StudentPaginatedResponseDto;
import paginationexample.entity.Student;

public interface StudentService {
    StudentPaginatedResponseDto getPaginatedList(int page, int size);
}
