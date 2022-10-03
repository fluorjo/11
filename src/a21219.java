public class a21219 {
    public static void main(String[]args) {
        a21219 a1= new a21219();
        a212192 a2= new a212192();
       System.out.print(a1.sun(3,2)+a2.sun(3,2));
    }
    
    int sun(int x,int y){
        return x+y;
    }
}

class a212192 extends a21219 {
    int sun(int x, int y) {
        return x - y + super.sun(x, y);
    
    }
}
