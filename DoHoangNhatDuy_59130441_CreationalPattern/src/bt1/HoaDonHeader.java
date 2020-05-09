
package bt1;

import java.util.Date;

public class HoaDonHeader {
    String maKH,tenKH;
    Date ngayBan;

    public HoaDonHeader() {
    }

    public HoaDonHeader(String maKH, String tenKH, Date ngayBan) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.ngayBan = ngayBan;
    }

    

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }
    
    
}
