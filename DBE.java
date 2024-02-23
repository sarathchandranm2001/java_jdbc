import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class DBE {
    public static void main()
    {
        Connection con;
        Statement st;
        ResultSet rs;
        int no;
        String name;
        float sal;
        Scanner s=new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java?characterEncoding=utf8","root","");
            st=con.createStatement();
            String str="Select * from emp,department where dno=1;";
            rs=st.executeQuery(str);
            while(rs.next()){
                System.out.println(rs.getString("eno")+""+rs.getString("ename")+""+rs.getString("dname")+""+rs.getString("dloc")+"");
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }

    }
}
