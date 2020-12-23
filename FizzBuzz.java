public class FizzBuzz {

    /**
     * Ваша задача написать цикл, который выводит числа от 1 до 100 на экран.
     * Но если число делится на 3, то нужно вместо числа вывести слово "Fizz".
     * Если число делится на 5, то нужно вывести слово "Bazz".
     * Если число делится и на 3, и на 5, то вывести слово "FizzBazz".
     */
    public static void main() {
        fizzbuzz();
    }

    private static void fizzbuzz() {

        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBazz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Bazz");
            }
            System.out.println(i);
        }
    }

}
