package com.oww.app;

public class Result {
	private String  path;
	private boolean isRedirect;
	
	public Result() {}

	//private -> get/set
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isRedirect() {
		return isRedirect;
	}

	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	
	
}