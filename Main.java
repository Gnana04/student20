import java.time.LocalDate;
import java.time.Period;

class Student {
    private String name;
    private LocalDate dateOfBirth;

    public Student(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", LocalDate.of(2000, 5, 15));
        
        // Print student's information
        System.out.println("Student Name: " + student.getName());
        System.out.println("Date of Birth: " + student.getDateOfBirth());
        System.out.println("Age: " + student.getAge());
        
        // Update student's name
        student.setName("Jane Smith");
        
        // Print updated student's information
        System.out.println("\nUpdated Student Name: " + student.getName());
    }
}
