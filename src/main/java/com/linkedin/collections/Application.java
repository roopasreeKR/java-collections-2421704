package com.linkedin.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String args[]){
		Room nag = new Room("Nag", "double", 2, 234);	
		Room seetha = new Room("Seetha", "single", 1, 134);

		Collection<Room> roomList = List.of(nag, seetha);
		double sumAmount = getSumValueOfRent(roomList);
		System.out.println(sumAmount);
	}

	public static double getSumValueOfRent(Collection<Room> roomList){
		return roomList.stream().mapToDouble(r -> r.getCost()).sum();
	}
}
