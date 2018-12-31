package com.ecristobale.designpatterns.observer.interfaces;

// Object observable must implement this interface that has a mechanism to attach and
// detach observer objects and also it can have another method to notify to the 
// observers about its change.
public interface IObservable {

	void attachObserver(IObserver observer);
	void detachObserver(IObserver observer);
	void notifyObservers();
}
