package org.devi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Booking {
	PassangerDetails passangers;
	TrainInfo trains;
//	Date date;
//	TrainInfo trainNo;
	
	Scanner scanner = new Scanner(System.in);
//	private int trainNo;

	public Booking() throws ParseException {
		List<PassangerDetails> passangers = new ArrayList<>();
		List<TrainInfo> trains = new ArrayList<>();
		System.out.println("Enter the passanger name...");
		String passangerName = scanner.nextLine();
		System.out.println("Enter the passanger age...");
		int passangerAge = scanner.nextInt();
		System.out.println("Enter the passanger gender...");
		scanner.next();
		String passangerGender = scanner.nextLine();
		System.out.println("Enter the passanger email...");
		String passangerEmail = scanner.nextLine();
		System.out.println("Enter the passanger phone...");
		long passangerPhone = scanner.nextLong();
//	Berths	
		System.out.print("Berths available are:");
		System.out.print("UPPER, ");
		System.out.print("MIDDLE, ");
		System.out.print("LOWER, ");
		System.out.print("SIDE_UPPER ");
		System.out.print("SIDE_LOWER");
		System.out.println();
		String berth = scanner.next();
		Berth passangerBerth = Berth.valueOf(berth.toUpperCase());
//	Coach	
		System.out.print("Coaches available are:");
		System.out.print("SECOND_SEATER, ");
		System.out.print("SLEEPER, ");
		System.out.print("AC, ");
		System.out.print("GOODS ");
		System.out.println();
		String coach = scanner.next();
		Coach passangerCoach = Coach.valueOf(coach.toUpperCase());
//	Date	
		System.out.println("When do you want to travel?");
		System.out.println("Date in the format of, [dd-mm-yyyy]");
		String date = scanner.next();
		SimpleDateFormat date1 = new SimpleDateFormat("dd-MM-yyyy");
		Date passangerDate = date1.parse(date);

		passangers.add(new PassangerDetails(passangerName, passangerAge, passangerGender, passangerEmail,
				passangerPhone, passangerBerth, passangerCoach, passangerDate));
//		int no;
//		String name;
//		if(no>=123 && no<=125) {
//			int trainNo = scanner.nextInt();
//		}else if(name.contains(name)) {
//			String trainName = scanner.nextLine();
//		}
//		
//		train.add(new TrainInfo(no, name));
		System.out.println("Enter the Train number");
		int passTrainNo = scanner.nextInt();

		trains.add(new TrainInfo(passTrainNo));
		
		String string = trains.toString();
		System.out.println(string);
	}

	public boolean isAvailable(List<Booking> bookings, List<TrainInfo> trains) {
		int cap = 0;
		for(TrainInfo t : trains) {
			if(t.getTrainNo() == Booking.class.) {
				cap = t.getCapacity();
			}
		}
		
		int booked = 0;
		for(Booking b : bookings) {
			if(b.trains.getTrainNo() == b.trains.getPassTrainNo() && b.passangers.getDate().equals(passangers.getDate())) {
				booked++;
			}
		}
		return false;
	}

}
