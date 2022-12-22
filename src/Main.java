import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your mode : \n1. Arcade Mode\n2. Omni Mode\n3. Swerve Mode\n4. Tank Mode");
        Scanner sc = new Scanner(System.in);
        int mode = sc.nextInt();

        switch (mode) {
            case 1:
                System.out.println("Enter your moves from single joystick");
                ArcadeMode arcade = new ArcadeMode();
                arcade.Input();
                break;
            case 2:
                System.out.println("Enter your moves from double joystick");
                OmniMode omni = new OmniMode();
                omni.Input();
                break;
            case 3:
                System.out.println("Enter your moves from single joystick");
                SwerveMode swerve = new SwerveMode();
                swerve.Input();
                break;
            case 4:
                System.out.println("Enter your moves from double joystick");
                TankMode tank = new TankMode();
                tank.Input();
                break;
            default:
                System.out.println("Invalid Mode...\nQuitting the game...");
                System.exit(0);
        }
        System.out.println("Hello world!");
    }
}