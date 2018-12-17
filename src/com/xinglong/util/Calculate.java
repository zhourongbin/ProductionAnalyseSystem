package com.xinglong.util;

public class Calculate {
	/**
	 * ָ��ԭ��������
	 * @author ���ٱ�
	 * @version 1.0
	 * 
	 * 
	 */
	static double 
	  RELATIVE_ATOMIC_MASS_OF_Mn = 55d,             //����Ԫ��ԭ����
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
	 * �����þ
	 * @author ���ٱ�
	 * @version 1.0
	 * @param iCa �Ʒ������
	 * @param iMg þ�������
	 * @return F����������λ����
	 */	
	 int CalculateCaMg( double iCa, double iMg)             //�����þ
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
		 * ����пͭ
		 * @author ���ٱ�
		 * @version 1.0
		 * @param iCu ͭ�������
		 * @param iZn п�������
		 * @return D����������λ����
		 */	
	 int CalculateCuZn( double iCu, double iZn) {             //����ͭп
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
		 * ������
		 * @author ���ٱ�
		 * @version 1.0
		 * @param iAl ���������
		 * @return Z����������λ��
		 */	
	int CalculateAl( double iAl)                             //������
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
	 * ������
	 * @author ���ٱ�
	 * @version 1.0
	 * @param type ����  
	 * @param iFe ���������
	 * @return H����������λͰ
	 */	
	 int CalculateFe(double iFe ,String type) {
		int H ;
		if (type=="���"){
			
		 
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
