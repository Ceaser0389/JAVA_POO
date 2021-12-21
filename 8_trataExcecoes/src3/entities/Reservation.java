package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException{
		 
		if (!checkOut.after(checkIn)){
				throw new DomainException("Check-out date must be  after check-in date" ); 
			}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckoIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	
	public long duration() {
		
		@SuppressWarnings("deprecation")
		long diff = checkOut.getTime() - checkIn.getDate();
		return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
	}
	
	
	                                                       //lançando ex personalizada
	public void updateDates(Date checkIn , Date checkOut ) throws DomainException {
		
		Date now = new Date();
		if(checkOut.before(now) || checkOut.before(now)) {
			throw new DomainException("Error in reservation: "
					+ "Check-in date must be "
					 );
		}
		 if (!checkOut.after(checkIn)){
			throw new DomainException("Check-out date must be  after check-in date" ); 
		}
		this.checkIn  =  checkIn;
		this.checkOut = checkOut;	
	
		
	}
	
	@Override
	public String  toString() {
	return  "Room "
			+ roomNumber
			+ ",  check-in: "
			+ sdf.format(checkIn)
			+ ",  check-out"
			+ sdf.format(checkOut)
		    + ", "
		    + duration()
		    + " nights ";
			
	}
}
