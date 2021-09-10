public class Main529{
	public static void printAnything(Object o){
		System.out.println(o.toString());
	}

	public static void main(String[] args){
		Empty e = new Empty();
		String s = e.toString();
		System.out.println(s);

		//Object[] o = {new Empty(). "こんにちは", new Wand()};
		Empty e2 = new Empty();
		String s2 = "こんにちは";
		Wand w2 = new Wand();

		Object[] o = {e2, s2, w2};

		for(Object o2 : o){
			System.out.println(o2.toString());		
		}

		printAnything(w2);
	}
}
