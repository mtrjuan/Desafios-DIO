public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        boolean t = (a > b);
        boolean y = true;
        boolean z = (y^t);
        System.out.println(y);
        System.out.println(t);
        System.out.println(z);
    }
}