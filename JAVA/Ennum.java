package Thread;
enum Signal{
	RED(5),ORRANGE(10),GREEN(15);
	private  int x;
	private Signal(int x) {
		this.x=x;
	}
	
	int getIndex() {
		return x;
	}
	
	}
public class Ennum {
	
	public static void main(String[] args) {
		Signal s =Signal.GREEN;
        System.out.println(Signal.GREEN.getIndex());
		System.out.println(s.ordinal());
		System.out.println(s.name());
		System.out.println(s.valueOf("RED"));     
		
	}

}
