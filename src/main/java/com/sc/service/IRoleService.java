package com.sc.service;

import com.sc.model.Function;
import com.sc.model.Role;

import java.util.List;
import java.util.Map;

public interface IRoleService {
    public Map<String,Object> rolelist(Integer pageNum, Integer pageSize);
    public int addrole(Role role,String str);
    public List<Role> toaddrole();
    public int deleterole(String roleid);
    public int updaterole(Role role);
    public Map<String,Object> toupdaterole(String roleid);
    public String check(String rolename);


}
