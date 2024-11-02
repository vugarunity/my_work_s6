public class Teacher<T> {
    private final T id;
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Teacher(T id, String firstName, String lastName, int age, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public T getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Имя: " + firstName + " " + lastName + ", Возраст: " + age + ", Зарплата: " + salary;
    }
}
