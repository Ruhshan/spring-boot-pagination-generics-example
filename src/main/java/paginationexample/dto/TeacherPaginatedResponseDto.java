package paginationexample.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import paginationexample.entity.Teacher;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeacherPaginatedResponseDto {
    private int size;
    private long totalElements;
    private int totalPages;
    private List<Teacher> content;
    private int currentPage;

    public TeacherPaginatedResponseDto(Page<Teacher> pageResult){
        this.setSize(pageResult.getSize());
        this.setTotalElements(pageResult.getTotalElements());
        this.setTotalPages(pageResult.getTotalPages());
        this.setCurrentPage(pageResult.getPageable().getPageNumber());
        this.setContent(pageResult.getContent());
    }

    public TeacherPaginatedResponseDto get(){
        return this;
    }
}
