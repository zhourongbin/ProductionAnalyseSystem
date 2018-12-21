package com.xinglong.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.junit.Test;
/**
 * 批号字符串过滤类
 * @author Administrator
 * @since 2.1
 */
public class BenchnumberFilter {
	/**
	 * 
	 * @param str
	 * @return benchnumberstr
	 * @throws PatternSyntaxException
	 */
public static String doFilter(String str) throws PatternSyntaxException {
	String regEx = "[ \\\\\"\t\n`~!@#$%^&*+=|':;'<>{},//[//]./?~！@#￥%……&*（）—+|【】‘；：”“’。，、？]"; 
	Pattern p = Pattern.compile(regEx);
	Matcher m = p.matcher(str);
	String benchnumberstr = m.replaceAll("").trim();
	return benchnumberstr;
    }
@Test
public void testStringFilter() throws PatternSyntaxException{
	String   str   =   "2018\\\" \\\\-3#$\\$@-12\"////-abcd'}{|下面八?><:!\t\n	~223";  
	 System.out.println(str);      
     System.out.println(doFilter(str));      
     }    
}

