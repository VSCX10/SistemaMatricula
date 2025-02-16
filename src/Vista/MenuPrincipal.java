/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Control.*;

/**
 *
 * @author ProfL3301
 */
public class MenuPrincipal extends javax.swing.JFrame {

    RegistroPersona objRegistroPersona;
    RegistroCurso objRegistroCurso;
    RegistroMatricula objRegistroMatricula;
    
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        objRegistroPersona = new RegistroPersona();
        objRegistroCurso = new RegistroCurso();
        objRegistroMatricula = new RegistroMatricula();
        
        this.setTitle("Sistema de matrícula");
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
        jMenuBar1 = new javax.swing.JMenuBar();
        menuPersona = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menuItemAlumno = new javax.swing.JMenuItem();
        menuItemAdministrativo = new javax.swing.JMenuItem();
        menuItemDocente = new javax.swing.JMenuItem();
        menuItemCurso = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemMatricula = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuItemReporteAdministrativos = new javax.swing.JMenuItem();
        menuItemReporteAlumnos = new javax.swing.JMenuItem();
        menuItemReporteDocentes = new javax.swing.JMenuItem();
        menuItemListarCursos = new javax.swing.JMenuItem();
        menuItemListarMatriculas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEMA DE MATRÍCULA");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CLASE POO 2024-1");
        jLabel2.setToolTipText("");

        menuPersona.setText("Registro");

        jMenu3.setText("Persona");

        menuItemAlumno.setText("Alumno");
        menuItemAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAlumnoActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemAlumno);

        menuItemAdministrativo.setText("Administrativo");
        menuItemAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAdministrativoActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemAdministrativo);

        menuItemDocente.setText("Docente");
        menuItemDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDocenteActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemDocente);

        menuPersona.add(jMenu3);

        menuItemCurso.setText("Curso");
        menuItemCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCursoActionPerformed(evt);
            }
        });
        menuPersona.add(menuItemCurso);

        jMenuBar1.add(menuPersona);

        jMenu2.setText("Proceso");

        menuItemMatricula.setText("Matrícula");
        menuItemMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMatriculaActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemMatricula);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Reporte");

        menuItemReporteAdministrativos.setText("Administrativos");
        menuItemReporteAdministrativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemReporteAdministrativosActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemReporteAdministrativos);

        menuItemReporteAlumnos.setText("Alumnos");
        menuItemReporteAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemReporteAlumnosActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemReporteAlumnos);

        menuItemReporteDocentes.setText("Docentes");
        menuItemReporteDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemReporteDocentesActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemReporteDocentes);

        menuItemListarCursos.setText("Cursos");
        menuItemListarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarCursosActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemListarCursos);

        menuItemListarMatriculas.setText("Matrículas");
        menuItemListarMatriculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarMatriculasActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemListarMatriculas);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAdministrativoActionPerformed
        // TODO add your handling code here:
        RegistrarAdministrativo frmRegistrarAdministrativo = new RegistrarAdministrativo(this.objRegistroPersona);
        frmRegistrarAdministrativo.setVisible(true);
    }//GEN-LAST:event_menuItemAdministrativoActionPerformed

    private void menuItemReporteAdministrativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemReporteAdministrativosActionPerformed
        // TODO add your handling code here:
        ListarAdministrativo frmListarAdministativos = new ListarAdministrativo(this.objRegistroPersona);
        frmListarAdministativos.setVisible(true);
        
    }//GEN-LAST:event_menuItemReporteAdministrativosActionPerformed

    private void menuItemDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDocenteActionPerformed
        // TODO add your handling code here:
        RegistrarDocente frmRegistrarDocente = new RegistrarDocente(this.objRegistroPersona);
        frmRegistrarDocente.setVisible(true);
    }//GEN-LAST:event_menuItemDocenteActionPerformed

    private void menuItemReporteDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemReporteDocentesActionPerformed
        // TODO add your handling code here:
        ListarDocente frmListarDocentes = new ListarDocente(this.objRegistroPersona);
        frmListarDocentes.setVisible(true);
    }//GEN-LAST:event_menuItemReporteDocentesActionPerformed

    private void menuItemAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAlumnoActionPerformed
        // TODO add your handling code here:
        RegistrarAlumno frmRegistrarAlumno = new RegistrarAlumno(this.objRegistroPersona);
        frmRegistrarAlumno.setVisible(true);
    }//GEN-LAST:event_menuItemAlumnoActionPerformed

    private void menuItemReporteAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemReporteAlumnosActionPerformed
        // TODO add your handling code here:
        ListarAlumno frmListarAlumnos = new ListarAlumno(this.objRegistroPersona);
        frmListarAlumnos.setVisible(true);
    }//GEN-LAST:event_menuItemReporteAlumnosActionPerformed

    private void menuItemCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCursoActionPerformed
        // TODO add your handling code here:
        RegistrarCurso frmRegistrarCurso = new RegistrarCurso(this.objRegistroPersona,objRegistroCurso);
        frmRegistrarCurso.setVisible(true);
    }//GEN-LAST:event_menuItemCursoActionPerformed

    private void menuItemListarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarCursosActionPerformed
        // TODO add your handling code here:
        ListarCurso frmListarCursos = new ListarCurso(this.objRegistroCurso);
        frmListarCursos.setVisible(true);
    }//GEN-LAST:event_menuItemListarCursosActionPerformed

    private void menuItemMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMatriculaActionPerformed
        // TODO add your handling code here:
        RegistrarMatricula frmRegistrarMatricula = new RegistrarMatricula(this.objRegistroPersona,objRegistroCurso, objRegistroMatricula);
        frmRegistrarMatricula.setVisible(true);
        
    }//GEN-LAST:event_menuItemMatriculaActionPerformed

    private void menuItemListarMatriculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarMatriculasActionPerformed
        // TODO add your handling code here:
        ListarMatricula frmListarMatriculas = new ListarMatricula(this.objRegistroMatricula);
        frmListarMatriculas.setVisible(true);
    }//GEN-LAST:event_menuItemListarMatriculasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuItemAdministrativo;
    private javax.swing.JMenuItem menuItemAlumno;
    private javax.swing.JMenuItem menuItemCurso;
    private javax.swing.JMenuItem menuItemDocente;
    private javax.swing.JMenuItem menuItemListarCursos;
    private javax.swing.JMenuItem menuItemListarMatriculas;
    private javax.swing.JMenuItem menuItemMatricula;
    private javax.swing.JMenuItem menuItemReporteAdministrativos;
    private javax.swing.JMenuItem menuItemReporteAlumnos;
    private javax.swing.JMenuItem menuItemReporteDocentes;
    private javax.swing.JMenu menuPersona;
    // End of variables declaration//GEN-END:variables
}
