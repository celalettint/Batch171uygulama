package day03methodobjectcreationscanner;

public class Runner {
    public static void main(String[] args) {

        Car myCar = new Car();
        System.out.println("myCar = " + myCar.fiyat);
        System.out.println("myCar = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Student Alican = new Student();

        System.out.println("Alican.name = " + Alican.name);
        System.out.println("Alican.address = " + Alican.address);
        System.out.println("Alican.grade = " + Alican.grade);
        Alican.study();
        Alican.feed();








    }
}
