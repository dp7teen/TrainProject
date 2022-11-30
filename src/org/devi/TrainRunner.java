package org.devi;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TrainRunner {

	TrainInfo trains;
	public static void main(String[] args) throws InterruptedException, ParseException {

		List<TrainInfo> trains = new ArrayList<>();
		List<Booking> bookings = new ArrayList<>();
		
		

		trains.add(new TrainInfo(123, "Jan_sadhapthi"));
		trains.add(new TrainInfo(124, "Cholan_express"));
		trains.add(new TrainInfo(125, "Thiruchendur_express"));
		
		

		Scanner scanner = new Scanner(System.in);
		String opt;
		do {
			System.out.println("Welcome to DPBookings");
			System.out.println();
			System.out.println("These are the available services");
			for(TrainInfo train : trains) {
				train.trainDetails();
			}
			System.out.println("Select by typing the valid options,");
			System.out.println("type 'Yes' for Booking");
			System.out.println("type 'No' for Exit");
			System.out.println();
			
			opt = scanner.next();
			if (opt.contains("Yes")) {
				System.out.println("Are you ready to book for your happy journey?  Com'on let's do it....");
//				for(int i =1; i<=5; i++) {
//					System.out.println(i);
//				    Thread.sleep(1000);
//				}
				System.out.println("Start...");
				Thread.sleep(1000);
				Booking booking = new Booking();
				
				if(booking.isAvailable(bookings, trains)) {
					bookings.add(booking);
				}else {
					System.out.println("Try another Date or Train... It seems like the train that you're looking for is already full");
				}
				
			} else if (opt.contains("No")) {
				System.out.println("Thankyou for using DPBookings");
			} else if (opt.contains("yes")) {
				System.out.println("Make sure, that you have entered 'y' as 'Y'");
			} else if (opt.contains("no")) {
				System.out.println("Make sure, that you have entered 'n' as 'N'");
			}

		} while (opt.contains("Yes"));

	}

	
}
