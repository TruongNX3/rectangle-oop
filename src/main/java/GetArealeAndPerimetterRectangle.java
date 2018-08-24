import java.util.Scanner;

public class GetArealeAndPerimetterRectangle {
    public static class Rectangle {
        double width;
        double height;

        public Rectangle() {
            width = 0;
            height = 0;
        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return this.width * this.height;
        }

        public double getPerimeter() {
            return (this.width + this.height) * 2;
        }

        public String display() {
            return "Rectangle{" + "width=" + width + ", height=" + height + "}";
        }
    }

    public static class Ex14_1 {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(inputGetWidth(), inputGetHeight());
            System.out.println("Your rectangle \n" + rectangle.display());
            System.out.println("Perimeter of the rectangle is: " + rectangle.getPerimeter());
            System.out.println("Area of the rectangle is: " + rectangle.getArea());
        }
    }
    public static double inputGetWidth(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter this width: ");
        double width = sc.nextDouble();
        return width;
    }

    public static double inputGetHeight(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter this height: ");
        double height = sc.nextDouble();
        return height;
    }
}
