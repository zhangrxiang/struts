package com.zrx.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zrx.dao.UserDao;
import com.zrx.domain.User;

@SuppressWarnings("serial")
public class FirstAction extends ActionSupport {

	private UserDao ud = new UserDao();

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		// ServletActionContext
		return SUCCESS;
	}

	public String add() {
		ud.add(new User());
		System.out.println("add");
		return "add";
	}

	public String delete() {
		System.out.println("delete");
		return "delete";
	}

	public String find() {
		System.out.println("find");
		return "find";
	}

	public String update() {
		System.out.println("update");
		return "update";
	}
}
