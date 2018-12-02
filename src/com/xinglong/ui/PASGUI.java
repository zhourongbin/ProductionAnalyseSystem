package com.xinglong.ui;

import java.util.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xinglong.ui.Calculate;
import com.xinglong.ui.PASGUI;
import com.xinglong.mapper.ResultMapper;
import com.xinglong.pojo.*;


public class PASGUI extends JFrame {
	private static final long serialVersionUID = 1L;
	/**
	 *  工段常量
	 * @author 周荣彬
	 * @version 1.0
	 *   
	 * 
	 */
	
	public String type;
	
	
	/**
	 *  创建各结果输入框
	 * @author 周荣彬
	 * @version 1.0
	 *   
	 * 
	 */
	private  JTextField  //创建文本框
    tBatchNumber =new JTextField("0",5),
    tAl     =     new JTextField("0",5),  
    tCa     =     new JTextField("0",5),  
    tCu     =     new JTextField("0",5),  
    tFe     =     new JTextField("0",5),  
    tMg     =     new JTextField("0",5),  
    tZn     =     new JTextField("0",5), 
    tMn     =     new JTextField("0",5),
    tF      =     new JTextField("0",5),
    tResult =     new JTextField("0",10);
	public  JTextField gettBatchNumber() {
		return tBatchNumber;
	}
	public JTextField gettAl() {
		return tAl; 
	}
	public JTextField gettCa() {
		return tCa;
	}
	public JTextField gettCu() {
		return tCu;
	}
	public JTextField gettFe() {
		return tFe;
	}
	public JTextField gettMg() {
		return tMg;
	}
	public JTextField gettZn() {
		return tZn;
	}
	public JTextField gettF() {
		return tF;
	}
	public JTextField gettMn() {
		return tMn;
	}
	/**
	 *  创建各按钮
	 * @author 周荣彬
	 * @version 1.0
	 *    
	 * 
	 */
	private JButton                    //创建按钮
	bca = new JButton("计算"),
	bcl = new JButton("清除"),
    bSave = new JButton("保存");
	/**
	 * 创建内容面板
	 * @author 周荣彬
	 * @version 1.0
	 *  
	 */
    private JPanel
     buttonPanel=new JPanel(),
     textPanel=new JPanel();
    /**
     * 创建选项框
	 * @author 周荣彬
	 * @version 1.0
	 *  
	 */
	public JComboBox<String> cType;
	/**
	 *     UI主方法
	 * @author 周荣彬
	 * @version 1.0
	 * @param 程序标题
	 * @return 无返回值
	 */
	
    public PASGUI(String title) {
    	super(title);
     	bca.addActionListener(new ActionListenerbca());
    	bcl.addActionListener(new ActionListenerbcl());
    	bSave.addActionListener(new ActionListenerbSave());
    		
	    textPanel.setLayout(new GridLayout(2,8));
	    buttonPanel.add(bca);
	    buttonPanel.add(bSave);
	    buttonPanel.add(bcl);
	    buttonPanel.add(tResult);
	    add(buttonPanel,BorderLayout.NORTH);
	    JComboBox<String> cType = new JComboBox<String>();
	    cType.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {	    		    		
	    	         type   =(String)cType.getSelectedItem();
	    	}
	    }
	    		);
	    cType.addItem("除杂一");
	    cType.addItem("除杂二");
	    cType.addItem("除杂三");
	    cType.addItem("酸浸");
	    cType.setEditable(false);
	JLabel 
	    eBatchNumber =new JLabel("批号"),
	    eType = new JLabel("流程"),
	    eAl =new JLabel(" Al"),
	    eCa =new JLabel(" Ca"),
	    eCu =new JLabel(" Cu"),
	    eFe =new JLabel(" Fe"),
	    eMg =new JLabel(" Mg"),
	    eZn =new JLabel(" Zn"),
	    eF  =new JLabel(" F "),
	    eMn =new JLabel(" Mn");
	    textPanel.add(eBatchNumber);
	    textPanel.add(eType);
	    textPanel.add(eAl);
	    textPanel.add(eCa);
	    textPanel.add(eCu);
	    textPanel.add(eFe);
	    textPanel.add(eMg);
	    textPanel.add(eZn);
	    textPanel.add(eF);
	    textPanel.add(eMn);
	    textPanel.add(tBatchNumber);
	    textPanel.add(cType);
	    textPanel.add(tAl);
	    textPanel.add(tCa);
	    textPanel.add(tCu);
	    textPanel.add(tFe);
	    textPanel.add(tMg);
	    textPanel.add(tZn);
	    textPanel.add(tF);
	    textPanel.add(tMn);
	    
	    add(textPanel,BorderLayout.CENTER);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    pack();
	    setVisible(true);	    	    
    }
    	
    /**
     * 计算按钮的事件监听器
	 * @author 周荣彬
	 * @version 1.0
	 * @see #Calculate
	 */
    class ActionListenerbca implements ActionListener {  
	    public void actionPerformed(ActionEvent e) {
	    double  iAl =    new Double(tAl.getText());     //接收文本框输入数据 测试用
	    double  iCa =    new Double(tCa.getText());
	    double  iCu =    new Double(tCu.getText());
	    double  iFe =    new Double(tFe.getText());
	    double  iMg =    new Double(tMg.getText());
	    double  iZn =    new Double(tZn.getText());
	    double  iF  =    new Double(tF.getText());
	    double  iMn =    new Double(tMn.getText());
	    Calculate cal = new Calculate();
	    int Z    = cal.CalculateAl(iAl);                        //计算
	    int MnF2 = cal.CalculateCaMg(iCa,iMg);
	    int BaS  = cal.CalculateCuZn(iCu,iZn);	    
	    int H    = cal.CalculateFe(iFe,type);
	    System.out.println(H);
	        if(MnF2 == -1||BaS == -1||Z== -1  ) tResult.setText("输入错误");             //输出命令
	         else if (MnF2 == 0&&BaS == 0&&Z== 0  ) tResult.setText("合格");
	         else if (MnF2 == -2||BaS == -2||Z== -2 ) tResult.setText("等待通知处理");
	         else	 tResult.setText("未合格");
	        
	        
	        
	  /*  if (MnF2 == 1)   
	    {
	    	 if (BaS<=0) tResult.setText("合格");
	    	else tResult.setText("加D料"+Math.ceil(BaS)+"kg");
	    }
	    else if (MnF2 == -1)   tResult.setText("等待通知处理");
    	else if (BaS<=0) tResult.setText("加F料"+MnF2+"kg");	
    	else	tResult.setText("加F料"+MnF2+"kg,3h后加D料"+BaS+"kg");
	    } */
    }
}
    /**
     * 清除按钮的事件监听器
	 * @author 周荣彬
	 * @version 1.0
	 *  
	 */
class ActionListenerbcl implements ActionListener           
	{ 
	    public void actionPerformed(ActionEvent e)
	    {
	 
	       tBatchNumber.setText("0");
	       tAl.setText("0");
	       tCa.setText("0");
	       tMg.setText("0");
	       tFe.setText("0");
	       tZn.setText("0");
	       tCu.setText("0");	  
	       tF.setText("0");	  
	       tMn.setText("0");  	    
	       tResult.setText("");
	    }
	  }
/**
 * 保存按钮的事件监听器,持久化Result对象
 * @author 周荣彬
 * @version 1.0
 * @version 2.0
 *  
 */
class ActionListenerbSave implements ActionListener            //监听保存按钮
{ 
    public void actionPerformed(ActionEvent e)
    {
    
    	Result r =new Result();
    	r.setBenchnumber(tBatchNumber.getText());
    	r.setAl(new Double(tAl.getText()));
    	r.setCa(new Double(tCa.getText()));
    	r.setCu(new Double(tCu.getText()));
    	r.setFe(new Double(tFe.getText()));
    	r.setMg(new Double(tMg.getText()));
    	r.setZn(new Double(tZn.getText()));
    	r.setF (new Double(tF .getText()));
    	r.setMn(new Double(tMn.getText()));
    	r.setDate(new Date());
//    	System.out.println(date);
    	String resource = "mybatis-config.xml";
    	InputStream inputStream;
    	SqlSessionFactory sqlSessionFactory;
    	SqlSession session = null;
    	ResultMapper mapper = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	         session = sqlSessionFactory.openSession();
	         mapper = session.getMapper(ResultMapper.class);
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
        System.out.println(r);
		mapper.add(r);
        
        
        session.commit();
        session.close();
        

    	
    }
}
/**
 * main方法入口
 * @author 周荣彬
 * @version 1.0
 *  
 */
public static void main(String[] args) 
     {
		   new PASGUI("PAS系统");		   
     }
}
