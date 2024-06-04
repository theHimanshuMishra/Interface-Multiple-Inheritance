import java.util.Scanner;

interface Mishra{
    void input();
    void output();
}
class A implements Mishra{
    String name;
    String course;
    public void input(){
     Scanner s=new Scanner(System.in);
     System.out.println("Enter your name: ");
     name=s.nextLine();
     System.out.println("Enter course:");
     course=s.nextLine();

    }
    public void output(){
        System.out.println(name+" "+course);
    
    }
    public static void main(String args[]){
      A obj=new A();
      obj.input();
      obj.output();

    }
}