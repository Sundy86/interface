package com.sc.dao;

import com.sc.model.TestCase;
import com.sc.model.TestCaseCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestCaseMapper {
    long countByExample(TestCaseCriteria example);

    int deleteByExample(TestCaseCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(TestCase record);

    int insertSelective(TestCase record);

    List<TestCase> selectByExampleWithBLOBs(TestCaseCriteria example);

    List<TestCase> selectByExample(TestCaseCriteria example);

    TestCase selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") TestCase record, @Param("example") TestCaseCriteria example);

    int updateByExampleWithBLOBs(@Param("record") TestCase record, @Param("example") TestCaseCriteria example);

    int updateByExample(@Param("record") TestCase record, @Param("example") TestCaseCriteria example);

    int updateByPrimaryKeySelective(TestCase record);

    int updateByPrimaryKeyWithBLOBs(TestCase record);

    int updateByPrimaryKey(TestCase record);
}