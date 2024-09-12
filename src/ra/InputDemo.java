package ra;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        //1. Nhập dữ liệu mã sinh viên, tên sinh viên, tuôi
        //B1: Khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        //B2: Thông báo nhập
        System.out.println("Nhập vào mã sinh viên:");
        //B3: Lấy giá trị nhập từ bàn phím và lưu vào biến
        String studentId = scanner.nextLine();

        System.out.println("Nhập vào tên sinh viên:");
        String studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên:");
//        int age = scanner.nextInt();
        //--C1: Xóa phím enter trong bộ nhớ đệm
//        scanner.nextLine();
        //--C2: Lấy dữ liệu vào là String --> convert sang kiểu dữ liệu mong muốn
        /*
         * String --> int: Integer.parseInt("String")
         * String --> float: Float.parseFloat("String")
         * String --> double: Double.parseDouble("String")
         * String --> boolean: Boolean.parseBoolean("String")
         * */
        int age = Integer.parseInt(scanner.nextLine());
        //2. Nhập vào địa chỉ và giới tính sinh viên
        System.out.println("Nhập vào địa chỉ sinh viên:");
        String address = scanner.nextLine();
        System.out.println("Nhập vào giới tính sinh viên:");
        boolean sex = Boolean.parseBoolean(scanner.nextLine());


        //In thông tin sinh viên
        System.out.printf("Mã sinh viên: %s - Tên sinh viên: %s - Tuổi: %d\n", studentId, studentName, age);
        System.out.printf("Địa chỉ: %s - Giới tính: %s\n", address, sex ? "Nam" : "Nữ");
    }
}
