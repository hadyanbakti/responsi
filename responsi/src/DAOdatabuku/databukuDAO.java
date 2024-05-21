/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOdatabuku;
import java.util.List;
import java.sql.*;
import connector.connector;
import model.*;
import DAOImplement.databukuimplement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lab Informatika
 */
public class databukuDAO implements databukuimplement {

    Connection connection;
    final String select = "SELECT * FROM sewa_buku";
    final String insert = "INSERT INTO sewa_buku (id, nama_penyewa, judul_buku, jenis_buku, nomor_telepon, duraasi_sewa, total_biaya) (?, ?, ?, ?, ?, ?, ?)";
    final String update = "UPDATE sewa_buku set nama_penyewa=?, judul_buku=?, jenis_buku=?, nomor_telepon=?, durasi_sewa=?, total_biaya=? WHERE id=?";
    final String delete = "DELETE FROM sewa_buku where id=?";
    @Override
    public void insert(databuku b) {
              PreparedStatement statement = null;
              
              try{
                  statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
                  statement.setString(1, b.getNama_penyewa());
                  statement.setString(2, b.getJudul_buku());
                  statement.setString(3, b.getJenis_buku());
                  statement.setString(4, b.getNomor_telepon());
                  statement.setDouble(5, b.getDurasi_sewa());
                  statement.setDouble(6, b.getTotal_biaya());
                  statement.executeUpdate();
                 ResultSet rs = statement.getGeneratedKeys();
                 
                 while(rs.next()){
                b.setId(rs.getString(0));
                 }
                 throw new SQLException("Data Telah Ditamahkan");
                 
              }catch(SQLException ex){
              ex.printStackTrace();
              } finally{
              try {
              statement.close();
              }catch(SQLException ex){
              ex.printStackTrace();
              }
              }
    }

    @Override
    public void update(databuku b) {
    PreparedStatement statement = null;
    try{
        statement = connection.prepareStatement(update);
                  statement.setString(7, b.getId());
                  statement.setString(1, b.getNama_penyewa());
                  statement.setString(2, b.getJudul_buku());
                  statement.setString(3, b.getJenis_buku());
                  statement.setString(4, b.getNomor_telepon());
                  statement.setDouble(5, b.getDurasi_sewa());
                  statement.setDouble(6, b.getTotal_biaya());
                  statement.executeUpdate();
    
    }catch(SQLException ex){
              ex.printStackTrace();
              }
    finally{
              try {
              statement.close();
              }catch(SQLException ex){
              ex.printStackTrace();
              }
              }
    }

    @Override
    public void delete(String id) {
        PreparedStatement statement = null;
    try{
        statement = connection.prepareStatement(delete);
                  statement.setString(1,id);
                  statement.executeUpdate();
                 
    
    }catch(SQLException ex){
              ex.printStackTrace();
              }
    finally{
              try {
              statement.close();
              }catch(SQLException ex){
              ex.printStackTrace();
              }
              }
    }

    @Override
    public List<databuku> getAll() {
        List<databuku> db = null;
        try{
        db = new ArrayList<>();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(select);
        while (rs.next()){
        databuku buku = new databuku();
        buku.setId(rs.getString("id"));
        buku.setNama_penyewa(rs.getString("nama_penyewa"));
        buku.setJudul_buku(rs.getString("judul_buku"));
        buku.setJenis_buku(rs.getString("jenis_buku"));
        buku.setNomor_telepon(rs.getString("nomor_telepon"));
        buku.setDurasi_sewa(rs.getDouble("durasi_sewa"));
        buku.setTotal_biaya(rs.getDouble("total_biaya"));
        
        
        
        }
                
                }catch(SQLException ex){
                    Logger.getLogger(databukuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return db;
    }
    
}
