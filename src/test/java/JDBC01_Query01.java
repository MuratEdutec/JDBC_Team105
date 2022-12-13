import java.sql.*;

public class JDBC01_Query01 {





    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1- ilgili driver 'i yukle - MySQL kullandigimizi (java'ya) bildiriyoruz
        // Driver'i bulamama ihtimaline karsi forName methodu 'ClassNotFoundException'
        // icin main methoda exception firlatmamizi istiyor
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2- baglantiyi olusturmak icin username ve passwoord girisi yapacagiz
        // BUrada da username ve passwoordun yanlis olmasi ihtimaline karsi getConnection methodu
        // SQLException firlatmami istiyor

        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "1234");


        //3- SQL Query'leri icin bir Statement olusturup, Javada kendimize SQL sorgulari icin bir alan acacagiz

        //con.createStatement();

        Statement st= con.createStatement();

        //4 - SQL sorgularini artik yazip calistirabiliriz
        ResultSet veri=st.executeQuery("Select * FROM calisanlar");

        //5-













    }


}
