package OOP;

public class Polymorphism {
    
    int sum(int a,int b){
        return a+b;

    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Shape shape= new Shape();
        circle clc=new circle();
        rectangle rec=new rectangle();
        Shape rec1=new rectangle();
        rec.Area();
        rec1.Area();
        Polymorphism poly=new Polymorphism();
        System.out.println(poly.sum(1,2));
        System.out.println(poly.sum(1,2,4)) ;

        
    }
    public static class Shape{
        void Area(){
            System.out.println("This is the area of shape ");
        }
    }

    public static class circle extends Shape{
        void Area(){
            System.out.println("This is the area of circle");
        }
    }

    public static class rectangle extends Shape{
        void Area(){
            System.out.println("This is the area of rectangle");
        }
    }
    
}
