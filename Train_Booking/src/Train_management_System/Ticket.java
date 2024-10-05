package Train_management_System;

public class Ticket 
{
	 private int ticketId;
	 private int ticketCost;
	 private String boardingpoint;
	 private String destinationpoint;
	 
	 public Ticket() {}
	 
	 public Ticket(int ticketId,int ticketCost,String boardingpoint,String destinationpoint)
	 {
		this.ticketId=ticketId;
		if (ticketCost>=100&&ticketCost<=800) 
		{
			this.ticketCost=ticketCost;
		}
		else 
		{
			System.out.println("Invalid Ticket Cost");

		}
		if(boardingpoint.equalsIgnoreCase("kachiguda")||boardingpoint.equalsIgnoreCase("Secundrabad")||boardingpoint.equalsIgnoreCase("lingampally"))
		{
			this.boardingpoint=boardingpoint;
		}
		else 
		{
			System.out.println("Invalid Boarding Point");
		}
		if (destinationpoint.equalsIgnoreCase("banglore")||destinationpoint.equalsIgnoreCase("Chennai")||destinationpoint.equalsIgnoreCase("Pune"))
		{
			this.destinationpoint=destinationpoint;
		}
		else 
		{
			System.out.println("Invalid Boarding Point");
		}
	 }

	public int getTicketId() 
	{
		return ticketId;
	}

	public int getTicketCost() 
	{
		return ticketCost;
	}

	public String getBoardingpoint() 
	{
		return boardingpoint;
	}

	public String getDestinationpoint() 
	{
		return destinationpoint;
	}

	public void setTicketCost(int ticketCost) 
	{
		this.ticketCost = ticketCost;
	}
	 
	public void display()
	{
		System.out.println(getTicketId());
		System.out.println(getTicketCost());
		System.out.println(getBoardingpoint());
		System.out.println(getDestinationpoint());
	}

	@Override
	public String toString() 
	{
		return "ticketId=" + ticketId + "\n ticketCost=" + ticketCost + "\n boardingpoint=" + boardingpoint
				+ "\n destinationpoint=" + destinationpoint + "\n------------------------------------";
	}
	 
	
}
