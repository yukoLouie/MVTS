/*
 * Luis Fernando Aguilar Ortiz 
ITSON ISW 228419
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Fernando Aguilar Ortiz 228419 ITSON ISW obregon-Camp-Nainari
 */
public class mapa extends javax.swing.JFrame {
//variables para emular las condiciones provinientes del entorno real de la mina
String numvagones="5";
String numsemaforos="4";
String semaforoactual="1";
String colorSemaforo="Verde";
    /**
     * Creates new form mapo
     */
    public mapa() {
        List<String> vagones = Arrays.asList("vagon 1", "vagon 2", "vagon 3", "vagon 4", "vagon 5");
        List<String> listaMateriales = Arrays.asList("herramientas", "30kg carbon", "50kg tierra", "20 kg arena", "30kg piedras", "30kg mineral", "10pz dinamita", "repuestos");
        List<String> congestion = Arrays.asList("semaforo 1: vagon 1 y 2 involucrados", "semaforo 2: vagon 3 y 4 involucrados", "semaforo 3: vagon 2 y 5 involucrados", "semaforo 4: vagon 1 y 3 involucrados");
        List<String> estadoSemaforo = Arrays.asList("Verde", "Amarillo", "Rojo");
        List<String> colores = Arrays.asList("Verde", "Amarillo", "Rojo");
        //aqui se guardan las congestiones habidas
        DefaultListModel<String> ListaCongestiones = new DefaultListModel<>();
        
        initComponents();
        
         for (String estado : estadoSemaforo) {
            estadosSemaforo.addItem(estado);
        }
        
        NumVagones.setText(numvagones);
        NumSemaforos.setText(numsemaforos);
         ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
         ScheduledExecutorService executor2 = Executors.newSingleThreadScheduledExecutor();
 
         HistorialCongestiones.setModel(ListaCongestiones);
        executor.scheduleAtFixedRate(() -> {
            int indiceAleatorio = (int) (Math.random() * vagones.size());
            System.out.println(vagones.get(indiceAleatorio));
            
             int cantidadAleatoria = (int) (Math.random() * listaMateriales.size()) + 1;
            Collections.shuffle(listaMateriales);
            List<String> seleccionados = listaMateriales.subList(0, cantidadAleatoria);
            
            System.out.println("Objetos seleccionados: " + seleccionados);
            vagonRepNom.setText(vagones.get(indiceAleatorio));
            
            DefaultListModel<String> model = new DefaultListModel<>();
         for (String item : seleccionados) {
                model.addElement(item);
            }
            jList1.setModel(model);
            
             int indiceAleatorio1 = (int) (Math.random() * congestion.size());
            ListaCongestiones.addElement(congestion.get(indiceAleatorio1));
            HistorialCongestiones.setModel(ListaCongestiones);
            
            semaforoSeleccionado.setText(semaforoactual);
            int indiceColorActual = colores.indexOf(colorSemaforo);
            int indiceColorSiguiente = (indiceColorActual + 1) % colores.size();
            colorSemaforo = colores.get(indiceColorSiguiente);
            jLabel10.setText(colorSemaforo);
            System.out.println("El color del semáforo es ahora: " + colorSemaforo);
        }, 0, 3, TimeUnit.SECONDS);
           executor.scheduleAtFixedRate(() -> {
        
                Random rand = new Random();
                int semaforoAleatorio = rand.nextInt(4) + 1; // Genera un número aleatorio entre 1 y 4
                
                String mensaje = "Congestión inminente entre dos vagones de la mina en el semáforo número " + semaforoAleatorio;
                JOptionPane.showMessageDialog(null, mensaje, "Advertencia de congestión", JOptionPane.WARNING_MESSAGE);

          
            
        }, 0, 14, TimeUnit.SECONDS);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        semaforo1 = new javax.swing.JLabel();
        semaforo2 = new javax.swing.JLabel();
        semaforo3 = new javax.swing.JLabel();
        semaforo4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NumVagones = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NumSemaforos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vagonRepNom = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        HistorialCongestiones = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        semaforoSeleccionado = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        estadosSemaforo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/minas.gif"))); // NOI18N
        jLabel2.setText("jLabel2");

        semaforo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/—Pngtree—traffic light_6666319.png"))); // NOI18N
        semaforo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semaforo1MouseClicked(evt);
            }
        });

        semaforo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/—Pngtree—traffic light_6666319.png"))); // NOI18N
        semaforo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semaforo2MouseClicked(evt);
            }
        });

        semaforo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/—Pngtree—traffic light_6666319.png"))); // NOI18N
        semaforo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semaforo3MouseClicked(evt);
            }
        });

        semaforo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/—Pngtree—traffic light_6666319.png"))); // NOI18N
        semaforo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semaforo4MouseClicked(evt);
            }
        });

        jLabel1.setText("numero de vagones en el mapa:");

        NumVagones.setText("NumVagones");

        jLabel3.setText("numero de semaforos en el mapa");

        NumSemaforos.setText("numSemaforos");

        jLabel4.setText("el vagon:");

        vagonRepNom.setText("vagonReportado");

        jLabel6.setText("llego a su destino y reporto la siguiente carga");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel5.setText("congestiones");

        HistorialCongestiones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(HistorialCongestiones);

        jLabel7.setText("semaforo actual seleccionado");

        semaforoSeleccionado.setText("semaforo seleccionado");

        jLabel9.setText("estado del semaforo seleccionado:");

        jLabel10.setText("verde");

        jLabel11.setText("cambiar estado del semaforo");

        jButton2.setText("cambiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vagonRepNom)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumSemaforos)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(NumVagones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(87, 87, 87))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(semaforo3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(323, 323, 323)
                                        .addComponent(semaforo1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(308, 308, 308)
                                        .addComponent(semaforo2)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(semaforo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(semaforoSeleccionado))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(estadosSemaforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel11)))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(NumVagones)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(NumSemaforos))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(vagonRepNom)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(semaforo1)
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(semaforo2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(semaforoSeleccionado)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(semaforo3))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(semaforo4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadosSemaforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 108, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 109, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void semaforo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semaforo1MouseClicked
     semaforoactual="1";
      semaforoSeleccionado.setText(semaforoactual);
    }//GEN-LAST:event_semaforo1MouseClicked

    private void semaforo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semaforo2MouseClicked
     semaforoactual="2";
      semaforoSeleccionado.setText(semaforoactual);
    }//GEN-LAST:event_semaforo2MouseClicked

    private void semaforo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semaforo3MouseClicked
     semaforoactual="3";
      semaforoSeleccionado.setText(semaforoactual);
    }//GEN-LAST:event_semaforo3MouseClicked

    private void semaforo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semaforo4MouseClicked
     semaforoactual="4";
      semaforoSeleccionado.setText(semaforoactual);
    }//GEN-LAST:event_semaforo4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jLabel10.setText(estadosSemaforo.getItemAt(estadosSemaforo.getSelectedIndex())); 
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> HistorialCongestiones;
    private javax.swing.JLabel NumSemaforos;
    private javax.swing.JLabel NumVagones;
    private javax.swing.JComboBox<String> estadosSemaforo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel semaforo1;
    private javax.swing.JLabel semaforo2;
    private javax.swing.JLabel semaforo3;
    private javax.swing.JLabel semaforo4;
    private javax.swing.JLabel semaforoSeleccionado;
    private javax.swing.JLabel vagonRepNom;
    // End of variables declaration//GEN-END:variables
}
