public class Aspirant extends Student {

    String AspirantsScientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String AspirantsScientificWork) {
        super(firstName, lastName, group, averageMark);

        this.AspirantsScientificWork = AspirantsScientificWork;
    }

    @Override
    public int getScholarship() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}