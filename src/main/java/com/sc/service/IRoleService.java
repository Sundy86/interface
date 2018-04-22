package com.sc.service;

import com.sc.model.Function;
import com.sc.model.Role;

import java.util.List;
import java.util.Map;

public interface IRoleService {
     Map<String,Object> rolelist(Integer pageNum, Integer pageSize);
     int addrole(Role role,String str);
     List<Role> toaddrole();
     int deleterole(String roleid);
     int updaterole(Role role);
     Map<String,Object> toupdaterole(String roleid);
     String check(String rolename);


}
