package com.ecristobale.designpatterns.observer.interfaces;

// Objects observers must implement that interface that has at least one method that
// defines the action to do when the the observable object changes its state
public interface IObserver {

	void update();
}
