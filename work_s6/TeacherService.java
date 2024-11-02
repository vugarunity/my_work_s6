import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TeacherService implements ITeacherService {
    private final List<Teacher<?>> teachers = new ArrayList<>();

    @Override
    public void addTeacher(Teacher<?> teacher) {
        teachers.add(teacher);
    }

    @Override
    public Teacher<?> findTeacherById(int id) {
        for (Teacher<?> teacher : teachers) {
            if (teacher.getId().equals(id)) { 
                return teacher;
            }
        }
        return null;
    }

    @Override
    public List<Teacher<?>> getAllTeachers() {
        return teachers;
    }

    @Override
    public void sortTeachers(Comparator<Teacher<?>> comparator) {
        teachers.sort(comparator);
    }
}
