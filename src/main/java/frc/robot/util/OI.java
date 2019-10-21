/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.util;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.subsystems.drive.Drive;
import frc.robot.subsystems.drive.command.DriveWithJoystick;
import frc.robot.subsystems.intake.commands.IntakeCommand;
import frc.robot.subsystems.intake.commands.Outtake;

/**
 * Add your docs here.
 */
public class OI {
    public Joystick stick1;
    public JoystickButton intakeButton;
    public JoystickButton outtakeButton;
    public OI() {
        stick1 = new Joystick(0);
        intakeButton = new JoystickButton(stick1, 1);
        outtakeButton = new JoystickButton(stick1, 2);
        intakeButton.whileHeld(new IntakeCommand());
        outtakeButton.whileHeld(new Outtake());

    }
}
