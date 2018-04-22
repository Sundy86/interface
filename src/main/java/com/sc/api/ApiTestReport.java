package com.sc.api;

import java.util.Date;
import java.util.List;

import com.sc.dao.ResultDetailMapper;
import com.sc.dao.ResultMapper;
import com.sc.model.Result;
import com.sc.model.ResultDetail;
import com.sc.model.TestCase;
import com.sc.utils.SpringContextUtils;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.collections.Lists;
import org.testng.xml.XmlSuite;

 

public class ApiTestReport implements ITestListener, IReporter {
	private List<ResultDetail> testPassed = Lists.newArrayList();
	private List<ResultDetail> testFailed = Lists.newArrayList();
	private List<ErrorReport> errorList = Lists.newArrayList();

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		System.out.println(" generateReport-------------- ");
		System.out.println("Passed Case: " + testPassed.size());
		System.out.println("testFailed Case: " + testFailed.size());
		Date date = new Date();
		Result result = new Result();
		result.setRuntime(date);
		result.setSucess(testPassed.size());
		result.setFail(testFailed.size());
		ResultMapper testResultMapper = SpringContextUtils.getBean(ResultMapper.class);
		testResultMapper.insertSelective(result);
		ResultDetailMapper ResultDetailMapper = SpringContextUtils.getBean(ResultDetailMapper.class);

		testPassed.addAll(testFailed);
		for (ResultDetail ResultDetail : testPassed) {
			ResultDetail.setRuntime(date);
			try {
				ResultDetailMapper.insertSelective(ResultDetail);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Object o = result.getParameters()[0];
		TestCase testCase = (TestCase) o;
		long start = result.getStartMillis();
		long end = result.getEndMillis();
		ResultDetail resultDetail = new ResultDetail();
		resultDetail.setCaseid(testCase.getUuid());
		resultDetail.setResult("Y");
		resultDetail.setTaketime(end - start);
		resultDetail.setSystem(testCase.getSystem());
		testPassed.add(resultDetail);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Object o = result.getParameters()[0];
		TestCase testCase = (TestCase) o;
		long start = result.getStartMillis();
		long end = result.getEndMillis();

		ResultDetail resultDetail = new ResultDetail();
		resultDetail.setCaseid(testCase.getUuid());
		resultDetail.setResult("N");
		resultDetail.setTaketime(end - start);
		resultDetail.setSystem(testCase.getSystem());
		String msg = result.getThrowable().getMessage();
		System.out.println(msg);
		resultDetail.setDetailmsg(msg);
		testFailed.add(resultDetail);
		ErrorReport error = new ErrorReport();
		error.setCaseName(testCase.getCasename());
		error.setUrl(testCase.getUrl());
		error.setMsg(msg);
		errorList.add(error);
		System.out.println(error);
		result.getThrowable();
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}
}
