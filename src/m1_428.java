abstract class A {
    abstract void display();

}

class B extends A {
    public B(){
        this.display();
    }

    public void display() {System.out.println("class B");}
}

public class m1_428 {
    public static void main(String[] args) {
        A obj1 = new B();
    }
}
