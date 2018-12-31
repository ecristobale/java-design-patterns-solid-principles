package com.ecristobale.designpatterns.observer.subject;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ecristobale.designpatterns.observer.interfaces.IObservable;
import com.ecristobale.designpatterns.observer.interfaces.IObserver;

public class Time implements IObservable, Runnable {

	private int secs;
	private int mins;
	private int hours;
	private Thread thread;
	private List<IObserver> observers;
	
	public Time(int hours, int mins, int secs) {
		this.secs = secs;
		this.mins = mins;
		this.hours = hours;
		this.observers = new ArrayList<IObserver>();
	}

	@Override
	public void attachObserver(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void detachObserver(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (IObserver observer : observers) {
			observer.update();
		}
	}

	public void start() {
		thread = new Thread(this);
		thread.start(); // remember, this is going to call run method
	}
	
	@Override
	public void run() {
		synchronized (this) {
			while(true) {
				try {
                    //This executes every 1 second
                    this.wait(1000);
                    if (getSecs() + 1 == 60) {
                        setSecs(0);
                        if (getMins() + 1 == 60) {
                            setMins(0);
                            if (getHours() + 1 == 24) {
                                setHours(0);
                            } else {
                                setHours(getHours() + 1);
                            }
                        } else {
                            setMins(getMins() + 1);
                        }
                    } else {
                        setSecs(getSecs() + 1);
                    }
                    //Notify the observers that there was a change in the object
                    notifyObservers();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Time.class.getName()).log(Level.SEVERE,
                            "An exception ocurred during the execution: ", ex);
                }
			}
		}
	}

	@Override
	public String toString() {
		return ((getHours() < 10 ? "0" + getHours() : getHours()) +
				":" + (getMins() < 10 ? "0" + getMins() : getMins()) + ":" +
				(getSecs() < 10 ? "0" + getSecs() : getSecs()));
	}

	public int getSecs() {
		return secs;
	}

	public void setSecs(int secs) {
		this.secs = secs;
	}

	public int getMins() {
		return mins;
	}

	public void setMins(int mins) {
		this.mins = mins;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
}
