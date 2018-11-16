package com.scme.mapper;

import com.scme.pojo.bloginfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/10/9.
 */
public interface BlogMapper {
    @Select("SELECT * FROM BLOG")
    List<bloginfo> getblogM();
    @Insert("insert into blog(title,content,autherId) values(#{title},#{content},#{autherId})")
    int insertM(@Param("title") String title, @Param("content") String content,@Param("autherId") Integer autherId);

}
