package com.sc.listener;

import com.sc.model.CaseSystem;
import com.sc.service.ICaseSystemService;
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
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
