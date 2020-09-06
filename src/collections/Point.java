package collections;

public class Point {

	private int x;
	private int y;
	private float p;
	private Double dv;
	private Rectancle shape;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public float getP() {
		return p;
	}
	public void setP(float p) {
		this.p = p;
	}
	public Double getDv() {
		return dv;
	}
	public void setDv(Double dv) {
		this.dv = dv;
	}
	
	public Point(int x,int y,float p,Double dv){
		this.x=x;
		this.y=y;
		this.p=p;
		this.dv=dv;
	}
	@Override
	public boolean equals(Object obj){
		
		if(obj == this)
			return true;
		if(!(obj instanceof Point))
			return false;
			
			Point point = (Point)obj;
			boolean result= point.getX() == this.x && point.getY() == this.y && point.getShape()!= null && point.getShape().equals(this.shape);
			//for float and double we need to use compare method to handle NaN and -0.0f
			result = (Float.compare(point.getP(), this.p) == 0 && Double.compare(point.getDv(), this.dv) == 0)
					? result : false;
			return result;
		
	}
	public Rectancle getShape() {
		return shape;
	}
	public void setShape(Rectancle shape) {
		this.shape = shape;
	}
	
	protected void print(){
		System.out.println("inside point class");
	}
	
	public Point(){
		
	}

}
