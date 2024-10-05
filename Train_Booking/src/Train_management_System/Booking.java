package Train_management_System;

import java.util.ArrayList;
import java.util.Iterator;

public class Booking 
{
	public Passenger p;
	public Ticket t;
	
	ArrayList<Ticket> ticket = new ArrayList<Ticket>();
	ArrayList<Passenger> passenger = new ArrayList<Passenger>();
	
	//Book Ticket
	public void bookTicket(Ticket t)
	{
		ticket.add(t);
		System.out.println("Ticket Booked Successfully");
	}
	
	// Display Ticket
	public void displayTicket()
	{
		if(ticket.isEmpty())
		{
			System.out.println("NO Tickets ARE Booked");
		}
		else
		{
			ticket.forEach((ticket)-> System.out.println(ticket));
		}
	}
	
	//Display Passengers 
	public void displayPassengers()
	{
		if(passenger.isEmpty())
			System.out.println("NO Passengers ARE ADDED");
		else
			passenger.forEach((passenger)-> System.out.println(passenger));
	}
	
	//Search Ticket based On ID
	public void searchTicket(int id)
	{
		boolean isFound=false;
		if(ticket.isEmpty())
		{
			System.out.println("NO Tickets ARE ADDED");
		}
		else
		{
			for (Ticket t : ticket) 
			{
				if(t.getTicketId()==id)
				{
					System.out.println("Ticket ID IS MATCHED");
					t.display();
					isFound=true;
				}
			}
		}
		if (isFound==false) 
		{
			System.out.println("INVALID ID");
		}
	}
	
	//Update Passenger name Based on Ticket ID
	public void updatePassengerName(int id,String name)
	{
		boolean isFound=false;
		if(passenger.isEmpty())
		{
			System.out.println("NO Passengers Are Added");
		}
		else
		{
			for (Passenger p : passenger) 
			{
				if(t.getTicketId()==id)
				{
					System.out.println("Ticket ID MATCHED");
					p.setName(name);
					System.out.println(p.getName());
				}
			}
		}
		if(isFound==false)
		{
			System.out.println("INVALID Ticket ID");
		}
	}
	
	//Cancel Ticket Id Based On Id
	public void cancelTicket(int id)
	{
		Iterator<Ticket> tc = ticket.iterator();
		boolean isCancelled=false;
		while(tc.hasNext())
		{
			Ticket t = tc.next();
			if(t.getTicketId()==id)
			{
				tc.remove();
				System.out.println("Ticket Cancelled SUCCESSFULLY");
				isCancelled=true;
			}
		}
		if (isCancelled==false) 
		{
			System.out.println("Invalid Ticket Id");
		}
	}
	
	//Display Passengers based on Destination point
	public void displayPassengerDestination(String destinationpoint)
	{
		if(passenger.isEmpty())
		{
			System.out.println("NO Passengers ARE ADDED");
		}
		else
		{
			if(t.getDestinationpoint().equals(destinationpoint))
			{
				for (Passenger passenger2 : passenger) 
				{
					System.out.println(passenger2);
				}
			}
			else
			{
				System.out.println("Destination point not matched with any passenger");
			}
		}
	}
	
	public void design()
	{
		String s ="\n 🚂🚂🚂🚂***********Welcome to TicketBooking*************🚂🚂🚂🚂";
		for(int i=0;i<=s.length()-1;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("HANDLED");
			}
			System.out.print(s.charAt(i));
			System.out.print("");
		}
	}
}
