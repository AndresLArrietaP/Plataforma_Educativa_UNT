/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import modelo.Calendario;
import modelo.Curso;
import modelo.Lista_Doble;
import modelo.Matricula;
import modelo.Retiro;
import modelo.Repositorio;

/**
 *
 * @author acer
 */
public class frmRetiro extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmRetiro
     */
    Lista_Doble ld = new Lista_Doble();
    DefaultTableModel model;

    public frmRetiro() {
        initComponents();
        this.setLocation(150, 40);
        this.setTitle("Retiro");
        ld.CargarEstudiante();
        ld.CargarProfesor();
        ld.CargarCurso();
        ld.CargarMatricula();
        ld.CargarRetiro();

        model = new DefaultTableModel();
        model.addColumn("N° RETIRO");
        model.addColumn("N° MAT.");
        model.addColumn("NOMBRES");
        model.addColumn("APELLIDOS");
        model.addColumn("ASIGNATURA");
        model.addColumn("PROFESOR");
        model.addColumn("FECHA");
        model.addColumn("HORA");
        tblRetiro.setModel(model);

        ajustarColumnas();
        listar();
        deshabilitarTodo();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        boxRetiro = new javax.swing.JComboBox<>();
        boxMatricula = new javax.swing.JComboBox<>();
        boxCurso = new javax.swing.JComboBox<>();
        txtEstudiante = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRetiro = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtProfesor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtActivoP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMatriculados = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtActivo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setClosable(true);
        setResizable(true);
        setTitle("Registro de Retiro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero de Matricula:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numero de Retiro:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Profesor:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo del Curso:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Matriculados:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Activo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        boxRetiro.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        boxRetiro.setEnabled(false);
        boxRetiro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxRetiroItemStateChanged(evt);
            }
        });
        jPanel1.add(boxRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 120, -1));

        boxMatricula.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        boxMatricula.setEnabled(false);
        boxMatricula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxMatriculaItemStateChanged(evt);
            }
        });
        jPanel1.add(boxMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 120, -1));

        boxCurso.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        boxCurso.setEnabled(false);
        boxCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxCursoItemStateChanged(evt);
            }
        });
        jPanel1.add(boxCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 120, -1));

        txtEstudiante.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtEstudiante.setEnabled(false);
        jPanel1.add(txtEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 170, -1));

        txtCurso.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtCurso.setEnabled(false);
        jPanel1.add(txtCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 180, -1));

        btnAdicionar.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/add.png"))); // NOI18N
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 50, 50));

        btnAceptar.setBackground(new java.awt.Color(255, 204, 204));
        btnAceptar.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/check.png"))); // NOI18N
        btnAceptar.setEnabled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 50, 50));

        btnModificar.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/edit.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 50, 50));

        btnEliminar.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/delete.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 50, 50));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 51));
        btnCancelar.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/cross.png"))); // NOI18N
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 50, 50));

        tblRetiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Retiro", "N° Mat", "Nombres", "Apellidos", "Asignatura", "Fecha", "Hora", "Profesor"
            }
        ));
        tblRetiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRetiroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRetiro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 660, 140));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estudiante:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtProfesor.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtProfesor.setEnabled(false);
        jPanel1.add(txtProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 190, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Activo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtActivoP.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtActivoP.setEnabled(false);
        jPanel1.add(txtActivoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 90, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Curso:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        txtMatriculados.setBackground(new java.awt.Color(255, 255, 153));
        txtMatriculados.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtMatriculados.setEnabled(false);
        jPanel1.add(txtMatriculados, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 60, -1));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estudiante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtActivo.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtActivo.setEnabled(false);
        jPanel2.add(txtActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 270, 70));

        jPanel3.setBackground(new java.awt.Color(255, 102, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Profesor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 290, 70));

        jPanel4.setBackground(new java.awt.Color(255, 51, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Curso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255)), "Curso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 440, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        limpiar();
        habilitar(false, true, false, false, false, false, false, true, true, false, true, false);
        boxRetiro.addItem(String.valueOf(ld.codigoCorelativoRetiro()));
        boxRetiro.setSelectedIndex(ld.tamañoRetiro());
        boxMatricula.requestFocus();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (!btnAdicionar.isEnabled()) {
            deshabilitarTodo();
        }
        habilitar(true, false, false, false, true, false, false, true, true, true, false, false);
        boxRetiro.requestFocus();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int numRetiro = leerNumeroRetiro();
            int codCurso = leerCodigoCurso();
            Retiro buscado = ld.buscarRetiro(numRetiro);

            ld.eliminarRetiro(buscado.getNumRetiro());
            ld.buscarEstudiante(ld.buscarMatricula(buscado.getNumMatricula()).getCodigoEstudiante()).setEstado(1);
            Curso cur=ld.buscarCurso(codCurso);
            int mat = cur.getMatriculados();
            cur.setMatriculados(mat+1);
            Repositorio.retiroElim++;
            ld.GuardarRetiro();
            ld.GuardarEstudiantes();
            ld.GuardarProfesores();
            ld.GuardarCurso();
            ld.GuardarMatricula();
            Repositorio.GuardarRepo();
            
            listar();
            mensaje("Retiro eliminado exitosamente");
            deshabilitarTodo();

        } catch (Exception error) {
            error("Seleccione un número de retiro", boxRetiro);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            int numRetiro = leerNumeroRetiro();
            try {
                int numMatricula = leerNumeroMatricula();
                int codCurso = leerCodigoCurso();
                if (!btnAdicionar.isEnabled()) {
                    if (ld.buscarEstudiante(ld.buscarMatricula(numMatricula).getCodigoEstudiante()).getEstado() == 1) {
                        Retiro nuevo = new Retiro(numRetiro, numMatricula, Calendario.fechaActual(), Calendario.horaActual());
                        ld.buscarEstudiante(ld.buscarMatricula(numMatricula).getCodigoEstudiante()).setEstado(2);
                        Curso cur=ld.buscarCurso(codCurso);
                        int mat = cur.getMatriculados();
                        cur.setMatriculados(mat-1);
                        ld.insertarRetiro(nuevo);
                        ld.GuardarRetiro();
                        ld.GuardarCurso();
                        ld.GuardarEstudiantes();
                        ld.GuardarProfesores();
                        ld.GuardarMatricula();
                        listar();
                        mensaje("Nuevo retiro añadido exitosamente");
                        deshabilitarTodo();
                        
                    } else {
                        error("No es posible completar la acción, el alumno ya se encuentra retirado", boxMatricula);
                    }
                } else if (!btnModificar.isEnabled()) {
                    Retiro buscado = ld.buscarRetiro(numRetiro);
                    ld.buscarMatricula(buscado.getNumMatricula()).setCodigoCurso(codCurso);
                    ld.GuardarRetiro();
                    ld.GuardarEstudiantes();
                    ld.GuardarProfesores();
                    ld.GuardarCurso();
                    ld.GuardarMatricula();
                    listar();
                    mensaje("Retiro modificado exitosamente");
                    deshabilitarTodo();
                }
            } catch (Exception error) {
                error("Inserte un número de matrícula", boxMatricula);
            }
        } catch (Exception error) {
            error("Seleccione un número de retiro", boxRetiro);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        deshabilitarTodo();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void boxRetiroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxRetiroItemStateChanged
        try {
            int numRetiro = leerNumeroRetiro();
            Retiro buscadoR = ld.buscarRetiro(numRetiro);
            Matricula buscadoM = ld.buscarMatricula(buscadoR.getNumMatricula());
            boxMatricula.setSelectedItem(buscadoR.getNumMatricula());
            boxCurso.setSelectedItem(buscadoM.getCodigoCurso());
            tblRetiro.setRowSelectionInterval(boxRetiro.getSelectedIndex(), boxRetiro.getSelectedIndex());
        } catch (Exception error) {
        }
    }//GEN-LAST:event_boxRetiroItemStateChanged

    private void boxMatriculaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxMatriculaItemStateChanged
        try {
            int numMatricula = leerNumeroMatricula();
            Matricula buscado = ld.buscarMatricula(numMatricula);
            txtEstudiante.setText(ld.buscarEstudiante(buscado.getCodigoEstudiante()).getNombres()
                    + " " + ld.buscarEstudiante(buscado.getCodigoEstudiante()).getApellidos());
            txtProfesor.setText(ld.buscarProfesor(buscado.getCodigoProfesor()).getNombres()
                    + " " + ld.buscarProfesor(buscado.getCodigoProfesor()).getApellidos());
            boxCurso.setSelectedItem(buscado.getCodigoCurso());
            txtActivo.setText(activo(ld.buscarEstudiante(buscado.getCodigoEstudiante()).getEstado()));
            txtActivoP.setText(activo(ld.buscarProfesor(buscado.getCodigoProfesor()).getEstado()));
        } catch (Exception error) {

        }
    }//GEN-LAST:event_boxMatriculaItemStateChanged

    private void boxCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxCursoItemStateChanged
        try {
            int codCurso = leerCodigoCurso();
            Curso buscado = ld.buscarCurso(codCurso);
            txtCurso.setText(buscado.getAsignatura());
            txtMatriculados.setText(String.valueOf(buscado.getMatriculados()));
        } catch (Exception error) {
        }
    }//GEN-LAST:event_boxCursoItemStateChanged

    private void tblRetiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRetiroMouseClicked
        if (btnAdicionar.isEnabled()) {
            try {
                boxRetiro.setSelectedIndex(tblRetiro.getSelectedRow());
                Retiro buscado = ld.buscarRetiro(Integer.parseInt(boxRetiro.getSelectedItem().toString()));

                boxMatricula.setSelectedItem(buscado.getNumMatricula());
            } catch (Exception error) {
            }
        }
    }//GEN-LAST:event_tblRetiroMouseClicked

    void habilitar(boolean numRetiro, boolean numMatricula, boolean alumno,boolean profesor, boolean codigoCurso, boolean curso,
            boolean activoMatricula, boolean aceptar, boolean cancelar, boolean adicionar, boolean modificar, boolean eliminar) {
        boxRetiro.setEnabled(numRetiro);
        boxMatricula.setEnabled(numMatricula);
        txtEstudiante.setEditable(alumno);
        txtProfesor.setEditable(profesor);
        boxCurso.setEnabled(codigoCurso);
        txtCurso.setEditable(curso);
        txtActivo.setEditable(activoMatricula);
        txtActivoP.setEditable(activoMatricula);
        btnAceptar.setEnabled(aceptar);
        btnCancelar.setEnabled(cancelar);
        btnAdicionar.setEnabled(adicionar);
        btnModificar.setEnabled(modificar);
        btnEliminar.setEnabled(eliminar);
    }

    void deshabilitarTodo() {
        listarCboNumRetiro();
        listarCboNumMatricula();
        listarCboCodCurso();
        habilitar(false, false, false, false, false, false, false, false, false, true, true, true);
        limpiar();
    }

    void limpiar() {
        boxRetiro.setSelectedIndex(-1);
        boxMatricula.setSelectedIndex(-1);
        txtEstudiante.setText("");
        txtProfesor.setText("");
        boxCurso.setSelectedIndex(-1);
        txtCurso.setText("");
        txtActivo.setText("");
        txtActivoP.setText("");
    }

    void listarCboNumRetiro() {
        boxRetiro.removeAllItems();
        ld.cajaRetiro(boxRetiro);
    }

    void listarCboNumMatricula() {
        boxMatricula.removeAllItems();
        ld.cajaMatricula(boxMatricula);
    }

    void listarCboCodCurso() {
        boxCurso.removeAllItems();
        ld.cajaCurso(boxCurso);
    }

    void listar() {
        model.getDataVector().removeAllElements();
        ld.Lista_Retiro(model);
    }
    int leerNumeroRetiro() {
        return Integer.parseInt(boxRetiro.getSelectedItem().toString());
    }
    int leerNumeroMatricula() {
        return Integer.parseInt(boxMatricula.getSelectedItem().toString());
    }
    String leerAlumno() {
        return txtEstudiante.getText().trim().toUpperCase();
    }
    String leerProfesor() {
        return txtProfesor.getText().trim().toUpperCase();
    }
    int leerCodigoCurso() {
        return Integer.parseInt(boxCurso.getSelectedItem().toString());
    }
    String leerCurso() {
        return txtCurso.getText().trim().toUpperCase();
    }
    String activo(int i) {
        return i == 1 ? "Sí" : "No";
    }
    void mensaje(String s) {
        JOptionPane.showMessageDialog(this, s);
    }
    void error(String s, JComboBox cbo) {
        JOptionPane.showMessageDialog(this, s, "", JOptionPane.ERROR_MESSAGE);
        cbo.requestFocus();
    }

    void ajustarColumnas() {
        TableColumnModel modeloColuma = tblRetiro.getColumnModel();
        modeloColuma.getColumn(0).setPreferredWidth(jScrollPane1.getWidth() * 3);
        modeloColuma.getColumn(1).setPreferredWidth(jScrollPane1.getWidth() * 2);
        modeloColuma.getColumn(2).setPreferredWidth(jScrollPane1.getWidth() * 5);
        modeloColuma.getColumn(3).setPreferredWidth(jScrollPane1.getWidth() * 6);
        modeloColuma.getColumn(4).setPreferredWidth(jScrollPane1.getWidth() * 11);
        modeloColuma.getColumn(5).setPreferredWidth(jScrollPane1.getWidth() * 7);
        modeloColuma.getColumn(6).setPreferredWidth(jScrollPane1.getWidth() * 3);
        modeloColuma.getColumn(7).setPreferredWidth(jScrollPane1.getWidth() * 3);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCurso;
    private javax.swing.JComboBox<String> boxMatricula;
    private javax.swing.JComboBox<String> boxRetiro;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRetiro;
    private javax.swing.JTextField txtActivo;
    private javax.swing.JTextField txtActivoP;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtEstudiante;
    private javax.swing.JTextField txtMatriculados;
    private javax.swing.JTextField txtProfesor;
    // End of variables declaration//GEN-END:variables
}
