import java.awt.*;

public class JavaStringBuilder {
    public static void main(String[] args) {

        String[] numbers = {"3","6","9","12","15","18","21","24","27","30"};
        StringBuilder Numbers = new StringBuilder();
        int total = 0;

        for (String ele : numbers) {
            total += Integer.parseInt(ele);
            Numbers.append(ele);
            System.out.println(ele);
        }

        System.out.println("The sum of all the numbers is: "+total);

    }
}
