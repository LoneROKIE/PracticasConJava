
package encriptarYdesencriptarPasswords;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class PracticaEncriptacion {
    
    public static void main(String[] args) {
        
        String contraseniaHashGuardada = doHashing("hola perro");
        String contraseniaDadaPorUsuario = "hola perro";
        
        // verificar
        if(verifyPassword(contraseniaDadaPorUsuario, contraseniaHashGuardada)){
            System.out.println("Contrasenia Correcta");
        }else{
            System.out.println("Contrasenia incorrecta");
        }
        
        
    }
    
    
    public static String doHashing(String password){
        
        try{
            MessageDigest messageDig = MessageDigest.getInstance("SHA-256");
                    
            messageDig.update(password.getBytes());
            
            byte[] resultByteArray = messageDig.digest();
            
            StringBuilder sb = new StringBuilder();
            
            for (byte b : resultByteArray){
                sb.append(String.format("%02x", b));
            }
            
            return sb.toString();
            
        }catch(NoSuchAlgorithmException ex){
            ex.printStackTrace();
        }
        return "";
    }
    
    
    public static boolean verifyPassword(String contraseniaDada, String contraseniaGuardada){
        String contraseniaDadaHash = doHashing(contraseniaDada);
        return contraseniaDadaHash.equals(contraseniaGuardada);
    }
    
}
