package com.cooksys.stuff;

import java.util.Iterator;

import com.cooksys.enumerations.Store;

public class Car implements Comparable<Car>, Iterable<Integer>{

	private int speed;
	
	private Store origin;
	
	public Car(int speed, Store origin) {
		this.speed = speed;
		this.origin = origin;
	}
	
	public int getSpeed() {
		return speed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + speed;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if(obj instanceof Car)
		{
			Car other = (Car) obj;
			if (speed != other.speed)
				return false;
			return true;
		}
		return false;
		
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int compareTo(Car c) {
		return speed - c.speed;
	}

	public Iterator<Integer> iterator() {
		
		return new CarIterator(speed);
	
	}

}
