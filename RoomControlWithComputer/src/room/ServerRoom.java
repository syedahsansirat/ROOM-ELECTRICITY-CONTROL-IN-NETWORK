package room;

/**
 *
 * @author Sirat
 */
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;
import gnu.io.*;
import javax.swing.JOptionPane;

public class ServerRoom extends javax.swing.JFrame {

    private ServerSocket server;
    private PrintWriter filewriter;
    private BufferedReader reader;
    private String line;
    String ip;
    int port;
    //SerialProgramming object;

    public ServerRoom() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
          // object = new SerialProgramming();
        try {
            Thread.sleep(1000);
            port = 3456;
            server = new ServerSocket(port);
            statusLabel.setText("Connecting...");
            //Thread.sleep(1000);
            Socket soc = server.accept();
            statusLabel.setText("Started");
            reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            while (true) {
                line = reader.readLine();
                System.out.println("input=" + line);
                if (line.matches("START")) {
//                       object.dataOutputStream.write('H');
//                     object.dataOutputStream.flush();
                     System.out.println("START");
                } else if (line.matches("STOP")) {
//                    object.dataOutputStream.write('L');
//                      object.dataOutputStream.flush();
                      System.out.println("STOP");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(jPanel1, "Something Wrong Or Client Disconnected");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        setIpAndPortButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        ipShowLabel = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 200));
        setName("frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(300, 200));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 200));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        setIpAndPortButton.setText("Set IP & Port");
        setIpAndPortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setIpAndPortButtonActionPerformed(evt);
            }
        });
        jPanel1.add(setIpAndPortButton);
        setIpAndPortButton.setBounds(20, 0, 264, 60);

        statusLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        statusLabel.setText("Not Connected");
        jPanel1.add(statusLabel);
        statusLabel.setBounds(170, 100, 140, 17);
        jPanel1.add(ipShowLabel);
        ipShowLabel.setBounds(10, 60, 280, 27);

        iconLabel.setIcon(new javax.swing.ImageIcon("D:\\RoomControlWithComputer\\RoomControlWithComputer\\Image\\CheckBackground.JPG")); // NOI18N
        jPanel1.add(iconLabel);
        iconLabel.setBounds(0, 0, 300, 200);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 300, 200);

        jMenu.setText("Help");

        jMenuItem1.setText("About Software");
        jMenu.add(jMenuItem1);

        jMenuItem2.setText("Contract Us");
        jMenu.add(jMenuItem2);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setIpAndPortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setIpAndPortButtonActionPerformed
        ip = new String();
        try {
            ip = (InetAddress.getLocalHost().getHostAddress()).trim();
            filewriter = new PrintWriter("Address/ip.txt");
            filewriter.write(ip);
            filewriter.close();
            ipShowLabel.setText("IP " + ip + " has been Set To Address Folder. ");
        } catch (Exception e) {
            System.out.println("Ops");
        }
    }//GEN-LAST:event_setIpAndPortButtonActionPerformed
    public static void main(String args[]) {
        ServerRoom ob = new ServerRoom();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel ipShowLabel;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton setIpAndPortButton;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
