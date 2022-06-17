public class Encapsulation {
    private int number;
    public void setNumber(String sNumber){
        number = Integer.parseInt(sNumber);
    }

    public int getNumber(){
        return number;
    }
}
