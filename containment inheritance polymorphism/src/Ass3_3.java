import com.zensar.pack1.*;
import com.zensar.pack2.*;
import static com.zensar.pack2.Batch.fun;


public class Ass3_3 {

	public static void main(String[] args) {
Student s1=new Student();
s1.display();
Student s2=new Student(1,"yasha");
s2.display();
Batch b1=new Batch();
b1.display();
Batch b2=new Batch("PCB",20);
b2.display();
fun();

	}

}
