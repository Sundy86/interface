package com.sc.service;

import com.sc.model.Function;

import java.util.List;
import java.util.Map;

public interface IFunctionService {
    public Map<String,Object> functionlist(Integer pageNum, Integer pageSize);
    public int addfunction(Function function);
    public List<Function> toaddfunction();
    public int deletefunction(String funcid);
    public int updatefunction(Function function);
    public Map<String,Object> toupdatefunction(String funcid);
    public String check(String funcname);

}
