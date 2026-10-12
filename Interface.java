package abcdndrjfd;
interface Abc {
    void m1();
}

class Demo implements Abc {

    public void m1() {
        System.out.println("asdfasdfjlks");
    }

    public static void main(String[] args) {
        Demo bb = new Demo();
        bb.m1();
    }
}