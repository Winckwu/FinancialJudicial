package cn.no7player.mapper;

import cn.no7player.model.Status;
import cn.no7player.model.StatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusMapper {
    int countByExample(StatusExample example);

    int deleteByExample(StatusExample example);

    int deleteByPrimaryKey(Integer statusId);

    int insert(Status record);

    int insertSelective(Status record);

    List<Status> selectByExample(StatusExample example);

    List<Status> selectStatusByCaseId(Integer caseId);

    Status selectByPrimaryKey(Integer statusId);

    int updateByExampleSelective(@Param("record") Status record, @Param("example") StatusExample example);

    int updateByExample(@Param("record") Status record, @Param("example") StatusExample example);

    int updateByPrimaryKeySelective(Status record);

    int updateByPrimaryKey(Status record);

    int selectType4(int caseId);

    int selectType5(int caseId);

    Status selectType6(int caseId);

    Status selectType14(int caseId);

    int selectCaseStatus(int caseId);
}