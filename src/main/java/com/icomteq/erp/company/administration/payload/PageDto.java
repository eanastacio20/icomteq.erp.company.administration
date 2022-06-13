package com.icomteq.erp.company.administration.payload;

import java.util.List;

import lombok.Data;

@Data
public class PageDto<T extends ObjectDto> {
	
	private Integer pageNo;
	private Integer sizePerPage;
	private Integer totalPages;
	private Long totalElements;
	private List<T> list;
	
}
