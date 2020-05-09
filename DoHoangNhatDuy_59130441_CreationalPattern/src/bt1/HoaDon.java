
package bt1;

import java.util.ArrayList;



public class HoaDon {
   HoaDonHeader hd =  new HoaDonHeader();
   ArrayList<CTHD> ct = new ArrayList<>();
   
   protected HoaDon(BuilderHD builder){
       this.ct = builder.ct;
       this.hd = builder.hd;
   }

    @Override
    public String toString() {
        String CTHD = "";
        for(int i = 0; i < ct.size(); i++)
        {
            CTHD += "\nTen san pham: " + ct.get(i).getSanPham()
                    +" |So luong: " + ct.get(i).getSoLuong()
                    +" |Don gia: " + ct.get(i).getDonGia()
                    +" |Chiet khau: " + ct.get(i).getChietKhau();
        }
        return "Ma Khach hang: "+ hd.getMaKH()
                + "\nTen khach hang: "+ hd.getTenKH()
                + "\nNgay ban: "+ hd.getNgayBan()
                + "\nDanh sach san pham: " + CTHD;
    }
   
   
   public static class BuilderHD{
       HoaDonHeader hd =  new HoaDonHeader();
       ArrayList<CTHD> ct = new ArrayList<>();
       
       public BuilderHD themhdheader(HoaDonHeader hd){
           this.hd = hd;
           return this;
       }
       
       public BuilderHD themCTHD(CTHD a){
           ct.add(a);
           return this;
       }
       
       public HoaDon build(){
           return new HoaDon(this);
       }
   }
}
