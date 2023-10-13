package org.example;

import org.example.model.Movie;
import org.example.model.Session;
import org.example.model.Theater;
import com.google.gson.Gson;
import java.io.*;



public class SerializationExercises {
    /*

Debe definir la clase para los conceptos Cine, Teatro y Sesión.
        Una sesión es una obra de cine en un teatro.
        Crea 2 instancias de cada clase y relaciona entre ellas.
        Serialice a Json todos los objetos y guárdelos en archivos diferentes.
     */
    public static class Exercise1 implements java.io.Serializable {
        public static void main(String[] args) {
            Movie movie = new Movie("Brad Pit", 90, "La Momia");
            Theater theater = new Theater(" Centro comercial Las Arenas", "Cinesa");
            Session session = new Session(100, "09/11/2023", "4:30", movie, theater);

            Gson gson = new Gson();
            String json = gson.toJson(movie);
            // Imprimir JSON
            System.out.println(json);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/cgsos/Downloads/movie.dat"))) {
                // Escribir JSON en el archivo
                writer.write(json);
            } catch (Exception exception) {
                exception.printStackTrace();

            }
        }

    }


    /*
Deserialice los objetos creados en el ejercicio 1.
        Ahora serialízalos usando ObjectOutputStream
     */
    public static class Exercise2 implements Serializable {

        public static void main(String[] args) {
            Movie movie1 = new Movie("Brad ", 60, "La Casa Vieja");
            Theater theater1 = new Theater(" Centro comercial Las Terrazas", "Yelmo Cines");
            Session session1 = new Session(23, "1/2/3", "120", movie1, theater1);

            //Deserializo los objetos del ejercicio 1 con BufferedReader

            try{
                BufferedReader leer = new BufferedReader(new FileReader("C:/Users/cgsos/Downloads/movie.dat"));
                String sessionArchivo = leer.readLine();
                System.out.println(sessionArchivo);
                leer.close();

            }catch (Exception e){

            }

            //Serializar con ObjectOutputStream:

            try {
                ObjectOutputStream fichero_session = new ObjectOutputStream(new FileOutputStream("C:/Users/cgsos/Downloads/fichero_movie.dat"));
                fichero_session.writeObject(session1);
                fichero_session.close();
            } catch (Exception exception) {

            }
        }
    }

    /*
Deserialice los objetos de los archivos binarios creados en el ejercicio 2.
    */
    public static class Exercise3 {

        public static void main(String[] args) {
            Movie movie = new Movie("Brad Pit", 90, "La Momia");
            Theater theater = new Theater(" Centro comercial Las Arenas", "Cinesa");
            Session session = new Session(23, "1/2/3", "120", movie, theater);

                try { //Deserializo con ObjectInputStream.


                ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("C:/Users/cgsos/Downloads/fichero_movie.dat"));
                Session fich_recuperado = (Session) recuperar.readObject();
                recuperar.close();
                System.out.println(fich_recuperado);

            } catch (Exception e) {

            }
        }
    }
}