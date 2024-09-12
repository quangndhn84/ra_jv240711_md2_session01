package ra;

public class OutputDemo {
    public static void main(String[] args) {
        //1. In ra câu Rikkei Academy, sau khi in không xuống dòng
        System.out.print("Rikkei Academy ");
        //2. In ra câu xin chào các bạn lớp JV240711, in xong xuống dòng
        System.out.println("xin chào các bạn lớp JV240711");
        //3. In chuỗi có định dạng
        int year = 2024;
        int month = 10;
        int day = 12;
        //-In ra ngày theo các biên year, month, day
        System.out.println("Ngày hiện tại là: " + day + "/" + month + "/" + year);
        System.out.printf("Ngày hiện tại là: %d/%d/%d", day, month, year);
    }
}
