package com.yf.designpattern.proxy;

public class AdminProxy implements Admin {
	private Admin admin;

	public AdminProxy(Admin admin) {
		this.admin = admin;
	}

	@Override
	public void doSomething() {
		System.out.println("本次管理员操作时间为："+System.currentTimeMillis());
		//此处防止实例化代理时传入null而引发空指针异常
		if(admin==null){
			admin=new Administrator();
		}
		admin.doSomething();
	}

}
