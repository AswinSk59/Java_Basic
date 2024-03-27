import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius=radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length=length;
        this.width=width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

class Square implements Shape{
	double side;
	Square(double side){
		this.side=side;
	}
	public double area(){
		return side*side;
	}
	public double perimeter(){
		return 4*side;
	}
}

class Triangle implements Shape{
	double sidea;
	double sideb;
	double base;
	double height;
	Triangle(double sidea,double sideb,double base,double height){
		this.sidea=sidea;
		this.sideb=sideb;
		this.base=base;
		this.height=height;
	}
	public double area(){
		return 0.5*(base*height);
	}
	public double perimeter(){
		return sidea+sideb+base;
	}
}

class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Calculate Circle");
            System.out.println("2. Calculate Rectangle");
            System.out.println("3. Calculate Square");
            System.out.println("4. Calculate Triangle");
            System.out.println("5. EXIT");
            System.out.print("Enter your choice: ");
            choice=scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius=scanner.nextDouble();
                    Circle circle=new Circle(radius);
                    System.out.println("Area of the circle: " + circle.area());
                    System.out.println("Perimeter of the circle: " + circle.perimeter());
                    break;
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length=scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width=scanner.nextDouble();
                    Rectangle rectangle=new Rectangle(length, width);
                    System.out.println("Area of the rectangle: " + rectangle.area());
                    System.out.println("Perimeter of the rectangle: " + rectangle.perimeter());
                    break;
                case 3:
                	System.out.println("Enter length of Square");
                	double side=scanner.nextDouble();
                	Square square=new Square(side);
                	System.out.println("Area of square: "+square.area());
                	System.out.println("Perimeter of square: "+square.perimeter());
    				break;
    			 case 4:
    			 	System.out.println("Enter two sides of triangle");
    			 	double sidea=scanner.nextDouble();
    			 	double sideb=scanner.nextDouble();
    			 	System.out.println("Enter base and height of triangle");
    			 	double base=scanner.nextDouble();
    			 	double height=scanner.nextDouble();
    			 	Triangle triangle=new Triangle(sidea,sideb,base,height);
    			 	System.out.println("Area of the triangle: " + triangle.area());
                    System.out.println("Perimeter of the triangle: " + triangle.perimeter());
                    break;    			 	
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
