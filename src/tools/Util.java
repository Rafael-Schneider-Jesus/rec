/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
            

/**
 *
 * @author u13766540670
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... vetCampo) {
        for (int i = 0; i < vetCampo.length; i++) {
           vetCampo[i].setEnabled(valor);
            
        }
    }
    
    public static void limp(JComponent ... vetComp) {
        for (JComponent componente : vetComp) {
            if (componente instanceof JTextField) {
                JTextField objeto = (JTextField) componente;
                objeto.setText("");
            } else if (componente instanceof JComboBox) {
                JComboBox objeto = (JComboBox) componente;
                objeto.setSelectedItem(-1);
            } else if (componente instanceof JCheckBox) {
                JCheckBox objeto = (JCheckBox) componente;
                objeto.setSelected(false);
            }
        }
    }
    public static void msg( String mensagem) {
         JOptionPane.showMessageDialog(null, mensagem);
    }
    public static boolean perguntar(String mensagem) {
//       int resp = JOptionPane.showConfirmDialog(null, "Confirmar exclusão?",
//       "Pergunta", JOptionPane.YES_NO_OPTION);
       
       int resp = JOptionPane.showConfirmDialog(null, "Confirmar exclusão?",
       "Pergunta", JOptionPane.YES_NO_OPTION);
       
        return false;
    }
    public static int strInt(String cad) {
        return 0;
    }
     public static String intStr(int num) {
        return "" ;
    }
     public static double strDouble(String cad) {
        return 0;
    }
      public static String doubleStr(String num) {
        return "";
    }
    public static java.util.Date strDate(String car) {
            try {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                return formato.parse(car);
            } catch (ParseException ex) {
                System.out.println("Houve uma falha em sua conversão de data");
            }
            return null;
    }

    public static String dateStr(java.util.Date cad) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(cad);
    }

    public static void habilitar(JTextField jtxtsabor, JTextField jtxtCodigo, JComboBox<String> jCbocopo, JComboBox<String> jCbotamanho, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
