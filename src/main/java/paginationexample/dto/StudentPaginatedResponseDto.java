package paginationexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import paginationexample.entity.Student;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentPaginatedResponseDto {
    private int size;
    private long totalElements;
    private int totalPages;
    private List<Student> content;
    private int currentPage;

    public StudentPaginatedResponseDto(Page<Student> pageResult){
        this.setSize(pageResult.getSize());
        this.setTotalElements(pageResult.getTotalElements());
        this.setTotalPages(pageResult.getTotalPages());
        this.setCurrentPage(pageResult.getPageable().getPageNumber());
        this.setContent(pageResult.getContent());
    }

    public StudentPaginatedResponseDto get(){
        return this;
    }
}
