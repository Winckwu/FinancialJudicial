package cn.no7player.mapper;

import cn.no7player.model.Filetest;
import cn.no7player.model.FiletestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FiletestMapper {
    int countByExample(FiletestExample example);

    int deleteByExample(FiletestExample example);

    int deleteByPrimaryKey(Integer fileid);

    int insert(Filetest record);

    int insertSelective(Filetest record);

    List<Filetest> selectByExample(FiletestExample example);

    Filetest selectByPrimaryKey(Integer fileid);

    int updateByExampleSelective(@Param("record") Filetest record, @Param("example") FiletestExample example);

    int updateByExample(@Param("record") Filetest record, @Param("example") FiletestExample example);

    int updateByPrimaryKeySelective(Filetest record);

    int updateByPrimaryKey(Filetest record);
}