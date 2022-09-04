abstract class Vehicle {
    String name;
    abstract public String getName(String val);
    public Vehicle(String val){
        this.name =val;

    }
    public String getName(){
        return "Vehicle name:" + name;

    }
}

class Car extends Vehicle{
    public Car(String val){
        super(val); // name=super.name=val;
    }
    public String getName(String val){
        return "Car name:" + val;
    }
    public String getName(byte val[]){
        return "Car name:" + val;

    }

}
public class E20312{ //1.class car의 객체를 생성하여 vehicle 타입으로 생성. car는 vehicle을 상속받았기 때문에 이런 형태의 생성이 가능함. 
    public static void main(String[]args){
        Vehicle obj = new Car("Spark");
        System.out.println(obj.getName());
    }
}