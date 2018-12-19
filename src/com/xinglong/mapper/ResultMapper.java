package com.xinglong.mapper;

import com.xinglong.pojo.Result;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
 /**
  * mapper�ӿ�
  * ע�ⷽʽ
  * @author Administrator
  * since 1.0
  */

public interface ResultMapper {
	/**
	 * 
	 * @return List<Result>
	 */
	@Select(" select * from result_ ") 
    public List<Result> list(); 
	/**
	 * 
	 * @param benchnumber
	 */
	@Delete(" delete from result_ where benchnumber= #{benchnumber} ") 
    public void delete(String benchnumber); 
	/**
	 * 
	 * @param result
	 * @return �޸ļ�¼����Ŀ��
	 */
	@Insert(" insert into result_ ( benchnumber,date,al,ca,cu,fe,mg,zn,f,mn ) values (#{benchnumber},#{date},#{al},#{ca},#{cu},#{fe},#{mg},#{zn},#{f},#{mn}) ") 
    public int add(Result result); 
	/**
	 * 
	 * @param benchnumber
	 * @param al
	 * @return �޸ļ�¼����Ŀ��
	 */
	
	@Update(" update result_ set al =#{al} where benchnumber=#{benchnumber}")
	public int updateAl(@Param("benchnumber")String benchnumber,@Param("al")double al);
	/**
	 * 
	 * @param benchnumber
	 * @param ca
	 * @return �޸ļ�¼����Ŀ��
	 */
	@Update(" update result_ set ca =#{ca} where benchnumber=#{benchnumber}")
	public int updateCa(@Param("benchnumber")String benchnumber,@Param("ca")double ca);
	/**
	 * 
	 * @param benchnumber
	 * @param cu
	 * @return �޸ļ�¼����Ŀ��
	 */
	@Update(" update result_ set cu =#{cu} where benchnumber=#{benchnumber}")
	public int updateCu(@Param("benchnumber")String benchnumber,@Param("cu")double cu);
	/**
	 * 
	 * @param benchnumber
	 * @param fe
	 * @return �޸ļ�¼����Ŀ��
	 */ 
	@Update(" update result_ set fe =#{fe} where benchnumber=#{benchnumber}")
	public int updateFe(@Param("benchnumber")String benchnumber,@Param("fe")double fe);
	/**
	 * 
	 * @param benchnumber
	 * @param mg
	 * @return �޸ļ�¼����Ŀ��
	 */
	@Update(" update result_ set mg =#{mg} where benchnumber=#{benchnumber}")
	public int updateMg(@Param("benchnumber")String benchnumber,@Param("mg")double mg);
	/**
	 * 
	 * @param benchnumber
	 * @param zn
	 * @return �޸ļ�¼����Ŀ��
	 */
	@Update(" update result_ set zn =#{zn} where benchnumber=#{benchnumber}")
	public int updateZn(@Param("benchnumber")String benchnumber,@Param("zn")double zn);
	/**
	 * 
	 * @param benchnumber
	 * @param f
	 * @return �޸ļ�¼����Ŀ��
	 */
	@Update(" update result_ set  f =#{f}  where benchnumber=#{benchnumber}")
	public int updateF (@Param("benchnumber")String benchnumber,@Param("f")double f);
	/**
	 * 
	 * @param benchnumber
	 * @param mn
	 * @return �޸ļ�¼����Ŀ��
	 */
	@Update(" update result_ set mn =#{mn} where benchnumber=#{benchnumber}")
	public int updateMn(@Param("benchnumber")String benchnumber,@Param("mn")double mn);
	

	//@Update(" update result_ set name=#{name} where id=#{id}")
	
	/**
	 * ������ģ������һ����¼
	 * @param benchnumber
	 * @return Result
	 */
	@Select("select * from result_ where benchnumber =#{benchnumber}")
	public Result selectOne(String benchnumber);
	/**
	 * ������ģ����ѯ������¼
	 * @param str
	 * @return List<Result>
	 */
	@Select("select * from result_ where benchnumber like concat('%', #{str},'%')")
	public List<Result> fuzzySelect(String str);
}