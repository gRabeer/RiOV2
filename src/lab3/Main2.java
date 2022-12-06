public class Main2 {
    public static void main(String[] args) {
        Veterenar Veterenar = new Veterenar();
        Cat Cat = new Cat("Басик", "Рыба", "1", "Default");
        Dog Dog = new Dog("Никита", "Собачий корм", "2", "Бульдог");
        Horse Horse = new Horse("Плотва", "Овсо", "3", "Что-то из Ведьмака");
        Animal[] animals = {Cat, Dog, Horse};


        for (Animal go : animals) {
            Veterenar.treatAnimal(go);
        }
    }
}

