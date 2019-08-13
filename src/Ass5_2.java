//import java.util.*;
 class LinearQueue<G>
{
	private G[] arr;
	private int size,front,rear;
	
	public LinearQueue()
	{
		size=5;
		front=0;
		rear=-1;
		arr=(G[])new Object[size];
	}
	
	public boolean isEmpty()
	{
		return front==rear;
	}
	
	public boolean isFull()
	{
		return rear==size-1;
		
	}
	
	public void insert(G x)
	{
		if(!isFull())
			arr[++rear]=x;
		else
			System.out.println("overflow");
	}
	
	public G remove()
	{
		if(!isEmpty())
			return arr[front++];
		else
			System.out.println("underflow");
		return null;
	}	
}
public class Ass5_2 {

	public static void main(String[] args) {
		LinearQueue <Integer> l=new LinearQueue<>();
		l.insert(2);
		l.insert(4);
		l.insert(6);
		l.insert(8);
		l.insert(10);
		System.out.println(l.remove());
		System.out.println(l.remove());
		System.out.println(l.remove());

	}

}
