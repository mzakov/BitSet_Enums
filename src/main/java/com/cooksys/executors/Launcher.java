package com.cooksys.executors;

import static com.cooksys.enumerations.Store.MEMPHIS;
import static com.cooksys.enumerations.Store.NASHVILLE;
import static com.cooksys.enumerations.Store.JACKSON;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.cooksys.enumerations.Permissions;
import com.cooksys.enumerations.Store;
import com.cooksys.stuff.Car;

public class Launcher {

	public static void main(String... args) throws InterruptedException, ExecutionException {
		
		Car ferrari = new Car(100, NASHVILLE);
		Car jalopy = new Car(18, MEMPHIS);
		
		Integer[] numOfCars = new Integer[3];
		
		Store.values();
				
		MEMPHIS.getProfit();
		
		NASHVILLE.getProfit();
		
		BitSet setOfBits = new BitSet(Store.values().length);
		
		setOfBits.flip(JACKSON.ordinal());
		
		setOfBits.flip(NASHVILLE.ordinal());
		
		//number of bits that are set to 1/true
		System.out.println(setOfBits.cardinality());
		
		
		//First store available that is online
		Store.values()[setOfBits.nextSetBit(0)].setProfit(500D);
	
		BitSet myPermissions = new BitSet(Permissions.values().length);
		BitSet yourPermissions = new BitSet(Permissions.values().length);

		myPermissions.set(Permissions.EXECUTE.ordinal());
		myPermissions.set(Permissions.WRITE.ordinal());
		
		yourPermissions.set(Permissions.EXECUTE.ordinal());
		yourPermissions.set(Permissions.READ.ordinal());
		
		myPermissions.and(yourPermissions);
		
		for(Permissions perm : Permissions.values())
		{
			if(myPermissions.get(perm.ordinal()))
			{
				System.out.println(perm.name());
			}
		}
		
		List<Car> list = new ArrayList<Car>();
		
		list.add(ferrari);
		list.add(jalopy);
		
		Comparator<Car> compare = new Comparator<Car>() {

			public int compare(Car car1, Car car2) {
				return car1.getSpeed() - car2.getSpeed();
			}
		};
		
		list.sort(null);
		
		labeledLoop : for(Integer b : ferrari)
		{
			for(Car c : list)
			{
				if(true)
					break labeledLoop;
				
				//here
			}
		}
	}

}
