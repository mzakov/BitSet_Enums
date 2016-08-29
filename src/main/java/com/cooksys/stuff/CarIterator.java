package com.cooksys.stuff;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CarIterator implements Iterator<Integer> {

	int i = 0;
	int speed;
	
	public CarIterator(int speed) {
		this.speed = speed;
	}
	
	public boolean hasNext() {
		return i < speed;
	}

	public Integer next() {
		
		if(hasNext())
			return i++;
		else
			throw new NoSuchElementException();
	}

}
