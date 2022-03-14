import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.Event;
import com.spring.EventList;

public class Main {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		//Fill your code here
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Budget");
		double amount = Double.parseDouble(scan.nextLine());
		EventList list= new EventList();
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		list.insert((Event)app.getBean("event1"));	
		list.insert((Event)app.getBean("event2"));
		list.insert((Event)app.getBean("event3"));
		String result = list.recommendfor(amount);
		if(result.isEmpty())System.out.println("No Shows available");
		else System.out.println(result);
	}

}
