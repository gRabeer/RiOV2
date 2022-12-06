public class Cat extends Animal{
    String name;
    String breed;

    public Cat(String name, String food, String location, String breed) {
        super(food, location);
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void makeNoise(){
        System.out.println("Мяу");

    }
    @Override
    public void eat(){
        System.out.println("Рыба");
    }
}
