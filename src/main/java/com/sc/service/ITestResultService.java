package com.sc.service;

import java.util.List;
import com.sc.model.Result;

public interface ITestResultService {

	List<Result> getTestReuslt(int pagesize);

}