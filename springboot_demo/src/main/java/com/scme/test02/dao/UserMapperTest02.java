package com.scme.test02.dao;

import com.scme.pojo.bloginfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapperTest02 {
	@Select("SELECT * FROM Blog WHERE id = #{id}")
	bloginfo findByName(@Param("id") String id);

	@Insert("insert into blog(title,content,autherId) values(#{title},#{content},#{autherId})")
	int insert(@Param("title") String title, @Param("content") String content,@Param("autherId") Integer autherId);
}
