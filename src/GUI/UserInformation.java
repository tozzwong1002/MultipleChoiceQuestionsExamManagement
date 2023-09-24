package GUI;

import BLL.Controller;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.json.JSONObject;

public class UserInformation extends javax.swing.JPanel {

    JSONObject json = new JSONObject();
    JFrame changePwd;

    public UserInformation(JSONObject json) {
        initComponents();
        BufferedImage img = null;
        BufferedImage img_edit = null;
        try {
            img = ImageIO.read(getClass().getResource("/GUI/Image/user.png"));
            img_edit = ImageIO.read(getClass().getResource("/GUI/Image/edit.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(160, 160, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        jLabel1.setIcon(imageIcon);

        Image dimg_edit = img_edit.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon imageIcon_edit = new ImageIcon(dimg_edit);
        jButton_edit.setIcon(imageIcon_edit);

        jButton_changePass.putClientProperty("JButton.buttonType", "borderless");
        jButton_logout.putClientProperty("JButton.buttonType", "borderless");

        //set data to jlabel
        jLabel_username.setText(json.getString("username"));
        jLabel_fullname.setText(json.getString("fullname"));
        jLabel_birth.setText(json.getString("birth"));
        if (json.getBoolean("gender")) {
            jLabel_gender.setText("Nam");
        } else {
            jLabel_gender.setText("Nữ");
        }

        this.json = json;
        jButton_edit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    EditUserInfor edit = new EditUserInfor(json);
                    edit.setVisible(true);

                } catch (ParseException ex) {
                    Logger.getLogger(UserInformation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        jButton_changePass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ChangePassword changePwd = new ChangePassword(json.getString("username"));
                changePwd.setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_username = new javax.swing.JLabel();
        jLabel_fullname = new javax.swing.JLabel();
        jLabel_birth = new javax.swing.JLabel();
        jLabel_gender = new javax.swing.JLabel();
        jButton_edit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_changePass = new javax.swing.JButton();
        jButton_logout = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1183, 659));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1503, 1037));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(650, 300));
        jPanel2.setMinimumSize(new java.awt.Dimension(650, 300));
        jPanel2.setPreferredSize(new java.awt.Dimension(450, 300));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Email:");
        jLabel2.setMaximumSize(new java.awt.Dimension(125, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(125, 25));
        jLabel2.setPreferredSize(new java.awt.Dimension(125, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Full name :");
        jLabel3.setMaximumSize(new java.awt.Dimension(125, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(125, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(125, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Birth :");
        jLabel5.setMaximumSize(new java.awt.Dimension(125, 25));
        jLabel5.setMinimumSize(new java.awt.Dimension(125, 25));
        jLabel5.setPreferredSize(new java.awt.Dimension(125, 25));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Gender :");
        jLabel6.setMaximumSize(new java.awt.Dimension(125, 25));
        jLabel6.setMinimumSize(new java.awt.Dimension(125, 25));
        jLabel6.setPreferredSize(new java.awt.Dimension(125, 25));

        jLabel_username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_username.setText("lyquocan17");
        jLabel_username.setName(""); // NOI18N

        jLabel_fullname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_fullname.setText("ly quoc an");

        jLabel_birth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_birth.setText("17/01/2001");

        jLabel_gender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_gender.setText("Male");

        jButton_edit.setText(" ");
        jButton_edit.setBorderPainted(false);
        jButton_edit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_edit.setMaximumSize(new java.awt.Dimension(35, 35));
        jButton_edit.setMinimumSize(new java.awt.Dimension(35, 35));
        jButton_edit.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel_username, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel_birth, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(229, 229, 229))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_username))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_fullname))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_birth))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_gender))
                .addGap(95, 95, 95))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(134, 0, 129, 5);
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanel3.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(30, 89, 0, 89);
        jPanel3.add(jLabel1, gridBagConstraints);

        jButton_changePass.setBackground(new java.awt.Color(255, 204, 51));
        jButton_changePass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_changePass.setForeground(new java.awt.Color(51, 51, 51));
        jButton_changePass.setText("Change Password");
        jButton_changePass.setBorderPainted(false);
        jButton_changePass.setFocusPainted(false);
        jButton_changePass.setMaximumSize(new java.awt.Dimension(148, 35));
        jButton_changePass.setMinimumSize(new java.awt.Dimension(148, 35));
        jButton_changePass.setPreferredSize(new java.awt.Dimension(148, 35));
        jButton_changePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_changePassActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(18, 89, 0, 89);
        jPanel3.add(jButton_changePass, gridBagConstraints);

        jButton_logout.setBackground(new java.awt.Color(255, 51, 51));
        jButton_logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_logout.setForeground(new java.awt.Color(255, 255, 255));
        jButton_logout.setText("Logout");
        jButton_logout.setBorderPainted(false);
        jButton_logout.setMaximumSize(new java.awt.Dimension(148, 35));
        jButton_logout.setMinimumSize(new java.awt.Dimension(148, 35));
        jButton_logout.setPreferredSize(new java.awt.Dimension(148, 35));
        jButton_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logoutActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(18, 89, 50, 89);
        jPanel3.add(jButton_logout, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(134, 5, 129, 0);
        jPanel1.add(jPanel3, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_changePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_changePassActionPerformed
        Window window = SwingUtilities.getWindowAncestor(this);
        window.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_jButton_changePassActionPerformed

    private void jButton_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logoutActionPerformed
        try {
            Controller controller = new Controller();
            Map<String, String> inputMap = new HashMap<String, String>();
            inputMap.put("func", "logout");
            inputMap.put("userID", String.valueOf(json.getInt("userID")));
            inputMap.put("status", "true");
            String dataReceive = controller.SendReceiveData(controller.convertToJSON(inputMap));
            JSONObject jsonReceive = new JSONObject(dataReceive);
            if (jsonReceive.getBoolean("status")) {
                JFrame parent = (JFrame) this.getTopLevelAncestor();
                parent.dispose();
                Login login = new Login();
                login.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Logout fail!");
            }
        } catch (IOException ex) {
            Logger.getLogger(UserInformation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(UserInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_logoutActionPerformed

    private void jButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editActionPerformed
        Window window = SwingUtilities.getWindowAncestor(this);
        window.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_jButton_editActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_changePass;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JButton jButton_logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_birth;
    private javax.swing.JLabel jLabel_fullname;
    private javax.swing.JLabel jLabel_gender;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
