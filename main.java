import java.sql.*;

public class main {

    public static void main(String []args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "postgres";

        try {

            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            ResultSet res = stmt.executeQuery("SELECT * FROM \"user\" ");

            while (res.next()) {
                String name = res.getString("name");
                int age = res.getInt("age");
                System.out.println(name + age);
            }

            conn.close();
            stmt.close();
            res.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
