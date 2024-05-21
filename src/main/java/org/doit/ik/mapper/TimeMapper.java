package org.doit.ik.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	String getTime();
	
	@Select("select sysdate from dual")
	String getNextTime();
}
