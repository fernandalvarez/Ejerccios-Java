package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // se instacia la conecion con la BD
    public static Connection con = null;

    // se le asignan los datos para conectar con BD
    // se le indica que capture las excepciones de SQL
    public static Connection conectar() throws SQLException{
        String url = "jdbc:mysql://127.0.0.1:3306/miVeterinaria";
        String user = "Fernanda";
        String pass = "";
        con = DriverManager.getConnection(url, user, pass);
        return con;
    }
}
 /*CREATE TABLE `miVeterinaria`.`mascota` (
  `idmascota` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `edad` INT NOT NULL,
  `vacunas` BIT(1) NOT NULL,
  `peso` FLOAT NULL,
  `altura` FLOAT NULL,
  `tipo` VARCHAR(45) NOT NULL,
  `clasificación` VARCHAR(45) NOT NULL,
  `fono` INT NOT NULL,
  PRIMARY KEY (`idmascota`));
 */