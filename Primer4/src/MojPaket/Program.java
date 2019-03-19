package MojPaket;

public class Program {
	public static void main (String [] args) {
		Pravugaonik pravugaonik=new pravugaonik(3,5);
		Krug krug=new Krug(5);
		System.out.print(pravugaonik.toString());
		System.out.print(krug.toString());
		System.out.print("Obim pravugaonika je:"+ pravugaonik.getO());
		System.out.print("Povrsina pravugaonika je"+pravugaonik.getP());
	}

}
