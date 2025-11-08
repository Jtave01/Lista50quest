package ex;

public class Ex4 {
   
    public static void main(String []args){
        int hbA = 80000;
        int hdB = 200000;

       
        double crescB =(1.5/100.0);
        double crescA =(3.0/100);

        int ano = 0;
        double k = hdB;
            
        for(double i  = hbA; i < k; i = i + (i *crescA)){
                k = k +(k * crescB );
                
                
                ano++;
            }
        

        System.out.println(" Anos: " + ano);
    }
    
}
