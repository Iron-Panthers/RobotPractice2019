public class SparkMaxMotorGroup {
    private CANSparkMax leaderMotor;
    private CANSparkMax followerMotor;

    public SparkMaxMotorGroup(CANSparkMax leaderMotor, CANSparkMax followerMotor) {
        this.leaderMotor = leaderMotor
        this.followerMotor = followerMotor
        this.followerMotor.follower(leaderMotor);
    }

    public void set(double pwer) {
        leaderMotor.set(power);
    }

    public void setInverted(boolean isInverted) {
        leaderMotor.setInverted(isInverted);
        followerMotor.setInverted(isInverted);
    }
}