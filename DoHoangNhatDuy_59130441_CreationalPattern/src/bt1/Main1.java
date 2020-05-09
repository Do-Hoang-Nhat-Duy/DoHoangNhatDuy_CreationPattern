
package bt1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main1 {

    public static void main(String[] args) throws ParseException {
        HoaDonHeader hd = new HoaDonHeader("AB1", "Do Hoang Nhat Duy", 
                new SimpleDateFormat("dd/MM/yy").parse("05/08/2020"));
        CTHD cthd1 =  new CTHD("Tivi", 10, 5000000, 2);
        CTHD cthd2 =  new CTHD("Bo chen su", 15, 500000, 5);
        CTHD cthd3 =  new CTHD("Banh keo", 10, 25000, 1);
        
        HoaDon hoadon = new HoaDon.BuilderHD()
                   .themhdheader(hd)
                   .themCTHD(cthd1)
                   .themCTHD(cthd2)
                   .themCTHD(cthd3)
                   .build();
        System.out.println(hoadon.toString());
    }
    
}
