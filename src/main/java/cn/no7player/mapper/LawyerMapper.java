package cn.no7player.mapper;

import cn.no7player.model.Financialuser;
import cn.no7player.model.Lawyer;
import cn.no7player.model.LawyerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LawyerMapper {
    int countByExample(LawyerExample example);

    int deleteByExample(LawyerExample example);

    int deleteByPrimaryKey(Integer lawyerId);

    int insert(Lawyer record);

    int insertSelective(Lawyer record);

    List<Lawyer> selectByExample(LawyerExample example);

    Lawyer selectByPrimaryKey(Integer lawyerId);

    Lawyer selectByTelp(String lawyerTelp);

    int updateByTelpSelective(Lawyer record);

    int updateByExampleSelective(@Param("record") Lawyer record, @Param("example") LawyerExample example);

    int updateByExample(@Param("record") Lawyer record, @Param("example") LawyerExample example);

    int updateByPrimaryKeySelective(Lawyer record);

    int updateByPrimaryKey(Lawyer record);

    int selectPidByTelp(String lawyerTelp);

    List<Lawyer> selectAll();
}