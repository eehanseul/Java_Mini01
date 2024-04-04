package day02;

public class MiniTest01 {
    public static void main(String[] args) {
        Person sonny = new Person("쏘니");
        Person beckham = new Person("베컴");

        SamsongPhone samsongPhone = new SamsongPhone();
        ApplePhone applePhone = new ApplePhone();

        sonny.setBuyPhone(samsongPhone);
        sonny.phone.turnOn();
        sonny.phone.ring();

        beckham.setBuyPhone(applePhone);
        beckham.phone.turnOn();
        beckham.phone.ring();
    }
}

class Phone{
    void ring(){
        System.out.println("링링링");
    }
    void turnOn() {
        System.out.println("켜라");
    }
}

class SamsongPhone extends Phone{
    void ring(){
        System.out.println("삐비빅");
    }
    void turnOn() {
        System.out.println("야 내 핸드폰 켜볼게");
    }
}

class ApplePhone extends Phone{
    void ring(){
        System.out.println("bbeep");
    }
    void turnOn() {
        System.out.println("turn on");
    }
}

class Person{
    private String name;
    Phone phone;

    Person(String name){
        this.name = name;
    }

    void setBuyPhone(Phone phone){
        this.phone = phone;
    }
}

class Store{
    String name;
}
