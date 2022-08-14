
package matematica;

import javax.swing.JOptionPane;



public class Matematica {

 
    public static void main(String[] args) {
        
        String num1;
        String num2;
         String opcao;
        int n1, n2, soma, sub, div, mult, somaq;
       
        
      
            
        while(true)//verdadeiro{
        {
               opcao =   JOptionPane.showInputDialog(" Digite a opção desejada: \n" 
                    + " 1 - Soma \n "
                    + " 2 -  Subtração \n "
                    + " 3 - Divisão \n "
                    + " 4 - Multiplicação \n "
                    + " 5 - Soma do quadrado \n "
                    + " 0  - Sair \n ");
               
  
               switch (opcao){
                   
                   case "1":
         num1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
         num2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
        
         n1 = Integer.parseInt(num1);//converter o a string para numero inteiro
         n2 = Integer.parseInt(num2);
         
                soma =  n1+n2;
                      
                      JOptionPane.showMessageDialog(null, "Resultado"  + soma);
                   break;
                   
                   case "2":
                       num1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
         num2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
        
         n1 = Integer.parseInt(num1);//converter o a string para numero inteiro
         n2 = Integer.parseInt(num2);
                       
                      sub =  n1-n2;
                      
                      JOptionPane.showMessageDialog(null, "Resultado" + sub);
                   break;
          
                   case "3":
                       num1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
         num2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
        
         n1 = Integer.parseInt(num1);//converter o a string para numero inteiro
         n2 = Integer.parseInt(num2);
                       
                      div =  n1/n2;
                      
                      JOptionPane.showMessageDialog(null, "Resultado" + div);
                   break;
                   
                   case "4":
                       num1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
         num2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
        
         n1 = Integer.parseInt(num1);//converter o a string para numero inteiro
         n2 = Integer.parseInt(num2);
                       
                      mult =  n1*n2;
                      
                      JOptionPane.showMessageDialog(null, "Resultado" + mult);
                   break;
                   
                   case "5":
                       num1 = JOptionPane.showInputDialog("Digite o qualqer numero para calcular o quadrado: ");
       
        
         n1 = Integer.parseInt(num1);//converter o a string para numero inteiro
      
                       
                      somaq =  n1*n1;
                      
                      JOptionPane.showMessageDialog(null, "Resultado: " + somaq);
                   break;
                   
                   case "0":
                       System.exit(0);
                     
                  
                   
                   
               }
               
         }
        
    }
}          
               
    
               
               
               
        
               
               
                 
      

    
    

        
 
      
        

