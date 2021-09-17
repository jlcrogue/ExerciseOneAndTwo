public class ExerciseOne {
	public static void main(String[] args) {
		int i = 1;
		do {
			if(i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		} while(i < 10);
		System.out.println(getAlphabetArray());
	}

	public static String getAlphabetArray() {
		String a = "a";
		int b = 98;
		do {
			a += (char) b;
			b++;
		} while(b <= 122);
		return a;
	}
}
