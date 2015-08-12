public class EnumExample {

	public enum Week {SATERDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};

	public static void main(String[] args) {
		for (Week w : Week.values())
		System.out.println(w);
	}
}


