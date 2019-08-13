//generics
//public class Test {
/** void swap(G a,G b)
{
	G temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println(a+" "+b);
}**/
	class Stack<G>//class Stack
	{
	
		private int top,size;
		private G []arr;//private int []arr;
		
		public Stack()
		{
			top=-1;
			size=5;
			arr=(G[])new Object[size];//arr=new int[size];
		}
		
		public void push(G data)//int data)
		{
			if(!isfull())
				arr[++top]=data;
			else
				System.out.println("overflow");

		}
		
		public G pop()//int pop()
		{
			if(!isempty())
				return arr[top--];
			else
				System.out.println("underflow");
			return null;//return -1;
		}
		
		public boolean isfull()
		{
			return top==size-1;
		}
		
		public boolean isempty()
		{
			return top==-1;
		}
	}	
		
public class Test
{
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Test<Integer> t1=new Test<>();
		t1.swap(10, 20);
		Test<String> t2=new Test<>();
		t2.swap("a","b" );**/
		Stack <Integer> s=new Stack<>();//Stack s=new Stack();
		s.push(12);
		s.push(32);
		s.push(62);
		s.push(72);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		Stack <String> s2=new Stack<>();
		s2.push("h");
		s2.push("o");
		s2.push("l");
		s2.push("a");
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());

		
	}

	}
	
