package com.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.dao.TodoDAO;
import com.todo.vo.TodoVo;

@Service("todoService")
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	TodoDAO tDAO;
	
	@Override
	public List<TodoVo> getList(){
		System.out.println("service getList");
		System.out.println(tDAO);
		
		
		return tDAO.getList();
	}
	

}
