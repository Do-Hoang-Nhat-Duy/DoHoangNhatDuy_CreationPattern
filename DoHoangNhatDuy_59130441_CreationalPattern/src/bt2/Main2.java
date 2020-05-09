
package bt2;

public class Main2 {

    public static void main(String[] args) {
        MyStringBuilder msb = new MyStringBuilder.MyBuilder()
                                .addString("Bai tap 2|")
                                .addFloat((float)0.7)
                                .addString("|")
                                .addBool(true)
                                .build();
        System.out.println(msb.toString());                  
    }
    
}
