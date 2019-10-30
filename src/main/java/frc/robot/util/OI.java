/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.util;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.subsystems.arm.command.ArmCargoShipCargo;
import frc.robot.subsystems.arm.command.ArmCargoShipCargoBack;
import frc.robot.subsystems.arm.command.ArmRocketLvlOne;
import frc.robot.subsystems.arm.command.ArmRocketLvlOneBack;
import frc.robot.subsystems.arm.command.ArmWithJoystick;
import frc.robot.subsystems.arm.command.SetZero;
import frc.robot.subsystems.climb.command.ClimbCommandDown;
import frc.robot.subsystems.climb.command.ClimbCommandUp;
import frc.robot.subsystems.intake.commands.IntakeCommand;
import frc.robot.subsystems.intake.commands.Outtake;

/**
 * Add your docs here.
 */
public class OI {
    public Joystick driveStick;
    public Joystick climbStick;
    public JoystickButton intakeButton;
    public JoystickButton outtakeButton;
    public JoystickButton armButton;
    public JoystickButton climbButtonUp;
    public JoystickButton climbButtonDown;
    public JoystickButton cargoShipFront;
    public JoystickButton cargoShipBack;
    public JoystickButton rocketLvlOneFront;
    public JoystickButton rocketLvlOneBack;
    public JoystickButton SetZero;


    public OI() {
        driveStick = new Joystick(0);
        climbStick = new Joystick(1);
        
        intakeButton = new JoystickButton(driveStick, 1);
        outtakeButton = new JoystickButton(driveStick, 2);

        armButton = new  JoystickButton(climbStick, 1);
        SetZero = new JoystickButton(climbStick, 4);
        cargoShipFront = new JoystickButton(climbStick, 5); 
        cargoShipBack = new JoystickButton(climbStick, 6);
        rocketLvlOneFront = new JoystickButton(climbStick, 7);
        rocketLvlOneBack = new JoystickButton(climbStick, 8);

        climbButtonUp = new JoystickButton(climbStick, 2);
        climbButtonDown = new JoystickButton(climbStick, 3);

        intakeButton.whileHeld(new IntakeCommand());
        outtakeButton.whileHeld(new Outtake());

        SetZero.whenPressed(new SetZero());
        armButton.whileHeld(new ArmWithJoystick());
        cargoShipFront.whenPressed(new ArmCargoShipCargoBack());
        cargoShipBack.whenPressed(new ArmCargoShipCargo());
        rocketLvlOneFront.whenPressed(new ArmRocketLvlOne());
        rocketLvlOneBack.whenPressed(new ArmRocketLvlOneBack());

        climbButtonUp.whileHeld(new ClimbCommandUp());
        climbButtonDown.whileHeld(new ClimbCommandDown());

        
    }
}
