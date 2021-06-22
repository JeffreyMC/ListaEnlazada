/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada.proyecto;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


/**
 *
 * @author Jeffrey
 */
public class Grafico extends javax.swing.JFrame {

    Nodo nodo;
    public Grafico(Nodo nodo) {
        this.nodo = nodo;
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("ELEMENTOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("RAÍZ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(jLabel1)))
                .addContainerGap(418, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized
    
    
      public void paint(Graphics g){
            super.paint(g);
            
            int rectX = 40;
            int stringX = 70;
            int lineX = 110;
            int lineY = 140;
            //fuente
            g.setFont(new Font("default", Font.BOLD, 16));
            
            g.setColor(Color.BLACK);
            g.drawRect(rectX, 60, 70, 70);
            g.drawString(String.valueOf(nodo.data), stringX, 100);
            g.drawLine(lineX, 95,lineY, 95);
            
            while(nodo.siguiente != null){
                rectX = rectX+100;
                stringX = stringX+100;
                lineX = lineX+100;
                lineY = lineY+100;
                
                g.setColor(Color.BLACK);
                g.drawRect(rectX, 60, 70, 70);
                g.drawString(String.valueOf(nodo.siguiente.data), stringX, 100);
                g.drawLine(lineX, 95,lineY, 95);
                
                nodo = nodo.siguiente;
            }
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
