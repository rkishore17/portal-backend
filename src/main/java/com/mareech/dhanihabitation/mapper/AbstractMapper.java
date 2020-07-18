package com.mareech.dhanihabitation.mapper;

import java.util.List;

public interface AbstractMapper<T, S> {

	public T modelToDTOMap(S model);
	
	public S dtoToModelMap(T dto);
	
	public List<T> modelToDTOList(List<S> modelList);
	
	public List<S> dtoToModelList(List<T> dtoList);
 }
