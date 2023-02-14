package com.todo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.todo.service.TodoService;
import com.todo.service.TodoServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	TodoService todoService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home( ModelAndView mv) {
		logger.info("Welcome home!");
				
		mv.addObject("todoList", todoService.getList() );
		mv.setViewName("home");
		
		return mv;
	}
	
}
