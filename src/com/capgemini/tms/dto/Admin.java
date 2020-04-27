package com.capgemini.tms.dto;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Admin {

	@Override
	public String toString() {
		return "Admin [testId=" + testId + ", testTitle=" + testTitle + ", testduration=" + testduration
				+ ", starttime=" + starttime + ", endtime=" + endtime + "]";
	}

	int testId;
	String testTitle;
	LocalTime testduration;
	LocalDateTime starttime;
	LocalDateTime endtime;
	int userId;

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestTitle() {
		return testTitle;
	}

	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}

	public LocalTime getTestduration() {
		return testduration;
	}

	public void setTestduration(LocalTime testduration) {
		this.testduration = testduration;
	}

	public LocalDateTime getStarttime() {
		return starttime;
	}

	public void setStarttime(LocalDateTime starttime) {
		this.starttime = starttime;
	}

	public LocalDateTime getEndtime() {
		return endtime;
	}

	public void setEndtime(LocalDateTime endtime) {
		this.endtime = endtime;
	}

	public void admin() {
	}

	public void admin(int testId, String testTitle, LocalTime testduration, LocalDateTime starttime,
			LocalDateTime endtime) {
	
		this.testId = testId;
		this.testTitle = testTitle;
		this.testduration = testduration;
		this.starttime = starttime;
		this.endtime = endtime;
	}

	public int getuserId() {
	//	Scanner sc=new Scanner(System.in);
		//userId=sc.nextInt();
		return userId;
		// TODO Auto-generated method stub
	}

	public void setuserId(int userId) {
		this.userId=userId;
		// TODO Auto-generated method stub
		
	}

}
