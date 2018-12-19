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
/**
 * JUnit测试类
 * @author Administrator
 * @since 2.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired
	private ResultMapper resultMapper;
	/**
	 * 测试List方法
	 * @author Administrator
	 * @since 2.0
	 */
	@Test
	public void testList() {
		System.out.println(resultMapper);
		List<Result> rs = resultMapper.list();
		for (Result r:rs) {
			System.out.println(r);
		}
	}
	/**
	 * 测试add方法
	 * @author Administrator
	 * @since 2.0
	 */
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
	/**
	 * 测试delete方法
	 * @since 2.0
	 */
	@Test
	public void testDelete() {
		System.out.println(resultMapper);
	    String bn = "2018-1-6-555";
		resultMapper.delete(bn);
		System.out.println("The result is already to delete!");
	}
	/**
	 * 测试selectOne方法
	 * @since 2.0
	 */
	@Test
	public void testSelectOne() {
		System.out.println(resultMapper);
	    String bn = "2018-1-9-577";
		Result r =resultMapper.selectOne(bn);	
		System.out.println(r);
	}
	/**
	 * 测试fuzzySelect方法
	 * @since 2.0
	 */
	@Test
	public void testFuzzySelect() {
		System.out.println(resultMapper);
	    String str = "577";
		List<Result> r =resultMapper.fuzzySelect(str);	
		System.out.println(r);
	}
	/**
	 * 测试修改各元素方法
	 * Al/Ca/Cu/Fe/Mg/Zn/Mn/F
	 * @since 2.0
	 */
	@Test
	public void testupdateAl() {
		System.out.println(resultMapper);
		String bn = "2018-1-10-586";
		Result r1 =resultMapper.selectOne(bn);
		System.out.println(r1);
		double al = 25d;
	    resultMapper.updateAl(bn,al);
		Result r2 =resultMapper.selectOne(bn);
		System.out.println(r2);
	}
	@Test
	public void testupdateCa() {
		System.out.println(resultMapper);
		String bn = "2018-1-9-577";
		Result r1 =resultMapper.selectOne(bn);
		System.out.println(r1);
		double ca = 25d;
	    resultMapper.updateCa(bn,ca);
		Result r2 =resultMapper.selectOne(bn);
		System.out.println(r2);
		
	}
	@Test
	public void testupdateCu() {
		System.out.println(resultMapper);
		String bn = "2018-1-4-577";
		Result r1 =resultMapper.selectOne(bn);
		System.out.println(r1);
		double cu = 25d;
	    resultMapper.updateCu(bn,cu);
		Result r2 =resultMapper.selectOne(bn);
		System.out.println(r2);
	}
	@Test
	public void testupdateFe() {
		System.out.println(resultMapper);
		String bn = "2018-1-4-577";
		Result r1 =resultMapper.selectOne(bn);
		System.out.println(r1);
		double fe = 25d;
	    resultMapper.updateFe(bn,fe);
		Result r2 =resultMapper.selectOne(bn);
		System.out.println(r2);
	}
	@Test
	public void testupdateMg() {
		System.out.println(resultMapper);
		String bn = "2018-1-10-586";
		Result r1 =resultMapper.selectOne(bn);
		System.out.println(r1);
		double mg = 25.0;
		resultMapper.updateMg(bn,mg);
		Result r2 =resultMapper.selectOne(bn);
		System.out.println(r2);
	}
	@Test
	public void testupdateZn() {
		System.out.println(resultMapper);
		String bn = "2018-1-10-586";
		Result r1 =resultMapper.selectOne(bn);
		System.out.println(r1);
		double zn = 25;
		resultMapper.updateZn(bn,zn);
		Result r2 =resultMapper.selectOne(bn);
		System.out.println(r2);
	}
	@Test
	public void testupdateMn() {
		System.out.println(resultMapper);
		String bn = "2018-1-10-586";
		Result r1 =resultMapper.selectOne(bn);
		System.out.println(r1);
		double mn = 25;
		resultMapper.updateMn(bn,mn);
		Result r2 =resultMapper.selectOne(bn);
		System.out.println(r2);
	}
	@Test
	public void testupdateF() {
		System.out.println(resultMapper);
		String bn = "2018-1-9-577";
		Result r1 =resultMapper.selectOne(bn);
		System.out.println(r1);
		double f = 0.0102;
		resultMapper.updateF(bn,f);
		Result r2 =resultMapper.selectOne(bn);
		System.out.println(r2);
	}
}