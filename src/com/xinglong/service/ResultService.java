package com.xinglong.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.xinglong.pojo.Result;

public interface ResultService {
//	@Select(" select * from result_ ") 
    public List<Result> list(); 
}
