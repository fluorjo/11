class Parent{
    int a;
    public Parent(int a1){this.a=a;}
    void display(){System.out.println("a="+a);}
}

class Child extends Parent{
    public Child(int a){
        super(a);
        super.display();
    }
}
public class m1_423 {
public static void main(String[] args) {
    Child a=new Child(10);
}
}
