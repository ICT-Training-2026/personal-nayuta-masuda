
public class Driver {
	
	public static void main(String[] args) {
		
		

		System.out.println();
		Product.displayStoreName();
		
		Product keyboard = new Product("キーボード", 3000);
		Product mouse = new Product("マウス",2000);
		
		System.out.println();
		keyboard.display();
		mouse.display();
		
		System.out.println();
		System.out.println("インスタンス数:" + Product.instanceCnt);
		
	}
	
}
