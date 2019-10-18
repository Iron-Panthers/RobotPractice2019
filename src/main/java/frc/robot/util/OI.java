/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.util;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Add your docs here.
 */
public class OI {
    public Joystick stick1;
    public JoystickButton intakeButton;
    public JoystickButton outtakeButton;
    public OI() {
        stick1 = new Joystick(1);
        intakeButton = new JoystickButton(stick1, 1);
        outtakeButton = new JoystickButton(stick1, 2);
    }
}
