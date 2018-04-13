class Fibonacci{

    public Fibonacci(int number) {

    }

    pubic static void fibonacci(int n, int result) {
        if(number == 1 || number == 0) {
            return result;
        }

        fibonacci(n-1, result) + fibonacci(n-2, result);
    }


    public static void main(String[] args) {
//        int number = 5;
//        new Fibonacci(number);
//        System.out.println("TEST");

    }
}
