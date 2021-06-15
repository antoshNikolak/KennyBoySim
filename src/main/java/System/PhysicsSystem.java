package System;

public class PhysicsSystem extends BaseSystem {
    private double delta;

    public PhysicsSystem() {
       super();
    }


    @Override
    public void executeTask(double delta) {

    }

    public void setDelta(double delta) {
        this.delta = delta;
    }
}
