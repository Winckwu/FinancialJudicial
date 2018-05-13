package cn.no7player.mapper;

import cn.no7player.model.Assign;
import cn.no7player.model.AssignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssignMapper {
    int countByExample(AssignExample example);

    int deleteByExample(AssignExample example);

    int deleteByPrimaryKey(Integer assignId);

    int insert(Assign record);

    int insertSelective(Assign record);

    List<Assign> selectByExample(AssignExample example);

    List<Assign> selectByLawyerId(Integer lawyerId);

    Assign selectByPrimaryKey(Integer assignId);

    int updateByExampleSelective(@Param("record") Assign record, @Param("example") AssignExample example);

    int updateByExample(@Param("record") Assign record, @Param("example") AssignExample example);

    int updateByPrimaryKeySelective(Assign record);

    int updateByLidAndCid(Assign record);

    int updateByPrimaryKey(Assign record);

    List<Assign> selectByCaseId(Integer caseId);

    int deleteByCaseId(Integer caseId);
}