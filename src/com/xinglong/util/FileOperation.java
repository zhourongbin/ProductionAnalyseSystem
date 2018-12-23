package com.xinglong.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileOperation {
	 /**
	   *  生成文件
	   *  @param fileName
	   *  @since 2.1
	   */
	  public static boolean createFile(File fileName){
	    if(!fileName.exists()){  
	      try {
	        fileName.createNewFile();
	      } catch (Exception e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	    return true;
	  }
	  
	  /**
	   * @description 读文件
	   * @throws IOException 
	   * @since 2.1
	   */
	  public static String readTxtFile(File fileName) throws IOException{
	    String result ="";
	    FileReader fileReader = null;
	    BufferedReader bufferedReader = null;
	    fileReader = new FileReader(fileName);
	    bufferedReader = new BufferedReader(fileReader);
	    
	    String read = null;
	    int count = 1;
	    while((read = bufferedReader.readLine()) != null){
	      result = result + "\n"+count + "\t"+read + "\r";
	      count++;
	    }
	    
	    if(bufferedReader != null){
	      bufferedReader.close();
	    }
	    
	    if(fileReader != null){
	        fileReader.close();
	    }
	    
	    System.out.println("The content of the file is "  + result);
	    return result;
	  }
	  
	  /**
	   * @description 写文件
	   * @param args
	   * @throws UnsupportedEncodingException 
	   * @throws IOException
	   * @since 2.1
	   */
	  public static boolean writeTxtFile(String content,File fileName) throws UnsupportedEncodingException, IOException{
		  OutputStreamWriter osp = new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8");
		  osp.write(content);
		  osp.close();
	    return true; 
		 
		  
	  }
	  /**
	   * @description 单元测试
	   * @throws IOException
	   */
	  public static void main(String[] args) throws IOException {	
		  String filePath = "C:\\Users\\Administrator\\Desktop\\newfile.txt";
	    File file = new File(filePath);
	    Date date = new Date();
	    SimpleDateFormat day = new SimpleDateFormat("yyyyMMddHHmmss");
	    String dateName = day.format(date);
	    File copyFile = new File("d:/" + dateName + ".txt");
	    String content = readTxtFile(file);
	    createFile(copyFile);
	    writeTxtFile(content,copyFile);
	  }
}
