package ve.edu.unet;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UtGenP {
    public static boolean debug = true;
    public static int lineNumber = 0;

    /* Comment */
    public static void comment(String c, BufferedWriter bw){
        if(debug){
            UtGenP.writeIns(";        "+c, bw);
            UtGenP.writeIns("true", bw);
        }
    }

    /* op = code operation
     * p = const
     * c= comment */
    public static void instruction(String op, int p, String c, BufferedWriter bw){
        lineNumber++;
        UtGenP.writeIns(op+" "+p, bw);
        if(debug)
            UtGenP.writeIns("        ;"+c, bw);
        UtGenP.writeIns("true", bw);
    }

    /* op = code operation
     * p =  operation variable
     * c = comment */
    public static void instruction(String op, String p, String c, BufferedWriter bw){
        lineNumber++;
        UtGenP.writeIns(op+" "+p, bw);
        if(debug)
            UtGenP.writeIns("        ;"+c, bw);
        UtGenP.writeIns("true", bw);
    }

    /* op = code operation
     * c = comment */
    public static void instruction(String op, String c, BufferedWriter bw){
        lineNumber++;
        UtGenP.writeIns(op, bw);
        if(debug)
            UtGenP.writeIns("        ;"+c, bw);
        UtGenP.writeIns("true", bw);
    }

    public static int lineNumber() {
        return lineNumber;
    }

    /* Terminal*/
    public static void writeIns(String output, BufferedWriter bw){
        if(bw != null){
            try {
                if(output.equals("true"))
                    bw.newLine();
                else
                    bw.write(output);
            } catch (IOException ex) {
                Logger.getLogger(UtGenP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            if(!output.equals("true"))
                System.out.println(output);
        }
    }
}
