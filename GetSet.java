package abcdndrjfd;
 class GetSetq {
	int a=10;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	}
public	class GetSet extends GetSetq{
		public static void main(String[]args) {
			GetSet bb = new GetSet();
			bb.setA(4);
		int ss = bb.getA();
		System.out.println(ss);
		}
	}