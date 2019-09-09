package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.service.MyService;

@Controller
public class MyController {
	
	@Autowired
	private MyService service;
	
	@RequestMapping("list.do")
	public String list(Model model){
		
		HashMap<String, Object> map = new HashMap<>();
		List<Map<String, Object>> list = service.list(map);
		System.out.println(list);
		model.addAttribute("list", list);
		return "list";

	}

}
