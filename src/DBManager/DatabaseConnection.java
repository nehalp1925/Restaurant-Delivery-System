package DBManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	protected Connection connection = null;
	
	public DatabaseConnection() {
		try {
				this.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fooddelivery", "root", "");

            if (this.connection != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
