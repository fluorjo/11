class A{
    protected int a;

    public A(){
        this.a=10;
    }
}

class B extends A{
    public void display(){
        System.out.println("a=" + a);
    }
}

class Basic{
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
