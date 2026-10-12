package abcdndrjfd;

public class Demoo {
	int a;
	int b;
	void m1(int c, int d) {
		a=c;
		b=d;
	}
	void m2() {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
	Demoo vv=new Demoo();
	vv.m1(2, 3);
	vv.m2();
}
}