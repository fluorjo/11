class A {
int a;
public A(int a){ this.a=a;} // 실행순서 3 멤버변수 (?)a에 10을 저장.
void display() {System.out.println("a="+a);} // 실행순서 5 a=10 출력(?)
}
class B extends A {  
    public B(int a) {
        super(a); //실행순서 2 부모클래스의 생성자에 10을 넘김.
        super.display();    //실행순서 4 부모클래스의 display() 함수 호출
    }
}

public class Test3{//실행순서 1 
    public static void main(String[] args) {
        B obj = new B(10); //객체 B의 생성자를 호출하면서 10을 넘김.
        
    }
}