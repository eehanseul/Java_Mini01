package day02;

public class MiniTest01 {
    public static void main(String[] args) {
        Person sonny = new Person("쏘니","kor");
        Person beckham = new Person("베컴", "eng");

        SamsongPhone samsongPhone = new SamsongPhone();
        ApplePhone applePhone = new ApplePhone();

        sonny.setBuyPhone(samsongPhone);
        sonny.turnOn();
        sonny.phone.ring();

        beckham.setBuyPhone(applePhone);
        beckham.turnOn();
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
}

class ApplePhone extends Phone{
    void ring(){
        System.out.println("bbeep");
    }
}

class Person{
    private String name;
    String language; // eng, kor
    Phone phone;

    Person(String name, String language){
        this.name = name;
        this.language = language;
    }

    void setBuyPhone(Phone phone){
        this.phone = phone;
    }

    void turnOn(){
        if(language=="kor")
            System.out.println("야 내가 핸드폰 켜볼게");
        else
            System.out.println("turn on");
    }

}

class Store{
    String name;
}
