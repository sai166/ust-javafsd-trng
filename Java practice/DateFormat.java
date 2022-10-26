
import java.text.DateFormat;
import java.util.*;
public class Dateformat{
   public static void main(String[] args) throws Exception{
      Date date_time = new Date();
      Locale England_time = new Locale("en", "ch");
      DateFormat de = DateFormat.getDateInstance(DateFormat.FULL, England_time);
      System.out.println("The England Format is: " + de.format(date_time));
      Locale Italy_time = new Locale("it", "ch");
      DateFormat di = DateFormat.getDateInstance(DateFormat.FULL, Italy_time);
      System.out.println("The Italian Format is: " + di.format(date_time));
   }
}