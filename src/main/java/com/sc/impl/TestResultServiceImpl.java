package com.sc.impl;

import java.util.List;

import com.sc.dao.ResultMapper;
import com.sc.model.Result;
import com.sc.model.ResultCriteria;
import com.sc.service.ITestResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
public class TestResultServiceImpl implements ITestResultService {
	
	@Autowired
	ResultMapper resultMapper;
	
	
	@Override
	public List<Result> getTestReuslt(int pagesize) {
		PageHelper.startPage(1, pagesize);
		ResultCriteria example = new ResultCriteria();
		example.setOrderByClause("runtime desc");
		List<Result> list = resultMapper.selectByExample(example);
		PageInfo<Result> pageInfo = new PageInfo<Result>(list);
		List<Result> pagelist = pageInfo.getList();
		return pagelist;
	}
}
