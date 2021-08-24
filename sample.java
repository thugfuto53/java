public class sample{
	public static void main(String[] args){
		print p = new print();
		System.out.println(p.getstr("Hello World"));
	}
}

class print{
	String str = "Helo World";
	public String getstr(String str){
		return str;
	}
}
