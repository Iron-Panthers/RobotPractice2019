package frc.robot.util;

import com.revrobotics.CANSparkMax;

public class SparkMaxMotorGroup {

    public CANSparkMax leader, follower;

    public SparkMaxMotorGroup(CANSparkMax leader, CANSparkMax follower){    
        this.leader = leader;
        this.follower = follower;
        follower.follow(leader);
    }

    public void set(double power){
        leader.set(power);
    }   

    public void stop(){
        leader.set(0);
    }

    public void setInversion(boolean isInverted){
        leader.setInverted(isInverted);
        follower.setInverted(isInverted); //security
    }

}