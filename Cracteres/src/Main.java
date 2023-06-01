import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numero = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			System.out.print("Numero: ");
			int guardar = sc.nextInt();
			numero.add(guardar);
		}
		System.out.println("Elementos Guardados: " + numero.size());

	}
}
