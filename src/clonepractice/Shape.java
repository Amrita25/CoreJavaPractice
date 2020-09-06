package clonepractice;

import java.util.Date;

public class Shape implements Cloneable{
	
	private  String typename;
	private  Date date;
	
	public Shape(String typename,Date date){
		this.typename=typename;
		this.date=date;
	}

	public String getTypename() {
		return typename;
	}

	public Date getDate() {
		
		//return new Date();
		return (Date) date.clone();
	}	
	
	@Override
	public Object clone(){
		Object obj=null;
		try {
			obj=super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return obj;
	}

	/*public void setTypename(String typename) {
		this.typename = typename;
	}

	public void setDate(Date date) {
		this.date = date;
	}*/

}
