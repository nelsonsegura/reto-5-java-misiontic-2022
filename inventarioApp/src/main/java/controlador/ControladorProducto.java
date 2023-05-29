
package controlador;

import java.util.ArrayList;
import java.util.Optional;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.RepositorioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import vista.Actualizar;
import vista.Advertencia;
import vista.Informe;
import vista.vista;

public class ControladorProducto {
    @Autowired
    RepositorioProducto rp;
    vista m;
    ArrayList<Producto> listaProductos;

    public ControladorProducto(RepositorioProducto rp, vista m) {
        this.rp = rp;
        this.m = m;
    } 
    public void setListaProductos(ArrayList<Producto> listaProductos){
        this.listaProductos =listaProductos;
    }
    
    public Producto agregar(Producto p){
        return rp.save(p);
    }
    public Producto actualizar(Producto p){
        return rp.save(p);
    }
    
    public boolean eliminar(Integer id){
        try{
            rp.deleteById(id);
            return true;       
        }catch(Exception ex){
            return false;
        }
    }  
    public ArrayList<Producto> obtenerProductos(){
        return (ArrayList<Producto>) rp.findAll();
    }
    public Optional<Producto> obtenerProducto(Integer id){
        return rp.findById(id);
    }
    public double inventarioToltal(){
         double suma = 0;
         for (Producto p: listaProductos){
             suma+=p.getPrecio()*p.getInventario();
         }  
         return suma;
     }
    public String precioMenor(){
       String nombre = listaProductos.get(0).getNombre();
       double precio = listaProductos.get(0).getPrecio();
       for(Producto p: listaProductos){
             if(p.getPrecio() < precio){
                 nombre = p.getNombre();
                 precio = p.getPrecio();
             }
         }   
         return nombre;
}
     
public String precioMayor(){
       String nombre = listaProductos.get(0).getNombre();
       double precio = listaProductos.get(0).getPrecio();
       for(Producto p: listaProductos){
             if(p.getPrecio() > precio){
                 nombre = p.getNombre();
                 precio = p.getPrecio();
             }
         }   
         return nombre;
     }
public double promedio(){
        double suma = 0;
        for (Producto p: listaProductos){
            suma+=p.getPrecio();
        }
        return suma/listaProductos.size();
     }
    public void eventoAgregar(){
        String nombre = m.getCampoNombre();
        String precio = m.getCampoPrecio();
        String inventario = m.getCampoInventario();
        if (!nombre.equals("") && !precio.equals("") && !inventario.equals("")){
            Producto nuevo = new Producto(nombre, Double.parseDouble(precio), Integer.parseInt(inventario));
            listaProductos.add(nuevo);
            agregar(nuevo);
            DefaultTableModel modelo = (DefaultTableModel) m.getInventario().getModel();
            modelo.insertRow(listaProductos.size()-1, new Object[]{nuevo.getNombre(), nuevo.getPrecio(), nuevo.getInventario()});
        }else{
            Advertencia me = new Advertencia();
            me.setVisible(true);
        }
    }
      public void eventoEliminar(){
          int filaEliminar = m.getInventario().getSelectedRow();
          listaProductos.remove(filaEliminar);
          eliminar(listaProductos.get(filaEliminar).getCodigo());
          DefaultTableModel modelo = (DefaultTableModel) m.getInventario().getModel();
          modelo.removeRow(filaEliminar);
      }
      
      public void abrirventanaAct(){
          Actualizar a = new Actualizar();
          a.setControlador(this);
          a.setVisible(true);
      }
      
      public void eventoActualizar(Actualizar v){
         
          String nombre = v.getCampoNombreA();
          String precio = v.getCampoPrecioA();
          String inventario = v.getCampoInventarioA();
          if (!nombre.equals("") && !precio.equals("") && !inventario.equals("")){
               int filaActualizar = m.getInventario().getSelectedRow();
               DefaultTableModel modelo = (DefaultTableModel) m.getInventario().getModel();
               listaProductos.get(filaActualizar).setInventario(Integer.parseInt(inventario));
               listaProductos.get(filaActualizar).setNombre(nombre);
               listaProductos.get(filaActualizar).setPrecio(Double.parseDouble(precio));
               actualizar(listaProductos.get(filaActualizar));
               modelo.setValueAt(nombre, filaActualizar, 0);
               modelo.setValueAt(Double.parseDouble(precio), filaActualizar, 1);
               modelo.setValueAt(Integer.parseInt(inventario), filaActualizar, 2);
      }else{
            Advertencia me = new Advertencia();
            me.setVisible(true);
      }
      }
    
      public void eventoInforme(){
          Informe i = new Informe();
          i.setVisible(true);
          i.setInventario(i.getInventario()+inventarioToltal());
          i.setMayor(i.getMayor()+precioMayor());
          i.setMenor(i.getMenor()+precioMenor());
          i.setPromedio(i.getPromedio()+String.format("%.1f", promedio()));
          
      }
    public void inicializaTabla(){
        DefaultTableModel modelo = (DefaultTableModel) m.getInventario().getModel();
        int ind = 0; 
        for(Producto p: listaProductos){
             modelo.insertRow(ind, new Object[]{p.getNombre(), p.getPrecio(), p.getInventario()});
             ind+=1;
        }
    }
   
}
