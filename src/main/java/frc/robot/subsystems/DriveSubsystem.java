public class DriveSystem extends Subsystem {

    private SparkMaxMotorGroup left, right;

    public DriveSystem() {
        left = new MotorGroup
    }

    public void setOpenLoop(double leftSpeed, double rightSpeed) {
        left.set(leftSpeed);
        right.set(rightSpeed);
    }

    public void setNeutral() {
        left.set(0,0);
        right.set(0,0);
    }

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new ManualDriveCommand());
    }
}