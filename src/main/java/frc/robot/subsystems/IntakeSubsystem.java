/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class IntakeSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private TalonSRX intakeMotor;

  // Class constructor
  public IntakeSubsystem() {
    intakeMotor = Robot.hardware.intakeMotor;
  }

  // Moves the motor forward
  public void intake(double power) {
    intakeMotor.set(ControlMode.PercentOutput, Math.abs(power));
  }

  // Moves the motor backwards
  public void outtake(double power) {
    intakeMotor.set(ControlMode.PercentOutput, -Math.abs(power));
  }

  // Stops the motor
  public void stop() {
    intakeMotor.set(ControlMode.PercentOutput, 0);
  }

  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
