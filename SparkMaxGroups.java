package frc.robot.util;

import com.revrobotics.CANSparkMax;

public class SparkMaxGroups{
    private CANSparkMax mainMotor;
    private CANSparkMax notMainMotor;

    public SparkMaxGroups(CANSparkMax mainMotor, CANSparkMax notMainMotor){
        this.mainMotor = mainMotor;
        this.notMainMotor = notMainMotor;
        this.notMainMotor.follow(mainMotor);
    }

    public void setPower (double power){
        mainMotor.set(power);
    }

    public void setInverted(boolean isInverted) {
        leaderMotor.setInverted(isInverted);
        followerMotor.setInverted(isInverted);
    }
}