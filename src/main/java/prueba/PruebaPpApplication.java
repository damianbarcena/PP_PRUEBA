package prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaPpApplication {

	public static void main(String[] args) {

		SpringApplication.run(PruebaPpApplication.class, args);
		Contador contador = new Contador();
		int cantidad = contador.cantidadLetras("Damian");
		System.out.println("La cantidad de letras de la palabra Damian es " + cantidad);
	}
}
