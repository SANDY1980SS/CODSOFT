package StudentCourseRegistration;
import java.net.ConnectException;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    
public class ViewOfStuInfo {
        public static void main(String[] argc){
            try {
                Connection ob = DriverManager.getConnection("jdbc:mysql://localhost:3306/nameOfDatabase", "root", "xxxx");
                PreparedStatement ps = ob.prepareStatement("select * from nameOfDatabase");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    int id = rs.getInt("stu_id");
                    System.out.println("Student id: " + id);
                    String name = rs.getString("stu_name");
                    System.out.println("Student name: " + name);
                    String dep = rs.getString("emp_dep");
                    System.out.println("Student course: " + dep);
                    System.out.println("<--------------------------------------------------------------------------->");
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
