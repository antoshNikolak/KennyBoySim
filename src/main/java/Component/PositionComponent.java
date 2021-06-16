package Component;

public class PositionComponent extends Component {
    private double x, y;

    public PositionComponent(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void incrementX(double velX){
        this.x+= velX;
    }

    public void incrementY(double velY){
        this.y+= velY;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


}
