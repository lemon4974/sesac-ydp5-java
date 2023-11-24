package _05_class;

public class Rectangle {
    // 필드
    public int width;
    public int height;

    // 생성자
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    // 메소드
    public int area(int width, int height){
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
