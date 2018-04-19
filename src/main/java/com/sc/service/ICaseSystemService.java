package com.sc.service;

import com.sc.model.CaseSystem;

import java.util.List;
import java.util.Map;

public interface ICaseSystemService {
    public Map<String,Object> casesystemlist(Integer pageNum, Integer pageSize);
    public int addcasesystem(CaseSystem caseSystem);
    public int updatecasesystem(CaseSystem caseSystem);
    public CaseSystem toupdatecasesystem(String systemid);
    public int deletecasesystem(String systemid);
    public String check(String systemname);

}
