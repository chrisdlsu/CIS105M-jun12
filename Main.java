public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");
        mySquare bonggo = new mySquare();

        int nBasket;
        nBasket = bonggo.addTwo(256);
        System.out.println(nBasket);

        for (int i = 1; i < 11; i++) {
            bonggo.sayHello();
            System.out.println(bonggo.addTwo(i));
        }

        System.out.println(bonggo.isASquare(1));
        System.out.println(bonggo.sayWeather(1));
    }
}