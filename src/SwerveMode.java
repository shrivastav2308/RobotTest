import java.io.File;
import java.util.Scanner;

public class SwerveMode extends RobotClass{
    SwerveMode() {}

    public void Actions(char c) {
        switch (c) {
            case 'B':
                this.Backward();
                break;
            case 'F':
                this.Forward();
                break;
            case 'L':
                this.Left();
                break;
            case 'R':
                this.Right();
                break;
            default:
                System.out.println("Invalid move");
        }
        this.get();
    }

    public void Input() {
        File text = new File("Single.txt");
        Scanner sc = new Scanner(System.in);
        this.get();

        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            if(line.length() == 1) this.Actions(line.charAt(0));
            else System.out.println("Invalid Move");
        }
    }
}
