public class ArcadeMode extends SwerveMode{
    ArcadeMode() {
    }

    public void Left() {
        super.Left();
        this.Forward();
        this.RotateL();
    }

    public void Right() {
        super.Right();
        this.Forward();
        this.RotateR();
    }

    public void L() {
        super.Left();
    }

    public void R() {
        super.Right();
    }
}
