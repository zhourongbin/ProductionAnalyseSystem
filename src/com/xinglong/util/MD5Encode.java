package com.xinglong.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;
/**
 * MD5加密
 * @author Administrator
 * @since 2.1
 */
public class MD5Encode {
	/**
	 * MD5加密方法
	 * @param plainText
	 * @return 加密后的密文
	 */
	 

	public static String GetMD5(String plainText) {
		plainText = plainText.trim();
		StringBuffer buf = new StringBuffer("");
		try {
		    MessageDigest md = MessageDigest.getInstance("MD5");
		    md.update(plainText.getBytes());
		    byte b[] = md.digest();
		    int i;
		    for (int offset = 0; offset < b.length; offset++)
		    {
		       i = b[offset];
		       if (i < 0)
		          i += 256;
		       if (i < 16)
		          buf.append("0");
		          buf.append(Integer.toHexString(i));
		         }
		} 
		catch (NoSuchAlgorithmException e) {
		    e.printStackTrace();
		}
		return buf.toString();
	}
	@Test
	public void testMD5Encode() {
		String s1=GetMD5("admin");
		String s2=GetMD5("ad min");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		}		
}
