package variables;

public class Program5 {
    public static void main(String[] args) {
        int english = 89;
        int physics = 78;
        int chemistry = 90;
        int maths = 98;
        int computer = 79;

        int total;
        int Percentage;

        total = english+physics+chemistry+maths+computer;
        System.out.println("My total is: " + total);

        Percentage = total*100/500;
        System.out.println("My Percentage are: " +Percentage + '%');
    }
}
