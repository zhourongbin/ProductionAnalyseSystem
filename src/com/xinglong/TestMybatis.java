package com.xinglong;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xinglong.mapper.ResultMapper;
import com.xinglong.pojo.Result;
import com.xinglong.sql.Query;
public class TestMybatis {
	 public static void main(String[] args) throws IOException {
	        String resource = "mybatis-config.xml";
	        InputStream inputStream = Resources.getResourceAsStream(resource);
	        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	        SqlSession session = sqlSessionFactory.openSession();
	        ResultMapper mapper = session.getMapper(ResultMapper.class);

//	        listAll(mapper);
	       
//	        deleteByBenchnumber(mapper,"2018-4-2-150"); 	  
//	        Result r = new Result();
//	        Date d =new Date();
//	        r.setBenchnumber("2018-4-1-552");
//	        r.setCa((double)28);
//	        r.setAl((double)58);
//	        r.setCu(0.5);
//	        r.setFe(0.5);
//	        r.setMg((double)5);
//	        r.setZn(0.5);
//	        r.setF(0.18);
//	        r.setMn((double)158);
//	        r.setDate(new Date());
//	        updateCa(mapper,"2018-1-6-555",20d);
//	        selectByBenchnumber( mapper,"2018-1-6-555");
//	        insertResult(mapper,r);
	        Query.selectByBenchnumber(mapper,"552");
//	        Query.setMg(mapper, "2018-4-1-552", 35d);
	        Query.selectByBenchnumber(mapper,"555");
//	        listAll(mapper);
//	        selectByBenchnumber(mapper,"1-");
	     //   mapper.delete("2018-3-9");
	        session.commit();
	        session.close();
	  
	    }
	 /**
	 private static void listAll(ResultMapper mapper) {
	        List<Result> rs = mapper.list();
	        for (Result r : rs) {
	            System.out.println(r);
	        }
	    }
	 
	 private static void deleteByBenchnumber(ResultMapper mapper,String benchnumber) {
		     mapper.delete(benchnumber);
	 }
	 private static void insertResult(ResultMapper mapper,Result result) {
		    mapper.add(result);
		   
	 }
	 public static void selectByBenchnumber(ResultMapper mapper,String benchnumber) {
		   Result r =mapper.selectOne(benchnumber);
		   System.out.println(r);
	 }
	 private static void updateCa(ResultMapper mapper,String benchnumber ,double ca) {
		 mapper.updateCa(benchnumber ,ca);
	 }
	 **/
}
