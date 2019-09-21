package mih.me.SimpleSpringCoreProjectRobot;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ActionReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("\naction method from actionReplacer");
		return null;
	}

}
