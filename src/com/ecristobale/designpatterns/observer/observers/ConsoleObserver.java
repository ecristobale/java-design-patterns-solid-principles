package com.ecristobale.designpatterns.observer.observers;

import com.ecristobale.designpatterns.observer.interfaces.IObservable;
import com.ecristobale.designpatterns.observer.interfaces.IObserver;

// That class is going to implement IObserver in order to observe the observable
// object: Time. When is called update from the object it just is going to show him
public class ConsoleObserver implements IObserver {

	private IObservable observable;
	
	public ConsoleObserver(IObservable observable) {
		this.observable = observable;
		this.observable.attachObserver(this);
	}
	
	@Override
	public void update() {
		System.out.println(observable.toString());
	}

}
