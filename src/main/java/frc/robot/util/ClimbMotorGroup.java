
package frc.robot.util;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;

public class ClimbMotorGroup {

    public CANSparkMax climbLeader, climbFollower1, climbFollower2;

    public ClimbMotorGroup(CANSparkMax leader, CANSparkMax follower1, CANSparkMax follower2) {
        this.climbLeader = leader;
        this.climbFollower1 = follower1;
        this.climbFollower2 = follower2;

        follower1.follow(climbLeader);
        follower2.follow(climbLeader);
    }

    public void set(double power) {
        climbLeader.set(power);
    }

    public void stop() {
        climbLeader.set(0);
    }

    public void setInversion(boolean isInverted) {
        System.out.println("INVERSION");
        climbLeader.setInverted(isInverted);
        climbFollower1.setInverted(isInverted);
        climbFollower2.setInverted(isInverted);

    }

    public void setEncoderPosition(){
        climbLeader.getEncoder().setPosition(Constants.ENCODER_POSITION);
        climbFollower1.getEncoder().setPosition(Constants.ENCODER_POSITION);
        climbFollower2.getEncoder().setPosition(Constants.ENCODER_POSITION);
    }

    public CANEncoder getLeaderEncoder() {
        return climbLeader.getEncoder();
    }

    public CANEncoder getFollower1Encoder() {
        return climbFollower1.getEncoder();
    }

    public CANEncoder getFollower2Encoder() {
        return climbFollower2.getEncoder();
    }

}