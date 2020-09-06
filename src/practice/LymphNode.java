package practice;

public class LymphNode<E> implements IMonolink<E> {
	
	private E data;
	private IMonolink<E> next;

	@Override
	public void setData(E e) {
		data=e;
		
	}

	@Override
	public E getData() {
		
		return data;
	}

	@Override
	public void setNext(IMonolink<E> next) {
		this.next=next;
		
	}

	@Override
	public IMonolink<E> getNext() {
		
		return next;
	}
	
	

	

	

}
