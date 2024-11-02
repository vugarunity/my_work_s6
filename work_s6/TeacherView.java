import java.util.List;

public class TeacherView<T> implements ITeacherView<T> {
    @Override
    public void showList(List<T> objects) {
        for (T object : objects) {
            System.out.println(object);
        }
    }

    @Override
    public void show(T object) {
        System.out.println(object);
    }
}
