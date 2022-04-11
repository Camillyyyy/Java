package atividadeint;

import java.util.Scanner;

public class AtividadeInt {

    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            
            // a horas recebe a variavel 'hrs'. A variavel 'nv' é o nivel, que vai ser de 1 ao 3.
            int hrs, nv;
            
            
            
            //entradas
            System.out.print("Nível [1] [2] [3]: ");
            nv=input.nextInt(); 
            
            System.out.println("Total de horas inteiras: ");
            hrs=input.nextInt();
            
            
            
            //Possiveis saidas usando if
            if(nv==1){
                     nv=36;
                     
                    double calc = (nv*hrs);
                    System.out.println("O total que o professor irá receber é de: "+calc);
    }
            else if(nv==2){
                    nv=41;
                    
                    double calc = (nv*hrs);
                    System.out.println("O total que o professor irá receber é de: "+calc);
    }            
            else if(nv==3){
                    nv=47;
                    
                    double calc = (nv*hrs);
                    System.out.println("O total que o professor irá receber é de: "+calc);
    }
            
            





    }
    
}
