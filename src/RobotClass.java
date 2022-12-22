public class RobotClass {
    protected int x = 0, y = 0, d = 0;
    RobotClass(){}

    public void checkBounds() {
        if(this.x < 0 || this.y < 0 || this.x > 4 || this.y > 4) {
            System.out.println("Robot out of grid.");
            System.exit(0);
        }
    }

    public void Forward() {
        switch(this.d) {
            case 0:
                ++this.y;
                break;
            case 1:
                ++this.x;
                break;
            case 2:
                --this.y;
                break;
            case 3:
                --this.x;
        }
        this.checkBounds();
    }
    public void Backward() {
        switch(this.d) {
            case 0:
                --this.y;
                break;
            case 1:
                --this.x;
                break;
            case 2:
                ++this.y;
                break;
            case 3:
                ++this.x;
        }
        this.checkBounds();
    }

    public void Left() {
        switch(this.d) {
            case 0:
                --this.x;
                break;
            case 1:
                ++this.y;
                break;
            case 2:
                ++this.x;
                break;
            case 3:
                --this.x;
        }
        this.checkBounds();
    }

    public void Right() {
        switch(this.d) {
            case 0:
                ++this.x;
                break;
            case 1:
                --this.y;
                break;
            case 2:
                --this.x;
                break;
            case 3:
                ++this.y;
        }
        this.checkBounds();
    }

    public void RotateL() {
        this.d = (this.d + 3) % 4;
    }

    public void RotateR() {
        this.d = (this.d + 1) % 4;
    }

    public void get() {
        String direction;
        switch (this.d) {
            case 0:
                direction = "E";
                break;
            case 1:
                direction = "S";
                break;
            case 2:
                direction = "W";
                break;
            case 3:
                direction = "N";
                break;
            default:
                direction = "Invalid Move";
        }
        System.out.println("(" + this.x + "," + this.y + ") " + direction);
    }
}
