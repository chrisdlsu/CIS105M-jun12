public class mySquare {


    // method with a return value
    public int addTwo(int i) {
        return i + 2;
    }

    public boolean isASquare(int x) {
        if (x == 1) {
            return true;
        }
        return false;
    }

    public String sayWeather(int y) {
        if (y > 5) {
            return "GreaterFive";
        }
        return "LessFive";
    }



    //print hello yeng
    public void sayHello() {
        System.out.println("Hello Yeng!");
    }
}