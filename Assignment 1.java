// Question 1
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int x,y;
        System.out.println("enter value of x : ");
        Scanner s = new Scanner(System.in);
        x=s.nextInt();
        System.out.println("enter value of y : ");
        y=s.nextInt();
        System.out.println("x*y : " + x*y);
    }
}


// Question 2
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int x='U';
        System.out.print("ascii value is : " + x);
    }
}


// Question 3
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int l,b;
        System.out.println("Enter Length : ");
        Scanner s = new Scanner(System.in);
        l=s.nextInt();
        System.out.println("Enter Breadth : ");
        b=s.nextInt();
        System.out.println("Area of Rectangle is : " + l*b);
    }
}


// Question 4
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter value : ");
        Scanner s = new Scanner(System.in);
        x=s.nextInt();
        System.out.println("Cube is : " + x*x*x);
    }
}


// Question 5
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int x,y,temp;
        System.out.println("Enter x : ");
        Scanner s = new Scanner(System.in);
        x=s.nextInt();
        System.out.println("Enter y : ");
        y=s.nextInt();
        
        temp=y;
        y=x;
        x=temp;
        
        System.out.println("After Swapping");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}
