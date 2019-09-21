package mih.me.SimpleSpringCoreProjectRobot;

import mih.me.SimpleSpringCoreProjectRobot.interfaces.IHead;
import mih.me.SimpleSpringCoreProjectRobot.interfaces.ILegs;

public class Robot{
	private IHead head;
	private ILegs legs;
	private String color;
	
	public Robot() {
		super();
	}
	public Robot(IHead head, ILegs legs) {
		super();
		this.head = head;
		this.legs = legs;
	}
	
	public void action() {
		System.out.println("\n");
		head.think();
		legs.go();
		System.out.println("color: "+ color);
	}
	
	public void initFromRobot() {
		System.out.println("Init method from robot: " + this);
	}
	
	public IHead getHead() {
		return head;
	}
	public void setHead(IHead head) {
		this.head = head;
	}
	public ILegs getLegs() {
		return legs;
	}
	public void setLegs(ILegs legs) {
		this.legs = legs;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
