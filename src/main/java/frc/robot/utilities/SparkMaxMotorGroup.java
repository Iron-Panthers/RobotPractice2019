package frc.robot.utilities;

public class SparkMaxMotorGroup {
    private CANSparkMax leaderMotor;
    private CANSparkMax followerMotor;
    //instance variables

    public SparkMotorGroup(CANSparkMax leaderMotor, CANSparkMax ... followerMotors) {
        // "..." is an array
        this.leaderMotor = leaderMotor;
        this.followerMotor = followerMotor;
        this.followerMotor.follow(leaderMotor);
    }

    public void set(double power) {
        leaderMotor.set(power);
    }

    public void setInverted(boolean isInverted); {
    leaderMotor.setInverted(isInverted);
    followerMotor.setInverted(isInverted);
    }
}