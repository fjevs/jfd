package flight;
import static java.lang.System.out;
import java.time.LocalTime;

public class UseFlight {

	public static void main(String[] args) {
		AirplaneFlight flight = new AirplaneFlight(55, Airport.LAX, Airport.LHR);
		LocalTime twoF = LocalTime.of(14, 15);
		LocalTime threeF = LocalTime.of(15, 15);
		
		out.println(flight.getFnumber() + " " + flight.getDepairport() + " " + flight.getArrairport() + " " + flight.getDeptime() + " " + flight.getArrtime());
		
		flight = new AirplaneFlight(55, Airport.LAX, Airport.LHR, twoF, threeF);
		out.println(flight.getFnumber() + " " + flight.getDepairport() + " " + flight.getArrairport() + " " + flight.getDeptime() + " " + flight.getArrtime());
	}

}
