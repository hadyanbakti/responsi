/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import DAOdatabuku.databukuDAO;
import DAOImplement.databukuimplement;
import model.*;
import frame.mainv;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Lab Informatika
 */
public class controller {
    mainv frame;
    databukuimplement impldatabuku;
    List<databuku> dp;
    
    public controller(mainv frame){
    this.frame = frame;
    impldatabuku = new databukuDAO();
    dp = impldatabuku.getAll();
}
    public void isitabel(){
    dp = impldatabuku.getAll();
    modeltabeldatabuku mp = new modeltabeldatabuku(dp);
    frame.getTabeldatabuku().setModel(mp);
    }
    
    public void insert(){
    databuku db = new databuku();
    db.setNama_penyewa(frame.getNama_penyewa().getText());
    db.setJudul_buku(frame.getJudul_buku().getText());
    db.setJenis_buku(frame.getJenis_buku().getText());
    db.setNomor_telepon(frame.getNomor_telepon().getText());
    db.setDurasi_sewa(Double.parseDouble(frame.getDurasi_sewa().getText()));
    db.setTotal_biaya(db.getDurasi_sewa()*5000);
}

public void update(){
databuku db = new databuku();
    db.setNama_penyewa(frame.getNama_penyewa().getText());
    db.setJudul_buku(frame.getJudul_buku().getText());
    db.setJenis_buku(frame.getJenis_buku().getText());
    db.setNomor_telepon(frame.getNomor_telepon().getText());
    db.setDurasi_sewa(Double.parseDouble(frame.getDurasi_sewa().getText()));
    db.setTotal_biaya(db.getDurasi_sewa()*5000);
}  
}
    

