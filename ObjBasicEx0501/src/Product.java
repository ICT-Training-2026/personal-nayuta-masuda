
public class Product {

	String name;
	
	int price;
	
	
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	int up(int amt) {
		return price += amt;
	}
	
	int down(int amt) {
		return price -= amt;
	}
	
	void display() {
		System.out.println(name + ":" + price + "円");
	}
}
