/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.util;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.subsystems.arm.commands.ArmWithJoystick;
import frc.robot.subsystems.arm.commands.SetZero;


/**
 * Add your docs here.
 */
public class OI {
    public Joystick armStick;
    public JoystickButton intakeButton, outtakeButton, armButton, setZeroButton;


    public OI() {
        armStick = new Joystick(1);
        
        outtakeButton = new JoystickButton(armStick, 3);
        setZeroButton = new JoystickButton(armStick, 4);
        armButton = new  JoystickButton(armStick, 1);

        setZeroButton.whenPressed(new SetZero());
        armButton.whileHeld(new ArmWithJoystick());
    }
}
