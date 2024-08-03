package mvcpattern;

public class Main {
    public static void main(String[] args) {
        // Create the model
        Student student = new Student("1", "Alice", "A");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update the student's grade
        controller.setStudentGrade("A+");

        // Display updated student details
        controller.updateView();
    }
}
