package Thread;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Enum8 {
	public static final  String REGEX="\\bcat\\b";
	public static final  String INPUT="cat cat cat cattie cat";
	
	public static void main(String[] args) {
		Pattern p =Pattern.compile(REGEX);
		Matcher m=p.matcher(INPUT);
		//get a match object
		int count=0;
		
		
		while(m.find()) {
			count++;
			System.out.println("Match number"+count);
			System.out.println("start():"+m.start());
			System.out.println("end():"+m.end());
			
		}
	}
	

}
