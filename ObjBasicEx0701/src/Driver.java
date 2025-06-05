public class Driver {
	
	public static void main(String[] args) {
		
		

		System.out.println();
		Product.displayStoreName();
		
		Product keyboard = new Product("キーボード", 4000);
		Product mouse = new Product("マウス");
		
		keyboard.display();
		mouse.display();
		
		System.out.println("---価格再設定後---");
		
		keyboard.down();
		
		mouse.up(2000);
		
		keyboard.display();
		mouse.display();
	}
	
}
