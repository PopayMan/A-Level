package ua.cherkasskiy.hw6;

public class Phone {
    int number;
    String model;
    double weight;

    Phone() {
    }

    Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    int getNumber() {
        return this.number;
    }

    public static void main(String[] args) {
        Phone firstPhone = new Phone();
        firstPhone.model = "Realme";
        firstPhone.number = 1111;
        firstPhone.weight = 111;

        Phone secondPhone = new Phone();
        secondPhone.model = "Xiaomi";
        secondPhone.number = 2222;
        secondPhone.weight = 222;

        Phone thirdPhone = new Phone();
        thirdPhone.model = "HUAWEI";
        thirdPhone.number = 3333;
        thirdPhone.weight = 333;

        System.out.println("Phone{ number = " + firstPhone.number);
        System.out.println("       weight = " + firstPhone.weight);
        System.out.println("       model  = " + firstPhone.model + "}");

        System.out.println("Phone{ number = " + secondPhone.number);
        System.out.println("       weight = " + secondPhone.weight);
        System.out.println("       model  = " + secondPhone.model + "}");

        System.out.println("Phone{ number = " + thirdPhone.number);
        System.out.println("       weight = " + thirdPhone.weight);
        System.out.println("       model  = " + thirdPhone.model + "}");

        firstPhone.receiveCall("Unknown");
        System.out.println(firstPhone.getNumber());
        secondPhone.receiveCall("Unknown");
        System.out.println(secondPhone.getNumber());
        thirdPhone.receiveCall("Unknown");
        System.out.println(thirdPhone.getNumber());

    }

}

