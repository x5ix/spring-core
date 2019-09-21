package mih.me.SimpleSpringCoreProjectRobot;

import java.util.Collection;

public class RobotCollection {
	private Collection<Robot> army;

	public void actionArmy() {
		for (Robot i : army) {
			i.action();
		}
	}
	
	public Collection<Robot> getArmy() {
		return army;
	}

	public void setArmy(Collection<Robot> army) {
		this.army = army;
	}
}
