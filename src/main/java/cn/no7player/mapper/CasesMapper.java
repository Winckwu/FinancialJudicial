package cn.no7player.mapper;

import cn.no7player.model.Cases;
import cn.no7player.model.CasesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CasesMapper {
    int countByExample(CasesExample example);

    int deleteByExample(CasesExample example);

    int deleteByPrimaryKey(Integer caseId);

    int insert(Cases record);

    int insertSelective(Cases record);

    List<Cases> selectByExampleWithBLOBs(CasesExample example);

    List<Cases> selectByExample(CasesExample example);

    List<Cases> selectByFiUserId(Integer fiuserId);

    List<Cases> selectByLawyerId(Integer lawyerId);

    List<Cases> selectAll();

    Cases selectByPrimaryKey(Integer caseId);

    int updateByExampleSelective(@Param("record") Cases record, @Param("example") CasesExample example);

    int updateByExampleWithBLOBs(@Param("record") Cases record, @Param("example") CasesExample example);

    int updateByExample(@Param("record") Cases record, @Param("example") CasesExample example);

    int updateByPrimaryKeySelective(Cases record);

    int updateByPrimaryKeyWithBLOBs(Cases record);

    int updateByPrimaryKey(Cases record);
}