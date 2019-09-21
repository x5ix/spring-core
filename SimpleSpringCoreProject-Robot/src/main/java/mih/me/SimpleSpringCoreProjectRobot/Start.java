package mih.me.SimpleSpringCoreProjectRobot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//		Robot robot = (Robot)context.getBean("robot");
//		robot.action();
//		System.out.println(robot);
//		robot = (Robot)context.getBean("robot");
//		System.out.println(robot);
		
		RobotCollection army = (RobotCollection)context.getBean("robotCollection");
		RobotConveyor robotConveyor = (RobotConveyor)context.getBean("robotConveyor");
		army.getArmy().add(robotConveyor.createRobot());
		RobotCollection redArmy = (RobotCollection)context.getBean("redRobotCollection");
		redArmy.actionArmy();
	}
}
