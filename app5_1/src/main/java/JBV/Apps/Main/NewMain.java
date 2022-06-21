/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JBV.Apps.Main;
import JBV.App.Clases.Forms.Celular;

/**
 *
 * @author Joseph
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Celular celular=new Celular("L1983","Huaweii","VTR", 300.30);
        celular.general();
        celular.descuento();
        
    }
    
}
