class A {// 실행순서 3
int a;
public A(int a){ this.a=a;} //멤버변수 (?)a에 10을 저장.
void display() {System.out.println("a="+a);}

}
class B extends A {
    public B(int a) {
        super(a);
        super.display();    
    }
}

public class Test3{
    public static void main(String[] args) {
        B obj = new B(10);
        
    }
}