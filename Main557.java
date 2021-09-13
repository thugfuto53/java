public class Main557{
	public static void main(String[] args){
		/*
			文字列の調査
		*/
		String s1 = "スッキリjava";
		String s2 = "Java";
		String s3 = "java";
		String s4 = "";
		
		if(s2.equals(s3)){ //等しいかどうか
			System.out.println("s2とs3は等しい");		
		}else{
			System.out.println("s2とs3は異なる");
		}

		if(s2.equalsIgnoreCase(s3)){ //ケースを区別せず等しいかどうか
			System.out.println("s2とs3はケースを区別しなければ等しい");		
		}else{
			System.out.println("s2とs3はケースを区別しても異なる");
		}

		System.out.println("s1の長さは" + s1.length() + "文字");

		if(s4.isEmpty()){
			System.out.println("s4は空文字です");		
		}

		/*
			文字列の検索
		*/	
		String s5 = "Java and JavaScript";
		if(s5.contains("Java")){
			System.out.println("文字列s5は「Java」を含んでいます");
		}
		//この文字列で始まるかどうか
		if(s5.startsWith("Java")){
			System.out.println("文字列s5は「java」が先頭にあります");
		}
		//この文字列で終わるかどうか
		if(s5.endsWith("Script")){
			System.out.println("文字列s5は「Script」が末尾にあります");
		}

		//最初に登場する位置
		System.out.println("文字列s5で最初に「Java」が登場する位置は" + s5.indexOf("Java"));

		//後ろから検索して最初に登場する位置
		System.out.println(s5.lastIndexOf('a'));

		/*
			文字列の切り出し
		*/
		String s6 = "Java Programming";
		//指定位置から末尾までの切り出し
		System.out.println("文字列の4文字目以降は" + s6.substring(3));
		//指定位置から指定位置までの切り出し（ここからこれより前まで）
		System.out.println("文字列s6の4~6文字目は" + s6.substring(3,8));
		//指定位置の1文字切り出し
		System.out.println("文字列s6の6文字目は" + s6.charAt(5));

		/*
			文字列の変換
		*/
		String s7 = "HELLO";
		System.out.println(s7.toLowerCase());
		String s8 = "good";
		System.out.println(s8.toUpperCase());
		String s9 = " Good Morning! ";
		System.out.println(s9.trim());
		System.out.println(s7.replace("L","X"));
		System.out.println(s9.replace("oo","00"));
		
	}
}
