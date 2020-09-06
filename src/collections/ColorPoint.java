package collections;

public class ColorPoint extends Point{

	private Color color;
	
	public ColorPoint(){
		
	}
	
	public ColorPoint(int x,int y,float p,Double dv,Color color){
		super(x, y, p, dv);
		this.color=color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	////breaks symmetry
	/*@Override
	public boolean equals(Object obj){
		
		if(!(obj instanceof ColorPoint))
			return false;
		return super.equals(obj) && ((ColorPoint)obj).getColor().equals(this.color);
	}*/
	
	//breaks transitivity contract
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Point))
			return false;
		
		//if the object is a simple point object then we will not consider color
		if(!(obj instanceof ColorPoint))
			return super.equals(obj);
		
		//if the object is a ColorPoint object then we will consider color
		return super.equals(obj) && ((ColorPoint)obj).getColor().equals(this.color);
	}
	   
}
