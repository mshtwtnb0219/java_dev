package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.Teacher;

@Mapper
public interface TeacherMapepr {
	
	@Select("SELECT * FROM teacher")
	List<Teacher> selectAll();
	
	
	// キー検索
	@Select({"Select * from teacher", 
		"where id = #{id}"
		})
	Teacher selectByPrimaryKey(Long id);
	

	// 追加
	@Insert({"Insert into teacher(user_name,email)",
			 " values(#{userName},#{email})"
			})
	int insert(Teacher record);
	
	
	
	// 更新
	@Update({"Update teacher",
			 " set user_name = #{userName}, email = #{email}",
			 "where id = #{id}"
		})
	int UpdateByPrimaryKey(Teacher record);
	
	
	// 削除
	@Delete({"delete teacher", 
		"where id = #{id}"
		})
	int deleteByRomaryKey(Long id);
	

}
