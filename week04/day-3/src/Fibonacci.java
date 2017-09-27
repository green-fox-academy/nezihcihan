public class Fibonacci {
    int number;
    public Fibonacci(){
    }
    public int fibonacci(int number){
        if ((number == 0) || (number == 1)) {
            return number;
        }
        else return fibonacci(number - 1) + fibonacci(number - 2);
    }
    public static void main(String[] args) {
        Fibonacci object = new Fibonacci();
        int number = 5;
        System.out.println(object.fibonacci(number));
    }
}
