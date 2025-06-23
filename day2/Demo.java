class Calculator {

    int a;

    public int add (int num1, int num2){
        System.out.println("in add " + num1 + num2);
        return 0;
    }

}

public class Demo
{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(5,6);
    }
}