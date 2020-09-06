package collections;

public class Rectancle {

	private int length;
	private int width;
	
	public Rectancle(int length,int width){
		this.length=length;
		this.width=width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Rectancle))
			return false;
		Rectancle rect = (Rectancle) obj;
		return rect.getLength() == this.length && rect.getWidth() == this.width;
	}

}
