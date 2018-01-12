package CucumberTest.CucumberTest;

public class Aggr_Test {

		int a;
		A a1;
		char c;
		float f;
		double d;
		byte b;
		short s;
		long l;
		boolean bl;
		
		Aggr_Test(int i, A obj1){
		a=i;
		a1=obj1;
		
	}
		public static void main(String[] args) {
			A obj1=new A();
			Aggr_Test Aggr_Obj1=new Aggr_Test(3, obj1);
			System.out.println("Value is"+Aggr_Obj1.a1.i);
			System.out.println("int Value is"+Aggr_Obj1.a);
			System.out.println("char Value is"+Aggr_Obj1.c);
			System.out.println("float Value is"+Aggr_Obj1.f);
			System.out.println("double Value is"+Aggr_Obj1.d);
			System.out.println("byte Value is"+Aggr_Obj1.b);
			System.out.println("short Value is"+Aggr_Obj1.s);
			System.out.println("long Value is"+Aggr_Obj1.l);
			System.out.println("boolean Value is"+Aggr_Obj1.bl);
		}
 		
}

