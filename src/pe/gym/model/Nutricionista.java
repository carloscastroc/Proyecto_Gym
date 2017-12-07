package pe.gym.model;

/**
 *
 * @author Brayian
 */
public class Nutricionista {
    
    
    private String IdInfNutricional;
    private String IdSocio;
    private String IdMembresia;
    private String Nombre;
    private String DNI;
    private String Fecha;   

    public Nutricionista() {
    }

    public String getIdInfNutricional() {
        return IdInfNutricional;
    }

    public String getIdSocio() {
        return IdSocio;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setIdInfNutricional(String IdInfNutricional) {
        this.IdInfNutricional = IdInfNutricional;
    }

    public void setIdSocio(String IdSocio) {
        this.IdSocio = IdSocio;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getIdMembresia() {
        return IdMembresia;
    }

    public void setIdMembresia(String IdMembresia) {
        this.IdMembresia = IdMembresia;
    }

    
    
}

