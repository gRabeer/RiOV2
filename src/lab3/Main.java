public class Main {
    public static void main(String[] args) {
        Student Student1 = new Student("Anna", "Pervova", "BUT1901", 5);
        Aspirant Aspirant1 = new Aspirant("Victor", "Smolnikov", "M152021", 5, "KukaVisionTech");
        Student Student2 = new Student("Arthur", "Pirogov", "BUT1901", 4.5);
        Aspirant Aspirant2 = new Aspirant("Dmitry", "Zolotov", "M272022", 3.5, "Networks and communications");
        Student[] students = {Student1, Student2, Aspirant1, Aspirant2};

        for (Student go : students)

            System.out.println(go.getScholarship());
    }
}