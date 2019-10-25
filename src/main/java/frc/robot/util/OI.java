/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.util;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.subsystems.arm.command.ArmWithJoystick;
import frc.robot.subsystems.climb.command.ClimbCommandDown;
import frc.robot.subsystems.climb.command.ClimbCommandUp;
import frc.robot.subsystems.intake.commands.IntakeCommand;
import frc.robot.subsystems.intake.commands.Outtake;

/**
 * Add your docs here.
 */
public class OI {
    public Joystick stick1;
    public Joystick joystickVroom;
    public JoystickButton intakeButton;
    public JoystickButton outtakeButton;
    public JoystickButton armButton;
    public JoystickButton climbButtonUp;
    public JoystickButton climbButtonDown;
    public OI() {
        stick1 = new Joystick(0);
        joystickVroom = new Joystick(1);
        armButton = new  JoystickButton(joystickVroom, 1);
        intakeButton = new JoystickButton(stick1, 1);
        outtakeButton = new JoystickButton(stick1, 2);
        climbButtonUp = new JoystickButton(joystickVroom, 2);
        climbButtonDown = new JoystickButton(joystickVroom, 3);
        intakeButton.whileHeld(new IntakeCommand());
        outtakeButton.whileHeld(new Outtake());
        armButton.whileHeld(new ArmWithJoystick());
        climbButtonUp.whileHeld(new ClimbCommandUp());
        climbButtonDown.whileHeld(new ClimbCommandDown());
    }
}
