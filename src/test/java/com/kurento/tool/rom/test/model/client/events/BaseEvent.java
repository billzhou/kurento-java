package com.kurento.tool.rom.test.model.client.events;


public class BaseEvent implements Event {

	private String prop2;

	public BaseEvent(String prop2) {
		super();
		this.prop2 = prop2;
	}

	public String getProp2() {
		return prop2;
	}

	public void setProp2(String prop2) {
		this.prop2 = prop2;
	}

}