class ProdOutOfStockException extends Exception{
    ProdOutOfStockException(String msg){
        super(msg);
    }
}
class PaymentFailedException extends Exception{
    PaymentFailedException(String msg){
        super(msg);
    }
}
class OrderProcessingFailedException extends Exception{
    OrderProcessingFailedException(String msg){
        super(msg);
    }
}
class Product {
    String name;
    int stock;
    double price;
    Product(String n,int s,double p){
        this.name=n;
        this.stock=s;
        this.price=p;
    }
}
class User{
    String name,address;
    User(String n,String a){
        this.name=n;
        this.address=a;
    }
}
class Order{
    Product p;
    int quantity;

    Order(Product p, int q) {
        this.p = p;
        this.quantity = q;
    }
}
class OrderService{
    void placeOrder(Order order) throws ProdOutOfStockException,PaymentFailedException,OrderProcessingFailedException{
        if(order.p.stock==order.quantity){
            System.out.println("Order Placed Successfully");
        }
        if(order.p.stock<=0){
            throw new ProdOutOfStockException("Product out of Stock");
        }
        if(Math.random()<0.4){
            throw new PaymentFailedException("Payment Failed");
        }
        if(Math.random()<0.2){
            throw new OrderProcessingFailedException("Order Processing failed");
        }
    }
}
class Main{
    public static void main(String[] args) {
        Product p=new Product("Mouse",5,200.0);
        User u=new User("Bershikha", "Cheenai");
        Order o=new Order(p,2);
        OrderService s=new OrderService();
        try{
            s.placeOrder(o);
        } catch(ProdOutOfStockException e){
            System.out.println(e.getMessage());
        } catch(PaymentFailedException e){
            System.out.println(e.getMessage());
        } catch(OrderProcessingFailedException e){
            System.out.println(e.getMessage());
        }
    }
}
