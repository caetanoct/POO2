import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		ArrayList<Par> pares = new ArrayList<Par>();

		pares.add(new Par("123", 234));
		pares.add(new Par(234, "123"));

		for (Par par : pares) {
			System.out.println(par.toString());
		}
	}
}
