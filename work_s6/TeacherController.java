import java.util.Comparator;
import java.util.List;

public class TeacherController {
    private final ITeacherService teacherService;
    private final ITeacherView<Teacher<?>> teacherView;

    public TeacherController(ITeacherService teacherService, ITeacherView<Teacher<?>> teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public void addTeacher(Teacher<?> teacher) {
        teacherService.addTeacher(teacher);
    }

    public void updateTeacher(int id, String firstName, String lastName, int age, int salary) {
        Teacher<?> teacher = teacherService.findTeacherById(id);
        if (teacher != null) {
            teacher.firstName = firstName;
            teacher.lastName = lastName;
            teacher.age = age;
            teacher.salary = salary;
            System.out.println("Учитель обновлен: " + teacher.fullName());
        } else {
            System.out.println("Учитель с ID " + id + " не найден.");
        }
    }

    public void displayTeachers() {
        List<Teacher<?>> teachers = teacherService.getAllTeachers();
        teacherView.showList(teachers);
    }

    public void sortTeachers(Comparator<Teacher<?>> comparator) {
        teacherService.sortTeachers(comparator);
    }
}
