/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15_exercicio_repeticção;

import javax.swing.JOptionPane;

/**
 *
 * @author maico
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s  = 0;
        int Total = 0;
        int pares = 0;
        int impar = 0;
        int acima = 0;
        int media = 0;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));
           s += n; // s = s + n
           if (n > 0){
               Total += 1;           
            }
                      
            if (n%2==0){
                if (n>0){
                  pares+=1;  
                }
            }else {
                if (n>0){
                 impar+=1;    
                }
            }  
            if (n>100){
                acima+=1;
            }
              media = s / Total;

            } while (n != 0);
            
            JOptionPane.showMessageDialog(null,"<html>Resultado final<br><hr>" + 
                "Somatória vale " + s +
                "<br> Total: " + Total +
                "<br> Total de Pares: " + pares +
                "<br> Total de Impares: " + impar +
                "<br> Total de Acima de 100: " + acima +
                "<br> Total Media: " + media + "<html>" );
    
    }
}

