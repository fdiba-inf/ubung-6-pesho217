package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kur = 0;
        int count = 0;
        do {
        String password = input.nextLine();
        if (password.length() >= 8 ) {
        
        for(int i = 0; i < password.length(); i++){
        if (Character.isLetterOrDigit(password.charAt(i))){
            for(int j = 0; j < password.length(); j++) {
        if(Character.isDigit(password.charAt(i))) {
          count++;
          if(count > 1){
             kur = 1;
            }
           }
          } 
         }
        }
      }
      
    }while(kur != 1);
        System.out.println("Password valid!");
  }
}