class Basic{
    int a=10;
    int b=20;

    void add() {
        a=a+1;
    }

    void add(int b){
        this.b +=b;
    }

    void display() {
        System.out.println(a+ " " + b);
    }

    public static void main(String[] args) {
        Basic obj = new Basic();
        obj.add();
        obj.add(10);
        obj.display();
    }

}
