/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Hardware;
import frc.robot.SparkMaxMotorGroup;

/**
 * Add your docs here.
 */
public class Climb extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private SparkMaxMotorGroup climbGroup1, climbGroup2, climbGroup3;

  public Climb(){
    climbGroup1 = new SparkMaxMotorGroup(Hardware.climbMotor1, Hardware.climbMotor2);
    climbGroup2 = new SparkMaxMotorGroup(Hardware.climbMotor3, Hardware.climbMotor4);
    climbGroup3 = new SparkMaxMotorGroup(Hardware.climbMotor5, Hardware.climbMotor6);
  }
  public void set(double speed) {
    climbGroup1.set(speed);
    climbGroup2.set(speed);
    climbGroup3.set(speed);
  }
  public void stop(){
    climbGroup1.stop();
    climbGroup2.stop();
    climbGroup3.stop();
  }
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}