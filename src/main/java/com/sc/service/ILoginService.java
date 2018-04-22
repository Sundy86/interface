package com.sc.service;

import com.sc.model.Function;
import com.sc.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ILoginService {
     String checkUser(HttpServletRequest request,User user);
     void loginOut(HttpServletRequest request);
     List<Function> menu(HttpServletRequest request);
}
