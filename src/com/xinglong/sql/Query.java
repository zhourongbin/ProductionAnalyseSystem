package com.xinglong.sql;

import java.util.List;

import com.xinglong.mapper.ResultMapper;
import com.xinglong.pojo.Result;

public class Query {
     public static void listAll(ResultMapper mapper) {
	    List<Result> rs = mapper.list();
	        for (Result r : rs) {
	            System.out.println(r);
	        }
	    }
     public static void deleteByBenchnumber(ResultMapper mapper,String benchnumber) {
	   mapper.delete(benchnumber);
    }
     public static  void insertResult(ResultMapper mapper,Result result) {
	   mapper.add(result);
}
     public static void selectByBenchnumber(ResultMapper mapper,String benchnumber) {
	   
	   System.out.println(mapper.selectOne(benchnumber));
}
     public static void setMg(ResultMapper mapper,String benchnumber ,double mg) {
	    mapper.updateMg(benchnumber ,mg);
    }  
}
