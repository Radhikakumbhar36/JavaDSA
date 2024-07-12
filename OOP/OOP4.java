package OOP;
public class OOP4 {
    public static void main(String[] args) {
        
    }

    public class A{
        protected int num;
        String name;
        int[] arr;

        public int getNum(){ //we can access the private var  outside using getter and setter

            return num;
        }
        public void setNum(){
            this.num= num;
        }

        public A(int num,String name){
            this.num=num;
            this.name=name;
            this.arr=new int[num];
        }
    }
    
}
 