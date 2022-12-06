public class Main3 {
    public static void main(String[] args) {
        lab2.Phone phone1 = new lab2.Phone("88005553535", "Iphone", 890);
        lab2.Phone phone2 = new lab2.Phone("89999999999", "Huawei", 1120);
        lab2.Phone phone3 = new lab2.Phone("84951111111", "Nokia", 900);

        System.out.println(phone1.getModel() + " " + phone1.getNumber() + " " + phone1.getWeight());
        System.out.println(phone2.getModel() + " " + phone2.getNumber() + " " + phone2.getWeight());
        System.out.println(phone3.getModel() + " " + phone3.getNumber() + " " + phone3.getWeight());

        phone1.receiveCall("Артур");
        phone1.receiveCall("Андрюха", "88005553535");
        phone2.sendMessage("89999999999", "84951111111", "88005553535");

    }
}