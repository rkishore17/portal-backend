package com.mareech.dhanihabitation;

public abstract class Constants {
	
	// URL_END_POINT
	public static final String API_END_POINT = "api/v1";
	
	//PROPRIETOR_API_NAMES
	public static final String SAVE_AND_UPDATE_PROPRIETOR = "/save-proprietor";
	public static final String FETCH_PROPRIETORS = "/proprietors";
	public static final String FETCH_PROPRIETOR_BY_ID = "/proprietor/{id}";
	public static final String FETCH_PROPRIETOR_BY_NAME_OR_PHONE_NO = "/proprietor/search/{search-value}";
	public static final String DELETE_PROPRIETOR = "/delete-proprietor/{ids}";
	public static final String UPDATE_PROPRIETOR_NAME = "/update-name";
	
	//UNIT_API_NAMES
	public static final String SAVE_AND_UPDATE_UNIT = "/save-unit";
	public static final String FETCH_UNITS = "/units";
	public static final String FETCH_UNIT_BY_ID = "/unit/{id}";
	public static final String FETCH_UNIT_BY_PROPRIETOR_BY_ID = "/unit/proprietor/{id}";
	public static final String FETCH_UNIT_BY_TYPE = "/unit/type/{type}";
	public static final String DELETE_UNIT = "/delete-unit/{ids}";
	
	//ROOM_API_NAMES
	public static final String SAVE_AND_UPDATE_ROOM = "/save-room";
	public static final String FETCH_ROOM_BY_ID = "/room/{id}";
	public static final String FETCH_ROOM_BY_FILTER_CRITERIA = "/room/filters";
	public static final String DELETE_ROOM = "/delete-room/{ids}";
	public static final String FETCH_ROOM_BY_PROPRIETOR_ID = "/proprietor/unit/room/{proprietor-id}";
	
	//CONSUMER_API_NAMES
	public static final String SAVE_AND_UPDATE_CONSUMER = "/save-consumer";
	public static final String FETCH_CONSUMER_BY_ID = "/consumer/{id}";
	public static final String FETCH_CONSUMER_BY_ROOM_ID = "/consumer/room/{room-id}";
	public static final String DELETE_CONSUMER = "/delete-consumer/{ids}";
	
	//PAGINATION_SORTING_VALUES
	public static final String ASCENDING = "asc";
	public static final String DESCENDING = "desc";
}