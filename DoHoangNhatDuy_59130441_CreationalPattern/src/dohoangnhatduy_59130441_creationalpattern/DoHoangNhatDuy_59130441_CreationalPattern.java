
package dohoangnhatduy_59130441_creationalpattern;

import bt1.CTHD;
import bt1.HoaDon;
import bt1.HoaDonHeader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DoHoangNhatDuy_59130441_CreationalPattern {

    public static void main(String[] args) throws ParseException {
           HoaDonHeader hd = new HoaDonHeader("ABC1", "Do Hoang Nhat Duy", 
                   new SimpleDateFormat("dd/MM/yy").parse("05/08/2020"));
           CTHD cthd1 = new CTHD("Bo chen dia", 10, 500000, 5);
           CTHD cthd2 = new CTHD("Bot giat", 2, 123000, 2);
           CTHD cthd3 = new CTHD("Banh keo", 1, 25000, 1);
           CTHD cthd4 = new CTHD("Lo vi song", 1, 5000000, 7);
           
           HoaDon hoadon = new HoaDon.BuilderHD()
                   .themhdheader(hd)
                   .themCTHD(cthd1)
                   .themCTHD(cthd2)
                   .themCTHD(cthd3)
                   .themCTHD(cthd4)
                   .build();
          System.out.println(hoadon.toString());
    }
    
}
