package practice;

public class CompNode<E extends Comparable<E>> implements Comparable<CompNode<E>>{
	
	private E data;

	@Override
	public int compareTo(CompNode o) {
		// TODO Auto-generated method stub
		if(o.getData().equals(this.getData())){
			return 1;
		}
		return 0;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	
}
