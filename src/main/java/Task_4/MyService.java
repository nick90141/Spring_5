package Task_4;

import java.sql.*;

public class MyService {

    public String getDataFromDatabase(String query) throws SQLException {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            StringBuilder result = new StringBuilder();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                result.append("ID: ").append(id).append(", Name: ").append(name).append(", Age: ").append(age).append("\n");
            }

            resultSet.close();
            statement.close();
            connection.close();

            return result.toString();
        }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль не допускается");
        }
        return a / b;
    }

    public String callController1() {
        return "Ожидаемый результат 1";

    }

    public String callController2() {
        return "Ожидаемый результат 2";
    }
}
