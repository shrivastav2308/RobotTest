import java.io.File;
import java.util.Scanner;
public class TankMode extends ArcadeMode{
    TankMode(){}

    public void Actions(String str) {
        if (str.equals("F, F")) this.Forward();
        else if (str.equals("B, B")) this.Backward();
        else if (str.equals("F, B")) this.RotateR();
        else if (str.equals("B, F")) this.RotateL();
        this.get();
    }
    public void Input() {
        File text = new File("Double.txt");
        Scanner sc = new Scanner(System.in);
        this.get();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if(line.length() == 4) {
                this.Actions(line);
            }
            else {
                System.out.println("Invalid Input");
            }
        }
    }
}
