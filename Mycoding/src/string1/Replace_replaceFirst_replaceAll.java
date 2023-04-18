package string1;

public class Replace_replaceFirst_replaceAll {
	public static void main(String[] args) {
		String a=" woow i mean just woow!! thats how dk woww woow, got your woow";
		a=(a.replace("woow","boseDk"));
		System.out.println(a);
		
		String b=" woow i mean just woow!! thats how dk woww woow, got your woow";
		System.out.println(b.replaceFirst("woww","kokoDk"));
		
		System.out.println(b.replaceAll("woww", "Hii"));
		System.out.println(b.replaceAll("woow", "Hii"));
		
	}

}
