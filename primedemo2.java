    import javax.swing.JOptionPane;

import org.xml.sax.InputSource;
public class primedemo2{

    // java program that prompts user to input a number in a dialog box and check if the number is a prime or not
    public static void main(String[] args){
        int num;
        int temp;

        boolean isPrime =true;

        //prompt user to input a number
        num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

        for(int i=2; i<=num/2; i++){
            temp=num%i;
            if(temp==0){
                isPrime=false;
                break;

            }
         }
         //checkin and checking if user number is prime number or not
         if(isPrime)
         JOptionPane.showMessageDialog(null,  num + "  is a prime number");
         else
         JOptionPane.showMessageDialog(null, num + "  is not a prime number");

         

    }
}