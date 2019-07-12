package Aplicacion;

//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import static java.lang.Integer.parseInt;
import static java.lang.Math.acos;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Pantalla2 extends javax.swing.JFrame {

    int hola1;
    int hola2;
            
    inicioframe casa;
    JFrame frame;
    JFrame frame2;
    Pantalla2 repintar;
    DBConexion Miconexion = new DBConexion(); //declaracion para realizar conexion a BD Mysql
    ArrayList<Municipio> Municipios = new ArrayList<Municipio>();
    ArrayList<Distancias> listaMunicipiocercano = new ArrayList<Distancias>();

    HashMap<String, TableCellEditor> combos = new HashMap<>();
    HashMap<String, TableCellEditor> combos1 = new HashMap<>();
    HashMap<String, TableCellEditor> combos2 = new HashMap<>();
    DefaultTableModel Modelo1;
    DefaultTableModel modelo5;
    DefaultTableModel modelo6;

    String[] items = {"ton", "Año"};

    String NombresMunicipios[];
    JComboBox[] combo_ubicacion_actual1;    //sustratos
    JComboBox[] combo_ubicacion_actual2;    //tipo biomasa
    JComboBox[] combo_municipio1;    //sustrato
    JComboBox[] combo_municipio2;    //tipo biomasa

    JComboBox sustrato_UbActual = new JComboBox();
    JComboBox tipo_biomasaUbActual = new JComboBox();
    JComboBox peso = new JComboBox();
    JComboBox tiempo = new JComboBox();

    JComboBox sustrato_municipio1 = new JComboBox();
    JComboBox tipo_biomasaMunicipio1 = new JComboBox();
    JComboBox peso_municipio1 = new JComboBox();
    JComboBox tiempo_municipio1 = new JComboBox();

    JComboBox sustrato_municipio2 = new JComboBox();
    JComboBox tipo_biomasaMunicipio2 = new JComboBox();
    JComboBox peso_municipio2 = new JComboBox();
    JComboBox tiempo_municipio2 = new JComboBox();

    TableColumn sustr1;

    Double[] cant_biomasa_fila;
    double cant_total_biomasa = 0;
    double potencia_producida = 0;
    double energia_producida = 0;

    String sustrato_consulta_municipio1 = "";
    String sustrato_consulta_municipio2 = "";

    String[] BMP;
    String[] CarbonNitro;
    String[] SolidVolTot;
    String[] DensidadApar;
    
    String[] m1;
    String[] m2;
        
    

    String[] BMP_municipio1;
    String[] CarbonNitro_municipio1;
    String[] SolidVolTot_municipio1;
    String[] DensidadApar_municipio1;

    String[] BMP_municipio2;
    String[] CarbonNitro_municipio2;
    String[] SolidVolTot_municipio2;
    String[] DensidadApar_municipio2;

    String TitleJpanelMunicipio1;
    String TitleJpanelMunicipio2;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnIniciar = new javax.swing.JButton();
        jPnlDatosEntrada = new javax.swing.JPanel();
        try {
            comboubicacionactual =(javax.swing.JComboBox)java.beans.Beans.instantiate(getClass().getClassLoader(), "Aplicacion.Pantalla2_ListMuniUno");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        municercanoUno = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        municercanoDos = new javax.swing.JComboBox<String>();
        checkGanaderia = new javax.swing.JCheckBox();
        checkAgricola = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        btnMCercanos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcantresiduoxmunicipio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mitemperatura = new javax.swing.JTextField();
        lblrecomendacion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        misresiduos = new javax.swing.JTextField();
        TitleDistancia1 = new javax.swing.JLabel();
        TitleDistancia2 = new javax.swing.JLabel();
        Distancia1 = new javax.swing.JLabel();
        Distancia2 = new javax.swing.JLabel();
        JPnlMunicercanoUno = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblMunicipio2 = new javax.swing.JTable(){
            public TableCellEditor getTableCellEditor(int row, int column) {
                int modelColumn = convertColumnIndexToModel(column);
                String valor = (String) modelo6.getValueAt(row, 0);
                System.out.println("Columna 0 = " + valor);
                if (modelColumn == 0 && row < Integer.parseInt(misresiduos.getText())) {
                    return combos.get(valor);
                }
                else {
                    return super.getCellEditor(row, column);
                }
            }
        };
        JPnlMunicercanoDos = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMunicipio1 = new javax.swing.JTable(){
            public TableCellEditor getTableCellEditor(int row, int column) {
                int modelColumn = convertColumnIndexToModel(column);
                String valor = (String) modelo5.getValueAt(row, 0);
                System.out.println("Columna 0 = " + valor);
                if (modelColumn == 0 && row < Integer.parseInt(misresiduos.getText())) {
                    return combos.get(valor);
                }
                else {
                    return super.getCellEditor(row, column);
                }
            }
        };
        reload = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jpnlubicacionactual = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblUbicacionActual = new javax.swing.JTable() {
            public TableCellEditor getTableCellEditor(int row, int column) {
                int modelColumn = convertColumnIndexToModel(column);
                String valor = (String) Modelo1.getValueAt(row, 0);
                System.out.println("Columna 0 = " + valor);
                if (modelColumn == 0 && row < Integer.parseInt(misresiduos.getText())) {
                    return combos.get(valor);
                }
                else {
                    return super.getCellEditor(row, column);
                }
            }
        };
        jpnltablacaracteristicas = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TblCaracteristicas = new javax.swing.JTable();
        btncaracteristicas = new javax.swing.JButton();
        btnprocesocodigestion = new javax.swing.JButton();
        btndimensionamiento = new javax.swing.JButton();
        btngraficar = new javax.swing.JButton();
        jpnldimensionamiento = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldimensionamiento = new javax.swing.JTable();
        jpnlprocesodigestion = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblproceso_codigestion = new javax.swing.JTable();
        btncostos = new javax.swing.JButton();
        autores = new javax.swing.JLabel();
        jpnlcostos = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblcostos = new javax.swing.JTable();
        javax.swing.JLabel Imagenfondo_pantalla1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Green Biogas");
        setMinimumSize(new java.awt.Dimension(1280, 1024));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 1024));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        BtnIniciar.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        BtnIniciar.setText("INICIAR");
        BtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnIniciar);
        BtnIniciar.setBounds(590, 240, 80, 25);

        jPnlDatosEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)), "Datos de Entrada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 3, 24))); // NOI18N
        jPnlDatosEntrada.setToolTipText("");
        jPnlDatosEntrada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboubicacionactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboubicacionactualActionPerformed(evt);
            }
        });
        jPnlDatosEntrada.add(comboubicacionactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, 30));

        municercanoUno.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        municercanoUno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                municercanoUnoItemStateChanged(evt);
            }
        });
        municercanoUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                municercanoUnoActionPerformed(evt);
            }
        });
        jPnlDatosEntrada.add(municercanoUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 180, 30));

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel1.setText("Ubicacion Actual");
        jPnlDatosEntrada.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, -1));

        municercanoDos.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        municercanoDos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                municercanoDosItemStateChanged(evt);
            }
        });
        municercanoDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                municercanoDosActionPerformed(evt);
            }
        });
        jPnlDatosEntrada.add(municercanoDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 200, 30));

        checkGanaderia.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        checkGanaderia.setText("Ganaderia");
        checkGanaderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkGanaderiaActionPerformed(evt);
            }
        });
        jPnlDatosEntrada.add(checkGanaderia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 100, -1));

        checkAgricola.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        checkAgricola.setText("Agricola");
        checkAgricola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAgricolaActionPerformed(evt);
            }
        });
        jPnlDatosEntrada.add(checkAgricola, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 100, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel2.setText("Municipios Cercanos (10 Km-50 km)");
        jPnlDatosEntrada.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 310, 20));

        btnMCercanos.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnMCercanos.setText("BUSCAR");
        btnMCercanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMCercanosActionPerformed(evt);
            }
        });
        jPnlDatosEntrada.add(btnMCercanos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 80, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel3.setText("Categorias :");
        jPnlDatosEntrada.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html> No. de Residuos </br> por municipio : </html>");
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPnlDatosEntrada.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 140, 40));

        txtcantresiduoxmunicipio.setText("2");
        jPnlDatosEntrada.add(txtcantresiduoxmunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 50, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Temperatura ( C° ):");
        jPnlDatosEntrada.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 140, -1));

        mitemperatura.setText("15");
        mitemperatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mitemperaturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mitemperaturaMouseExited(evt);
            }
        });
        jPnlDatosEntrada.add(mitemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 50, -1));

        lblrecomendacion.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        lblrecomendacion.setForeground(new java.awt.Color(255, 0, 0));
        lblrecomendacion.setText("<html> Se recomienda una temperatura entre 15° y 35° </br> para un optimo rendimiento </html>");
        jPnlDatosEntrada.add(lblrecomendacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 220, 80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setText("Numero de residuos (Max. 10)");
        jPnlDatosEntrada.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 190, -1));

        misresiduos.setText("1");
        misresiduos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                misresiduosActionPerformed(evt);
            }
        });
        jPnlDatosEntrada.add(misresiduos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 50, -1));

        TitleDistancia1.setText("Distancia km");
        jPnlDatosEntrada.add(TitleDistancia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        TitleDistancia2.setText("Distancia km");
        jPnlDatosEntrada.add(TitleDistancia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, -1, -1));

        Distancia1.setText("0.00");
        jPnlDatosEntrada.add(Distancia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        Distancia2.setText("0.00");
        jPnlDatosEntrada.add(Distancia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, -1, -1));

        getContentPane().add(jPnlDatosEntrada);
        jPnlDatosEntrada.setBounds(210, 10, 810, 210);

        JPnlMunicercanoUno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Municipio : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        JPnlMunicercanoUno.setAutoscrolls(true);
        JPnlMunicercanoUno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMunicipio2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tblMunicipio2);

        JPnlMunicercanoUno.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 640, 110));

        getContentPane().add(JPnlMunicercanoUno);
        JPnlMunicercanoUno.setBounds(610, 370, 640, 130);

        JPnlMunicercanoDos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Municipio :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        JPnlMunicercanoDos.setAutoscrolls(true);
        JPnlMunicercanoDos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMunicipio1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblMunicipio1);

        JPnlMunicercanoDos.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 640, 110));

        getContentPane().add(JPnlMunicercanoDos);
        JPnlMunicercanoDos.setBounds(610, 230, 640, 130);

        reload.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        reload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplicacion/Imagen1.png"))); // NOI18N
        reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadActionPerformed(evt);
            }
        });
        getContentPane().add(reload);
        reload.setBounds(1210, 10, 40, 40);

        home.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplicacion/Imagen.png"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home);
        home.setBounds(10, 10, 40, 40);

        jpnlubicacionactual.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ubicacion Actual :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        jpnlubicacionactual.setAutoscrolls(true);
        jpnlubicacionactual.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TblUbicacionActual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TblUbicacionActual);

        jpnlubicacionactual.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 580, 110));

        getContentPane().add(jpnlubicacionactual);
        jpnlubicacionactual.setBounds(20, 230, 580, 130);

        jpnltablacaracteristicas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABLA DE CARACTERISTICAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 3, 24))); // NOI18N
        jpnltablacaracteristicas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TblCaracteristicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(TblCaracteristicas);

        jpnltablacaracteristicas.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 570, 110));

        getContentPane().add(jpnltablacaracteristicas);
        jpnltablacaracteristicas.setBounds(10, 370, 590, 140);

        btncaracteristicas.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btncaracteristicas.setText("Generar Caracteristicas");
        btncaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncaracteristicasActionPerformed(evt);
            }
        });
        getContentPane().add(btncaracteristicas);
        btncaracteristicas.setBounds(1040, 60, 180, 30);

        btnprocesocodigestion.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btnprocesocodigestion.setText("Proceso de Co-Digestion");
        btnprocesocodigestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocesocodigestionActionPerformed(evt);
            }
        });
        getContentPane().add(btnprocesocodigestion);
        btnprocesocodigestion.setBounds(1040, 100, 183, 25);

        btndimensionamiento.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btndimensionamiento.setText("Dimensionamiento");
        btndimensionamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndimensionamientoActionPerformed(evt);
            }
        });
        getContentPane().add(btndimensionamiento);
        btndimensionamiento.setBounds(1060, 140, 150, 25);

        btngraficar.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btngraficar.setText("Graficar");
        btngraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngraficarActionPerformed(evt);
            }
        });
        getContentPane().add(btngraficar);
        btngraficar.setBounds(710, 660, 100, 25);

        jpnldimensionamiento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIMENSIONAMIENTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 3, 24))); // NOI18N
        jpnldimensionamiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbldimensionamiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbldimensionamiento);

        jpnldimensionamiento.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 410, 50));

        getContentPane().add(jpnldimensionamiento);
        jpnldimensionamiento.setBounds(140, 610, 420, 80);

        jpnlprocesodigestion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROCESO CO-DIGESTION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 3, 24))); // NOI18N
        jpnlprocesodigestion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblproceso_codigestion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblproceso_codigestion);

        jpnlprocesodigestion.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 380, 50));

        getContentPane().add(jpnlprocesodigestion);
        jpnlprocesodigestion.setBounds(180, 520, 380, 80);

        btncostos.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btncostos.setText("costos");
        btncostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncostosActionPerformed(evt);
            }
        });
        getContentPane().add(btncostos);
        btncostos.setBounds(1090, 180, 73, 23);

        autores.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        autores.setText("Creadores: Daniel Esteban Martinez, Jean Paul  Cholo - Universidad EAN");
        getContentPane().add(autores);
        autores.setBounds(900, 680, 350, 14);

        jpnlcostos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COSTOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 3, 24))); // NOI18N
        jpnlcostos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblcostos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tblcostos);

        jpnlcostos.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 570, 90));

        getContentPane().add(jpnlcostos);
        jpnlcostos.setBounds(630, 520, 570, 120);

        Imagenfondo_pantalla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagenfondo_pantalla1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplicacion/large.jpg"))); // NOI18N
        Imagenfondo_pantalla1.setAutoscrolls(true);
        Imagenfondo_pantalla1.setMaximumSize(new java.awt.Dimension(1440, 900));
        Imagenfondo_pantalla1.setMinimumSize(new java.awt.Dimension(1280, 800));
        Imagenfondo_pantalla1.setName(""); // NOI18N
        Imagenfondo_pantalla1.setPreferredSize(new java.awt.Dimension(1280, 800));
        Imagenfondo_pantalla1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                Imagenfondo_pantalla1ComponentAdded(evt);
            }
        });
        getContentPane().add(Imagenfondo_pantalla1);
        Imagenfondo_pantalla1.setBounds(0, 0, 1280, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Imagenfondo_pantalla1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_Imagenfondo_pantalla1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagenfondo_pantalla1ComponentAdded

    private void comboubicacionactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboubicacionactualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboubicacionactualActionPerformed

    private void municercanoUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_municercanoUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_municercanoUnoActionPerformed

    private void btnMCercanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCercanosActionPerformed
        btnMCercanos.setVisible(false);
        municercanoUno.removeAllItems();
        municercanoDos.removeAllItems();
//APLICACION MATEMATICA PARA CALCULO DE DISTANCIAS 
        int seleccion = comboubicacionactual.getSelectedIndex();
        Municipio miubicacion = Municipios.get(seleccion);
        System.out.println(" seleccion del combobox ubicacion actual: " + miubicacion.nombre);
        listaMunicipiocercano.removeAll(listaMunicipiocercano);

        /*recorremos todo el arraylist de los municipios y los comparamos
         con la ubicacion actual realizando el proceso matematico de longitud y latitud        
         */
        double DistanciaKM = 0;
        float LatGr, LatMin, LatSeg, LonGr, LonMin, LonSeg;

        float LatGrDos, LatMinDos, LatSegDos, LonGrDos, LonMinDos, LonSegDos;

        float CoordenadaLat, CoordenadaLong;
        float CoordenadaLatDos, CoordenadaLongDos;

        double Lat1, Long1, Lat2, Long2;

        LatGr = Float.parseFloat(miubicacion.Latitud.substring(0, 2));
        LatMin = Float.parseFloat(miubicacion.Latitud.substring(3, 5));
        LatSeg = Float.parseFloat(miubicacion.Latitud.substring(6, 8));

        //System.out.println("variable latitud"+miubicacion.Latitud);
        //System.out.println("Latitud Grados:"+LatGr+" Minutos:"+LatMin+" segundo:"+LatSeg );
        CoordenadaLat = LatGr + (LatGr / 60) + (LatSeg / 3600);

        LonGr = Float.parseFloat(miubicacion.longitud.substring(0, 2));
        LonMin = Float.parseFloat(miubicacion.longitud.substring(3, 5));
        LonSeg = Float.parseFloat(miubicacion.longitud.substring(6, 8));

        CoordenadaLong = LonGr + (LonMin / 60) + (LonSeg / 3600);

        /*Coordenadas Decimales	Coordenadas Sexagesimales
         Latitud	Longitud	Latitud	Longitud
         0° a 90°	0° a 180°	N	E
         0° a 90°	0° a -180°	N	O
         0° a -90°	0° a 180°	S	E
         0° a -90°	0° a -180°	S	O*/
        if (miubicacion.PolLong.equals("OESTE")) {
            CoordenadaLong = CoordenadaLong * -1;
        }

        Lat1 = (CoordenadaLat * Math.PI) / 180;
        Long1 = (CoordenadaLong * Math.PI) / 180;

        for (int index = 0; index < Municipios.size(); index++) {

            DistanciaKM = 0;

            if (index != seleccion) //no vamos a comparar la ubicacion actual conel mismo
            {
                //System.out.println("calculando distancia y comparando con municipio :"+Municipios.get(index).nombre);

                LatGrDos = Float.parseFloat(Municipios.get(index).Latitud.substring(0, 2));
                LatMinDos = Float.parseFloat(Municipios.get(index).Latitud.substring(3, 5));
                LatSegDos = Float.parseFloat(Municipios.get(index).Latitud.substring(6, 8));

                CoordenadaLatDos = LatGrDos + (LatMinDos / 60) + (LatSegDos / 3600);

                LonGrDos = Float.parseFloat(Municipios.get(index).longitud.substring(0, 2));
                LonMinDos = Float.parseFloat(Municipios.get(index).longitud.substring(3, 5));
                LonSegDos = Float.parseFloat(Municipios.get(index).longitud.substring(6, 8));

                CoordenadaLongDos = LonGrDos + (LonMinDos / 60) + (LonSegDos / 3600);

                if (Municipios.get(index).PolLong.equals("OESTE")) {
                    CoordenadaLongDos = CoordenadaLongDos * -1;
                }

                Lat2 = (CoordenadaLatDos * Math.PI) / 180;
                Long2 = (CoordenadaLongDos * Math.PI) / 180;

                String M = "";
                double Dist = 0.00;

                DistanciaKM = 6378.137 * acos(cos(Lat1) * cos(Lat2) * cos(Long2 - Long1) + sin(Lat1) * sin(Lat2));
                //System.out.println("Distancia :"+DistanciaKM);

                if ((DistanciaKM >= 10) && (DistanciaKM <= 50)) {

                    M = Municipios.get(index).nombre;
                    Dist = DistanciaKM;

                    Distancias midistancia = new Distancias(M, Dist);

                    listaMunicipiocercano.add(midistancia);

                    //System.out.println("ENCONTRADO CERCANIA Indice del municipio:"+index);
                    municercanoUno.addItem(Municipios.get(index).nombre);
                    municercanoDos.addItem(Municipios.get(index).nombre);
                }
            }
        }

        int indcerca = 0;

        for (int i = 0; i < listaMunicipiocercano.size(); i++) {

            indcerca = Integer.parseInt(listaMunicipiocercano.get(i).toString());
            System.out.println("indice lista municipio:" + indcerca);
            System.out.println("corresponde con Municipio:" + Municipios.get(indcerca).nombre);

        }


    }//GEN-LAST:event_btnMCercanosActionPerformed

    private void municercanoDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_municercanoDosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_municercanoDosActionPerformed

    private void checkAgricolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAgricolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAgricolaActionPerformed

    private void checkGanaderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkGanaderiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkGanaderiaActionPerformed

    private void mitemperaturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemperaturaMouseEntered
        lblrecomendacion.setVisible(true);
    }//GEN-LAST:event_mitemperaturaMouseEntered

    private void mitemperaturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemperaturaMouseExited
        lblrecomendacion.setVisible(false);
    }//GEN-LAST:event_mitemperaturaMouseExited


    private void BtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarActionPerformed

        int temperatura = parseInt(mitemperatura.getText());
        int nresiduos = parseInt(misresiduos.getText());

        boolean tmp = false;
        boolean chkCat = false;
        boolean Nresiduo = true;

        if ((temperatura >= 15) && (temperatura <= 35)) {
            tmp = true;
        } else {
            String titulo = "Valor NO valido";
            String Mensaje = "Temperatura No Valida";
            JOptionPane.showMessageDialog(null, Mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        }

        if ((checkAgricola.isSelected()) || (checkGanaderia.isSelected())) {
            chkCat = true;
        } else {
            JOptionPane.showMessageDialog(null, "Debe selecionar al menos una de las categorias", "Seleccion invalida", JOptionPane.WARNING_MESSAGE);;
        }

        if (nresiduos > 10) {
            Nresiduo = false;
        }

        if (chkCat && tmp && Nresiduo) {
            ///
            BtnIniciar.setVisible(false);
            btncaracteristicas.setVisible(true);

            TitleJpanelMunicipio1 = "";
            TitleJpanelMunicipio2 = "";
            String TitleJpanelUbicacionactual = "";

            TitleJpanelMunicipio1 = municercanoUno.getSelectedItem().toString();
            TitleJpanelMunicipio2 = municercanoDos.getSelectedItem().toString();
            TitleJpanelUbicacionactual = comboubicacionactual.getSelectedItem().toString();

            jpnlubicacionactual.setVisible(true);
            jpnlubicacionactual.setBorder(BorderFactory.createTitledBorder(null, "Ubicacion Actual :" + TitleJpanelUbicacionactual));
            JPnlMunicercanoUno.setVisible(true);
            JPnlMunicercanoUno.setBorder(BorderFactory.createTitledBorder(null, "Municipio :" + TitleJpanelMunicipio1));
            JPnlMunicercanoDos.setVisible(true);
            JPnlMunicercanoDos.setBorder(BorderFactory.createTitledBorder(null, "Municipio :" + TitleJpanelMunicipio2));

            //CREACION DE TABLA PARA UBICACION ACTUAL
            //TblMunicipioCercano1
            Object filas = null;
            Object No_row[] = {filas};

            int cantresiduos = Integer.parseInt(misresiduos.getText());

            TableColumn col1 = TblUbicacionActual.getColumnModel().getColumn(0);
            TableColumn col2 = TblUbicacionActual.getColumnModel().getColumn(1);
            //col2 es utilizada por el usuario para escribir la cantidad
            TableColumn col4 = TblUbicacionActual.getColumnModel().getColumn(3);
            TableColumn col5 = TblUbicacionActual.getColumnModel().getColumn(4);

            TableColumn colM1 = tblMunicipio1.getColumnModel().getColumn(0);
            TableColumn colM2 = tblMunicipio1.getColumnModel().getColumn(1);
            //col2 es utilizada por el usuario para escribir la cantidad

            TableColumn colM11 = tblMunicipio2.getColumnModel().getColumn(0);
            TableColumn colM22 = tblMunicipio2.getColumnModel().getColumn(1);
            //col2 es utilizada por el usuario para escribir la cantidad

            //-------------------------------------
            //consulta para la tabla 1            
            sustrato_UbActual.removeAllItems();

            ResultSet missustratos;

            if ((checkAgricola.isSelected()) && (checkGanaderia.isSelected())) {

                missustratos = Miconexion.getQuery("SELECT cultivo FROM productosmunicipio WHERE `Municipio`= '" + TitleJpanelUbicacionactual + "' "); //CONSULTA A LA BD
                        
            }else if ((checkAgricola.isSelected())) 
            {
                missustratos = Miconexion.getQuery("SELECT cultivo FROM productosmunicipio WHERE `Municipio`= '" + TitleJpanelUbicacionactual + "' AND categoria=1 "); //CONSULTA A LA BD
                
            }else {
                missustratos = Miconexion.getQuery("SELECT cultivo FROM productosmunicipio WHERE `Municipio`= '" + TitleJpanelUbicacionactual + "' AND categoria=2"); //CONSULTA A LA BD
            }

            
            String cultivoUbActual = "";
            try {
                while (missustratos.next()) {

                    cultivoUbActual = missustratos.getString("cultivo");
                    sustrato_UbActual.addItem(cultivoUbActual);
                }
            } catch (SQLException ex) {
                System.out.println("Error consulta sustratosUbicacion Actual");
            }

            //columnas modificadas para la tabla 1
            sustrato_UbActual.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        String sustrato_consulta = e.getItem().toString();

                        ResultSet tipobiomasa_bd = Miconexion.getQuery("SELECT tipo_biomasa FROM caracteristicassustratos WHERE nombre_cultivo = '" + sustrato_consulta + "' ");

                        DefaultTableModel modelo = (DefaultTableModel) TblUbicacionActual.getModel();

                        String tipo_B = "";
                        try {
                            tipo_biomasaUbActual.removeAllItems();
                            while (tipobiomasa_bd.next()) {     //mientras halla datos haga
                                tipo_B = tipobiomasa_bd.getString("tipo_biomasa");
                                tipo_biomasaUbActual.addItem(tipo_B);
                                modelo.setValueAt(items[0], TblUbicacionActual.getSelectedRow(), 3);
                                modelo.setValueAt(items[1], TblUbicacionActual.getSelectedRow(), 4);
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Pantalla2.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.printf("Error consulta tipo_biomasa_consulta Actual");
                        }
                    }

                }
            });
            col1.setCellEditor(new DefaultCellEditor(sustrato_UbActual));
            col2.setCellEditor(new DefaultCellEditor(tipo_biomasaUbActual));
            col4.setCellEditor(new DefaultCellEditor(peso));
            col5.setCellEditor(new DefaultCellEditor(tiempo));

            //---------------------------------------
            //consulta para la tabla municipio1
            sustrato_municipio1.removeAllItems();
            ResultSet missustratos_municipio1 = Miconexion.getQuery("SELECT sustrato_cultivo FROM disponibilidadmunicipios WHERE municipio= '" + TitleJpanelMunicipio1 + "' "); //CONSULTA A LA BD
            String cultivo_municipio1 = "";
            try {
                while (missustratos_municipio1.next()) {

                    cultivo_municipio1 = missustratos_municipio1.getString("sustrato_cultivo");
                    sustrato_municipio1.addItem(cultivo_municipio1);
                }
            } catch (SQLException ex) {
                System.out.println("Error consulta sustratosUbicacion Actual");
                
            }

            //consulta para la tabla municipio2
            sustrato_municipio2.removeAllItems();
            ResultSet missustratos_municipio2 = Miconexion.getQuery("SELECT sustrato_cultivo FROM disponibilidadmunicipios WHERE municipio= '" + TitleJpanelMunicipio2 + "' "); //CONSULTA A LA BD
            String cultivo_municipio2 = "";
            try {
                while (missustratos_municipio2.next()) {

                    cultivo_municipio2 = missustratos_municipio2.getString("sustrato_cultivo");
                    sustrato_municipio2.addItem(cultivo_municipio2);
                }
            } catch (SQLException ex) {
                System.out.println("Error consulta sustratosUbicacion Actual");
            }

            //----------------------------------------------
            //columnas modificadas para la tabla municipio1
            sustrato_municipio1.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        sustrato_consulta_municipio1 = e.getItem().toString();

                        ResultSet tipobiomasa_bd = Miconexion.getQuery("SELECT tipo_biomasa FROM disponibilidadmunicipios WHERE municipio = '" + TitleJpanelMunicipio1 + "' AND sustrato_cultivo = '" + sustrato_consulta_municipio1 + "' ");

                        DefaultTableModel modelo = (DefaultTableModel) tblMunicipio1.getModel();

                        String tipo_B = "";
                        try {
                            tipo_biomasaMunicipio1.removeAllItems();
                            while (tipobiomasa_bd.next()) {     //mientras halla datos haga
                                tipo_B = tipobiomasa_bd.getString("tipo_biomasa");
                                tipo_biomasaMunicipio1.addItem(tipo_B);
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Pantalla2.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.printf("Error consulta tipo_biomasa_consulta Actual");
                        }
                    }
                }
            });
            colM1.setCellEditor(new DefaultCellEditor(sustrato_municipio1));
            colM2.setCellEditor(new DefaultCellEditor(tipo_biomasaMunicipio1));

            //columnas modificadas para la tabla municipio2
            sustrato_municipio2.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        sustrato_consulta_municipio2 = e.getItem().toString();

                        ResultSet tipobiomasa_bd = Miconexion.getQuery("SELECT tipo_biomasa FROM disponibilidadmunicipios WHERE municipio = '" + TitleJpanelMunicipio2 + "' AND sustrato_cultivo = '" + sustrato_consulta_municipio2 + "' ");

                        DefaultTableModel modelo = (DefaultTableModel) tblMunicipio2.getModel();

                        String tipo_B = "";
                        try {
                            tipo_biomasaMunicipio2.removeAllItems();
                            while (tipobiomasa_bd.next()) {     //mientras halla datos haga
                                tipo_B = tipobiomasa_bd.getString("tipo_biomasa");
                                tipo_biomasaMunicipio2.addItem(tipo_B);
                                //modelo.setValueAt("", TblUbicacionActual.getSelectedRow(), 0);
                                //modelo.setValueAt("", TblUbicacionActual.getSelectedRow(), 1);
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Pantalla2.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.printf("Error consulta tipo_biomasa_consulta Actual");
                            JOptionPane.showMessageDialog(null,"error consulta","Error consulta tipo_biomasa_consulta Actual",JOptionPane.ERROR_MESSAGE);
                        }
                    }

                }
            });
            colM11.setCellEditor(new DefaultCellEditor(sustrato_municipio2));
            colM22.setCellEditor(new DefaultCellEditor(tipo_biomasaMunicipio2));

            //----------------------------------------------
            //columnas cantidad disponible para la tabla municipio1
            tipo_biomasaMunicipio1.addItemListener(new ItemListener() {

                @Override

                public void itemStateChanged(ItemEvent e) {
                    //tipo_biomasaMunicipio1.removeAllItems();
                    if (e.getSource() == tipo_biomasaMunicipio1) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            String dato_tipo_biomasa = e.getItem().toString();

                            ResultSet tipobiomasa_bd = Miconexion.getQuery("SELECT Total_Disponible FROM disponibilidadmunicipios WHERE municipio = '" + TitleJpanelMunicipio1 + "' AND sustrato_cultivo = '" + sustrato_consulta_municipio1 + "' AND tipo_biomasa= '" + dato_tipo_biomasa + "' ");

                            DefaultTableModel modelo = (DefaultTableModel) tblMunicipio1.getModel();

                            String tipo_B = "";
                            try {
                                //tipo_biomasaMunicipio2.removeAllItems();
                                while (tipobiomasa_bd.next()) {     //mientras halla datos haga
                                    tipo_B = tipobiomasa_bd.getString("Total_Disponible");
                                    modelo.setValueAt(tipo_B, tblMunicipio1.getSelectedRow(), 2);
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(Pantalla2.class.getName()).log(Level.SEVERE, null, ex);
                                System.out.printf("Error consulta tipo_biomasa_consulta Actual");
                                JOptionPane.showMessageDialog(null,"error consulta","Error consulta tipo_biomasa_consulta Actual",JOptionPane.ERROR_MESSAGE);
                                
                            }
                        }
                    }
                }
            });

            //columnas cantidad disponible para la tabla municipio2
            tipo_biomasaMunicipio2.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {
                    //tipo_biomasaMunicipio2.removeAllItems();
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        String dato_tipo_biomasa = e.getItem().toString();

                        ResultSet tipobiomasa_bd = Miconexion.getQuery("SELECT Total_Disponible FROM disponibilidadmunicipios WHERE municipio = '" + TitleJpanelMunicipio2 + "' AND sustrato_cultivo = '" + sustrato_consulta_municipio2 + "' AND tipo_biomasa= '" + dato_tipo_biomasa + "' ");

                        DefaultTableModel modelo = (DefaultTableModel) tblMunicipio2.getModel();

                        String tipo_B = "";
                        try {
                            //tipo_biomasaMunicipio2.removeAllItems();
                            while (tipobiomasa_bd.next()) {     //mientras halla datos haga
                                tipo_B = tipobiomasa_bd.getString("Total_Disponible");
                                modelo.setValueAt(tipo_B, tblMunicipio2.getSelectedRow(), 2);
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Pantalla2.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.printf("Error consulta tipo_biomasa_consulta Actual");
                            JOptionPane.showMessageDialog(null,"error consulta","Error consulta tipo_biomasa_consulta Actual",JOptionPane.ERROR_MESSAGE);
                        }
                    }

                }
            });

            for (int i = 0; i < cantresiduos; i++) {
                //sustrato_UbActual.addItemListener((ItemListener) this);
                ((DefaultTableModel) TblUbicacionActual.getModel()).addRow(No_row);
                ((DefaultTableModel) tblMunicipio1.getModel()).addRow(No_row);
                ((DefaultTableModel) tblMunicipio2.getModel()).addRow(No_row);
                //sustrato_UbActual.addItemListener(this);
            }

            peso.addItem("kg");
            peso.addItem("ton");
            tiempo.addItem("Dia");
            tiempo.addItem("Mes");
            tiempo.addItem("Año");

            ((DefaultTableCellRenderer) TblUbicacionActual.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            ((DefaultTableCellRenderer) tblMunicipio1.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            ((DefaultTableCellRenderer) tblMunicipio2.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

            DefaultTableCellRenderer modelo = new DefaultTableCellRenderer();
            modelo.setHorizontalAlignment(SwingConstants.CENTER);
            for (int i = 0; i < 5; i++) {
                TblUbicacionActual.getColumnModel().getColumn(i).setCellRenderer(modelo);
            }
            for (int i = 0; i < 5; i++) {
                tblMunicipio1.getColumnModel().getColumn(i).setCellRenderer(modelo);
            }
            for (int i = 0; i < 5; i++) {
                tblMunicipio2.getColumnModel().getColumn(i).setCellRenderer(modelo);
            }

        } else {
            String msje = "Para continuar corrija los parametros";
            String title = "Correcion de variables";
            JOptionPane.showMessageDialog(null, msje, title, JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnIniciarActionPerformed

    private void misresiduosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_misresiduosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_misresiduosActionPerformed

    private double redondear(double numero) {
        String val = numero + "";
        BigDecimal big = new BigDecimal(val);
        big = big.setScale(4, RoundingMode.HALF_UP);
        double redondeo = big.doubleValue();
        return redondeo;
    }

    private double redondeara0(double numero) {
        String val = numero + "";
        BigDecimal big = new BigDecimal(val);
        big = big.setScale(4, RoundingMode.HALF_UP);
        double redondeo = big.doubleValue();
        return redondeo;
    }
    
    private double redondeara2(double numero) {
        String val = numero + "";
        BigDecimal big = new BigDecimal(val);
        big = big.setScale(2, RoundingMode.HALF_UP);
        double redondeo = big.doubleValue();
        return redondeo;
    }

    private void municercanoUnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_municercanoUnoItemStateChanged

        //cambiar
        int indicelelemento = municercanoUno.getSelectedIndex();

        Distancias D = listaMunicipiocercano.get(indicelelemento);
        
        double Dist1 = redondeara0(D.distancia);
        String hola = String.format("%.0f", Dist1);
        hola1 = Integer.parseInt(hola);
        Distancia1.setText("" + hola1);

    }//GEN-LAST:event_municercanoUnoItemStateChanged

    private void municercanoDosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_municercanoDosItemStateChanged

        int indicelelemento = municercanoDos.getSelectedIndex();

        Distancias D = listaMunicipiocercano.get(indicelelemento);

        double Dist2 = redondear(D.distancia);
        String hola = String.format("%.0f", Dist2);
        hola2 = Integer.parseInt(hola);
        Distancia2.setText("" + hola2);

    }//GEN-LAST:event_municercanoDosItemStateChanged

    private void reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadActionPerformed
        dispose();
        try {
            repintar = new Pantalla2();
        } catch (SQLException ex) {
            Logger.getLogger(Pantalla2.class.getName()).log(Level.SEVERE, null, ex);
        }
        repintar.setVisible(true);
    }//GEN-LAST:event_reloadActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        dispose();
        casa = new inicioframe();
        casa.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void btncaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncaracteristicasActionPerformed

                
//formulas tabla ubicacion actual
        boolean vacio = false;
        for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
            for (int j = 0; j <= 4; j++) {
                if (String.valueOf(TblUbicacionActual.getValueAt(i, j)).equals("null")) {
                    vacio = true;
                }
            }
        }

        if (vacio == true) {
            JOptionPane.showMessageDialog(null, "por favor introduzca todos los datos en la tabla");
        } else {

            //tabla 1 
            String[] datos_tipo_biomas = new String[Integer.parseInt(misresiduos.getText())];
            String[] datos_tipo_biomas1 = new String[Integer.parseInt(misresiduos.getText())];
            String[] datos_tipo_biomas2 = new String[Integer.parseInt(misresiduos.getText())];
            String[] datos_sustrato = new String[Integer.parseInt(misresiduos.getText())];
            String[] datos_sustrato1 = new String[Integer.parseInt(misresiduos.getText())];
            String[] datos_sustrato2 = new String[Integer.parseInt(misresiduos.getText())];

            BMP = new String[Integer.parseInt(misresiduos.getText())];
            CarbonNitro = new String[Integer.parseInt(misresiduos.getText())];
            SolidVolTot = new String[Integer.parseInt(misresiduos.getText())];
            DensidadApar = new String[Integer.parseInt(misresiduos.getText())];

            for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
                datos_tipo_biomas[i] = String.valueOf(TblUbicacionActual.getValueAt(i, 1));  //tipo biomasa seleccionados

                ResultSet Caracteristic = Miconexion.getQuery("SELECT BMP, Rel_CarbonoNitrogeno, SolidosVolatiles, DensidadAparente  FROM caracteristicassustratos WHERE tipo_biomasa= '" + datos_tipo_biomas[i] + "' ");
                try {
                    Caracteristic.next();
                    BMP[i] = Caracteristic.getString("BMP");
                    CarbonNitro[i] = Caracteristic.getString("Rel_CarbonoNitrogeno");
                    SolidVolTot[i] = Caracteristic.getString("SolidosVolatiles");
                    DensidadApar[i] = Caracteristic.getString("DensidadAparente");
                
                } catch (SQLException ex) {
                    Logger.getLogger(Pantalla1.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,"error consulta","error caracteristicas sustratos1 pantalla 2",JOptionPane.ERROR_MESSAGE);
                }
            }

            //para la tabla municipios 1
            String[] datos_tipo_biomas_municipio1 = new String[Integer.parseInt(misresiduos.getText())];
            String[] datos_sustrato_municipio1 = new String[Integer.parseInt(misresiduos.getText())];

            BMP_municipio1 = new String[Integer.parseInt(misresiduos.getText())];
            CarbonNitro_municipio1 = new String[Integer.parseInt(misresiduos.getText())];
            SolidVolTot_municipio1 = new String[Integer.parseInt(misresiduos.getText())];
            DensidadApar_municipio1 = new String[Integer.parseInt(misresiduos.getText())];

            for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
                datos_sustrato_municipio1[i] = String.valueOf(tblMunicipio1.getValueAt(i, 0));  //tipo biomasa seleccionados
                datos_tipo_biomas_municipio1[i] = String.valueOf(tblMunicipio1.getValueAt(i, 1));  //tipo biomasa seleccionados

                ResultSet Caracteristic1 = Miconexion.getQuery("SELECT BMP, Rel_CarbonoNitrogeno, Solido_Vol_tot, DensidadAparente  FROM caracteristicassustratos WHERE tipo_biomasa= '" + datos_tipo_biomas_municipio1[i] + "' ");
                try {
                    Caracteristic1.next();
                    BMP_municipio1[i] = Caracteristic1.getString("BMP");
                    CarbonNitro_municipio1[i] = Caracteristic1.getString("Rel_CarbonoNitrogeno");
                    SolidVolTot_municipio1[i] = Caracteristic1.getString("Solido_Vol_tot");
                    DensidadApar_municipio1[i] = Caracteristic1.getString("DensidadAparente");
                } catch (SQLException ex) {
                    Logger.getLogger(Pantalla1.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,"error consulta","error caracteristicas sustratos 2 pantalla 2",JOptionPane.ERROR_MESSAGE);
                }
            }

            //para la tabla municipios2
            String[] datos_tipo_biomas_municipio2 = new String[Integer.parseInt(misresiduos.getText())];
            String[] datos_sustrato_municipio2 = new String[Integer.parseInt(misresiduos.getText())];

            BMP_municipio2 = new String[Integer.parseInt(misresiduos.getText())];
            CarbonNitro_municipio2 = new String[Integer.parseInt(misresiduos.getText())];
            SolidVolTot_municipio2 = new String[Integer.parseInt(misresiduos.getText())];
            DensidadApar_municipio2 = new String[Integer.parseInt(misresiduos.getText())];

            for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
                datos_sustrato_municipio2[i] = String.valueOf(tblMunicipio2.getValueAt(i, 0));  //tipo biomasa seleccionados
                datos_tipo_biomas_municipio2[i] = String.valueOf(tblMunicipio2.getValueAt(i, 1));  //tipo biomasa seleccionados

                ResultSet Caracteristic2 = Miconexion.getQuery("SELECT BMP, Rel_CarbonoNitrogeno, Solido_Vol_tot, DensidadAparente  FROM caracteristicassustratos WHERE tipo_biomasa= '" + datos_tipo_biomas_municipio2[i] + "' ");
                try {
                    Caracteristic2.next();
                    BMP_municipio2[i] = Caracteristic2.getString("BMP");
                    CarbonNitro_municipio2[i] = Caracteristic2.getString("Rel_CarbonoNitrogeno");
                    SolidVolTot_municipio2[i] = Caracteristic2.getString("Solido_Vol_tot");
                    DensidadApar_municipio2[i] = Caracteristic2.getString("DensidadAparente");
                } catch (SQLException ex) {
                    Logger.getLogger(Pantalla1.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,"error consulta","error caracteristicas sustratos pantalla 2",JOptionPane.ERROR_MESSAGE);
                }
            }

            TblUbicacionActual.disable();
            tblMunicipio1.disable();
            tblMunicipio2.disable();
            //mostrar_caracteristicas.setVisible(false);

            //hacer arreglos para guardar la información de la otra tabla para hacer las formulas o solo pasar datos
            //
            String[] datos_tipo_biomasa = new String[Integer.parseInt(misresiduos.getText())];

            Double[] datos_proporcion = new Double[Integer.parseInt(misresiduos.getText()) * 3];
            String[] datos_cant_biomasa = new String[Integer.parseInt(misresiduos.getText())];
            String[] column_peso = new String[Integer.parseInt(misresiduos.getText())];
            String[] column_tiempo = new String[Integer.parseInt(misresiduos.getText())];
            Double[] conversion_peso = new Double[Integer.parseInt(misresiduos.getText())];
            Double[] conversion_tiempo = new Double[Integer.parseInt(misresiduos.getText())];

            cant_biomasa_fila = new Double[Integer.parseInt(misresiduos.getText()) * 3];

            //colocar las filas necesarias e incluilas en este mismo for
            Object filas = null;
            Object No_row[] = {filas};

            //guardar la información dentro de los arreglos de la tabla 1
            for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
                datos_tipo_biomasa[i] = String.valueOf(TblUbicacionActual.getValueAt(i, 1));  //tipo biomasa seleccionados

                //datos columna cant_biomasa y calculos
                datos_cant_biomasa[i] = String.valueOf(TblUbicacionActual.getValueAt(i, 2));  //cantidad biomasa
                column_peso[i] = String.valueOf(TblUbicacionActual.getValueAt(i, 3));  //peso seleccionados
                column_tiempo[i] = String.valueOf(TblUbicacionActual.getValueAt(i, 4));  //tiempo seleccionados
                if (column_peso[i].equals("kg")) {
                    conversion_peso[i] = (Double.parseDouble(datos_cant_biomasa[i]) / 1000);    //convertir de kg a ton
                    //conversion_peso[i]=redondear(conversion_peso[i]);
                } else {
                    conversion_peso[i] = Double.parseDouble(datos_cant_biomasa[i]);
                    //conversion_peso[i]=redondear(conversion_peso[i]);
                }

                if (column_tiempo[i].equals("Dia")) {
                    conversion_tiempo[i] = (conversion_peso[i] * 365);
                    //conversion_tiempo[i]=redondear(conversion_tiempo[i]);
                } else {
                    if (column_tiempo[i].equals("Mes")) {
                        conversion_tiempo[i] = (conversion_peso[i] * 12);
                        //conversion_tiempo[i]=redondear(conversion_tiempo[i]);
                    } else {
                        conversion_tiempo[i] = conversion_peso[i];
                        //conversion_tiempo[i]=redondear(conversion_tiempo[i]);
                    }
                }
                
                cant_biomasa_fila[i] = conversion_tiempo[i];
                cant_total_biomasa = (conversion_tiempo[i] + cant_total_biomasa);
                //String.valueOf(tabla_sustrato.getValueAt(tabla_sustrato.getSelectedColumn(), 4))  //seleccionar una o mas column
            }

            for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
                datos_proporcion[i] = (100 * conversion_tiempo[i]);
            }

            //for para tabla 1
            for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
                ((DefaultTableModel) TblCaracteristicas.getModel()).addRow(No_row);   //abrir filas para ingresar datos
                TblCaracteristicas.setValueAt(datos_tipo_biomasa[i], i, 0);  //datos colocados en columna tipo de biomasa
                TblCaracteristicas.setValueAt((BMP[i]), i, 3);  //datos colocados en columna bmp
                TblCaracteristicas.setValueAt((CarbonNitro[i]), i, 2);  //datos colocados en columna c/n
                TblCaracteristicas.setValueAt((SolidVolTot[i]), i, 4);  //datos colocados en columna solidos volatiles
                TblCaracteristicas.setValueAt((DensidadApar[i]), i, 5);  //datos colocados en columna densidad apartente

                datos_tipo_biomasa[i] = "";
                datos_cant_biomasa[i] = "";
                column_peso[i] = "";
                column_tiempo[i] = "";
                conversion_peso[i] = 0.0;
                conversion_tiempo[i] = 0.0;
            }

            //----------------------------------------------------
            //Guardar la informacion dentro de los arreglos de la tabla municipio 1
            for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
                datos_tipo_biomasa[i] = String.valueOf(tblMunicipio1.getValueAt(i, 1));  //tipo biomasa seleccionados

                //datos columna cant_biomasa y calculos
                datos_cant_biomasa[i] = String.valueOf(tblMunicipio1.getValueAt(i, 3));  //cantidad biomasa
                cant_biomasa_fila[Integer.parseInt(misresiduos.getText()) + i] = Double.parseDouble(datos_cant_biomasa[i]);
                cant_total_biomasa = (Double.parseDouble(datos_cant_biomasa[i]) + cant_total_biomasa);
                //String.valueOf(tabla_sustrato.getValueAt(tabla_sustrato.getSelectedColumn(), 4))  //seleccionar una o mas column
            }

            for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
                datos_proporcion[Integer.parseInt(misresiduos.getText()) + i] = (100 * Double.parseDouble(datos_cant_biomasa[i]));
            }

            //datos de la tabla municipio1
            for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
                ((DefaultTableModel) TblCaracteristicas.getModel()).addRow(No_row);   //abrir filas para ingresar datos
                TblCaracteristicas.setValueAt(datos_tipo_biomasa[i], Integer.parseInt(misresiduos.getText()) + i, 0);  //datos colocados en columna tipo de biomasa
                TblCaracteristicas.setValueAt((BMP_municipio1[i]), Integer.parseInt(misresiduos.getText()) + i, 3);  //datos colocados en columna bmp
                TblCaracteristicas.setValueAt((CarbonNitro_municipio1[i]), Integer.parseInt(misresiduos.getText()) + i, 2);  //datos colocados en columna c/n
                TblCaracteristicas.setValueAt((SolidVolTot_municipio1[i]), Integer.parseInt(misresiduos.getText()) + i, 4);  //datos colocados en columna solidos volatiles
                TblCaracteristicas.setValueAt((DensidadApar_municipio1[i]), Integer.parseInt(misresiduos.getText()) + i, 5);  //datos colocados en columna densidad apartente

                datos_tipo_biomasa[i] = "";
                datos_cant_biomasa[i] = "";
                column_peso[i] = "";
                column_tiempo[i] = "";
                conversion_peso[i] = 0.0;
                conversion_tiempo[i] = 0.0;
            }

            //------------------------------------------------
            //Guardar la informacion dentro de los arreglos de la tabla municipio 2
            for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
                datos_tipo_biomasa[i] = String.valueOf(tblMunicipio2.getValueAt(i, 1));  //tipo biomasa seleccionados

                //datos columna cant_biomasa y calculos
                datos_cant_biomasa[i] = String.valueOf(tblMunicipio2.getValueAt(i, 3));  //cantidad biomasa

                cant_biomasa_fila[(Integer.parseInt(misresiduos.getText()) * 2) + i] = Double.parseDouble(datos_cant_biomasa[i]);
                cant_total_biomasa = (Double.parseDouble(datos_cant_biomasa[i]) + cant_total_biomasa);
                //String.valueOf(tabla_sustrato.getValueAt(tabla_sustrato.getSelectedColumn(), 4))  //seleccionar una o mas column
            }

            for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
                datos_proporcion[(Integer.parseInt(misresiduos.getText()) * 2) + i] = (100 * Double.parseDouble(datos_cant_biomasa[i]));
            }

            //datos de la tabla municipios2
            for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
                ((DefaultTableModel) TblCaracteristicas.getModel()).addRow(No_row);   //abrir filas para ingresar datos
                TblCaracteristicas.setValueAt(datos_tipo_biomasa[i], (Integer.parseInt(misresiduos.getText()) * 2) + i, 0);  //datos colocados en columna tipo de biomasa
                TblCaracteristicas.setValueAt((BMP_municipio2[i]), (Integer.parseInt(misresiduos.getText()) * 2) + i, 3);  //datos colocados en columna bmp
                TblCaracteristicas.setValueAt((CarbonNitro_municipio2[i]), (Integer.parseInt(misresiduos.getText()) * 2) + i, 2);  //datos colocados en columna c/n
                TblCaracteristicas.setValueAt((SolidVolTot_municipio2[i]), (Integer.parseInt(misresiduos.getText()) * 2) + i, 4);  //datos colocados en columna solidos volatiles
                TblCaracteristicas.setValueAt((DensidadApar_municipio2[i]), (Integer.parseInt(misresiduos.getText()) * 2) + i, 5);  //datos colocados en columna densidad apartente

            }

            //for para incluir los calculos relacionados con la tabla proporcion para las 3 tablas combinadas
            for (int i = 0; i < Integer.parseInt(misresiduos.getText()) * 3; i++) {
                datos_proporcion[i] = (datos_proporcion[i] / cant_total_biomasa);
                datos_proporcion[i] = redondear(datos_proporcion[i]);

                TblCaracteristicas.setValueAt((datos_proporcion[i]), i, 1);  //datos colocados en columna proporcion
            }

            //las celdas de los titulos queden centrados
            ((DefaultTableCellRenderer) TblCaracteristicas.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

            //las celdas donde estan los datos queden centrados
            DefaultTableCellRenderer modelo2 = new DefaultTableCellRenderer();
            modelo2.setHorizontalAlignment(SwingConstants.CENTER);
            for (int i = 0; i < 4; i++) {
                TblCaracteristicas.getColumnModel().getColumn(i).setCellRenderer(modelo2);
            }

            //CREACION DE TABLAS PARA MUNICIPIO CERCANO 1
            //TblMunicipioCercano1
            //CREACION DE TABLAS PARA MUNICIPIO CERCANO 2
            jpnltablacaracteristicas.setVisible(true);
            btncaracteristicas.setVisible(false);
            btnprocesocodigestion.setVisible(true);
            //
        }

        //creacion tabla caracteristicas basado en tablas ubicacion actual y dos municipios cercanos

    }//GEN-LAST:event_btncaracteristicasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        //setExtendedState(JFrame.MAXIMIZED_BOTH);    //ajustar pantalla de la aplicacion a la del computador
        ImageIcon FondoFrame = new ImageIcon("src/Aplicacion/Large.jpg");
        //Icon iconoFondo = new ImageIcon(FondoFrame.getImage().getScaledInstance(Imagenfondo_pantalla1.getWidth(), Imagenfondo_pantalla1.getHeight(), Image.SCALE_DEFAULT));
        //Imagenfondo_pantalla1.setIcon(iconoFondo);

        this.repaint();

        Modelo1 = (DefaultTableModel) TblUbicacionActual.getModel();

        Modelo1.addColumn("Sustrato");
        Modelo1.addColumn("Tipo de biomasa");
        Modelo1.addColumn("Cant de sustrato");
        Modelo1.addColumn("Unidad de Peso");
        Modelo1.addColumn("Unidad de Tiempo");

        DefaultTableModel Modelo2 = (DefaultTableModel) TblCaracteristicas.getModel();

        Modelo2.addColumn("Tipo de Biomasa");
        Modelo2.addColumn("Proporcion");
        Modelo2.addColumn("Relación C/N");
        Modelo2.addColumn("BMP (m3/T SV)");
        Modelo2.addColumn("% SV");
        Modelo2.addColumn("Densidad aparente");

        DefaultTableModel modelo3 = (DefaultTableModel) tblproceso_codigestion.getModel();

        modelo3.addColumn("C/N");
        modelo3.addColumn("Biogas Producido");

        DefaultTableModel modelo4 = (DefaultTableModel) tbldimensionamiento.getModel();

        modelo4.addColumn("Volumen Digestor");
        modelo4.addColumn("Potencia Producida");
        modelo4.addColumn("Energia Producida");

        modelo5 = (DefaultTableModel) tblMunicipio1.getModel();

        modelo5.addColumn("Sustrato");
        modelo5.addColumn("Tipo de biomasa");
        modelo5.addColumn("Cantidad Disponible");
        modelo5.addColumn("Cant de sustrato");
        modelo5.addColumn("Costo por adquisicion de sustrato ($)");

        modelo6 = (DefaultTableModel) tblMunicipio2.getModel();

        modelo6.addColumn("Sustrato");
        modelo6.addColumn("Tipo de biomasa");
        modelo6.addColumn("Cantidad Disponible");
        modelo6.addColumn("Cant de sustrato");
        modelo6.addColumn("Costo por adquisicion de sustrato ($)");

        DefaultTableModel modelo7 = (DefaultTableModel) tblcostos.getModel();

        modelo7.addColumn("Venta de Energia");
        modelo7.addColumn("Venta Digestato");
        modelo7.addColumn("Operacion");
        modelo7.addColumn("Mantenimiento");
        modelo7.addColumn("Financiacion");
        modelo7.addColumn("Transporte");
        modelo7.addColumn("Adquisicion sustrato");

    }//GEN-LAST:event_formWindowOpened

    private void btncostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncostosActionPerformed
        //hallar calculos de COSTOS
        //inversión
        double inversion = 0;
        double ayuda_inversion = 0;
        double ayuda_inversion1 = 0;

        //hallar ingresos
        ayuda_inversion = (potencia_producida / 500);
        ayuda_inversion = redondeara2(ayuda_inversion);

        ayuda_inversion1 = Math.pow(ayuda_inversion, 0.6);
        ayuda_inversion1 = redondeara2(ayuda_inversion1);

        inversion = 5228426833.21 * ayuda_inversion1;
        inversion = redondeara2(inversion);
        //String cortar_inversion = String.format("%.2f", inversion);
        //inversion = Double.parseDouble(cortar_inversion);

        //hallar costos operacion
        double costos_operacion = 0;
        double costos_mantenimiento = 0;
        double costos_financieros = 0;

        costos_operacion = inversion * 1.6664;
        costos_operacion = redondeara2(costos_operacion);

        costos_mantenimiento = inversion * 0.15;
        costos_mantenimiento = redondeara2(costos_mantenimiento);

        costos_financieros = inversion * 0.25;
        costos_financieros = redondeara2(costos_financieros);

        //hallar venta energia
        double venta_energia = 0;
        venta_energia = energia_producida / 8760;
        venta_energia = venta_energia * 165.12;
        venta_energia = venta_energia * 8760;
        venta_energia = redondeara2(venta_energia);

        //hallar venta digestato
        double venta_digestato = 0;
        double ayuda_venta_digestato = 0;
        ayuda_venta_digestato = cant_total_biomasa * 0.25;
        venta_digestato = ayuda_venta_digestato * 200000;
        venta_digestato = redondeara2(venta_digestato);

        //hallar si es viable o no
        double cant_total_ingresos = 0;
        double cant_total_egresos = 0;
        double viabilidad_calculo = 0;

        cant_total_ingresos = venta_energia + venta_digestato;
        cant_total_egresos = costos_mantenimiento + costos_operacion + costos_financieros;
        viabilidad_calculo = cant_total_ingresos - cant_total_egresos;
        viabilidad_calculo = redondeara2(viabilidad_calculo);

        String mensaje_viabilidad = "";

        if (viabilidad_calculo > 0) {
            mensaje_viabilidad = "Es viable";
        } else {
            mensaje_viabilidad = "No es viable";
        }

        //hallar costos por adquisicion
        double ayuda_costos_adquisicion = 0;
        double costos_adquisicion = 0;
        String[] datos_costos_adquisicion1 = new String[Integer.parseInt(misresiduos.getText())];
        String[] datos_costos_adquisicion2 = new String[Integer.parseInt(misresiduos.getText())];
        for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
            datos_costos_adquisicion1[i] = String.valueOf(tblMunicipio1.getValueAt(i, 4));
            datos_costos_adquisicion2[i] = String.valueOf(tblMunicipio2.getValueAt(i, 4));
            ayuda_costos_adquisicion = Double.parseDouble(datos_costos_adquisicion1[i]) + Double.parseDouble(datos_costos_adquisicion2[i]);
            costos_adquisicion = costos_adquisicion + ayuda_costos_adquisicion;
            ayuda_costos_adquisicion = 0;
        }
        
        //hallar costos de transporte
        int ayuda_distancia_total = 0;
        String distancia_total2 = "";
        int distancia_total = 0;
        distancia_total = hola1 + hola2;
        ResultSet transp = Miconexion.getQuery("SELECT precio FROM costos WHERE KilometrosRecorridos= "+ distancia_total +" ");
        
        int transporte_variable = 0;
        try {
            transp.next();
            transporte_variable = transp.getInt("precio");
        } catch (SQLException ex) {
            Logger.getLogger(Pantalla2.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"error consulta","eror consulta tabla costos",JOptionPane.ERROR_MESSAGE);
        }
        
        int total_costo_transporte = 0;
        total_costo_transporte = transporte_variable*distancia_total;
        
       //colocar las filas necesarias e incluilas en este mismo for
        Object filas = null;
        Object No_row[] = {filas};
        ((DefaultTableModel) tblcostos.getModel()).addRow(No_row);   //abrir filas para ingresar datos

        //costos
        tblcostos.setValueAt(venta_energia, 0, 0);
        tblcostos.setValueAt(venta_digestato, 0, 1);
        tblcostos.setValueAt(costos_mantenimiento, 0, 2);
        tblcostos.setValueAt(costos_operacion, 0, 3);
        tblcostos.setValueAt(costos_financieros, 0, 4);
        tblcostos.setValueAt(total_costo_transporte, 0, 5);        
        tblcostos.setValueAt(costos_adquisicion, 0, 6);

        //las celdas de los titulos queden centrados
        ((DefaultTableCellRenderer) tblcostos.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        //las celdas donde estan los datos queden centrados
        DefaultTableCellRenderer modelo2 = new DefaultTableCellRenderer();
        modelo2.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < 7; i++) {
            tblcostos.getColumnModel().getColumn(i).setCellRenderer(modelo2);
        }

        btncostos.setVisible(false);
        btngraficar.setVisible(true);
        jpnlcostos.setVisible(true);
    }//GEN-LAST:event_btncostosActionPerformed

    private void btnprocesocodigestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocesocodigestionActionPerformed
        TblCaracteristicas.disable();
        btnprocesocodigestion.setVisible(false);

        String[] C_N = new String[Integer.parseInt(misresiduos.getText())*3];
        String[] proporcion = new String[Integer.parseInt(misresiduos.getText())*3];
        String[] potencial_metano = new String[Integer.parseInt(misresiduos.getText())*3];
        String[] porcen_solid_volatiles = new String[Integer.parseInt(misresiduos.getText())*3];

        double calculo_pro_cn = 0;

        //hallar relacion C/N
        double ayuda_variable_calcular = 0;

        //hallar biogas producido
        double ton_sus_año = 0;
        double particion = 0;
        double total_biogas_producido1 = 0;
        double total_biogas_producido2 = 0;
        double total_biogas_producido = 0;

        for (int i = 0; i < Integer.parseInt(misresiduos.getText())*3; i++) {
            proporcion[i] = String.valueOf(TblCaracteristicas.getValueAt(i, 1));  //Proporcion de la tabla caracteristicas
            C_N[i] = String.valueOf(TblCaracteristicas.getValueAt(i, 2));  //Relacion C_N de la tabla caracteristicas
            potencial_metano[i] = String.valueOf(TblCaracteristicas.getValueAt(i, 3));  //Potencial de metano de la tabla caracteristicas
            porcen_solid_volatiles[i] = String.valueOf(TblCaracteristicas.getValueAt(i, 4));  //%solidos volatiles de la tabla caracteristicas

            //System.out.println(calculo_pro_cn+((Floatt.parseFloat(proporcion[i])/100)*Float.parseFloat(C_N[i]))+"///---adawda---");
            //datos con las formulas
            ayuda_variable_calcular = (Double.parseDouble(proporcion[i]) / 100);
            ayuda_variable_calcular = ayuda_variable_calcular * Double.parseDouble(C_N[i]);
            calculo_pro_cn = ayuda_variable_calcular + calculo_pro_cn;
            ayuda_variable_calcular = 0;

            //hallar biogas producido
            System.out.println(cant_biomasa_fila[i]+"  cant fila  "+i);
            System.out.println(porcen_solid_volatiles[i]+"  %SV  "+i);
            ton_sus_año = cant_biomasa_fila[i] / Double.parseDouble(porcen_solid_volatiles[i]);
            System.out.println(ton_sus_año+" tonelada año  "+i);            
            particion = ton_sus_año / cant_total_biomasa;
            System.out.println(particion+" participacion  "+i);
            total_biogas_producido1 = ton_sus_año * particion;
            System.out.println(total_biogas_producido1+" total tonelada con participacion  "+i);
            total_biogas_producido2 = total_biogas_producido1 * Double.parseDouble(potencial_metano[i]);
            System.out.println(total_biogas_producido2+" total con bmp  "+i); 
            total_biogas_producido = total_biogas_producido2 + total_biogas_producido;
            System.out.println(total_biogas_producido+" total TOTAL   "+i);
            
            ton_sus_año = 0;
            particion = 0;
            total_biogas_producido1 = 0;
            total_biogas_producido2 = 0;

        }
        //calculo_pro_cn = redondeara2(calculo_pro_cn);
        total_biogas_producido = redondeara2(total_biogas_producido);

        //colocar las filas necesarias e incluilas en este mismo for
        Object filas = null;
        Object No_row[] = {filas};
        ((DefaultTableModel) tblproceso_codigestion.getModel()).addRow(No_row);   //abrir filas para ingresar datos
        tblproceso_codigestion.setValueAt(calculo_pro_cn, 0, 0);  //datos colocados en columna C/N
        tblproceso_codigestion.setValueAt(total_biogas_producido, 0, 1);  //datos colocados en columna biogas producido     CAMBIAR!!!!

        //las celdas de los titulos queden centrados
        ((DefaultTableCellRenderer) tblproceso_codigestion.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        //las celdas donde estan los datos queden centrados
        DefaultTableCellRenderer modelo2 = new DefaultTableCellRenderer();
        modelo2.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < 2; i++) {
            tblproceso_codigestion.getColumnModel().getColumn(i).setCellRenderer(modelo2);
        }
        jpnlprocesodigestion.setVisible(true);
        btnprocesocodigestion.setVisible(false);
        btndimensionamiento.setVisible(true);
    }//GEN-LAST:event_btnprocesocodigestionActionPerformed

    private void btndimensionamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndimensionamientoActionPerformed
        //hallar volumen digestor 
        double volumen_residuos = 0;
        double ayuda_volumen_digestor = 0;
        double volumen_digestor = 0;
        double ayuda_volumen_residuos = 0;
        double ayuda_volumen_residuos2 = 0;

        for (int i = 0; i < Integer.parseInt(misresiduos.getText())*3; i++) {
            ayuda_volumen_residuos = (cant_biomasa_fila[i] / cant_total_biomasa);
            ayuda_volumen_residuos2 = (Double.parseDouble(String.valueOf(TblCaracteristicas.getValueAt(i, 5))) * ayuda_volumen_residuos);
            ayuda_volumen_residuos2 = (cant_total_biomasa / ayuda_volumen_residuos2);
            //ayuda_volumen_residuos3=ayuda_volumen_residuos*ayuda_volumen_residuos2;
            volumen_residuos = ayuda_volumen_residuos2 + (volumen_residuos);
            ayuda_volumen_residuos = 0;
            ayuda_volumen_residuos2 = 0;
        }
        //volumen_digestor=(Double)(volumen_residuos*0.08219178);

        ayuda_volumen_digestor = (volumen_residuos / 365);
        volumen_digestor = (ayuda_volumen_digestor * 30);
        volumen_digestor = redondeara2(volumen_digestor);

        //hallar potencia producida
        double ayuda_potencia_producida = 0;
        double ayuda_potencia_producida2 = 0;
        double ayuda_potencia_producida3 = 0;
        double ayuda_potencia_producida4 = 0;
        double ayuda_potencia_producida5 = 0;
        double ayuda_potencia_producida6 = 0;
        double ayuda_potencia_producida7 = 0;

        //potencia_producida=(Double)((Double.parseDouble(String.valueOf(tabla_proceso_codigestion.getValueAt(0, 1)))*9000*4.18*(1/365*24*60*60))*0.35);
        ayuda_potencia_producida = Double.parseDouble(String.valueOf(tblproceso_codigestion.getValueAt(0, 1))) * 9000;

        ayuda_potencia_producida2 = ayuda_potencia_producida * 4.18;
        ayuda_potencia_producida3 = (365 * 24);
        ayuda_potencia_producida4 = (ayuda_potencia_producida3 * 60);
        ayuda_potencia_producida5 = (ayuda_potencia_producida4 * 60);
        ayuda_potencia_producida6 = (1 / ayuda_potencia_producida5);

        ayuda_potencia_producida7 = ayuda_potencia_producida2 * ayuda_potencia_producida6;

        potencia_producida = ayuda_potencia_producida7 * 0.35;
        potencia_producida = redondeara2(potencia_producida);

        //hallar energia producida
        double energia_producida1 = 0;
        energia_producida1 = (potencia_producida * 365);
        energia_producida = (energia_producida1 * 24);
        energia_producida = redondeara2(energia_producida);

        //colocar las filas necesarias e incluilas en este mismo for
        Object filas = null;
        Object No_row[] = {filas};
        ((DefaultTableModel) tbldimensionamiento.getModel()).addRow(No_row);   //abrir filas para ingresar datos

        //dimensionamiento
        tbldimensionamiento.setValueAt(volumen_digestor, 0, 0);  //datos colocados en la columna volumen digestor
        tbldimensionamiento.setValueAt(potencia_producida, 0, 1);    //datos colocados en la columna potencia producida
        tbldimensionamiento.setValueAt(energia_producida, 0, 2);     //datos colocados en la columna energia producida

        //las celdas de los titulos queden centrados
        ((DefaultTableCellRenderer) tbldimensionamiento.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        //las celdas donde estan los datos queden centrados
        DefaultTableCellRenderer modelo2 = new DefaultTableCellRenderer();
        modelo2.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < 3; i++) {
            tbldimensionamiento.getColumnModel().getColumn(i).setCellRenderer(modelo2);
        }

        btndimensionamiento.setVisible(false);
        jpnldimensionamiento.setVisible(true);
        btncostos.setVisible(true);

    }//GEN-LAST:event_btndimensionamientoActionPerformed

    private void btngraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngraficarActionPerformed
        
        
        String[] datos_sustrato1 = new String[Integer.parseInt(misresiduos.getText())];
        String[] datos_sustrato2 = new String[Integer.parseInt(misresiduos.getText())];
        String[] datos_cant_biomasa1 = new String[Integer.parseInt(misresiduos.getText())];
        String[] datos_cant_biomasa2 = new String[Integer.parseInt(misresiduos.getText())];
        String[] datos_tipo_biomasa1 = new String[Integer.parseInt(misresiduos.getText())];
        String[] datos_tipo_biomasa2 = new String[Integer.parseInt(misresiduos.getText())];
        
        String[] datos_tabla_total1 = new String[Integer.parseInt(misresiduos.getText())];
        String[] datos_tabla_total2 = new String[Integer.parseInt(misresiduos.getText())];
        
        
        DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        
        for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
            datos_sustrato1[i] = String.valueOf(tblMunicipio1.getValueAt(i, 0));  //tipo biomasa seleccionados
            datos_sustrato2[i] = String.valueOf(tblMunicipio2.getValueAt(i, 0));  //tipo biomasa seleccionados

            datos_cant_biomasa1[i] = String.valueOf(tblMunicipio1.getValueAt(i, 3));  //cantidad biomasa
            datos_cant_biomasa2[i] = String.valueOf(tblMunicipio2.getValueAt(i, 3));  //cantidad biomasa
            
            datos_tipo_biomasa1[i] = String.valueOf(tblMunicipio1.getValueAt(i, 1));  //cantidad biomasa
            datos_tipo_biomasa2[i] = String.valueOf(tblMunicipio2.getValueAt(i, 1));  //cantidad biomasa
            
            
            ResultSet año = Miconexion.getQuery("SELECT Total_Disponible FROM disponibilidadmunicipios WHERE sustrato_cultivo= '"+ datos_sustrato1[i] +"' AND tipo_biomasa='"+ datos_tipo_biomasa1[i] +"' ");
            try {
                año.next();
                datos_tabla_total1[i] = año.getString("Total_Disponible");
            } catch (SQLException ex) {
                    Logger.getLogger(Pantalla1.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,"error consulta","error grafica disponibilidad",JOptionPane.ERROR_MESSAGE);
            }
            
            ResultSet año2 = Miconexion.getQuery("SELECT Total_Disponible FROM disponibilidadmunicipios WHERE sustrato_cultivo= '"+ datos_sustrato2[i] +"' AND tipo_biomasa='"+ datos_tipo_biomasa2[i] +"' ");
            try {
                año2.next();
                datos_tabla_total2[i] = año.getString("Total_Disponible");
            } catch (SQLException ex) {
                    Logger.getLogger(Pantalla1.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,"error consulta","error grafica disponibilidad",JOptionPane.ERROR_MESSAGE);
            }
            
              
        }
        
        for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
            //dataset1.setValue(Double.parseDouble(m1[i]), "datos mensuales", datos_sustrato1[index]);
            dataset1.setValue(Double.parseDouble(datos_tabla_total1[i]), "Total Disponible", datos_sustrato1[i]);
        }
        
        for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
            //dataset1.setValue(Double.parseDouble(m1[i]), "datos mensuales", datos_sustrato1[index]);
            dataset2.setValue(Double.parseDouble(datos_tabla_total2[i]), "Total Disponible", datos_sustrato2[i]);
        } 
        
        JFreeChart chart = ChartFactory.createBarChart("Total Disponible municipio 1", "sustrato", "", dataset1, PlotOrientation.VERTICAL, true, true, true);

        ChartPanel charpanel = new ChartPanel(chart, false);
        frame.setContentPane(charpanel);
        frame.setVisible(true);
        
        JFreeChart chart2 = ChartFactory.createBarChart("Total Disponible municipio2", "sustrato", "", dataset2, PlotOrientation.VERTICAL, true, true, true);

        ChartPanel charpanel2 = new ChartPanel(chart2, false);
        frame2.setContentPane(charpanel2);
        frame2.setVisible(true);
        /*
        m1 = new String[12];
        m2 = new String[12];
        double dato_mayor = 0;
        int index = 0;
        int index2 = 0;
        for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
            if (dato_mayor < Double.parseDouble(datos_cant_biomasa1[i])) {
                dato_mayor = Double.parseDouble(datos_cant_biomasa1[i]);
                index = i;
            }
            if (dato_mayor < Double.parseDouble(datos_cant_biomasa2[i])) {
                dato_mayor = Double.parseDouble(datos_cant_biomasa2[i]);
                index2 = i;
            }
        }
        
        
        /*
        System.out.println(datos_sustrato1[index]);
        System.out.println(datos_tipo_biomasa1[index]);
        ResultSet año = Miconexion.getQuery("SELECT Disponible_Enero, Disponible_Febrero, Disponible_Marzo, Disponible_Abril, Disponible_Mayo, Disponible_Junio, Disponible_Julio, Disponible_Agosto, Disponible_Septiembre, Disponible_Octubre, Disponible_Noviembre, Disponible_Diciembre FROM disponibilidadmunicipios WHERE sustrato_cultivo= '"+ datos_sustrato1[index] +"' AND tipo_biomasa='"+ datos_tipo_biomasa1[index] +"' ");
        try {
                    año.next();
                    m1[0] = año.getString("Disponible_Enero");
                    m1[1] = año.getString("Disponible_Febrero");
                    m1[2] = año.getString("Disponible_Marzo");
                    m1[3] = año.getString("Disponible_Abril");
                    m1[4]= año.getString("Disponible_Mayo");
                    m1[5] = año.getString("Disponible_Junio");
                    m1[6] = año.getString("Disponible_Julio");
                    m1[7] = año.getString("Disponible_Agosto");
                    m1[8] = año.getString("Disponible_Septiembre");
                    m1[9] = año.getString("Disponible_Octubre");
                    m1[10] = año.getString("Disponible_Noviembre");
                    m1[11] = año.getString("Disponible_Diciembre");
                
                } catch (SQLException ex) {
                    Logger.getLogger(Pantalla1.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,"error consulta","error grafica disponibilidad",JOptionPane.ERROR_MESSAGE);
                }
        
        String[] alo= new String[12];
        alo[0] = "enero";
        alo[1] = "febrero";
        alo[2] = "marzo";
        alo[3] = "abril";
        alo[4] = "mayo";
        alo[5] = "junio";
        alo[6] = "julio";
        alo[7] = "agosto";
        alo[8] = "septiembre";
        alo[9] = "octubre";
        alo[10] = "noviembre";
        alo[11] = "diciembre";

        for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
            //dataset1.setValue(Double.parseDouble(m1[i]), "datos mensuales", datos_sustrato1[index]);
            dataset1.setValue(Double.parseDouble(m1[i]), "datos mensuales", alo[i]);
        }
        
        JFreeChart chart = ChartFactory.createBarChart("mensual", "sustrato", "", dataset1, PlotOrientation.VERTICAL, true, true, true);

        ChartPanel charpanel = new ChartPanel(chart, false);
        frame.setContentPane(charpanel);
        frame.setVisible(true);
        
         
         
        
        ResultSet año2 = Miconexion.getQuery("SELECT Disponible_Enero, Disponible_Febrero, Disponible_Marzo, Disponible_Abril, Disponible_Mayo, Disponible_Junio, Disponible_Julio, Disponible_Agosto, Disponible_Septiembre, Disponible_Octubre, Disponible_Noviembre, Disponible_Diciembre FROM disponibilidadmunicipios WHERE sustrato_cultivo= '"+ datos_sustrato2[index2] +"' AND tipo_biomasa='"+ datos_tipo_biomasa2[index2] +"' ");
        try {
                    año2.next();
                    m2[0] = año2.getString("Disponible_Enero");
                    m2[1] = año2.getString("Disponible_Febrero");
                    m2[2] = año2.getString("Disponible_Marzo");
                    m2[3] = año2.getString("Disponible_Abril");
                    m2[4]= año2.getString("Disponible_Mayo");
                    m2[5] = año2.getString("Disponible_Junio");
                    m2[6] = año2.getString("Disponible_Julio");
                    m2[7] = año2.getString("Disponible_Agosto");
                    m2[8] = año2.getString("Disponible_Septiembre");
                    m2[9] = año2.getString("Disponible_Octubre");
                    m2[10] = año2.getString("Disponible_Noviembre");
                    m2[11] = año2.getString("Disponible_Diciembre");
                
                } catch (SQLException ex) {
                    Logger.getLogger(Pantalla1.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,"error consulta","error consulta  tabla disponibilidad",JOptionPane.ERROR_MESSAGE);
                }
        
        for (int i = 0; i < Integer.parseInt(misresiduos.getText()); i++) {
            dataset1.setValue(Double.parseDouble(m2[i]), "datos mensuales", alo[i]);

            //dataset2.setValue("enero", Double.parseDouble(m2[i]));
        }
                    
        JFreeChart chart2 = ChartFactory.createBarChart("mensual", "sustrato", "", dataset2, PlotOrientation.VERTICAL, true, true, true);

        ChartPanel charpanel2 = new ChartPanel(chart2, false);
        frame2.setContentPane(charpanel2);
        frame2.setVisible(true);
        */
    }//GEN-LAST:event_btngraficarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JLabel Distancia1;
    private javax.swing.JLabel Distancia2;
    private javax.swing.JPanel JPnlMunicercanoDos;
    private javax.swing.JPanel JPnlMunicercanoUno;
    private javax.swing.JTable TblCaracteristicas;
    private javax.swing.JTable TblUbicacionActual;
    private javax.swing.JLabel TitleDistancia1;
    private javax.swing.JLabel TitleDistancia2;
    private javax.swing.JLabel autores;
    private javax.swing.JButton btnMCercanos;
    private javax.swing.JButton btncaracteristicas;
    private javax.swing.JButton btncostos;
    private javax.swing.JButton btndimensionamiento;
    private javax.swing.JButton btngraficar;
    private javax.swing.JButton btnprocesocodigestion;
    private javax.swing.JCheckBox checkAgricola;
    private javax.swing.JCheckBox checkGanaderia;
    private javax.swing.JComboBox<String> comboubicacionactual;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPnlDatosEntrada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel jpnlcostos;
    private javax.swing.JPanel jpnldimensionamiento;
    private javax.swing.JPanel jpnlprocesodigestion;
    private javax.swing.JPanel jpnltablacaracteristicas;
    private javax.swing.JPanel jpnlubicacionactual;
    private javax.swing.JLabel lblrecomendacion;
    private javax.swing.JTextField misresiduos;
    private javax.swing.JTextField mitemperatura;
    private javax.swing.JComboBox<String> municercanoDos;
    private javax.swing.JComboBox<String> municercanoUno;
    private javax.swing.JButton reload;
    private javax.swing.JTable tblMunicipio1;
    private javax.swing.JTable tblMunicipio2;
    private javax.swing.JTable tblcostos;
    private javax.swing.JTable tbldimensionamiento;
    private javax.swing.JTable tblproceso_codigestion;
    private javax.swing.JTextField txtcantresiduoxmunicipio;
    // End of variables declaration//GEN-END:variables

    public Pantalla2() throws SQLException {
        frame = new JFrame("Grafica");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        frame2 = new JFrame("Grafica");
        frame2.setSize(500, 700);
        frame2.setLocationRelativeTo(null);

        
        initComponents();
        BtnIniciar.setVisible(true);
        comboubicacionactual.removeAllItems();
        Agregaritemscombo();
        this.setLocationRelativeTo(null);

        this.setVisible(true);
        lblrecomendacion.setVisible(false);
        JPnlMunicercanoUno.setVisible(false);
        JPnlMunicercanoDos.setVisible(false);
        jpnlubicacionactual.setVisible(false);
        jpnltablacaracteristicas.setVisible(false);
        btncaracteristicas.setVisible(false);
        btnprocesocodigestion.setVisible(false);
        btndimensionamiento.setVisible(false);
        btngraficar.setVisible(false);
        jpnldimensionamiento.setVisible(false);
        jpnlcostos.setVisible(false);
        jpnlprocesodigestion.setVisible(false);
        btncostos.setVisible(false);

        this.pack();

    }

    public void Agregaritemscombo() {

        //llenado de datos
        int idmunicipio;
        String nombremunicipio, Latitud, PolLatitud, Longitud, PolLongitud;
        ModeloListaMunicipios MilistaModelo;

        ResultSet DatosUbicacion = Miconexion.getQuery("SELECT * FROM ubicacionmunicipios"); //CONSULTA A LA BD

        try {
            while (DatosUbicacion.next()) {

                idmunicipio = DatosUbicacion.getInt("id_municipio");
                nombremunicipio = DatosUbicacion.getString("Nombre_municipio");
                Latitud = DatosUbicacion.getString("Latitud");
                PolLatitud = DatosUbicacion.getString("Polaridad_Latitud");
                Longitud = DatosUbicacion.getString("Longitud");
                PolLongitud = DatosUbicacion.getString("Polaridad_Longitud");
                /*
                 System.out.println("id:" + idmunicipio + " Nombre:" + nombremunicipio);
                 System.out.println(" Latitud:" + Latitud + " PolaridadLatitud:" + PolLatitud);
                 System.out.println(" Longitud:" + Longitud + " PolaridadLongitud:" + PolLongitud);
                 */
                Municipio mimunicipio = new Municipio(idmunicipio, nombremunicipio, Latitud, Longitud, PolLatitud, PolLongitud);
                Municipios.add(mimunicipio);

                comboubicacionactual.addItem(nombremunicipio);

            }
        } catch (SQLException e) {

            String titulo = "Error en consulta BD";
            String mensaje = "Error insertando Lista Ubicacion de municipios";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);

            System.out.println("Error insertando Lista ubicacion de municipios");
            e.printStackTrace();
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Pantalla2().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Pantalla2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

}
