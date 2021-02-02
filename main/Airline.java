package by.dcAirline.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {

	private String destination;
	private String flightNumber;
	private String typeOfAircraft;
	private Date timeOfDeparture;
	private int dayOfWeek;

	public Airline(String destination, String flightNumber, String typeOfAircraft, Date time, int dayOfWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.typeOfAircraft = typeOfAircraft;
		this.timeOfDeparture = time;
		this.dayOfWeek = dayOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void seFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getTypeOfAircraft() {
		return typeOfAircraft;
	}

	public void setTypeOfAircraft(String typeOfAircraft) {
		this.typeOfAircraft = typeOfAircraft;
	}

	public Date getTimeOfDeparture() {
		return timeOfDeparture;
	}

	public void setTimeOfDeparture(String time) throws ParseException {
		this.timeOfDeparture = new SimpleDateFormat("dd.MM.yyyy HH:mm").parse(time);
	}

	public int getDayOfWeek() {
		return dayOfWeek;
	}

	public void seDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dayOfWeek;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
		result = prime * result + ((timeOfDeparture == null) ? 0 : timeOfDeparture.hashCode());
		result = prime * result + ((typeOfAircraft == null) ? 0 : typeOfAircraft.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (dayOfWeek != other.dayOfWeek)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber == null) {
			if (other.flightNumber != null)
				return false;
		} else if (!flightNumber.equals(other.flightNumber))
			return false;
		if (timeOfDeparture == null) {
			if (other.timeOfDeparture != null)
				return false;
		} else if (!timeOfDeparture.equals(other.timeOfDeparture))
			return false;
		if (typeOfAircraft == null) {
			if (other.typeOfAircraft != null)
				return false;
		} else if (!typeOfAircraft.equals(other.typeOfAircraft))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DCAirline [destination=" + destination + ", flightNumber=" + flightNumber + ", typeOfAircraft="
				+ typeOfAircraft + ", timeOfDeparture=" + timeOfDeparture + ", dayOfWeek=" + dayOfWeek + "]";
	}

}