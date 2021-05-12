

import java.sql.SQLOutput;

public class Temp {
    int a = 5;
    //tạo phương thức, để chạy chương trình cần phương thức Main
    // static dùng để không cần khởi tạo đối tượng khi sử dugj phuowg thức của class
    public static void example() {
        int wid=7;
        int leng=15;
        float rad=8;
        Circle circle = new Circle(rad);
        Ractangle ractangle = new Ractangle(leng,wid);
        String str = "Lập trình java";
        String str2= str.toUpperCase();
        System.out.println("Chuỗi ban đầu " + str);
        System.out.println(("Chuỗi sau khi sử dung toUperCase(): " + str.toUpperCase()));
        System.out.println(("Chuỗi sau khi sử dung toLowerCase(): " + str.toLowerCase()));

        int size = str.length();
        System.out.println("Kich thuoc chuỗi: " + size);
        String str1 ="          ava";
        System.out.println("xoa khoang trăng: " + str1.trim());

        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));



        double areaCircle = circle.circleArea(circle);
        double circuitCircle = circle.circleCircuit(circle);
        int circuitRact= ractangle.ractangularCircuit(ractangle);
        int areaRact= ractangle.rectangularArea(ractangle);

        // in ra màn hình chu vi và diện tích kết quả tính hình tròn:
        System.out.println("Chu vi hinh tròn là:" + " " + circuitCircle + " cm");
        System.out.println("Diện tích hình tròn là: " + areaCircle + " cm2");


        //In ra màn hình kết quả tính chu vi và diện tích hình chữ nhật
        System.out.println("Chu vi hình chữ nhật là: " + circuitRact + " cm");
        System.out.println("Diện tích hình chữ nhật là: " + areaRact + " cm2");

    }
    public static void temp1() {
        float weight = 60;
        double height = 1.58;
        double bmi = weight / (height * height);

        System.out.println("Chi so BMI là: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Bạn bị thiếu cân");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Dáng chuẩn");
        } else {
            System.out.println("Bạn bị thừa cân");
        }
        printNumberDateofMonth(3);
    }

    public static void printNumberDateofMonth(int month) {
        int[] array31 = {1, 3, 5, 7, 8, 10, 12};
        int[] array30 = {4, 6, 9, 11};
        boolean isMonthHave30Day = false;
        for (int i = 0; i < array30.length; i++) {
            System.out.println("gia tri cua mang là: " + array30[i]);
            if (array30[i] == month) {
                System.out.println("Thang " + month + " Có 30 ngày");
                isMonthHave30Day = true;
            }
        }
        if (month == 2) {
            System.out.println("Tháng 2 có 28 hoặc 29 ngày");
        } else if (!isMonthHave30Day) {
            System.out.println("Thang " + month + " Có 31 ngày");
        }
    }
}
