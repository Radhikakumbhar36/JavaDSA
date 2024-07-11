import java.util.ArrayList;
import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;
public class StringAndStringBuilder {
    public static void main(String[] args) {
        String a="radha";
        String b="radha";
        System.out.println(a==b); //true
        
        String name1=new String("Kunal");
        String name2=new String("Kunal");
        System.out.println(name1==name2);   //False

        System.out.println(name1.equals(name2)); //true only value checking 
        //if "Kunal"="kunal " false it should be same as it is 

        System.out.println(name1.charAt(0));

        System.out.println(new int[] {2,3,4,5});
        System.out.println(Arrays.toString(new int[] {2,3,4,5,6}));

        float num=456.12756f;
        System.out.printf(String.format("%.2f",num));
        System.out.printf("Pie:%.3f",Math.PI);

        System.out.printf("hello my name is %s and I m %s ","radha","Cool");


        //'a'+'b'=195
        //"a"+"b"=ab
        //'a'+3=100 char()=d
        //"a"+1 =a1     "a"+"1"
        //integer will be converted to Integer that will call toString()

        System.out.println("Kunal"+new ArrayList<>());
      //objects in java called toString method so they can print with String
      //+ operator only work with primitive datatype and also work with complex datatype but one should have type String 
    //   String ans=new Integer(56)+" "+new ArrayList<>();
        System.out.println("a"+'b' );   //ab

        String series="";
        for(int i =0;i<26;i++){
            char ch=(char)('a'+i);
            series=series+ch;
        }
        System.out.println(series);    //abcdefghijklmnopqrstuvwxyz
         

        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch);


        }
        System.out.println(builder.toString());



        //String Methods 
        String str="Hello World";
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(str.charAt(0));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.indexOf('a'));
        System.out.println("    Radha   ".strip());
        System.out.println(Arrays.toString(str.split(" ")));
        }


        
}
