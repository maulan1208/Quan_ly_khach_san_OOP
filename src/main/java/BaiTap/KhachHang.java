package BaiTap;

/**
 *
 * @author khoa
 */
import java.util.ArrayList;
import java.util.Scanner;
public class KhachHang {
Scanner scanner = new Scanner(System.in);
ArrayList<KhachHang> dskh = new ArrayList<>();
    public String MAKH;
    public String TENKH;
    public String CMND;
    public String QUOCTICH;
    public String GIOITINH;
    public String tuoi;
    public String SDT;
    public String MAPHONG;
    public KhachHang() {
        super();
    }
    public KhachHang(String MAKH, String TENKH, String CMND, String QUOCTICH, String GIOITINH, String tuoi, String SDT, String MAPHONG) {
        this.MAKH = MAKH;
        this.TENKH = TENKH;
        this.CMND = CMND;
        this.QUOCTICH = QUOCTICH;
        this.GIOITINH = GIOITINH;
        this.tuoi = tuoi;
        this.SDT = SDT;
        this.MAPHONG = MAPHONG;
    }
    public String getMAKH() {
        return MAKH;
    }
    public void setMAKH(String MAKH) {
        this.MAKH = MAKH;
    }
    public String getTENKH() {
        return TENKH;
    }
    public void setTENKH(String TENKH) {
        this.TENKH = TENKH;
    }
    public String getCMND() {
        return CMND;
    }
    public void setCMND(String CMND) {
        this.CMND = CMND;
    }
    public String getQUOCTICH() {
        return QUOCTICH;
    }
    public void setQUOCTICH(String QUOCTICH) {
        this.QUOCTICH = QUOCTICH;
    }
    public String getGIOITINH() {
        return GIOITINH;
    }
    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }
    public String getTuoi() {
        return tuoi;
    }
    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }
    public String getSDT() {
        return SDT;
    }
    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    public String getMAPHONG() {
        return MAPHONG;
    }
    public void setMAPHONG(String MAPHONG) {
        this.MAPHONG = MAPHONG;
    }
    public void nhapttkh(){
    System.out.println("NHap ma khach hang:");
    MAKH = scanner.nextLine();
    System.out.println("NHap ho va ten khach hang:");
    TENKH = scanner.nextLine();
    System.out.println("NHap CMD khach hang:");
    CMND = scanner.nextLine();
    System.out.println("NHap quoc tinh khach hang:");
    QUOCTICH = scanner.nextLine();
    System.out.println("NHap gioi tinh khach hang:");
    GIOITINH = scanner.nextLine();
    System.out.println("NHap tuoi khach hang:");
    tuoi = scanner.nextLine();
    System.out.println("NHap SDT khach hang:");
    SDT = scanner.nextLine();
    System.out.println("NHap ma phong khach hang:");
    MAPHONG = scanner.nextLine();
	}
    public void hienthikh(){
    System.out.println("Ma Khach Hang:"+MAKH);
    System.out.println("Ho Va Ten Khach Hang:"+TENKH);
    System.out.println("CMND Khach Hang:"+CMND);
    System.out.println("Quoc Tich Khach Hang:"+QUOCTICH);
    System.out.println("Gioi Tinh Khach Hang:"+GIOITINH);
    System.out.println("Tuoi Khach Hang:"+tuoi);
    System.out.println("SDT Khach Hang:"+SDT);
    System.out.println("Ma Phong Khach Hang:"+MAPHONG);

}

    public void xoakh(ArrayList<KhachHang> dskh, int s){
    for(int j=0;j<dskh.size();j++){
       if(j == s){
        dskh.remove(this.CMND[j]);
        break;
}
}}
}
    
