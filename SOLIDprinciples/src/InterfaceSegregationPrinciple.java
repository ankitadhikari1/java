interface RiderInterface{
	public void Bookride();
	public void pay();
	public void rateDriver();
}

interface DriverInterface{
	public void acceptRide();
	public void trackEarning();
	public void ratePassenger();
}

class Rider implements RiderInterface{
	@Override
	public void Bookride() {
		System.out.println("ride booked successfull");
	}
	@Override
	public void pay() {
		System.out.println("payment successfull");
	}
	@Override
	public void rateDriver() {
		System.out.println("driver is rated");
	}
}

class Driver implements DriverInterface{
	@Override
	public void acceptRide() {
		System.out.println("ride accepted");
	}
	@Override
	public void trackEarning() {
		System.out.println("earning displayed");
	}
	@Override
	public void ratePassenger() {
		System.out.println("passenger is rated");
	}
}


public class InterfaceSegregationPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rider rdr = new Rider();
		Driver dvr = new Driver();
		
		rdr.Bookride();
		rdr.rateDriver();
		rdr.pay();
		
		System.out.println(".....................");
		
		dvr.acceptRide();
		dvr.trackEarning();
		dvr.ratePassenger();

	}

}
