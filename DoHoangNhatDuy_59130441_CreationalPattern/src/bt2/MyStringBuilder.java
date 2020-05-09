
package bt2;

public class MyStringBuilder {
    String str;

    public MyStringBuilder() {
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
    protected MyStringBuilder(MyBuilder builder){
        this.str = builder.str;
    }

    @Override
    public String toString() {
        return str;
    }
    
    
    public static class MyBuilder{
        String str = " ";

        public MyBuilder addString(String s){
            this.str += s;
            return this;
        }
        
        public MyBuilder addFloat(float f){
            this.str += String.valueOf(f);
            return this;
        }
        
        public MyBuilder addBool(boolean b){
            this.str += String.valueOf(b);
            return this;
        }
        public MyStringBuilder build(){
            return new MyStringBuilder(this);
        }
    }
}