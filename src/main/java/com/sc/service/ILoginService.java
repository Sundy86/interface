package com.sc.service;

import com.sc.model.Function;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ILoginService {
    public String checkUser(HttpServletRequest request,User user);
    public void loginOut(HttpServletRequest request);
    public List<Function> menu(HttpServletRequest request);
}
