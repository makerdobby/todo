package com.todo.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.todo.vo.TodoVo;

@Repository("todoDAO")
public class TodoDAOImpl implements TodoDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<TodoVo> getList() {
		System.out.println("dao getList");
		List<TodoVo> todoList = new ArrayList<TodoVo>();
		todoList = sqlSession.selectList("todomapper.selectList");
		todoList.get(0).getStId();
		return todoList;
	}

}
