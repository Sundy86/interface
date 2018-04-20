package com.sc.dao;

import com.sc.model.ResultDetail;
import com.sc.model.ResultDetailCriteria;
import com.sc.model.ResultDetailKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResultDetailMapper {
    long countByExample(ResultDetailCriteria example);

    int deleteByExample(ResultDetailCriteria example);

    int deleteByPrimaryKey(ResultDetailKey key);

    int insert(ResultDetail record);

    int insertSelective(ResultDetail record);

    List<ResultDetail> selectByExampleWithBLOBs(ResultDetailCriteria example);

    List<ResultDetail> selectByExample(ResultDetailCriteria example);

    ResultDetail selectByPrimaryKey(ResultDetailKey key);

    int updateByExampleSelective(@Param("record") ResultDetail record, @Param("example") ResultDetailCriteria example);

    int updateByExampleWithBLOBs(@Param("record") ResultDetail record, @Param("example") ResultDetailCriteria example);

    int updateByExample(@Param("record") ResultDetail record, @Param("example") ResultDetailCriteria example);

    int updateByPrimaryKeySelective(ResultDetail record);

    int updateByPrimaryKeyWithBLOBs(ResultDetail record);

    int updateByPrimaryKey(ResultDetail record);
}