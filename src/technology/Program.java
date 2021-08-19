package technology;

import java.sql.SQLOutput;

public class Program {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone(200,400,false,20);
        System.out.println("The number of selfies in my phone is " + phone.getNumberOfSelfies());
        phone.setRam(50);
        System.out.println(phone.getId());

        Laptop laptop = new Laptop(300,600,true,4);
        System.out.println(laptop.isHeavy());
        System.out.println(laptop.getId());
        laptop.setRam(100);

        Computer computer = new Computer(300,800,true);
        System.out.println("The Computer has storage: "+ computer.getRam());



    }
}
