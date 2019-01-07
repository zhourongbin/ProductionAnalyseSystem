package com.xinglong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinglong.mapper.ResultMapper;
import com.xinglong.pojo.Result;
import com.xinglong.service.ResultService;
@Service
public class ResultServiceImpl implements ResultService {
@Autowired
	public ResultMapper resultMapper;
	
	public List<Result> list() {
		// TODO Auto-generated method stub
		return resultMapper.list();
	}

}
