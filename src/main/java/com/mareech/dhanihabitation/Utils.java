package com.mareech.dhanihabitation;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.mareech.dhanihabitation.dto.PagingAndSortingDTO;

public class Utils {
	
	Utils(){}
	
	public static Pageable getPageRequest(PagingAndSortingDTO pagingAndSortingDTO)
	{	
		if(pagingAndSortingDTO != null)
		{
			Integer pageNo = pagingAndSortingDTO.getPageNo() != null ? pagingAndSortingDTO.getPageNo() - 1 : 0;
			Integer recordsPerPage = pagingAndSortingDTO.getRecordsPerPage() != null ? pagingAndSortingDTO.getRecordsPerPage() : 5;
			String sortColumn = pagingAndSortingDTO.getSortColumn() != null ? pagingAndSortingDTO.getSortColumn() : "id";
			String sortDirection = pagingAndSortingDTO.getSortDirection() != null && pagingAndSortingDTO.getSortDirection().equals(Constants.DESCENDING) ? Constants.DESCENDING : Constants.ASCENDING;
			
			return PageRequest.of(pageNo, recordsPerPage, sortDirection.equals(Constants.ASCENDING) ? Sort.by(sortColumn).ascending() : Sort.by(sortColumn).descending());
		}
		return null;
	}
}
