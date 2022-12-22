public class OmniMode extends TankMode {
    OmniMode() {}

    public void Actions(String str) {
        if(str.equals("F, F")) this.Forward();
        else if(str.equals("B, B")) this.Backward();
        else if(str.equals("F, B")) this.RotateR();
        else if(str.equals("B, F")) this.RotateL();
        else if(str.equals("L, L")) this.L();
        else if(str.equals("R, R")) this.R();
        else if(str.charAt(0) == 'F' && str.length() == 4) this.Right();
        else if(str.charAt(3) == 'F') this.Left();
        this.get();
    }
}
