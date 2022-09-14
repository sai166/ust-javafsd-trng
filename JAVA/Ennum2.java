package Thread;
enum Size1{
	SMALL,MEDIUM,LARGE,EXTRALARGE
}
class Test{
	Size pizzaSize;
	public Test(Size pizzaSize) {
		this.pizzaSize=pizzaSize;
	}
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL:
		System.out.println("I Ordered a small size pizza.");
	break;
		case MEDIUM:
	
		System.out.println("I dont known which one to order.");
		break;
		default:
			System.out.println("I dont know which one to  order.");
			break;
		
		}
	}
}


public class Ennum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1= new Test(Size.MEDIUM);
		t1.orderPizza();

	}

}
