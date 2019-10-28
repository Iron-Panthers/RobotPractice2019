package frc.robot.util;

import com.revrobotics.CANSparkMax;

public class SparkMaxMotorGroup {

    public CANSparkMax driveLeader, driveFollower;

    public SparkMaxMotorGroup(CANSparkMax leader, CANSparkMax follower){    
        this.driveLeader = leader;
        this.driveFollower = follower;
        follower.follow(leader);
    }

    public void set(double power){
        driveLeader.set(power);
    }   

    public void stop(){
        driveLeader.set(0);
    }
    
    public void setInversion(boolean isInverted){
        driveLeader.setInverted(isInverted);
        driveFollower.setInverted(isInverted); //security
    }

}