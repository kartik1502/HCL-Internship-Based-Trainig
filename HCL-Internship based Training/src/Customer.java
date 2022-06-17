public class Customer {
    String name;
    String address;
    String billingStatus;
    int age;
    int custNumber;
    long ordNumber;


    double requestDiscount(int price){
        return price*0.85;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void displayCustomer(){
        System.out.println("The customer with customer id: "+custNumber+" whose name is: "+name+" and he is from "+address+" has "+billingStatus+" his billing for the order number: "+ordNumber);
    }
}
