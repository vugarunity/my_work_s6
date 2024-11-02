import java.util.Comparator;
import java.util.List;

public interface ITeacherService {
    void addTeacher(Teacher<?> teacher);
    Teacher<?> findTeacherById(int id);
    List<Teacher<?>> getAllTeachers();
    void sortTeachers(Comparator<Teacher<?>> comparator);
}
