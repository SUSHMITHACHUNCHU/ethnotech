import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ecommerce",
                    "root",
                    "Sushmitha_12"
            );

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM product");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("product_id") + " " +
                        rs.getString("product_name")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}