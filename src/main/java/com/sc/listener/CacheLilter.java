package com.sc.listener;

import com.sc.model.CaseSystem;
import com.sc.model.Role;
import com.sc.service.ICaseSystemService;
import com.sc.service.IRoleService;
import com.sc.service.IUserService;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.List;

/**
 * Created by Suncy on 2018/4/21 0021.
 */
public class CacheLilter implements ServletContextListener {
    public void contextInitialized(ServletContextEvent se){
        ICaseSystemService systemService = (ICaseSystemService) WebApplicationContextUtils.getWebApplicationContext(se.getServletContext()).getBean(ICaseSystemService.class);

        List<CaseSystem> list =systemService.getAll();
        for(CaseSystem caseSystem:list){
            ObjectCache.addCache(caseSystem.getSystemid(),caseSystem);
        }

        IRoleService roleService = (IRoleService) WebApplicationContextUtils.getWebApplicationContext(se.getServletContext()).getBean(IRoleService.class);
        List<Role> list1 =roleService.getAll();
        for(Role role:list1){
            ObjectCache.addCache(role.getRoleid(),role);
        }
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
