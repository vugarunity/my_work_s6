import java.util.List;

public interface ITeacherView<T> {
    void showList(List<T> objects);
    void show(T object);
}
