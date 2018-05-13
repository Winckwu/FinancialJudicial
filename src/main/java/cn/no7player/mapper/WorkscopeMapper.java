package cn.no7player.mapper;

import cn.no7player.model.Workscope;
import cn.no7player.model.WorkscopeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkscopeMapper {
    int countByExample(WorkscopeExample example);

    int deleteByExample(WorkscopeExample example);

    int deleteByPrimaryKey(Integer workscopeId);

    int deleteByLawyerId(Integer lawyerId);

    int insert(Workscope record);

    int insertSelective(Workscope record);

    List<Workscope> selectByExample(WorkscopeExample example);

    List<Workscope> selectByLawyerId(Integer lawyerId);

    Workscope selectByPrimaryKey(Integer workscopeId);

    int updateByExampleSelective(@Param("record") Workscope record, @Param("example") WorkscopeExample example);

    int updateByExample(@Param("record") Workscope record, @Param("example") WorkscopeExample example);

    int updateByPrimaryKeySelective(Workscope record);

    int updateByPrimaryKey(Workscope record);
}