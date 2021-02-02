package by.dcAirline.main;

import java.util.ArrayList;
import java.util.List;

public class AirlineList {

	public List<Airline> getInfoboard(List<Airline> airs) {
		List<Airline> result = new ArrayList<>();
		for (Airline air : airs) {
			result.add(air);
		}
		return result;
	}


}