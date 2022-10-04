import javax.print.event.PrintJobListener;

interface A{
    void display();
}

class B implements A {
    public void display() {System.out.println("class B display");}
}

class C implements A {
    public void display() {System.out.println("class C display");}
}

public class m1_426 {
    public static void main(String[] args) {
        A obj1=new B();
        A obj2=new C();

        obj1.display();
        obj2.display();
    }
    
}
