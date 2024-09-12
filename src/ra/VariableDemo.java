package ra;

public class VariableDemo {
    public static void main(String[] args) {
        //1. Khai báo các biến chứa giá trị mã sinh viên, tên sinh viên, tuổi
        //-Datatype + variableName
        String studentId;
        String studentName;
        int age;
        //2. Khởi tạo giá trị các biến mã sinh viên,tên sinh viên, tuổi
        studentId = "SV001";
        studentName = "Nguyễn Văn A";
        age = 18;
        //3. Khai báo và khới tạo giá trị biến giới tính = true, địa chỉ = Hà Nội, điểm trung bình = 8.5
        //- Datatype variableName = Value
        boolean sex = true;
        String address = "Hà Nội";
        float avgMark = 8.5f;
        //4. Khai báo và khởi tạo gía trị các biến số nguyên (khai báo và khởi tạo các biến có cùng kiểu dữ liệu)
        int firstNumber = 5, secondNumber = 10, thirtNumber=15;
        //5. Khai báo hằng số điểm pass của sinh viên là 5
        //- final datatype CONSTANT_NAME = value
        final float MARK_PASS = 5;
    }
}
