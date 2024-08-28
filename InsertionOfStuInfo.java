package StudentCourseRegistration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class InsertionOfStuInfo {
    public static void main(String[] args) {
 
        try {
            int a = 7;
            String name = "MOHIT";
            String course = "MANAGEMENT";
            Connection obj = DriverManager.getConnection("jdbc:mysql://localhost:3306/nameOfdatabase", "root", "xxxx");
            PreparedStatement ps = obj.prepareStatement("insert into employee values(?,?,?)");
            ps.setInt(1,a);
            ps.setString(2,name);
            ps.setString(3,course);
            int i = ps.executeUpdate();
            if(i>0){
                System.out.println("success");
            }
            else{
                System.out.println("fail");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
