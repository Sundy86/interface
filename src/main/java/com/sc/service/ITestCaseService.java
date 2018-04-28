package com.sc.service;


import com.sc.model.CaseSystem;
import com.sc.model.TestCase;

import java.util.List;
import java.util.Map;

public interface ITestCaseService {
     Map<String,Object> caselist(Integer pageNum, Integer pageSize);
     int addcase(TestCase testCase);
     int deletecase(String caseId);
    TestCase getByCaseId(String caseId);
     int updatecase(TestCase testCase);
    String check(String casename);
    List<CaseSystem> getSystem();

}
