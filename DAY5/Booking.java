package DAY5;

public class Booking {
    String name;
    long phno;
    String location;
    Booking(String name,long phno,String location){
        this.name=name;
        this.phno=phno;
        this.location=location;
    }
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Phone number: "+phno);
        System.out.println("Location: "+location);
    }
}
class Ride extends Booking {
    String vehtype;
    Ride(String name,long phno,String location,String vehtype){
        super(name,phno,location);
        this.vehtype=vehtype;
    }
    void DisplayRideInfo(){
        super.displayInfo();
        System.out.println("Vehicle type: "+vehtype);
    }
}
class Food extends Booking{
    String favfood;
    Food(String name,long phno,String location,String favfood){
        super(name,phno,location);
        this.favfood=favfood;
    }
    void DisplayFoodInfo(){
        super.displayInfo();
        System.out.println("Favorite food: "+favfood);
    }
}
class Parcel extends Booking{
    int weight;
    Parcel(String name,long phno,String location,int weight){
        super(name,phno,location);
        this.weight=weight;
    }
    void DisplayParcelInfo(){
        super.displayInfo();
        System.out.println("Weight: "+weight);
    }
}
class Book{
    public static void main(String[] args) {
        Booking b;
        b=new Ride("Ravi",1234767838L,"Chennai","Car");
        b.displayInfo();
        b=new Food("Patil",9836645788L,"Bangalore","Dosa");
        b.displayInfo();
        b=new Parcel("Lina",8653825748L,"Hyderabad",5);
        b.displayInfo();
    }
}