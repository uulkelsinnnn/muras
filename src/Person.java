public class Person {
    String name;
    String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn() {
        System.out.println(name + " is learning.");
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Designation: " + designation;
    }
}

// Первый уникальный класс
class Programmer extends Person {
    String subject;

    public Programmer(String name, String designation, String subject) {
        super(name, designation);
        this.subject = subject;
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject + ".");
    }
}

// Второй уникальный класс
class Dancer extends Person {
    String specialization;

    public Dancer (String name, String designation, String specialization) {
        super(name, designation);
        this.specialization = specialization;
    }

    public void design() {
        System.out.println(name + " is designing " + specialization + ".");
    }
}

// Третий уникальный класс
class Singer extends Person {
    String field;

    public Singer(String name, String designation, String field) {
        super(name, designation);
        this.field = field;
    }

    public void diagnose() {
        System.out.println(name + " is diagnosing in " + field + ".");
    }
}


