
package tpalumnoss;

//import java.util.ArrayList;
//import java.util.Collection;
import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import javax.swing.JOptionPane;

public class Materia {
    private Integer codigoMateria;
    private String nombre;
    private Integer ano;
    public static HashMap<Integer, String> listaMaterias=new HashMap<Integer, String>();

    public Materia() {
    }

    public Materia(Integer codigoMateria, String nombre, Integer ano) {
        this.codigoMateria = codigoMateria;
        this.nombre = nombre;
        this.ano = ano;
    }

    

    public Integer getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(Integer codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
    
    public static boolean agregarMateria(Integer codigoMateria, String nombre, Integer ano){
        boolean agregado=false;
        if(!listaMaterias.containsKey(codigoMateria)){
            listaMaterias.put(codigoMateria, nombre);
            agregado=true;
        }
        return agregado;
    }

}