package com.spring;

import java.util.ArrayList;

public class EventList {

	ArrayList<Event> eventMenu = new ArrayList<>();
	
	public void insert(Event event) {
		//Fill your code here
		eventMenu.add(event);
		}
	public String recommendfor(Double budget){
		//Fill your code here
		StringBuffer s = new StringBuffer("");
		eventMenu.forEach(action->{
			int tickets = 0;
			if(action.fare <budget) tickets = (int) (budget/action.fare);          
			if(tickets!=0) {
			s.append(action.eventName + "-"+ tickets + "\n");
//				 s = s + action.eventName + "-"+ tickets + " \n";
			}
		});
		return s.toString();
	}

}
