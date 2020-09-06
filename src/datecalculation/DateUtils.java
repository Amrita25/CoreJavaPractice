package datecalculation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateUtils {
	
	private static Calendar addMonths(String datestr,int noOfMonths){
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		Date tempDate=null;
		Calendar finaldate=null;
		try {
			tempDate=sdf.parse(datestr);
			finaldate=Calendar.getInstance();
			finaldate.setTime(tempDate);
			
			finaldate.add(Calendar.MONTH, 5);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return finaldate;
		
	}
	
	public static void main(String [] args){
		
		Calendar finaldate=addMonths("10/05/2017",5);
		System.out.println("Date after 5 months "+ (finaldate.get(Calendar.MONTH) + 1)
                + "-"
                + finaldate.get(Calendar.DATE)
                + "-"
                + finaldate.get(Calendar.YEAR));
		
	}

}
