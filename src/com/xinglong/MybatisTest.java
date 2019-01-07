package com.xinglong;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinglong.mapper.ResultMapper;
import com.xinglong.pojo.Result;
import com.xinglong.util.BenchnumberFilter;
/**
 * JUnit������
 * @author Administrator
 * @since 2.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired
	private ResultMapper resultMapper;
	/**
	 * ����List����
	 * @author Administrator
	 * @since 2.0
	 */
	@Ignore
	@Test
	public void testList() {
		System.out.println(resultMapper);
		List<Result> rs = resultMapper.list();
		for (Result r:rs) {
			System.out.println(r);
		}
	}
	/**
	 * ����add����
	 * @author Administrator
	 * @since 2.0
	 */
	@Ignore
	@Test
	public void testAdd() {
		System.out.println(resultMapper);//ͬһ��resultMapper����
		Result r = new Result();
		r.setBenchnumber("2019-1-1-001");
		r.setDate(new Date());
		r.setCa(470d);
		r.setCu(0.5);
		r.setFe(0.5);
		r.setMg(152d);
		r.setZn(153.3);
		System.out.println(r);
		resultMapper.add(r);
	}
	/**
	 * ����delete����
	 * @since 2.0
	 */
	@Ignore
	@Test
	public void testDelete() {
		System.out.println(resultMapper);
	    String bn = "2018-1-6-555";
		resultMapper.delete(bn);
		System.out.println("The result is already to delete!");
	}
	/**
	 * ����selectOne����
	 * @since 2.0
	 */
	@Ignore
	@Test
	public void testSelectOne() {
		System.out.println(resultMapper);
	    String str = "\\\\\" \\\\#2018-1-9$\\\\$@\\-577\"//!\t\n	~//";
	    String bn = BenchnumberFilter.doFilter(str);
	    System.out.println(bn);
		Result r =resultMapper.selectOne(bn);	
		System.out.println(r);
	}
	/**
	 * ����fuzzySelect����
	 * @since 2.0
	 * ����List�����foreach����
	 */
	@Ignore
	@Test
	public void testFuzzySelect() {
		System.out.println(resultMapper);
	    String str = "577";
		List<Result> rs =resultMapper.fuzzySelect(str);	
		for (Result r:rs) {
			System.out.println(r.getBenchnumber());
		}
	}
	/**
	 * �����޸ĸ�Ԫ�ط���
	 * Al/Ca/Cu/Fe/Mg/Zn/Mn/F
	 * @since 2.0
	 */
	@Ignore
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
	@Ignore
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
	@Ignore
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
	@Ignore
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
	@Ignore
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
	@Ignore
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
	@Ignore
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
	@Ignore
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