/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
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
  private ClimbMotorGroup left, right;
  private DigitalInput climbUpLimit, climbDownLimit;
  private Solenoid superStructure;

  public Climb(){
    left = new ClimbMotorGroup(Robot.hardware.lClimbLead, Robot.hardware.lClimbF1, Robot.hardware.lClimbF2);
    right = new ClimbMotorGroup(Robot.hardware.rClimbLead, Robot.hardware.rClimbF1, Robot.hardware.rClimbF2);
    climbUpLimit = Robot.hardware.climbUpLimit;
    climbDownLimit = Robot.hardware.climbDownLimit;
    superStructure = Robot.hardware.superStructure;
  }

  //climbing
  public void climbUp(){
    if(climbUpLimit.get()){
      left.stop();
      right.stop();
      
      left.setEncoderPosition(Constants.CLIMB_UP_ENCODER_POS);
      right.setEncoderPosition(Constants.CLIMB_UP_ENCODER_POS);
    } else {
      left.set(Constants.CLIMB_UP_POWER);
      right.set(Constants.CLIMB_UP_POWER);
    }
  }

  public void climbDown(){
    if(climbDownLimit.get()){
      left.stop();
      right.stop();
      
      left.setEncoderPosition(Constants.CLIMB_DOWN_ENCODER_POS);
      right.setEncoderPosition(Constants.CLIMB_DOWN_ENCODER_POS);
    } else {
      left.set(Constants.CLIMB_DOWN_POWER);
      right.set(Constants.CLIMB_DOWN_POWER);
    }
  }

  public void stopClimb(){
    left.stop();
    right.stop();
  }

  //winch motors
  public void lowerWinch(TalonSRX winch){
    winch.set(ControlMode.PercentOutput, -Constants.WINCH_OUTPUT);
  }

  public void raiseWinch(TalonSRX winch){
    winch.set(ControlMode.PercentOutput, Constants.WINCH_OUTPUT);
  }

  public void stopWinch(TalonSRX winch){
    winch.set(ControlMode.PercentOutput, 0);
  }

  //super structure
  public void extendSuperStructure(){
    superStructure.set(true);
  }

  public void retractSuperStructure(){
    superStructure.set(false);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
