import com.zensar.*;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Manager m=new Manager();
m.display();

MarketingExecutive me=new MarketingExecutive();
me.display();
Employee7 e=new Manager();
printObjects(e);
MarketingExecutive me1=new MarketingExecutive();
printObjects(me1);
	}
public static void printObjects(Employee7 e) {
	e.display();
}
}
