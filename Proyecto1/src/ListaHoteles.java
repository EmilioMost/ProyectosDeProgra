package negocio;




import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner; 

public class ListaHoteles{
    private ArrayList<Hotel> listaHoteles = new ArrayList<>();

    public void lista(){
        cargarHoteles();
    }

    public static void annadir(Hotel hotel){
        listaHoteles.add(hotel);
        volcarListaHoteles();
    }

    public ArrayList<Hotel> getListaHoteles(){
        return  listaHoteles;
    }

    private static void volcarListaHoteles(){
        try{
            FileWriter fw = new FileWriter("padron.csv");
            for(Hotel hotel : listaHoteles){
                fw.write(hotel.getNombre() + "," + 
                hotel.getUbicacion() + "," + 
                hotel.getEstrellas() + "," + 
                hotel.getHabitaciones() + "\n");
            }
            fw.close();
        }catch(IOException ex){
            System.err.println("hay un error al volcar los hoteles en la lista");
        }
    }

    private void cargarHoteles(){
        try{
            File fichero = new File("listaHoteles.csv");
            fichero.createNewFile();
            Scanner sc = new Scanner(fichero);
            sc.useDelimiter(",|\n");
            while(sc.hasNext()){
                Hotel hotel = new Hotel(sc.next(), sc.next(), sc.next(), sc.next());
                listaHoteles.add(hotel);
            }
            sc.close();
        }
        catch(IOException ex){
            System.err.println("no hay hoteles en la lista");
        }
    }

}
