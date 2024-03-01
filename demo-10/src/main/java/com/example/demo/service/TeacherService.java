package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherMapepr;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TeacherService {

	private final TeacherMapepr  mapepr;
	
	
	/*
	 * 全件検索
	 */
	public List<Teacher> selectAll() {
		return mapepr.selectAll();
	}
	
	
	/*
	 * 指定検索
	 */
	public Teacher selectByPrimariKey(Long id) {
		return mapepr.selectByPrimaryKey(id);
	}
	
	/*
	 * 追加/更新
	 */
	public void save(Teacher teacher) {
		if (teacher.getId()== null) {
			mapepr.insert(teacher);
		} else {
			mapepr.UpdateByPrimaryKey(teacher);
		}
	}
	
	// 削除
	public void delete(Long id) {
		mapepr.deleteByRomaryKey(id);
	}
	

}
