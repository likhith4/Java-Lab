interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Rectangle class implementing Resizable interface
class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Implementation of Resizable interface
    @Override
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Resized width to: " + width);
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Resized height to: " + height);
    }

    // Additional methods for Rectangle class
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void displayInfo() {
        System.out.println("Rectangle: Width = " + width + ", Height = " + height);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle rectangle = new Rectangle(10, 5);

        // Displaying the original information
        System.out.println("Original Rectangle Info:");
        rectangle.displayInfo();

        // Resizing the rectangle
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(8);

        // Displaying the updated information
        System.out.println("\nUpdated Rectangle Info:");
        rectangle.displayInfo();
    }
}
