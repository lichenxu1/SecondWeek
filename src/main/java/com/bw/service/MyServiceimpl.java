package com.bw.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.MyDao;

@Service
public class MyServiceimpl implements MyService {

	@Autowired
	private MyDao dao;

	@Override
	public List<Map<String, Object>> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.list(map);
	}


	
	
}
