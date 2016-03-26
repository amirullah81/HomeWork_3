package polymorphism;

public class Abc {
	public int area1(int a, int b, int c){
		int total = a + b + c;
		return total;
	}
	public int area1(int a, int b, int c, int d){
		int total = a + b + c + d;
		return total;
	}
	
	public int area1(int a, int b, int c, int d, int e){
		int total = a + b + c + e;
		return total;
	}

}
