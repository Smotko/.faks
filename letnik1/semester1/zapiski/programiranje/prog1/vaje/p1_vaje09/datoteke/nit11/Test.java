public class Test {
	
	public static void main(String[] args) {
		
		String[] imena = { "Ivan", "Ana", "Tina" };
		
		for (String ime : imena)
			System.out.println(ime);
		
		for (int i = 0; i < imena.length; i++) {
			String ime = imena[i];
			System.out.println(ime);
		}
	}
}