/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Hardware;

public class Intake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private TalonSRX intakeMotor;
  private Solenoid hatchFingers;
  private Solenoid hatchThrowing;

  public Intake(){
    intakeMotor = Hardware.intakeMotor;
    hatchFingers = Hardware.hatchFingers;
    hatchThrowing = Hardware.hatchThrowing;
  }
  public void intake(double power){
    intakeMotor.set(ControlMode.PercentOutput, Math.abs(power));
  }
  public void hatchIntake(){
    hatchFingers.set(false);
  }
  public void hatchOuttake(){
    hatchFingers.set(true);
  }

  public void extendHatchPistons() {
		hatchThrowing.set(true);
	}

	public void retractHatchPistons() {
		hatchThrowing.set(false);
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
