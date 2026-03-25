package DAY5;
class User{ 
    User(String name) {
        this.name = name;
        System.out.println("User created");
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Role: "+role);
    }
    String name;
    String phone;
    String role="user";
    String address;
}
class Driver extends User {
    String role="Driver";
    String vehicle;
    Driver(String name,String vehicle){
        super(name);
        this.vehicle=vehicle;
    }
    void displayDriver(){
        super.display();
        System.out.println("Vehicle: "+vehicle);
        System.out.println("Driver class role:"+role);
    }
}
class Fooduser extends User {
    String favouriteFood;
}
class TravelUser extends User {}
public class App {
    public static void main(String[] args) {
        
    }
}
