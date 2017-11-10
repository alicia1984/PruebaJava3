/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import javax.swing.*;
import java.awt.*;
import bd.ConexionBD ;
import java.sql.Connection;
import java.awt.event.*;

//paso 14  importar  la  clase  conexionBd
/**
 **Alicia Villarroel Astudillo
 * @author LP 13
 * Fecha:Noviembre 10 de 20017
 * Programa: pruebajava3
 * Responsabilidad: estructura jframe  para creacion del  tipo  conexion para  la  bd 
 * PRUEBA TERMINADA 
 * @author LP 13
 */
public class Interfaz extends JFrame{
  JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton;
    JButton boton2;
    //paso 15 creacion  de un  objeto tipo  coxion bd
    ConexionBD con;
    
      public Interfaz() 
    {   
    panel = new JPanel();
    label = new JLabel();
    text = new JTextField(30);
    boton = new JButton();
     boton2 = new JButton(); 
    
this.add(panel);
    panel.add(label);
    panel.add(text);
    panel.add(boton);
   panel.add(boton2);
    
    label.setText("Base De Datos");
    boton.setText("Conectar");
    boton2.setText("Desconectar");
    panel.setBackground(Color.orange);
    // paso  16 agregamos escuchadore al  boton
  
     boton.addActionListener(new ActionListener()
  
   {
    public void actionPerformed(ActionEvent evt)
    {
    con = new ConexionBD();
    Connection reg = con.conectar();
    }
   });
   boton2.addActionListener(new ActionListener()
   
   
   {
    public void actionPerformed(ActionEvent evt)
    {
   con.desconectar();
    }
   });
      }
}
