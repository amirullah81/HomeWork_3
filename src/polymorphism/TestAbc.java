package polymorphism;

public class TestAbc {

	public static void main(String[] args) {
		Abc abc = new Abc();
		int shape1 = abc.area1(10,20,30);
		System.out.println(shape1);
		
		CorrectedArea2 abc2 = new CorrectedArea2();
			int shape2 = abc2.area1(10, 20, 30, 40);
			System.out.println(shape2);
		}

	}

