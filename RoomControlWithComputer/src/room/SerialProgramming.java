package room;

import gnu.io.NRSerialPort;
import java.io.BufferedReader;
import java.io.DataOutputStream;


/**
 *
 * @author Sirat
 */
public class SerialProgramming {

    NRSerialPort nrSerialPort;
    
    public DataOutputStream dataOutputStream;

    public SerialProgramming() {
        try {
//            br = new BufferedReader(new FileReader("Address/com.txt"));
//            comPort = br.readLine();
            nrSerialPort = new NRSerialPort("COM4", 9600);
            nrSerialPort.connect();

            dataOutputStream = new DataOutputStream(nrSerialPort.getOutputStream());
//            while(true)
//            {
//                
//            System.out.println("H");
//            dataOutputStream.write('H');
//            dataOutputStream.flush();
//            Thread.sleep(5000);
//            System.out.println("L");
//            dataOutputStream.write('L');
//            dataOutputStream.flush();
//            Thread.sleep(5000);
//            
//            
//            }
            
            
            
            
            

        } catch (Exception e) {
                    System.out.println(e);
        }

    }


}
