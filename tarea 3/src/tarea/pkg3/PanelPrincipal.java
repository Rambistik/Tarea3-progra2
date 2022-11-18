package tarea.pkg3;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

class PanelPrincipal extends JPanel implements MouseListener, ActionListener {

    private Comprador com;
    private Expendedor exp;

    public PanelPrincipal() {
        super();
        exp = new Expendedor(3, 2);
        com = new Comprador(exp);
        this.setBackground(Color.white);
        setSize(1600, 1200);
        setVisible(true);
    }
    
    public void Botones(){
        JButton boton100 = new JButton();
        boton100.setText("100");
        boton100.setBounds(10, 10, 100, 40);
        JButton boton500 = new JButton();
        boton500.setText("500");
        boton500.setBounds(200, 10, 100, 40);
        JButton boton1000 = new JButton();
        boton1000.setText("1000");
        boton1000.setBounds(700, 10, 100, 40);
        add(boton100);
        add(boton500);
        add(boton1000);
    }
    

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        com.paint(g);
        exp.paint(g);
    } 
    

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
