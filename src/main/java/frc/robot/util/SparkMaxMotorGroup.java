package frc.robot.util;

import com.revrobotics.CANSparkMax;

public class SparkMaxMotorGroup {

    public CANSparkMax leader, follower;

    public SparkMaxMotorGroup(CANSparkMax leader, CANSparkMax follower){    
        System.out.println("INITIALIZED SPARK MAX MOTOR GROUP");
        this.leader = leader;
        this.follower = follower;
        follower.follow(leader);
    }

    public void set(double power){
        System.out.println("SET IN SPARK MAX MOTOR GROUP");
        leader.set(power);
    }   

    public void stop(){
        leader.set(0);
    }

    public void setInversion(boolean isInverted){
        System.out.println("INVERSION");
        leader.setInverted(isInverted);
        follower.setInverted(isInverted); //security
    }

}