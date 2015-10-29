
package creencias;

import java.util.Random;
import javax.swing.DefaultListModel;


public class INTERFAZ extends javax.swing.JFrame {

    
Random rnd = new Random();    
    
DefaultListModel modelo;
    
    public INTERFAZ() {
        initComponents();
        setLocationRelativeTo(null);
    
               
        modelo = new DefaultListModel();
        jList1.setModel(modelo);
    
    }
 
desorden d = new desorden();    
    
String[] original = new String[28];    
   





@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("28 Creencias Adventistas"));
        jPanel1.setName(""); // NOI18N

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " ", " ", " ", " ", " ", " ", "    " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Orden-Burbuja");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Desordenar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Orden-Insercion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Orden-Seleccion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(39, 39, 39)
                .addComponent(jButton2)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  
String[] desorden = new String[28];    

desorden[0] = "1. Las Sagradas Escrituras";
desorden[1] = "2. La Trinidad";
desorden[2] = "3. Dios Padre";
desorden[3] = "4. Dios Hijo";
desorden[4] = "5. Dios Espíritu Santo";
desorden[5] = "6. Dios es el Creador";
desorden[6] = "7. La Naturaleza del Hombre";
desorden[7] = "8. El Gran Conflicto";
desorden[8] = "9. Vida, Muerte y Ressurrección de Cristo";
desorden[9] = "10. La Experiencia de la Salvación";
desorden[10] = "11. El crecimiento en Cristo";
desorden[11] = "12. La Iglesia";
desorden[12] = "13. El Remaneciente y su Misión";
desorden[13] = "14. Unidad en el Cuerpo de Cristo";
desorden[14] = "15. El Bautismo";
desorden[15] = "16. La Cena del Señor";
desorden[16] = "17. Dones y Ministerios Espirituales";
desorden[17] = "18. El Don de Profecía";
desorden[18] = "19. La Ley de Dios";
desorden[19] = "20. El Sábado";
desorden[20] = "21. Mayordomía";
desorden[21] = "22. Conducta Cristiana";
desorden[22] = "23. Matrimonio y Familia";
desorden[23] = "24. El Ministerio de Cristo en el Santuario Celestial";
desorden[24] = "25. La Segunda Venida de Cristo";
desorden[25] = "26. Muerte y Resurrección";
desorden[26] = "27. El Milenio y el Fin del Pecado";
desorden[27] = "28. La Nueva Tierra"; 

modelo.clear();

for (int i = 0; i < 28; i++) {
    
                      
            modelo.addElement( desorden[rnd.nextInt(28)] );
            
            
  } 
        
    }//GEN-LAST:event_jButton2ActionPerformed
      
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

//burbuja        
        
modelo.clear();
  
     
String[] original = {"1. Las Sagradas Escrituras",
"2. La Trinidad","3. Dios Padre",
"4. Dios Hijo",
"5. Dios Espíritu Santo","6. Dios es el Creador",
"7. La Naturaleza del Hombre","8. El Gran Conflicto", 
"9. Vida, Muerte y Ressurrección de Cristo",
"10. La Experiencia de la Salvación",
"11. El crecimiento en Cristo",
"12. La Iglesia",
"13. El Remaneciente y su Misión",
"14. Unidad en el Cuerpo de Cristo",
"15. El Bautismo",
"16. La Cena del Señor",
"17. Dones y Ministerios Espirituales",
"18. El Don de Profecía",
"19. La Ley de Dios",
"20. El Sábado",
"21. Mayordomía",
"22. Conducta Cristiana",
"23. Matrimonio y Familia",
"24. El Ministerio de Cristo en el Santuario Celestial",
"25. La Segunda Venida de Cristo",
"26. Muerte y Resurrección",
"27. El Milenio y el Fin del Pecado",
"28. La Nueva Tierra"
};

int[] desorde ={14,19,17,22,26,25,20,18,24,21,23,27,16,15,3,7,11,13,4,12,5,6,0,2,8,9,10,1}; 


d.BURBUJA(desorde);
 



for (int i = 0; i < desorde.length ; i++) {
   
                      
            modelo.addElement( original[ desorde[i] ] );
            
            
  }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

  //insercion      


modelo.clear();
  
     
String[] creencias = {"1. Las Sagradas Escrituras",
"2. La Trinidad","3. Dios Padre",
"4. Dios Hijo",
"5. Dios Espíritu Santo","6. Dios es el Creador",
"7. La Naturaleza del Hombre","8. El Gran Conflicto", 
"9. Vida, Muerte y Ressurrección de Cristo",
"10. La Experiencia de la Salvación",
"11. El crecimiento en Cristo",
"12. La Iglesia",
"13. El Remaneciente y su Misión",
"14. Unidad en el Cuerpo de Cristo",
"15. El Bautismo",
"16. La Cena del Señor",
"17. Dones y Ministerios Espirituales",
"18. El Don de Profecía",
"19. La Ley de Dios",
"20. El Sábado",
"21. Mayordomía",
"22. Conducta Cristiana",
"23. Matrimonio y Familia",
"24. El Ministerio de Cristo en el Santuario Celestial",
"25. La Segunda Venida de Cristo",
"26. Muerte y Resurrección",
"27. El Milenio y el Fin del Pecado",
"28. La Nueva Tierra"
};

int[] vector ={14,19,17,22,26,25,20,18,24,21,23,27,16,15,3,7,11,13,4,12,5,6,0,2,8,9,10,1}; 


d.INSERCION(vector);
 



for (int i = 0; i < vector.length ; i++) {
   
                      
            modelo.addElement( creencias[ vector[i] ] );
            
            
  }

        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

// seleccion
        
        

modelo.clear();
  
     
String[] vectorcreencias = {"1. Las Sagradas Escrituras",
"2. La Trinidad","3. Dios Padre",
"4. Dios Hijo",
"5. Dios Espíritu Santo","6. Dios es el Creador",
"7. La Naturaleza del Hombre","8. El Gran Conflicto", 
"9. Vida, Muerte y Ressurrección de Cristo",
"10. La Experiencia de la Salvación",
"11. El crecimiento en Cristo",
"12. La Iglesia",
"13. El Remaneciente y su Misión",
"14. Unidad en el Cuerpo de Cristo",
"15. El Bautismo",
"16. La Cena del Señor",
"17. Dones y Ministerios Espirituales",
"18. El Don de Profecía",
"19. La Ley de Dios",
"20. El Sábado",
"21. Mayordomía",
"22. Conducta Cristiana",
"23. Matrimonio y Familia",
"24. El Ministerio de Cristo en el Santuario Celestial",
"25. La Segunda Venida de Cristo",
"26. Muerte y Resurrección",
"27. El Milenio y el Fin del Pecado",
"28. La Nueva Tierra"
};

int[] vectordesorden ={14,19,17,22,26,25,20,18,24,21,23,27,16,15,3,7,11,13,4,12,5,6,0,2,8,9,10,1}; 


d.SELECCION(vectordesorden);
 



for (int i = 0; i < vectordesorden.length ; i++) {
   
                      
            modelo.addElement( vectorcreencias[ vectordesorden[i] ] );
            
            
  }

                
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed


      
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
