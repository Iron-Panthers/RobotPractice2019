package frc.robot.util;

import com.revrobotics.CANSparkMax;

public class SparkMaxMotorGroup {
    private CANSparkMax leaderMotor;
    private CANSparkMax followerMotor;

    public SparkMaxMotorGroup(CANSparkMax leaderMotor, CANSparkMax followerMotor){
        this.leaderMotor = leaderMotor;
        this.followerMotor = followerMotor;
        this.followerMotor.follow(leaderMotor);
    }   

    public void set(double power){
        leaderMotor.set(power);
    }                                   
    
    public void setInversion(boolean isInverted){
        leaderMotor.setInverted(isInverted);
        followerMotor.setInverted(isInverted); //security
    }
}