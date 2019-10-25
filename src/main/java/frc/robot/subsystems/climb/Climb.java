/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.climb;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Hardware;

/**
 * Add your docs here.
 */
public class Climb extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private DigitalInput limFoward;
  private DigitalInput limReverse;
  public CANSparkMax climbLeftMotor1;
	public CANSparkMax climbLeftMotor2;
	public CANSparkMax climbLeftMotor3;
	public CANSparkMax climbRightMotor1;
	public CANSparkMax climbRightMotor2;
	public CANSparkMax climbRightMotor3;
	public TalonSRX leftWinchMotor;
	public TalonSRX rightWinchMotor;
  public Climb() {
    limFoward = Hardware.forwardLimit;
    limReverse = Hardware.reverseLimit;
    climbLeftMotor1 = Hardware.climbLeftMotor1;
    climbLeftMotor2 = Hardware.climbLeftMotor2;
    climbLeftMotor3 = Hardware.climbLeftMotor3;
    climbRightMotor1 = Hardware.climbRightMotor1;
    climbRightMotor2 = Hardware.climbRightMotor2;
    climbRightMotor3 = Hardware.climbRightMotor3;
    leftWinchMotor = Hardware.leftWinchMotor;
    rightWinchMotor = Hardware.rightWinchMotor;
  }
  public void stop() {
      this.climbLeftMotor1.set(0);
      this.climbLeftMotor2.set(0);
      this.climbLeftMotor3.set(0);
      this.climbRightMotor1.set(0);
      this.climbRightMotor2.set(0);
      this.climbRightMotor3.set(0);
  }
  public void climbUp() {
    if (this.limFoward.get()) {
			// Stop climbing, and indicate the climb has stopped
      this.climbLeftMotor1.set(0);
      this.climbLeftMotor2.set(0);
      this.climbLeftMotor3.set(0);
      this.climbRightMotor1.set(0);
      this.climbRightMotor2.set(0);
      this.climbRightMotor3.set(0);

      this.climbLeftMotor1.getEncoder().setPosition(140);
			this.climbLeftMotor2.getEncoder().setPosition(140);
      this.climbLeftMotor3.getEncoder().setPosition(140);
      this.climbRightMotor1.getEncoder().setPosition(140);
      this.climbRightMotor2.getEncoder().setPosition(140);
      this.climbRightMotor3.getEncoder().setPosition(140);
		} else {
      this.climbLeftMotor1.set(0.25);
      this.climbLeftMotor2.set(0.25);
      this.climbLeftMotor3.set(0.25);
      this.climbRightMotor1.set(0.25);
      this.climbRightMotor2.set(0.25);
      this.climbRightMotor3.set(0.25);		}
  }
  public void climbDown() {
    if (this.limReverse.get()) {
			// Stop climbing, and indicate the climb has stopped
      this.climbLeftMotor1.set(0);
      this.climbLeftMotor2.set(0);
      this.climbLeftMotor3.set(0);
      this.climbRightMotor1.set(0);
      this.climbRightMotor2.set(0);
      this.climbRightMotor3.set(0);

      this.climbLeftMotor1.getEncoder().setPosition(140);
			this.climbLeftMotor2.getEncoder().setPosition(140);
      this.climbLeftMotor3.getEncoder().setPosition(140);
      this.climbRightMotor1.getEncoder().setPosition(140);
      this.climbRightMotor2.getEncoder().setPosition(140);
      this.climbRightMotor3.getEncoder().setPosition(140);
		} else {
      this.climbLeftMotor1.set(-0.25);
      this.climbLeftMotor2.set(-0.25);
      this.climbLeftMotor3.set(-0.25);
      this.climbRightMotor1.set(-0.25);
      this.climbRightMotor2.set(-0.25);
      this.climbRightMotor3.set(-0.25);		
    }
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
