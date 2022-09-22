package Stream;

import java.util.ArrayList;
import java.util.List;

class Product{
	int id;
	
	String names;
	float price;
	public Product(int d,String name,float price) {
		this.id=id;
		this.names=name;
		this.price=price;
	}
	
}

public class Stream8 {
	public static void main(String[] args) {
		
		List<Product>productList=new ArrayList<Product>();
	
	//Adding product
			productList.add(new Product(1,"HP Laptop",25000f));
			productList.add(new Product(2,"DELL Laptop",30000f));
			productList.add(new Product(3,"Lenevo Laptop",28000f));
			productList.add(new Product(4,"Sony Laptop",28000f));
			productList.add(new Product(5,"Apple Laptop",90000f));
			//This is  more compact approach for filtering data
			Float totalprice=productList.stream().map(product->product.price).reduce(0.0f,(sum,price)->sum+price);
			//accumaltig price
			System.out.println(totalprice);
			
			//More precise code
			float totalPrice2=productList.stream().map(product->product.price).reduce(0.0f,Float::sum);
			
			//accumalating price,by refering method of Float class
			System.out.println(totalPrice2);
	}

}
