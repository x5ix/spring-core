package mih.me.SimpleSpringCoreProjectRobot.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import mih.me.SimpleSpringCoreProjectRobot.interfaces.IHead;

public class SonyHead implements IHead, InitializingBean, DisposableBean {

	@Override
	public void think() {
		System.out.println("Thinking about sony...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(this + "destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(this + " afterPropertiesSet method");
	}
	
}
