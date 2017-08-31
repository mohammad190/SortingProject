package Class_9.JavaDatabaseDemo;
import java.sql.*;
import java.sql.DriverManager;

public class ConnectToSQL {

    private static final String URL = "jdbc:mysql://localhost:3306/employee";
    private static final String USER = "root";
    private static final String PASSWD = "!sujon123";

    public static void main(String[] args) {
        try {
            Connection my = DriverManager.getConnection(URL, USER, PASSWD);


            Statement mystm = my.createStatement();


            ResultSet myrs = mystm.executeQuery("select*from employee");

            while (myrs.next()){
                System.out.println("Id:" + myrs.getString("id")+ " " +"username:"+"  "+ myrs.getString("username")
                +" " + "Password"+" "+ myrs.getString("passwd")+ " "+"DOB:"+" "+ myrs.getString("DOB")+
                        " " +"SSN:"+" "+ myrs.getString("SSN")+ " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
