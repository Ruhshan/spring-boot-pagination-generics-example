package paginationexample.service;

import paginationexample.dto.TeacherPaginatedResponseDto;

public interface TeacherService {
    TeacherPaginatedResponseDto getPaginatedList(int page, int size);
}
