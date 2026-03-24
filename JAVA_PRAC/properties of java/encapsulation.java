class student {
    private String name;
    private int age;
    private double marks;  

    public void setname(String name) {
        this.name = name;
    }

     public void setage(int age) {
        this.age = age;
    }

     public void setmarks(double marks) {
        this.marks = marks;
    }
    public String getname(){
    return name;
}

public int getage() {
    return age;
}

public double getmarks() {
    return marks;
 }
}

public class encapsulation {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setname("vaibhav");
        s1.setage(18);
        s1.setmarks(90);

        System.out.println(s1.getname());
        System.out.println(s1.getage());
        System.out.println(s1.getmarks());
    }
}