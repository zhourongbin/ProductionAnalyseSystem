package com.xinglong;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinglong.mapper.ResultMapper;
import com.xinglong.pojo.Result;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired
	private ResultMapper resultMapper;
	
	@Test
	public void testList() {
		System.out.println(resultMapper);
		List<Result> rs = resultMapper.list();
		for (Result r:rs) {
			System.out.println(r);
		}
	}
	@Test
	public void testAdd() {
		System.out.println(resultMapper);//同一个resultMapper对象
		Result r = new Result();
		r.setBenchnumber("2018-1-6-555");
		r.setDate(new Date());
		r.setCa(47d);
		r.setCu(0.5);
		r.setFe(0.5);
		r.setMg(54d);
		r.setZn(3.3);
		System.out.println(r);
		resultMapper.add(r);
	}
	@Test
	public void testDelete() {
		System.out.println(resultMapper);
	    String bn = "2018-1-6-555";
		resultMapper.delete(bn);
		System.out.println("The result is already to delete!");
	}
	@Test
	public void testSelectOne() {
		System.out.println(resultMapper);
	    String bn = "2018-1-9-577";
		Result r =resultMapper.selectOne(bn);	
		System.out.println(r);
	}
	@Test
	public void testupdateCa() {
		System.out.println(resultMapper);
		String bn = "2018-1-9-577";
		Result r1 =resultMapper.selectOne(bn);
		System.out.println(r1);
		double ca = 25d;
//	    resultMapper.updateCa(bn,ca);
//		Result r2 =resultMapper.selectOne(bn);
//		System.out.println(r2);
		
	}
}