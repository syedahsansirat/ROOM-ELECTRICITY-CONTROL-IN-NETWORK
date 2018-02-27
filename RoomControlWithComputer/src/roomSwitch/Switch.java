package roomSwitch;
import java.io.*;
import java.net.Socket;

/**
 *
 * @author Sirat
 */
public class Switch extends javax.swing.JFrame {

    Socket socket;
    private PrintWriter writer;
    String ip = "";
    BufferedReader br;
    int port = 3456;

    public Switch() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
      
        
        try {
          //  statusLabel.setText("Connecting...");
            br = new BufferedReader(new FileReader("Address/ip.txt"));
            ip=br.readLine();
           
        //    ipLabel.setText("Server IP is "+ip);
        //    statusLabel.setText("Connecting...");
            Thread.sleep(1000);
             
            socket = new Socket(ip, port);
        //    statusLabel.setText("Connected");
            
            writer = new PrintWriter(socket.getOutputStream());
        } catch (Exception ex) {
            System.out.println("Error=" + ex.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        onButton = new javax.swing.JButton();
        offButton = new javax.swing.JButton();
        switchLabel = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(250, 180));
        setPreferredSize(new java.awt.Dimension(250, 180));
        setResizable(false);
        getContentPane().setLayout(null);

        onButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        onButton.setForeground(new java.awt.Color(102, 102, 102));
        onButton.setText("On");
        onButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onButtonActionPerformed(evt);
            }
        });
        getContentPane().add(onButton);
        onButton.setBounds(50, 33, 170, 40);

        offButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        offButton.setForeground(new java.awt.Color(102, 102, 102));
        offButton.setText("OFF");
        offButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offButtonActionPerformed(evt);
            }
        });
        getContentPane().add(offButton);
        offButton.setBounds(50, 80, 170, 40);

        switchLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        switchLabel.setForeground(new java.awt.Color(255, 51, 51));
        switchLabel.setText("Switch ");
        getContentPane().add(switchLabel);
        switchLabel.setBounds(70, 0, 173, 20);

        iconLabel.setIcon(new javax.swing.ImageIcon("D:\\RoomControlWithComputer\\RoomControlWithComputer\\Image\\pink.GIF")); // NOI18N
        getContentPane().add(iconLabel);
        iconLabel.setBounds(0, -30, 370, 290);

        jMenu1.setText("Help");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Contract us");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onButtonActionPerformed
        writer.println("START");
        writer.flush();
       
    }//GEN-LAST:event_onButtonActionPerformed

    private void offButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offButtonActionPerformed
        writer.println("STOP");
        writer.flush();
        
    }//GEN-LAST:event_offButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
public static void main(String args[]) {
        Switch ob = new Switch();
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton offButton;
    private javax.swing.JButton onButton;
    private javax.swing.JLabel switchLabel;
    // End of variables declaration//GEN-END:variables
}
