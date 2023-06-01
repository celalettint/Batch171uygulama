package day02datatypesmethodcreation;

public class MethodCreation01 {

    public static void main(String[] args) {

        int sonuc = toplamaYap(3,5);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(5,12);
        System.out.println(carpmaSonucu);

        System.out.println(firstTwoMultiplyThirdAdd(2,3,4));

        int sonuc1 =cikarmaYap (8,5);
        System.out.println(sonuc1);






    }

    private static int cikarmaYap(int a, int b) {
        return a-b;
    }

    private static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return a*b+c;
    }

    protected static long multiply(int a, int b) {
        return a*b;
    }

    public static int toplamaYap(int a,int b) {
        return a+b;
    }
}
