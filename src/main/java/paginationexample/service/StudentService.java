package paginationexample.service;

import paginationexample.dto.StudentPaginatedResponseDto;

public interface StudentService {
    StudentPaginatedResponseDto getPaginatedList(int page, int size);
}
