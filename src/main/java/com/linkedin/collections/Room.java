package com.linkedin.collections;

public class Room {

private String name;
private String type;
private int capacity;
private double cost;

	public Room(String name, String type, int capacity, double cost){
		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
         this.name= name;

    }

	public String getType(){
		return type;
	}

	public void setType(String type){
		this.type = type;
	}

	public int getCapacity(){
		return capacity;
	}

	public void setCapapcity(){
		this.capacity = capacity;
	}

	public double getCost(){
		return cost;
	}

	public void setCost(double cost){
		this.cost = cost;
	}

	@Override
	public String toString(){
       return "name=" + name+"type=" +type +"capacity="+capacity +"cost="+cost;
	}
}
