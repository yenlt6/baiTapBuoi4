import java.sql.Array;
import java.sql.SQLOutput;

import static java.lang.Math.sqrt;

public class Main {
    int a = 5;

    //tạo phương thức, để chạy chương trình cần phương thức Main
    // static dùng để không cần khởi tạo đối tượng khi sử dugj phuowg thức của class
    public static void main(String[] args) {
        printNumberDateofMonth(5);
        printNumberDateofMonth(4);
        printNumberDateofMonth(2);
    }
    public static void printNumberDateofMonth(int month) {
        int[] array31 = {1, 3, 5, 7, 8, 10, 12};
        int[] array30 = {4, 6, 9, 11};
        boolean isMonthHave30Day = false;
        for (int i = 0; i < array30.length; i++) {
            if (array30[i] == month) {
                System.out.println("Thang " + month + " Có 30 ngày");
                isMonthHave30Day = true;
            }        }
        if (month == 2) {
            System.out.println("Tháng 2 có 28 hoặc 29 ngày");
        } else if (!isMonthHave30Day) {
            System.out.println("Thang " + month + " Có 31 ngày");
        }
    }
}