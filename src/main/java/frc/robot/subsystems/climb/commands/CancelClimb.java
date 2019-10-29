/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.climb.commands;

import frc.robot.Robot; 

import edu.wpi.first.wpilibj.command.InstantCommand;

public class CancelClimb extends InstantCommand {
  /**
   * CancelClimb stops the climb when called
   */
  public CancelClimb() {
    requires(Robot.climb); 
  }

  @Override
  protected void initialize() {
    Robot.climb.cancelClimb(); 
  }
}
