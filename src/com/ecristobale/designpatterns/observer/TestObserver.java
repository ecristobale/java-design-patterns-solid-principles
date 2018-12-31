package com.ecristobale.designpatterns.observer;

import com.ecristobale.designpatterns.observer.observers.ConsoleObserver;
import com.ecristobale.designpatterns.observer.subject.Time;

public class TestObserver {

	public static void main(String[] args) {
		Time time = new Time(23, 59, 50);
		ConsoleObserver consoleObserver = new ConsoleObserver(time);
		
		time.start();
	}

}
