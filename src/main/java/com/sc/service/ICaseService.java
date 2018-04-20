package com.sc.service;


import com.sc.model.TestCase;

import java.util.Map;

public interface ICaseService {
     Map<String,Object> caselist(Integer pageNum, Integer pageSize);
     int addcase(TestCase testCase);
     int deletefunction(String caseid);
     TestCase getByCaseId(String caseid);
     int updatecase(TestCase testCase);
}
