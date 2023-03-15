import java.util.Scanner;

public class Eciclos12 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        int dia_elatorio=0;
        int mes=0;
        int ano=0;

        for (int i = 1; i <= 2; i++) {
            int aleatorio=(int)(Math.random()*31);
            dia_elatorio=(dia_elatorio*31)+aleatorio;

            aleatorio=(int)(Math.random()*12);
            mes=(mes*12)+aleatorio;

            aleatorio=(int)(Math.random()*9999);
            ano=(ano*9999)+aleatorio;

            if ((dia_elatorio <= 31)&&(mes<=12)&&(ano>=1000 && ano <=5000)) {
                System.out.println("este es  el dia"+ dia_elatorio+"/"+mes+"/"+ ano ); 
            }else if((dia_elatorio ==31)&&(mes ==1)&&(mes == 2)&&(mes ==5)&&(mes ==7)&&(mes ==8)&&(mes ==10)&&(mes ==12)){
                
            }
              
        }
        
    }
    
}
