package Tresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResoucerBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundleBR = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        ResourceBundle bundleUS = ResourceBundle.getBundle("messages", Locale.US);
        System.out.println(bundleBR.getString("ola"));
        System.out.println(bundleBR.getString("bom.dia"));
        System.out.println(bundleUS.getString("hello"));
        System.out.println(bundleUS.getString("good.morning"));
        //Locale("fr", "CA")
        //messages_fr_CA.properties
        //messages_fr.properties
        //messages_pt_BR.properties
        //messages_pt.properties
        //messages.properties
        //ordem que ele irá procurar os arquivos se nao achar


    }

}
