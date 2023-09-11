
import java.io.*;

import javax.swing.plaf.metal.MetalBorders.PaletteBorder;


class Player implements Serializable {

    int jerNo = 0;
    String pName = null;

    Player(int jerNo, String pName) {

        this.jerNo = jerNo;
        this.pName = pName;
    }
}

class FileWriterDemo {

    public static void main(String[] args) throws IOException {

        Player obj1 = new Player(1 ,"KLRahul");
        Player obj2 = new Player(45,"Rohit");
        
        FileOutputStream fos = new FileOutputStream("Incubator.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(obj1);
        oos.writeObject(obj2);

        oos.close();
        fos.close();           
    }
}
