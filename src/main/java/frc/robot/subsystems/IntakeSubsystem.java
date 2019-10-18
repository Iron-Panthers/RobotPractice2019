/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;

public class IntakeSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private TalonSRX intakeMotor;
  public IntakeSubsystem(){
    intakeMotor = Robot.hardware.intakeMotor;
  }
  public void intake(double power){
    intakeMotor.set(ControlMode.PercentOutput, Math.abs(power));
  }
  public void outtake(double power){
    intakeMotor.set(ControlMode.PercentOutput, -Math.abs(power));
  }
  public void stop(){
    intakeMotor.set(ControlMode.PercentOutput, 0);
  }
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
