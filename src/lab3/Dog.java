public class Dog extends Animal{
    String name;
    String breed;

    public Dog(String name, String food, String location, String breed) {
        super(food, location);
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void makeNoise(){
        System.out.println("Гав-гав");
    }
    @Override
    public void eat(){
        System.out.println("Собачий корм");
    }
}