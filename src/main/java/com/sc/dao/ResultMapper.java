package com.sc.dao;

import com.sc.model.Result;
import com.sc.model.ResultCriteria;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResultMapper {
    long countByExample(ResultCriteria example);

    int deleteByExample(ResultCriteria example);

    int deleteByPrimaryKey(Date runtime);

    int insert(Result record);

    int insertSelective(Result record);

    List<Result> selectByExample(ResultCriteria example);

    Result selectByPrimaryKey(Date runtime);

    int updateByExampleSelective(@Param("record") Result record, @Param("example") ResultCriteria example);

    int updateByExample(@Param("record") Result record, @Param("example") ResultCriteria example);

    int updateByPrimaryKeySelective(Result record);

    int updateByPrimaryKey(Result record);
}