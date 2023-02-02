package paginationexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GenericPaginatedResponseDto<U>{
    private int size;
    private long totalElements;
    private int totalPages;
    private List<U> content;
    private int currentPage;

    public <T> GenericPaginatedResponseDto(Page<T> pageResult, List<U> contents){
        this.setSize(pageResult.getSize());
        this.setTotalElements(pageResult.getTotalElements());
        this.setTotalPages(pageResult.getTotalPages());
        this.setCurrentPage(pageResult.getPageable().getPageNumber());
        this.setContent(contents);
    }

    public GenericPaginatedResponseDto<U> get(){
        return this;
    }
}
