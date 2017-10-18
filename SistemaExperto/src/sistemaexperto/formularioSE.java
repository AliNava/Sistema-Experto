package sistemaexperto;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;


public class formularioSE extends javax.swing.JFrame {

    
    public formularioSE() {
        initComponents();
        setTitle("Sistema Experto de Videojuegos");
        setResizable(false);
        this.setLocationRelativeTo(null);
        texto.setEditable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.gray));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Centro de videjojuegos");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel2.setText("Cuestionario de preguntas");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Moba, Deportes & Shooter");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.gray));

        jButton1.setToolTipText("Clic para comenzar el examen");
        jButton1.setLabel("Comenzar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        jLabel6.setText("Para comenzar el cuestionario da");

        jLabel3.setText("clic en \"comenzar\"");

        jLabel7.setText("analiza y contesta las preguntas");

        jLabel8.setText("para generarte un resultado.");

        jButton2.setText("Salir");
        jButton2.setToolTipText("Clic para salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addGap(3, 3, 3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(62, 62, 62)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int u,d,t;
          
        u = JOptionPane.showConfirmDialog(rootPane,"¿Usted le gustan los juegos de estrategia?", null, YES_NO_OPTION);
                
        if(u == 0){
            moba();
        }
        else if(u == 1){
          d = JOptionPane.showConfirmDialog(rootPane, "¿Usted es una persona competitiva?", null, YES_NO_OPTION);  
            if(d == 0){
                deportes();
            }
            else if(d==1){
                t = JOptionPane.showConfirmDialog(rootPane, "¿le husta los juegos velicos?", null, YES_NO_OPTION);
                    if(t == 0){
                        shooter();
                    }
                    else if(t == 1){
                        JOptionPane.showMessageDialog(rootPane, "Usted deberia comprar otro tipo de juego", null, YES_NO_OPTION);
                    }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void moba(){
      int u,d,t,c,ci,se;
      
      u = JOptionPane.showConfirmDialog(rootPane, "¿A usted le gusta jugar?", null, YES_NO_OPTION);
      d = JOptionPane.showConfirmDialog(rootPane, "¿Tienes experiencia en juegos?", null, YES_NO_OPTION);
      t = JOptionPane.showConfirmDialog(rootPane, "¿Le gusta trabajar en equipo?", null, YES_NO_OPTION);
      c = JOptionPane.showConfirmDialog(rootPane, "¿Le gustan los juegos donde se requiere pensar arduamente?", null, YES_NO_OPTION);
      ci = JOptionPane.showConfirmDialog(rootPane, "¿Te gusta jugar online?", null, YES_NO_OPTION);
      se = JOptionPane.showConfirmDialog(rootPane, "¿Pasas mucho tiempo jugando?", null, YES_NO_OPTION);
      
      if((u==0) && (d==0) && (t==0) && (c==0) && (ci==0) && (se==0)){
           String dg = "----------------------------------------------------\n"
                     + "-  Sistema Experto de Videojuegos                   \n"
                     + "----------------------------------------------------\n"
                     + "-     Que tipo de juego debería comprar             \n"
                     + "----------------------------------------------------\n"
                     + "- tipo moba                                         \n"
                     + "----------------------------------------------------";
           
           texto.setText(dg);
      }
      else{
          deportes();
      }
    }
    
    private void deportes(){
      int u,d,t,c,ci,se,si,oc ;  
      
      u = JOptionPane.showConfirmDialog(rootPane, "¿Usted le gustan los deportes?", null, YES_NO_OPTION);
      d = JOptionPane.showConfirmDialog(rootPane, "¿Le gusta jugar en equipo?", null, YES_NO_OPTION);
      t = JOptionPane.showConfirmDialog(rootPane, "¿Le gusta jugar online?", null, YES_NO_OPTION);
      c = JOptionPane.showConfirmDialog(rootPane, "¿Le gusta jugan con sus amigos?", null, YES_NO_OPTION);
      ci = JOptionPane.showConfirmDialog(rootPane, "¿Pasa mucho tiempo jugando?", null, YES_NO_OPTION);
      se = JOptionPane.showConfirmDialog(rootPane, "¿Tiene habilidad para jugar?", null, YES_NO_OPTION); 
      si = JOptionPane.showConfirmDialog(rootPane, "¿Le gusta jugar por tiempos?", null, YES_NO_OPTION);
      oc = JOptionPane.showConfirmDialog(rootPane, "¿Le gusta participar en torneos?", null, YES_NO_OPTION);
      
      if((u==0) && (d==0) && (t==0) && (c==0) && (ci==0) && (se==0) && (si==0) && (oc==0)){
           String dg = "----------------------------------------------------\n"
                     + "-  Sistema Experto de Videojuegos                   \n"
                     + "----------------------------------------------------\n"
                     + "-     Que tipo de juego debería comprar             \n"
                     + "----------------------------------------------------\n"
                     + "- tipo deportes                                         \n"
                     + "----------------------------------------------------";
           
          texto.setText(dg);
      }
      else{
          shooter();
      }
    }
    
    private void shooter(){
       int u,d,t,c,ci,se;
       
       u = JOptionPane.showConfirmDialog(rootPane, "¿Usted le gusta la sangre?", null, YES_NO_OPTION);
       d = JOptionPane.showConfirmDialog(rootPane, "¿Usted le gustan las pistolas?", null, YES_NO_OPTION);
       t = JOptionPane.showConfirmDialog(rootPane, "¿Usted le gusta la guerra?", null, YES_NO_OPTION);
       c = JOptionPane.showConfirmDialog(rootPane, "¿Es una persona sangunaria?", null, YES_NO_OPTION);
       ci = JOptionPane.showConfirmDialog(rootPane, "¿Sabe de historia?", null, YES_NO_OPTION); 
       se = JOptionPane.showConfirmDialog(rootPane, "¿Le gusta los juegos con misiones?", null, YES_NO_OPTION);
       
       if((u==0) && (d==0) && (t==0) && (c==0) && (ci==0) && (se==0)){
            String dg = "----------------------------------------------------\n"
                     + "-  Sistema Experto de Videojuegos                   \n"
                     + "----------------------------------------------------\n"
                     + "-     Que tipo de juego debería comprar             \n"
                     + "----------------------------------------------------\n"
                     + "- tipo shooter                                         \n"
                     + "----------------------------------------------------";
            
           texto.setText(dg); 
       }
       else{
           moba();
       }
    }
    
   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formularioSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioSE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
