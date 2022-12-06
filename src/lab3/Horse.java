public class Horse extends Animal {
    String name;
    String breed;

    public Horse(String name, String food, String location, String breed) {
        super(food, location);
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void makeNoise(){
        System.out.println("Иго-го-го");

    }
    @Override
    public void eat(){
        System.out.println("Овсо");
    }
}