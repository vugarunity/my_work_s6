public class Square extends Shape {
    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height; // Ширина всегда равна высоте
    }

    @Override
    public void setWidth(int width) {
        this.width = width; // Высота всегда равна ширине
        this.height = width;
    }
}