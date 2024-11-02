import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ITeacherService teacherService = new TeacherService(); // Используем интерфейс ITeacherService
        ITeacherView<Teacher<?>> teacherView = new TeacherView<>(); // Используем интерфейс ITeacherView
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        teacherController.addTeacher(new Teacher<>(1, "John", "Doe", 40, 50000));
        teacherController.addTeacher(new Teacher<>(2, "Jane", "Smith", 35, 52000));

        System.out.println("Список учителей:");
        teacherController.displayTeachers();

        teacherController.updateTeacher(1, "John", "Doe", 42, 55000);

        // Передаем компаратор для сортировки по фамилии
        teacherController.sortTeachers(Comparator.comparing(Teacher::getLastName));
        System.out.println("\nСписок учителей после сортировки:");
        teacherController.displayTeachers();
    }
}
