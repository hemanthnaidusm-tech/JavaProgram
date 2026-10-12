public class Student {
    String name;
    int age;
    
    void details() {
        System.out.println("i am " + name + ", age" + age);
    }
    
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Asha";
        s.age = 21;
        s.details();
    }
}
	
               
       
