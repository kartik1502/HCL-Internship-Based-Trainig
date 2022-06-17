public class ObjectsClasses {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.name = "Karthik";
        customer.billingStatus = "Done";
        customer.custNumber = 1411;
        customer.ordNumber = 15487;

        customer.requestDiscount(250);
        customer.setAddress("Gadag");
        customer.displayCustomer();
    }
}
