package com.sc.service;

import com.sc.model.Function;
import com.sc.model.User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ILoginService {
    public String checkUser(HttpServletRequest request,User user);
    public void loginOut(HttpServletRequest request);
    public List<Function> menu(HttpServletRequest request);
}
