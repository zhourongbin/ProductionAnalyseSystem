package com.xinglong.ui;

public class Calculate {
	/**
	 * 指定原子量常数
	 * @author 周荣彬
	 * @version 1.0
	 * 
	 * 
	 */
	static double 
	  RELATIVE_ATOMIC_MASS_OF_Mn = 55d,             //设置元素原子量
	  RELATIVE_ATOMIC_MASS_OF_Zn = 64d,
	  RELATIVE_ATOMIC_MASS_OF_Cu = 64d,
	  RELATIVE_ATOMIC_MASS_OF_Ca = 40d,
	  RELATIVE_ATOMIC_MASS_OF_Mg = 24d,
	  RELATIVE_ATOMIC_MASS_OF_Fe = 56d,
	  RELATIVE_ATOMIC_MASS_OF_S  = 32d,
	  RELATIVE_ATOMIC_MASS_OF_F  = 19d,
	  RELATIVE_ATOMIC_MASS_OF_Al = 27d;
	double
      CONTENT_OF_S_IN_BARIUM_SULFIDE = 0.18,
      REACTION_COEFFICIENT_OF_CalculateCaMg = 1.2,
	  REACTOR_VOLUME_OF_CalculateCaMg =16d;
	/**
	 * 计算钙镁
	 * @author 周荣彬
	 * @version 1.0
	 * @param iCa 钙分析结果
	 * @param iMg 镁分析结果
	 * @return F料用量，单位公斤
	 */	
	 int CalculateCaMg( double iCa, double iMg)             //计算钙镁
	{
		    double iCaMg = iCa+iMg-50;
		if(iCa<0.1||iMg<0.1||iCaMg>4000) return -1;
	    else if (iCaMg<0)     return 0;
	    else if (iCaMg<25)    return 5;
	    else if (iCaMg<50)    return 20;
	    else if (iCaMg<150)   return 40;
	    else if (iCaMg<200)   return 60;
	                     else return -2;
	}
	 /**
		 * 计算锌铜
		 * @author 周荣彬
		 * @version 1.0
		 * @param iCu 铜分析结果
		 * @param iZn 锌分析结果
		 * @return D料用量，单位公斤
		 */	
	 int CalculateCuZn( double iCu, double iZn) {             //计算铜锌
	   double iCuZn = iCu + iZn;
	   int BaS;
	   if      (iCu<0.1||iZn<0.1) BaS = -1;
	   else if (iCu<1.0&&iZn<1.0) BaS =  0;
	   else  BaS = (int)(Math.round(iCuZn/1000
			   / RELATIVE_ATOMIC_MASS_OF_Cu
			   * RELATIVE_ATOMIC_MASS_OF_S
			   / CONTENT_OF_S_IN_BARIUM_SULFIDE
			   * REACTION_COEFFICIENT_OF_CalculateCaMg
			   * REACTOR_VOLUME_OF_CalculateCaMg));
	   return  BaS;
	}
	 /**
		 * 计算铝
		 * @author 周荣彬
		 * @version 1.0
		 * @param iAl 铝分析结果
		 * @return Z料用量，单位格
		 */	
	int CalculateAl( double iAl)                             //计算铝
	{
	    int Z;
		 if      (iAl<0.1)  Z =-1;	 
		 else if (iAl<100)  Z = 0;
		 else if (iAl>1000) Z =-2;
		 else if (iAl<200)  Z = 1;
		 else if (iAl<300)  Z = 2;
		 else if (iAl<600)  Z = 3;
		 else  Z=(int)(iAl/200);
		return Z ;
	}
	
	/**
	 * 计算铁
	 * @author 周荣彬
	 * @version 1.0
	 * @param type 工段  
	 * @param iFe 铁分析结果
	 * @return H料用量，单位桶
	 */	
	 int CalculateFe(double iFe ,String type) {
		int H ;
		if (type=="酸浸"){
			
		 
		if      (iFe<0.1)   H=-1;	
		else if (iFe<100)   H=0;
		else if (iFe<1000)     H=(int)(iFe/100);
		else H=-2;
		}
		else  {
			if      (iFe<0.1)   H=-1;	
			else if (iFe<0.5)   H=0;
			else if (iFe<2.0)     H=(int)(iFe);
			else H=-2;
		}
		return H;
			
			
			
			
		}
	
}
