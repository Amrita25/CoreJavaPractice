package practice;

public interface IMonolink<E> {
	
	void setData(E e);
	E getData();
	void setNext(IMonolink<E> next);
	IMonolink<E> getNext();

}
