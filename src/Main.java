public class Main {
    public static void main(String[] args) {
        Programmer programmer= new Programmer("John", "Programmer", "Coding");
        Dancer engineer = new Dancer("Alice", "Dancer", "Dancing");
        Singer doctor = new Singer("Michael", "Singer", "Sings");

        System.out.println(programmer.toString());
        programmer.learn();
        programmer.teach();

        System.out.println(engineer.toString());
        engineer.walk();
        engineer.design();

        System.out.println(doctor.toString());
        doctor.eat();
        doctor.diagnose();
    }
}