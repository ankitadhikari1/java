package FactoryDesign;

interface Order{
	public void getOrder();
}

class Pizza implements Order{
	@Override
	public void getOrder() {
		System.out.println("your pizza is ordered.....");
	}
}

class Burger implements Order{
	@Override
	public void getOrder() {
		System.out.println("your Burger is ordered.....");
	}
}

class Fries implements Order{
	@Override
	public void getOrder() {
		System.out.println("your Fries is ordered.....");
	}
}

class Coldrink implements Order{
	@Override
	public void getOrder() {
		System.out.println("your Coldrink is ordered.....");
	}
}


class MenuFactory{
	Order order;
	public Order getOrder(String order) {
		if(order.equalsIgnoreCase("pizza")) {
			return new Pizza();
		}
		else if(order.equalsIgnoreCase("burger")) {
			return new Burger();
		}
		else if(order.equalsIgnoreCase("fries")) {
			return new Fries();
		}
		else
			return new Coldrink();
	}
}



public class RestaurantFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MenuFactory menu = new MenuFactory();
		Order order1 = menu.getOrder("pizza");
		order1.getOrder();
		Order order2 = menu.getOrder("burger");
		order2.getOrder();
		Order order3 = menu.getOrder("fries");
		order3.getOrder();
		Order order4 = menu.getOrder("coldrink");
		order4.getOrder();

	}

}
