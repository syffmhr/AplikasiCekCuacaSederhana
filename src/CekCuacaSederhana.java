import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONObject;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class CekCuacaSederhana extends javax.swing.JFrame {

    /**
     * Creates new form CekCuacaSederhana
     */
    
    public CekCuacaSederhana() {
        initComponents();

        start();
    }
    
     ArrayList<String> kotaFavorit = new ArrayList<>();;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        weatherInfoLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        favoriteCitiesCombo = new javax.swing.JComboBox<>();
        checkWeatherButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tableModel = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        iconLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Cek Cuaca Sederhana", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jLabel1.setText("Masukkan Kota : ");

        weatherInfoLabel.setText("Cuaca :");

        jLabel2.setText("Pilih Kota Favorit : ");

        favoriteCitiesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banjarbaru" }));
        favoriteCitiesCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoriteCitiesComboActionPerformed(evt);
            }
        });

        checkWeatherButton.setText("Cek Cuaca");
        checkWeatherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkWeatherButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Tambah Favorit");

        jButton3.setText("Simpan Data");

        jButton4.setText("Muat Data");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kota", "Cuaca", "Suhu"
            }
        ));
        tableModel.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(checkWeatherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(favoriteCitiesCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(10, 10, 10)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tableModel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(weatherInfoLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconLabel)
                .addGap(145, 145, 145))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkWeatherButton)
                    .addComponent(jButton3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(favoriteCitiesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(weatherInfoLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton4))))
                .addGap(37, 37, 37)
                .addComponent(iconLabel)
                .addGap(46, 46, 46)
                .addComponent(tableModel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkWeatherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkWeatherButtonActionPerformed
        
    }//GEN-LAST:event_checkWeatherButtonActionPerformed

    private void favoriteCitiesComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoriteCitiesComboActionPerformed
        
    }//GEN-LAST:event_favoriteCitiesComboActionPerformed

    private void saveDataToFile() {
        try (FileWriter writer = new FileWriter("Weather.csv", true)) { 
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel(); 
            for (int i = 0; i < tableModel.getRowCount(); i++) { 
                String city = tableModel.getValueAt(i, 0).toString(); 
                String weather = tableModel.getValueAt(i, 1).toString(); 
                String temp = tableModel.getValueAt(i, 2).toString(); 
                writer.append(city).append(",").append(weather).append(",").append(temp).append("\n"); 
            }
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void loadDataFromFile() {
        File file = new File("Weather.csv");

        try {
            if (!file.exists()) { 
                file.createNewFile(); 
                try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
                    writer.println("Kota,Cuaca,Suhu (°C)"); 
                }
                JOptionPane.showMessageDialog(this, "File Weather.csv berhasil dibuat.");
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) { 
                DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
                String line;
                tableModel.setRowCount(0);
                while ((line = reader.readLine()) != null) { 
                    String[] data = line.split(",");
                    tableModel.addRow(data);
                }
                JOptionPane.showMessageDialog(this, "Data berhasil dimuat dari CSV");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    private void getWeather(String city) {
        String apiKey = "55dd1449b7630cdd9e8d824f73c6ca54";
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric"; // URL untuk meminta data cuaca

        try {
            URL url = new URL(urlString); 
            HttpURLConnection conn = (HttpURLConnection) url.openConnection(); 
            conn.setRequestMethod("GET");
            conn.connect(); 

            int responseCode = conn.getResponseCode(); 
            if (responseCode == 200) { 
                InputStream inputStream = conn.getInputStream(); 
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)); 
                StringBuilder stringBuilder = new StringBuilder(); 
                String line;
                while ((line = reader.readLine()) != null) { 
                    stringBuilder.append(line);
                }

                JSONObject json = new JSONObject(stringBuilder.toString()); 
                String weather = json.getJSONArray("weather").getJSONObject(0).getString("main"); 
                String icon = json.getJSONArray("weather").getJSONObject(0).getString("icon");
                double temp = json.getJSONObject("main").getDouble("temp");

                weatherInfoLabel.setText("Cuaca : " + weather + " (" + temp + "°C)");

                String iconUrl = "http://openweathermap.org/img/wn/" + icon + "@2x.png";
                ImageIcon iconImage = new ImageIcon(new URL(iconUrl)); 
                iconLabel.setIcon(iconImage);

                DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
                tableModel.addRow(new Object[]{city, weather, temp});
            } else {
                weatherInfoLabel.setText("Kota tidak ditemukan.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void addFavoriteCity() {
        String city = cityField.getText();
        if (!city.isEmpty() && !kotaFavorit.contains(city)) { 
            kotaFavorit.add(city); 
            favoriteCitiesCombo.addItem(city); 
            JOptionPane.showMessageDialog(this, "Kota " + city + " ditambahkan ke favorit."); 
        } else if (kotaFavorit.contains(city)) {
            JOptionPane.showMessageDialog(this, "Kota " + city + " sudah ada di favorit."); 
        }
    }
    
    private void saveFavoriteCities() {
        try (FileWriter writer = new FileWriter("kota_favorit.txt")) {
            for (String city : kotaFavorit) {
                writer.write(city + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFavoriteCities() {
        File file = new File("favorit.txt");

        try {
            if (!file.exists()) { 
                file.createNewFile(); 
                JOptionPane.showMessageDialog(this, "File favorit.txt berhasil dibuat.");
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) { 
                String line;
                kotaFavorit.clear();
                favoriteCitiesCombo.removeAllItems();
                while ((line = reader.readLine()) != null) { 
                    kotaFavorit.add(line); 
                    favoriteCitiesCombo.addItem(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
    
       
    private void start() {
        loadFavoriteCities(); 
        Runtime.getRuntime().addShutdownHook(new Thread(() -> { 
            saveFavoriteCities();
        }));
        String comboBox = (String) favoriteCitiesCombo.getSelectedItem();
        if (comboBox != null && !comboBox.isEmpty()) {
            getWeather(comboBox);
        }

        
        favoriteCitiesCombo.addItemListener(e -> {
            
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String city = (String) favoriteCitiesCombo.getSelectedItem();
                getWeather(city);
            }
        });

        checkWeatherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textField = cityField.getText();
                String comboBox = (String) favoriteCitiesCombo.getSelectedItem();

                if (!textField.isEmpty()) {
                    getWeather(textField);
                } else if (comboBox.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Kota harus terisi!");
                }
            }
        });


        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addFavoriteCity();
            }
        });

        jButton3.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                saveDataToFile(); 
            }
        });
        
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadDataFromFile();
            }
        });
    }
    
    
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
            java.util.logging.Logger.getLogger(CekCuacaSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CekCuacaSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CekCuacaSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CekCuacaSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CekCuacaSederhana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkWeatherButton;
    private javax.swing.JTextField cityField;
    private javax.swing.JComboBox<String> favoriteCitiesCombo;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane tableModel;
    private javax.swing.JLabel weatherInfoLabel;
    // End of variables declaration//GEN-END:variables
}
