/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.uned.ac.introsis.taller3.dao;

import cr.uned.ac.introsis.taller3.domino.AccionEcologica;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ivanrojasgranados
 */
public class AccionEcologicaDAO {
    private Connection con;
    public AccionEcologicaDAO(){
        try {
            Conexion conexion =new Conexion();
            con=conexion.conectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion a Base de datos","Error Dao",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(AccionEcologicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void insertarAccion(AccionEcologica accion) throws SQLException{
        String insert="INSERT INTO accion_ecologica(nombre,tipo,impacto) VALUES (?, ?, ?)";
        
        PreparedStatement pst=con.prepareCall(insert);
        pst.setString(1, accion.getNombre());
        pst.setString(2, accion.getTipo());
        pst.setInt(3, accion.getImpacto());
        
        pst.execute();
    }
    
    public ArrayList<AccionEcologica> obtenerCatalogoAcciones() throws SQLException{
        ArrayList<AccionEcologica> accionesLista=new ArrayList<>();
        String select="SELECT * FROM accion_ecologica";
        PreparedStatement pstm=con.prepareCall(select);
        ResultSet rs=pstm.executeQuery();
        
        while(rs.next()){
            AccionEcologica accionTmp=new AccionEcologica();
            accionTmp.setId(rs.getInt("id"));
            accionTmp.setImpacto(rs.getInt("impacto"));
            accionTmp.setTipo(rs.getString("tipo"));
            accionTmp.setNombre(rs.getString("Nombre"));
            accionesLista.add(accionTmp);
        }
        
        return accionesLista;
    }
}
