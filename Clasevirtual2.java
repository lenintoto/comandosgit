import java.sql.*;
import java.util.Scanner;

public class Clasevirtual2{
    public static void main(String[] args){
        String dbURL = "jdbc:mysql://localhost:3306/estudiantes";
        String dbUsername = "root";
        String dbPassword = "Analisis2023B*";
        Scanner scanner = new Scanner(System.in);
//CRUD MYSql-Java
        //Agregar
        /*try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection conn = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
             String sql = "INSERT INTO calificaciones VALUES (?, ?, ?, ?, ?)";

             PreparedStatement statement = conn.prepareStatement(sql);

             statement.setInt(1, 1783192832);
             statement.setString(2, "Juan");
             statement.setInt(3, 1731271371);
             statement.setFloat(4, 10);
             statement.setFloat(5, 10);

             int rowsInserted = statement.executeUpdate();

             if(rowsInserted > 0){
                 System.out.println("Se inserto un nuevo registro");
             }

         } catch (Exception exception){
             System.out.println("Error: " + exception.getMessage());
         }*/
        /*try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
            String sql = "INSERT INTO calificaciones VALUES (?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);

            int id;
            String nombre;
            int cedula;
            float nota1;
            float nota2;

            System.out.println("Ingrese el id del estudiante: ");
            id = scanner.nextInt();

            System.out.println("Ingrese el nombre del estudiante: ");
            nombre = scanner.next();

            System.out.println("Ingrese la cedula del estudiante: ");
            cedula = scanner.nextInt();

            System.out.println("Ingrese la nota 1 del estudiante: ");
            nota1 = scanner.nextFloat();

            //  System.out.println("Ingrese la nota 2 del estudiante: ");
            // nota2 = scanner.nextFloat();

            statement.setInt(1, id);
            statement.setString(2, nombre);
            statement.setInt(3, cedula);
            statement.setFloat(4, nota1);
            // statement.setFloat(5, nota2);
            int rowsUpdated = statement.executeUpdate();

            if(rowsUpdated > 0){
                System.out.println("Se actualizo el registro exitosamente");
            }

            scanner.close();

        } catch (Exception exception){
            System.out.println("Error: " + exception.getMessage());
        }*/
        //Modificar
        /*try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
            String sql = "UPDATE calificaciones SET calificacion1 = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);

            int id;
            float nota1;

            System.out.println("Ingrese el id del estudiante: ");
            id = scanner.nextInt();
            System.out.println("Ingrese la nota 1 modificada del estudiante: ");
            nota1 = scanner.nextFloat();

            statement.setFloat(1,nota1);
            statement.setInt(2,id);

            int rowsUpdated = statement.executeUpdate();

            if(rowsUpdated > 0){
                System.out.println("Se actualizo el registro exitosamente");
            }

            scanner.close();

        }catch (Exception exception){
                System.out.println("Error: " + exception.getMessage());
        }*/
        //Modificar
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
            String sql = "DELETE FROM calificaciones WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);

            int id;

            System.out.println("Ingrese el id del estudiante: ");
            id = scanner.nextInt();

            statement.setInt(1,id);

            int rowsUpdated = statement.executeUpdate();

            if(rowsUpdated > 0){
                System.out.println("Se eliminó el registro exitosamente");
            }

            scanner.close();
        }catch (Exception exception){
            System.out.println("Error: " + exception.getMessage());
        }

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
            if(conn != null){
                System.out.println("Conectado a la base de datos estudiantes exitosamente");
            }

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM calificaciones");

            int id;
            String nombre;

            while(rs.next()){
                id = rs.getInt("id");
                nombre = rs.getString("nombre");
                System.out.println(id + " " + nombre);
            }

        }catch(Exception exception){
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
