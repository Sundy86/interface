package com.sc.dao;

import com.sc.model.CaseSystem;
import com.sc.model.CaseSystemCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaseSystemMapper {
    long countByExample(CaseSystemCriteria example);

    int deleteByExample(CaseSystemCriteria example);

    int deleteByPrimaryKey(String systemid);

    int insert(CaseSystem record);

    int insertSelective(CaseSystem record);

    List<CaseSystem> selectByExample(CaseSystemCriteria example);

    CaseSystem selectByPrimaryKey(String systemid);

    int updateByExampleSelective(@Param("record") CaseSystem record, @Param("example") CaseSystemCriteria example);

    int updateByExample(@Param("record") CaseSystem record, @Param("example") CaseSystemCriteria example);

    int updateByPrimaryKeySelective(CaseSystem record);

    int updateByPrimaryKey(CaseSystem record);
}