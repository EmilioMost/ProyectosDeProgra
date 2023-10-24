package negocio; 

public class Hotel {
    private String nombre;
    private String ubicacion;
    private String estrellas;
    private String habitaciones;
// short para habitaciones ya que ningún hotel puede tener más de 32768 habitaciones
    public Hotel(String nombre, String ubicacion, String estrellas, String habitaciones){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.estrellas = estrellas;
        this.habitaciones = habitaciones;
    }
    public Hotel(String nombre, String ubicacion, String estrellas){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.estrellas = estrellas;
    }
    public Hotel(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
// con estos 3 metodos permite crear objetos de la clase Hotel y sin la necesidad de poner las habitaciones o las estrellas del hotel,
// pero es necesario el nombre y la ubicacion como minimo. Si se quieren añadir las habitaciones es necesario saber cuantas estrellas tiene el hotel
    public String getNombre(){
        return nombre;
    }
    public String getUbicacion(){
        return ubicacion;
    } 
    public String getEstrellas(){
        return estrellas;
    }
    public String getHabitaciones(){
        return habitaciones;
    }
    public String getHotel(){


        return "El nombre del hotel es " + getNombre() + ", se escuentra en " + getUbicacion() + ", tiene" + getEstrellas() + "estrellas y " + getHabitaciones() + "habitaciones.";
    }
}
