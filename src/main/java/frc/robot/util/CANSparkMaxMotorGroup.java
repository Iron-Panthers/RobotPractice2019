package frc.robot.util;

import com.revrobotics.CANSparkMax;

public class CANSparkMaxMotorGroup {

    public CANSparkMax leaderMotor, followerMotor;

    public CANSparkMaxMotorGroup(CANSparkMax leaderMotor, CANSparkMax followerMotor){
        this.leaderMotor = leaderMotor;
        this.followerMotor = followerMotor;
        
        followerMotor.follow(leaderMotor);
    }

    public void set(double power){
        leaderMotor.set(power);
    }

    public void stop(){
        leaderMotor.set(0);
    }
}