//This covers all the possiblities of Inheritance 
//next part polymorphism
public class OOP3 {
    double l;
    double h;
    double w;

    OOP3() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    OOP3(double side) {
        this.h = side;
        this.l = side;
        this.w = side;
    }

    OOP3(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    OOP3(OOP3 old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }

    public static class Box extends OOP3 {
        double weight;

        Box() {
            this.weight = -1;
        }

        Box(double l, double h, double w, double weight) {
            super(l, h, w);  // Call the parent class constructor
            // Used to initialize values present in parent class
            this.weight = weight;
        }

        Box(Box other) { //it will be like OOP3(OOP3 old)not access to weight 
            super(other);
            weight = other.weight;
        }

        @Override
        public void information() {
            super.information();
            System.out.println("Box weight: " + weight);
        }
    }

    public static  class BoxSize extends Box{
        double size;
        BoxSize(BoxSize old){
            super(old);
            size=old.size;

        }

        BoxSize(){
            this.size=-1;
        }

        BoxSize(double l,double w,double h,double weight,double size){
            super(l,h,w,weight);
            this.size=size;
        }

        @Override
        public void information() {
            super.information();
            System.out.println("Box size: " + size);
        }
    }

    public static void main(String[] args) {
        OOP3 box = new OOP3(5.0);
        box.information();
        System.out.println(box.l + " " + box.w + " " + box.h);

        OOP3 box2 = new OOP3(box);
        box2.information();
        System.out.println(box2.l + " " + box2.w + " " + box2.h);

        Box weightBox = new Box(2, 3, 4, 5);
        weightBox.information();
        System.out.println(weightBox.l + " " + weightBox.w + " " + weightBox.h + " " + weightBox.weight);

        // Using Parent class reference to point to a Box object
        OOP3 box3 = new Box(2, 3, 4, 5);
        box3.information();
        System.out.println(box3.l + " " + box3.h + " " + box3.w);

          //there are many variables in both parent and child classes
        //you are given access to var that are the ref type i.e. Box
        //hence,you should have access to weight var
        //this is also means,that the ones you are trying to access should be initialised
        //but,here when object itself is type of parent class how you will call the constructor 
        

        // Accessing child class specific member
        if (box3 instanceof Box) {
            Box box3AsBox = (Box) box3;
            System.out.println("Weight: " + box3AsBox.weight);
        }
          // Box weightBox2=new OOP3(2,3,6,7);  //cannot access
    

    // Creating BoxSize object
    BoxSize sizeBox = new BoxSize(2, 3, 4, 6, 7);
    sizeBox.information();
    System.out.println(sizeBox.l + " " + sizeBox.w + " " + sizeBox.h + " " + sizeBox.weight + " " + sizeBox.size);

    // Using parent class reference to point to a BoxSize object
    OOP3 size1 = new BoxSize(2, 3, 4, 6, 7);
    size1.information();
    System.out.println(size1.l + " " + size1.h + " " + size1.w);

    // Accessing grandchild class specific member using instance check and cast
    if (size1 instanceof BoxSize) {
        BoxSize size1AsBoxSize = (BoxSize) size1;
        System.out.println("Weight: " + size1AsBoxSize.weight + " Size: " + size1AsBoxSize.size);
        }

        // Copy constructor for Box
        Box copyBox = new Box(weightBox);
        copyBox.information();
        System.out.println(copyBox.l + " " + copyBox.w + " " + copyBox.h + " " + copyBox.weight);

        // Copy constructor for BoxSize
        BoxSize copySizeBox = new BoxSize(sizeBox);
        copySizeBox.information();
        System.out.println(copySizeBox.l + " " + copySizeBox.w + " " + copySizeBox.h + " " + copySizeBox.weight + " " + copySizeBox.size);

        // Uncommenting the below line would cause an error, as you cannot instantiate a parent class reference with a child class constructor directly
        // Box weightBox2 = new OOP3(2, 3, 6, 7); // cannot access

     }

      // This code should be inside a method, adding it in main for correction
    public static void demonstrateBoxSize() {
        OOP3 size1 = new BoxSize(2, 3, 4, 6, 7);
        System.out.println(size1.l + " " + size1.h + " " + size1.w);

        if (size1 instanceof BoxSize) {
            BoxSize size1AsBoxSize = (BoxSize) size1;
            System.out.println("Weight: " + size1AsBoxSize.weight + " Size: " + size1AsBoxSize.size);
        }
    }
}
