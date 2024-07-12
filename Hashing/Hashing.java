package Hashing;
class Main{
    public static void main(String[] args) {
        String name="Rahul"; //gives no. as per operation
        System.out.println(name.hashCode());
        Integer a=4235678;  //int cannot be used so use wrapple class
        System.out.println(a.hashCode()); //gives same no.
    }
}
