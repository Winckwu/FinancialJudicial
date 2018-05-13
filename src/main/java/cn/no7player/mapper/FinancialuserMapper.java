package cn.no7player.mapper;

import cn.no7player.model.Financialuser;
import cn.no7player.model.FinancialuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinancialuserMapper {
    int countByExample(FinancialuserExample example);

    int deleteByExample(FinancialuserExample example);

    int deleteByPrimaryKey(Integer fiuserId);

    int insert(Financialuser record);

    int insertSelective(Financialuser record);

    List<Financialuser> selectByExample(FinancialuserExample example);

    Financialuser selectByPrimaryKey(Integer fiuserId);

    Financialuser selectByEmail(String fiuserEmail);

    int updateByExampleSelective(@Param("record") Financialuser record, @Param("example") FinancialuserExample example);

    int updateByExample(@Param("record") Financialuser record, @Param("example") FinancialuserExample example);

    int updateByPrimaryKeySelective(Financialuser record);

    int updateByPrimaryKey(Financialuser record);

    int updateByEmailKeySelective(Financialuser record);

    int updateByEmail(Financialuser record);

    void update(Financialuser financialuser);

    Financialuser getUserByEmail(String fiuserEmail);

    List<Financialuser> selectAll();

}