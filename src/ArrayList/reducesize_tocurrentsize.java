package ArrayList;
import java.util.ArrayList;

public class reducesize_tocurrentsize {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.ensureCapacity(20);
		a.add(45);
		a.add(58);
		a.add(98);
		a.add(100);
		a.add(2);
		a.add(85);
		a.add(2, 20);
		a.set(4, 101);
		a.add(4, 102);
		a.add(856);
		a.add(982);
		a.add(0);
		a.add(25);
		a.trimToSize();
		System.out.println(a.size());
	}

}
