
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author barbarazumblick
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        switch (n1){
            case 21:
                System.out.print("Rio de Janeiro");
                break;
            default:
                System.out.print("DDD nao cadastrado");
        }
        
        // TODO code application logic here
    }
    
}
