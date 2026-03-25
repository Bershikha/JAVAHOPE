package DAY6;

public class Notification {
    String name;
    String message;
    Notification(String name, String message){
        this.name=name;
        this.message=message;
    }
    void send() {
        System.out.println("Sending notification from parent class");
    }
}
class EmailNotification extends Notification {
    EmailNotification(String name, String message){
        super(name,message);
    }
    void send() {
        System.out.println("Sending email to "+name);
        System.out.println("Message: "+message);
    }
    void changeRecieverEmail(){}
}
class SMSNotification extends Notification {
    SMSNotification(String name, String message){
        super(name,message);
    }   
    void send() {
        System.out.println("Sending SMS to "+name);
        System.out.println("Message: "+message);
    }
}
class Notify{
    public static void main(String[] args) {
        Notification n;
        n=new EmailNotification("Text1","Order Confirmed");
        n.send();
        n=new SMSNotification("Text2","OTP is 270");
        n.send();
    }
}
