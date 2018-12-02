package com.xinglong.mapper;

import com.xinglong.pojo.Result;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
 

public interface ResultMapper {
	@Select(" select * from result_ ") 
    public List<Result> list(); 
	
	@Delete(" delete from result_ where benchnumber= #{benchnumber} ") 
    public void delete(String benchnumber); 
	
	@Insert(" insert into result_ ( benchnumber,date,al,ca,cu,fe,mg,zn,f,mn ) values (#{benchnumber},#{date},#{al},#{ca},#{cu},#{fe},#{mg},#{zn},#{f},#{mn}) ") 
    public int add(Result result); 
	
	@Update(" update result_ set ca =#{ca} where benchnumber=#{benchnumber}")
	public int updateCa(String benchnumber , double ca);
	
	@Update(" update result_ set cu =#{cu} where benchnumber=#{benchnumber}")
	public int updateCu(String benchnumber ,double cu);
	
	@Update(" update result_ set fe =#{fe} where benchnumber=#{benchnumber}")
	public int updateFe(String benchnumber ,double fe);
	
	@Update(" update result_ set mg =#{mg} where benchnumber=#{benchnumber}")
	public int updateMg(String benchnumber ,double mg);
	
	@Update(" update result_ set zn =#{zn} where benchnumber=#{benchnumber}")
	public int updateZn(String benchnumber ,double zn);
	
	@Update(" update result_ set  f =#{f} where benchnumber=#{benchnumber}")
	public int updateF(String benchnumber ,double f);
	
	@Update(" update result_ set mn =#{mn} where benchnumber=#{benchnumber}")
	public int updateMn(String benchnumber ,double mn);
	

	//@Update(" update result_ set name=#{name} where id=#{id}")
	
	
	@Select("select * from result_ where benchnumber like concat('%', #{benchnumber},'%')")
	public Result selectOne(String benchnumber);
	
    int deleteByPrimaryKey(Integer id);

    int insert(Result record);

    int insertSelective(Result record);

    Result selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Result record);

    int updateByPrimaryKey(Result record);
}