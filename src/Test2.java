class Parent {
    void show() {
        System.out.println("Parent");
    }
}
    class Child extends Parent {
        void show() {
        System.out.println("child");       
    } 
    }

public class Test2 {
        public static void main(String[] args){
            Parent pa =new Child();
            pa.show();
        }
    }

