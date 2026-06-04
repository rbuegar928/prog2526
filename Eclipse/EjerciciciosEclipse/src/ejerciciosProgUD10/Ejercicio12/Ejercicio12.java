package ejerciciosProgUD10.Ejercicio12;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Ejercicio12 {

	public static void main(String[] args) {

		try {

			// Abrimos la conexión con la base de datos
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/tienda?allowPublicKeyRetrieval=true&useSSL=false", "fran", "Fr4n");

			System.out.println("¡Conexión exitosa!");

			// Obtener los metadatos de la base de datos
			DatabaseMetaData meta = con.getMetaData();

			// Tablas de la base de datos
			System.out.println("TABLAS:");

			ResultSet tablas = meta.getTables(null, null, "%", new String[] {"TABLE"});

			while (tablas.next()) {
				System.out.println(tablas.getString("TABLE_NAME"));
			}

			// Columnas de la tabla producto
			System.out.println("COLUMNAS DE PRODUCTO:");

			ResultSet columnas = meta.getColumns(null, null, "producto", "%");

			while (columnas.next()) {
				System.out.println(columnas.getString("COLUMN_NAME"));
			}

			// Información de la conexión

			System.out.println("USUARIO:");
			System.out.println(meta.getUserName());

			System.out.println("URL:");
			System.out.println(meta.getURL());

			System.out.println("DRIVER:");
			System.out.println(meta.getDriverName());

			System.out.println("VERSIÓN DEL DRIVER:");
			System.out.println(meta.getDriverVersion());

			System.out.println("SGBD:");
			System.out.println(meta.getDatabaseProductName());

			System.out.println("VERSIÓN DEL SGBD:");
			System.out.println(meta.getDatabaseProductVersion());

			// Cerramos
			tablas.close();
			columnas.close();
			con.close();

		} catch (Exception e) {

			System.out.println("Error al acceder a la base de datos");
		}
	}
}