package System;

public class PhysicsSystem extends BaseSystem {
    private double delta;

    public PhysicsSystem() {
       super();
    }



    @Override
    public void executeTask(double delta) {
//        double delta = (double) (now - then) / 1000000000f;

    }

    public void setDelta(double delta) {
        this.delta = delta;
    }
}
