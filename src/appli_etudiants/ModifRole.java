/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author g.parra
 */
public class ModifRole extends javax.swing.JDialog {

    private InterfaceGraphique fenetre;
    private Personne gens;

    /**
     * Creates new form ModifRole
     */
    public ModifRole(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //positionnement au milieu de la fenetre parente
        this.setLocationRelativeTo(parent);
        //modal==true signifie que l'on ne peut pas revenir 
        //sur la precedente fenêtre dans fermer connexion
        this.setModal(true);
        //on stocke dans this.fenetre la référence vers la fenetre parente
        this.fenetre = (InterfaceGraphique) parent;
    }

    public void AjoutInfo(Personne gens) {
        this.gens = gens;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextPos = new javax.swing.JTextField();
        jTextID = new javax.swing.JTextField();
        jButtonModifPos = new javax.swing.JButton();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jLabelCategorie = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelNom1 = new javax.swing.JLabel();
        jLabelPrenom1 = new javax.swing.JLabel();
        jLabelRole1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("modif");

        jTextPos.setToolTipText("uyuyb");

        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });

        jButtonModifPos.setText("Modifier la position");
        jButtonModifPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifPosActionPerformed(evt);
            }
        });

        jLabelNom.setText("Nom");

        jLabelPrenom.setText("Prénom");

        jLabelCategorie.setText("Catégorie");

        jButton1.setText("Rechercher Utilisateur");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelNom1.setText("Nom");

        jLabelPrenom1.setText("Prénom");

        jLabelRole1.setText("Catégorie");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonModifPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextID)
                    .addComponent(jTextPos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNom1)
                        .addGap(51, 51, 51)
                        .addComponent(jLabelPrenom1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelRole1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelNom)
                        .addGap(51, 51, 51)
                        .addComponent(jLabelPrenom)
                        .addGap(50, 50, 50)
                        .addComponent(jLabelCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPrenom1)
                    .addComponent(jLabelNom1)
                    .addComponent(jLabelRole1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonModifPos)
                        .addComponent(jTextPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelNom)
                    .addComponent(jLabelPrenom)
                    .addComponent(jLabelCategorie))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModifPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifPosActionPerformed

        String pos = jTextPos.getText();
        int id = Integer.parseInt(jTextID.getText());
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requete
            Statement requete = maConnexion.createStatement();
            ResultSet lignesRetournees = requete.executeQuery(gens.modifPos(id, pos));
            if (lignesRetournees.next()) {
                String nom = lignesRetournees.getString("nom");
                String prenom = lignesRetournees.getString("prenom");
                String newPos = lignesRetournees.getString("categorie");

                jLabelNom.setText(nom);
                jLabelPrenom.setText(prenom);
                jLabelCategorie.setText(newPos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModifRole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonModifPosActionPerformed

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requete
            Statement requete = maConnexion.createStatement();
            ResultSet lignesRetournees = requete.executeQuery("select nom,prenom,categorie from Utilisateurs where id_utilisateur=" + jTextID.getText());
            if (lignesRetournees.next()) {
                String nom = lignesRetournees.getString("nom");
                String prenom = lignesRetournees.getString("prenom");
                String pos = lignesRetournees.getString("categorie");
                jLabelCategorie.setText(pos);
                jLabelNom.setText(nom);
                jLabelPrenom.setText(prenom);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Responsable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ModifRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModifRole dialog = new ModifRole(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonModifPos;
    private javax.swing.JLabel jLabelCategorie;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelNom1;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelPrenom1;
    private javax.swing.JLabel jLabelRole1;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextPos;
    // End of variables declaration//GEN-END:variables
}
