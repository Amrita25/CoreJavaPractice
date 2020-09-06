package reflection;

public class Flower {
	
	private String flowerName;
	private String flowerColor;
	private boolean isIndoor;
	
	
	public Flower(String flowerName, String flowerColor, boolean isIndoor) {
		super();
		this.flowerName = flowerName;
		this.flowerColor = flowerColor;
		this.isIndoor = isIndoor;
	}
	
	public String getFlowerName() {
		return flowerName;
	}
	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}
	public String getFlowerColor() {
		return flowerColor;
	}
	public void setFlowerColor(String flowerColor) {
		this.flowerColor = flowerColor;
	}
	public boolean isIndoor() {
		return isIndoor;
	}
	public void setIndoor(boolean isIndoor) {
		this.isIndoor = isIndoor;
	}
	
	@Override
	public String toString(){
		return this.flowerName+" with color "+this.flowerColor;
	}
	
	private void print(){
		System.out.println(this);
	}
	

}
