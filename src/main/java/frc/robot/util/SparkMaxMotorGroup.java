package frc.robot.util;

import com.revrobotics.CANSparkMax;

public class SparkMaxMotorGroup {

    public CANSparkMax driveLeader, driveFollower;

    public SparkMaxMotorGroup(CANSparkMax leader, CANSparkMax follower){    
        System.out.println("INITIALIZED SPARK MAX MOTOR GROUP");
        this.driveLeader = leader;
        this.driveFollower = follower;
        follower.follow(leader);
    }

    public void set(double power){
        System.out.println("SET IN SPARK MAX MOTOR GROUP");
        driveLeader.set(power);
    }   

    public void stop(){
        driveLeader.set(0);
    }

    
    public void setInversion(boolean isInverted){
        System.out.println("INVERSION");
        driveLeader.setInverted(isInverted);
        driveFollower.setInverted(isInverted); //security
        
        
    }

}