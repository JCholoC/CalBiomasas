package Aplicacion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

public class ModeloListaMunicipios extends AbstractListModel implements ComboBoxModel {

    DBConexion Miconexion = new DBConexion(); //declaracion para realizar conexion a BD Mysql
   
    ArrayList<String> listamunicipios = new ArrayList<String>();
    
    private Object selectedItem;
    
    public ModeloListaMunicipios() {

        //llenado de datos
                
        int idmunicipio;
        String nombremunicipio;

        ResultSet DatosUbicacion = Miconexion.getQuery("SELECT id_municipio,Nombre_municipio* FROM ubicacionmunicipios"); //CONSULTA A LA BD

        try {
            while (DatosUbicacion.next()) {

                idmunicipio = DatosUbicacion.getInt("id_municipio");
                nombremunicipio = DatosUbicacion.getString("Nombre_municipio");
                listamunicipios.add(nombremunicipio);
                
                
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            
            String titulo = "Error en Listado Municipios";
            String mensaje = "Error en el Modelo Lista de municipios";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
            System.out.println("Error insertando Lista ubicacion de municipios");
            
            e.printStackTrace();
        }
        
        /*
        
        for (int i = 0; i < ListadoM.size(); i++) {
            listamunicipios.add(ListadoM.get(i).nombre);
        }
        */
    }
    

    @Override
    public int getSize() {
        return listamunicipios.size();
    }

    @Override
    public String getElementAt(int index) {

        return listamunicipios.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

}
