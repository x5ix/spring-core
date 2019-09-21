package mih.me.SimpleSpringCoreProjectRobot.impl;

import mih.me.SimpleSpringCoreProjectRobot.interfaces.IHead;

public class ToshibaHead implements IHead {

	@Override
	public void think() {
		System.out.println("Thinking about toshiba...");
	}

}
