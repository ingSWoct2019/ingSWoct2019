package ingswoct2019;

public class IngSWoct2019 {
    private static String sms;
    
    public static void enviaMensaje(String sms){
        IngSWoct2019.sms = sms;
    }
    
    public static void recibirMensaje(){
        System.out.println("Mensaje:"+ IngSWoct2019.sms);
    }
    
    public static void main(String[] args) {
     
        String sms= "Te estoy enviando un mensaje";
        
        IngSWoct2019.enviaMensaje(sms);
        
        IngSWoct2019.recibirMensaje();
        
        
        
    }
    
}
