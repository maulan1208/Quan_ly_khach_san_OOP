/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Tesst1 {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    KhachHang kh = null;
    // tạo 1 ArrayList lưu thông tin khách trọ
    ArrayList<KhachHang> dskh = new ArrayList<>();
    int n;
    System.out.println("Nhap So luong khach hang:");
    n = Integer.parseInt(scanner.nextLine());
    for(int i=0;i<=n;i++){
    kh = new KhachHang();
    System.out.println("Nhap khanh hang thu:");
    i = scanner.nextInt();
    kh.nhapttkh();
    dskh.add(kh); 
}
    for(int i=0;i<dskh.size();i++){
    System.out.println("Khach hang thu:"+(i+1));
            dskh.get(i).getMAKH();
            dskh.get(i).getTENKH();
            dskh.get(i).getCMND();
            dskh.get(i).getQUOCTICH();
            dskh.get(i).getGIOITINH();
            dskh.get(i).getTuoi();
            dskh.get(i).getSDT();
            dskh.get(i).getMAPHONG();
            dskh.get(i).hienthikh();
}  
    int s;
    System.out.println("Nhap Ma Khach Hang Muon Xoa:");
    kh.CMND = scanner.nextInt();
    kh.xoakh(dskh, kh.CMND);
    System.out.println("Danh sach khach hang sau khi xoa:");
    for(int i=0;i<dskh.size();i++){
    System.out.println("Khach hang thu:"+(i+1));
            dskh.get(i).getMAKH();
            dskh.get(i).getTENKH();
            dskh.get(i).getCMND();
            dskh.get(i).getQUOCTICH();
            dskh.get(i).getGIOITINH();
            dskh.get(i).getTuoi();
            dskh.get(i).getSDT();
            dskh.get(i).getMAPHONG();
            dskh.get(i).hienthikh();
} 
int n1;
    System.out.println("Nhap So luong khach hang can them:");
    n1 = Integer.parseInt(scanner.nextLine());
    for(int i=0;i<=n1;i++){
    kh = new KhachHang();
    System.out.println("Nhap khanh hang can them thu:"+i+1);
    i = scanner.nextInt();
    kh.nhapttkh();
    dskh.add(kh); 
}
    for(int i=0;i<dskh.size();i++){
    System.out.println("Khach hang thu:"+(i+1));
            dskh.get(i).getMAKH();
            dskh.get(i).getTENKH();
            dskh.get(i).getCMND();
            dskh.get(i).getQUOCTICH();
            dskh.get(i).getGIOITINH();
            dskh.get(i).getTuoi();
            dskh.get(i).getSDT();
            dskh.get(i).getMAPHONG();
            dskh.get(i).hienthikh();
}
}
}
