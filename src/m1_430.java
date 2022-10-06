class Parent{
    void display(){
        System.out.print("parent");
    }
}

class Child extends Parent{
    void display(){
        super.display();
        System.out.println("Child");
    }
}

public class m1_430 {
public static void main(String[] args) {
    Parent a=new Child();
    a.display();
}
}
