package hemanth;

public class Demooo {
		int a;
		int b;
		void m1(int a, int b) {
			this.a=a;
			this.b=b;
		}
		void m2() {
			System.out.println(a%b);
		}
		
		public static void main(String[] args) {
			Demooo vv=new Demooo();
			vv.m1(5, 25);
			vv.m2();
		}
}
	



