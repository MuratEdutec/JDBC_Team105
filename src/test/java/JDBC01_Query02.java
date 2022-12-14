import java.sql.*;

public class JDBC01_Query02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "1234");

        Statement st = con.createStatement();

        ResultSet veri = st.executeQuery("Select isim, maas, sehir FROM calisanlar where sehir= 'Ankara' order by maas desc;");

        while (veri.next()) {
            System.out.println(veri.getString("isim") + "\n" + veri.getInt("maas") + "\n" + veri.getString("sehir"));


            System.out.println("=== * * * ==== * * * ==== * * * ==== * * * ==== * * * ==== * * * ==== ");

        }
         /*=======================================================================
          ORNEK3: Maasi en yuksek 3 kisinin adini, yasadigi sehri ve maasini
           maas sirali listeyiniz.
        ========================================================================*/
        String sorgu="Select isim, sehir, maas FROM calisanlar ORDER BY maas desc LIMIT 3";

        ResultSet veri2=st.executeQuery(sorgu);


        while(veri2.next()) {
            System.out.println(veri2.getString(1) + " " + veri2.getString(2) + " " + veri2.getInt(3));
        }


        /* con.close();
        st.close();
        veri.close();
        veri2.close();
        */


    }
    }


