public abstract class Shape {
    protected int height;
    protected int width;

    public abstract void setHeight(int height);
    public abstract void setWidth(int width);
}


// Принцип подстановки Лисков (LSP)

// У всех фигур есть общий абстрактный класс, что улучшает понимание структуры кода.

// Каждая фигура имеет свои собственные методы установки высоты и ширины, что предотвращает неправильное поведение.

// Можно легко добавлять новые фигуры, просто наследуя от абстрактного класса Shape и реализуя необходимые методы.