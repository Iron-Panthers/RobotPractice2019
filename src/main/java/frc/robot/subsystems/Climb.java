/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.util.ClimbMotorGroup;
import frc.robot.util.Constants;

/**
 * Add your docs here.
 */
public class Climb extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private ClimbMotorGroup leftGroup, rightGroup;
  private DigitalInput forwardLimit, backwardsLimit;

  public Climb(){
    leftGroup = new ClimbMotorGroup(Robot.hardware.leftClimbLeader, Robot.hardware.leftClimbFollower1, Robot.hardware.leftClimbFollower2);
    rightGroup = new ClimbMotorGroup(Robot.hardware.rightClimbLeader, Robot.hardware.rightClimbFollower1, Robot.hardware.rightClimbFollower2);
    rightGroup.setInversion(Constants.IS_RIGHT_INVERTED);
    leftGroup.setInversion(Constants.IS_LEFT_INVERTED);
    this.forwardLimit = Robot.hardware.forwardLimit;
    this.backwardsLimit = Robot.hardware.backwardsLimit;
  }

  public void setClimbUp(){
    if(this.backwardsLimit.get()){
      leftGroup.set(0);
      rightGroup.set(0);
      
      leftGroup.setEncoderPosition(Constants.ENCODER_POSITION);
      rightGroup.setEncoderPosition(Constants.ENCODER_POSITION);
    } else {
      leftGroup.set(Constants.CLIMB_DOWN_POWER);
      rightGroup.set(Constants.CLIMB_DOWN_POWER);
    }
  }

  public void setClimbDown(){
    if(this.forwardLimit.get()){
      leftGroup.stop();
      rightGroup.stop();

      leftGroup.getLeaderEncoder().setPosition(Constants.ENCODER_POSITION);
      rightGroup.getLeaderEncoder().setPosition(Constants.ENCODER_POSITION);
    } else{
      leftGroup.set(Constants.CLIMB_UP_POWER);
      rightGroup.set(Constants.CLIMB_UP_POWER);
    }
  }

  public void stop(){
    leftGroup.stop();
    rightGroup.stop();
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
