import java.lang.String;

public class Main {
      public static void main(String[] args) {
        printNumberDateofMonth1(5);
        printNumberDateofMonth1(4);
        printNumberDateofMonth1(2);
        printNumberDateofMonth1(13);

        printNumberDateofMonth2(5);
        printNumberDateofMonth2(4);
        printNumberDateofMonth2(2);
        printNumberDateofMonth2(13);

        printNumberDateofMonth3(5);
        printNumberDateofMonth3(4);
        printNumberDateofMonth3(2);
        printNumberDateofMonth3(13);


    }

    public static void printNumberDateofMonth1(int month) {
        int[] array31 = {1, 3, 5, 7, 8, 10, 12};
        int[] array30 = {4, 6, 9, 11};
//        if(array30.includes("month")) {
//        }
        boolean isMonthHave30Day = false;
        boolean isMonthHave31Day = false;
        for (int i = 0; i < array30.length; i++) {
            if (array30[i] == month) {
                System.out.println("Thang " + month + " Có 30 ngày");
                isMonthHave30Day = true;
            }
        }
        for (int i = 0; i < array31.length; i++) {
            if (array31[i] == month) {
                System.out.println("Thang " + month + " Có 31 ngày");
                isMonthHave31Day = true;
            }
        }
        if (month == 2) {
            System.out.println("Tháng 2 có 28 hoặc 29 ngày");
        } else if (!isMonthHave30Day && !isMonthHave31Day) {
            System.out.println("Nhập Thang " + month + " là không hợp lệ");
        }

    }


    public static void printNumberDateofMonth2(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                System.out.println("Thang " + month + " Có 31 ngày");
                break;
            case 2:
                System.out.println("Thang " + month + " Có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + month + " Có 30 ngày");
                break;
            default:
                System.out.println("Nhập Thang " + month + " là không hợp lệ");
                break;
        }
    }

    public static void printNumberDateofMonth3(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 12) {

            System.out.println("Tháng " + month + " có 31 ngày");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Tháng " + month + " có 30 ngày");
        }  else if (month == 2) {
            System.out.println("Tháng " + month + " có 28 hoăc ngày");
        }else {
            System.out.println("Nhập Thang " + month + " là không hợp lệ");
        }
    }


}