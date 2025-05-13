import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestKoneksi {
    public static void main(String[] args) {
        String url = "jdbc:mysql://u3163_nl0jrgp6dQ:iEdCFhSq8G97S%3DuB!ysU65!I@database.alstore.space:3306/s3163_player";
        String user = "u3163_nl0jrgp6dQ";
        String password = "iEdCFhSq8G97S=uB!ysU65!I";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi berhasil!");
            conn.close();
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }
}
