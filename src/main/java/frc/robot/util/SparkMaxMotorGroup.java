package frc.robot.util;

import com.revrobotics.CANSparkMax;

public class SparkMaxMotorGroup {
    private CANSparkMax leaderMotor;
    private CANSparkMax followerMotor;

    public SparkMaxMotorGroup(CANSparkMax leaderMotor, CANSparkMax followerMotor) {
        this.leaderMotor = leaderMotor;
        this.followerMotor = followerMotor;
        this.followerMotor.follow(leaderMotor);
    }

    public void set(double power) {
        leaderMotor.set(power);
    }

    public void setInverted(boolean isInverted) {
        leaderMotor.setInverted(isInverted);
        followerMotor.setInverted(isInverted);
    }

    public void setStop(boolean isStop)
    {
        leaderMotor.setStop(isStop);

    }
    //this is the SparkMaxMotorGroup Class.....

    

}