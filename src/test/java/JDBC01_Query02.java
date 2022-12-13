import java.sql.*;

public class JDBC01_Query02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "1234");

        Statement st = con.createStatement();
        ResultSet veri = st.executeQuery("Select isim, maas FROM calisanlar where sehir= 'Ankara' order by maas desc;");

        while (veri.next()) {
            System.out.println(veri.getString("isim") + " - " + veri.getInt("maas"));

            /* con.close();
            st.close();
            veri.close();


             */
    }
    }
}
