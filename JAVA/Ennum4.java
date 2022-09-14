package Thread;

public class Ennum4 {
	enum Position{
		Reema("Panda"),Himanshu("Bhardwaj"),Geetanjali("Sharma");
		
		String IName;
		
		Position(String s){
			
			IName=s;
		}
		String showsPosition() {
			return IName;
		}
		
	}
	public static void main(String[] args) {
		for(Position pos:Position.values()) {
			int val=pos.ordinal()+1;
			
			System.out.println("First name="+pos+"\nLast name ="+pos.showsPosition() +"\nPosition in class="+val);
			System.out.println();
		}
	}

}
