package by.dcAirline.main;

import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws ParseException {

		Airline air1 = new Airline("Minsk", "BO1234", "Boeing 777-Dreamliner",
				new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("22.01.2021 14:00"), 5);
		Airline air2 = new Airline("Minsk", "BE7471", "Boeing 747-200",
				new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("23.01.2021 10:00"), 4);
		Airline air3 = new Airline("Moscow", "AI1111", "Airbus 320",
				new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("24.01.2021 00:00"), 3);
		Airline air4 = new Airline("Moscow", "AI6678", "Airbus 370",
				new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("25.01.2021 10:20"), 2);
		Airline air5 = new Airline("Panama", "BS1414", "Boeing 737-300",
				new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("26.01.2021 04:00"), 3);
		Airline air6 = new Airline("Virginia", "DC2222", "DC-9",
				new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("27.01.2021 09:00"), 1);
		List<Airline> airs = Arrays.asList(air1, air2, air3, air4, air5, air6);

		Scanner sc = new Scanner(System.in);
		System.out.print("Ведите пункт назначения: ");
		String t = sc.next();
		System.out.print("День недели int1-7: ");
		int d = sc.nextInt();
		System.out.print("Введите дату вылета в формате dd.MM.yyyy: ");
		String dd = sc.next();
		System.out.print("Введите время вылета в формате HH:mm: ");
		String td = sc.next();
		String tdd = dd + " " + td;
		sc.close();

		{
			AirlineList a2 = new AirlineList();
			System.out.println("Infoboard :");
			List<Airline> resultList0 = a2.getInfoboard(airs);
			for (Airline a : resultList0)
				System.out.println(a.toString());

		}

		{
			AirlineLogic a1 = new AirlineLogic();
			System.out.println("\nСписок рейсов для заданного пункта назначения:");
			List<Airline> resultList1 = a1.getAircraftsByDestination(airs, t);
			for (Airline a : resultList1)
				System.out.println(a.toString());
		}

		{
			AirlineLogic a1 = new AirlineLogic();
			System.out.println("\nСписок рейсов для заданного дня недели:");
			List<Airline> resultList2 = a1.getAircraftsByDay(airs, d);
			for (Airline a : resultList2)
				System.out.println(a.toString());
		}

		{
			AirlineLogic a1 = new AirlineLogic();
			System.out.println("\nСписок рейсов для заданного дня недели, время вылета для которых больше заданного:");
			List<Airline> resultList3 = a1.getAircraftsByDayAndAfterDate(airs, tdd, d);
			for (Airline a : resultList3)
				System.out.println(a.toString());
		}
	}
}
