package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ClimbDown;
import frc.robot.commands.ClimbUp;
import frc.robot.commands.ExtendSuperStructure;
import frc.robot.commands.RetractSuperStructure;
import frc.robot.util.Constants;

public class OI {
    public Joystick stick1;
    public JoystickButton climbUpButton, climbDownButton;
    public JoystickButton extendSuperStructureButton, retractSuperStructureButton;

    public OI(){
        stick1 = new Joystick(Constants.STICK_1_PORT);
        climbUpButton = new JoystickButton(stick1, Constants.CLIMB_UP_BUTTON);
        climbDownButton = new JoystickButton(stick1, Constants.CLIMB_DOWN_BUTTON);
        extendSuperStructureButton = new JoystickButton(stick1, Constants.EXTEND_SUPER_STRUCTURE_BUTTON);
        retractSuperStructureButton = new JoystickButton(stick1, Constants.RETRACT_SUPER_STRUCTURE_BUTTON);

        climbUpButton.whileHeld(new ClimbUp());
        climbDownButton.whileHeld(new ClimbDown());
        extendSuperStructureButton.whileHeld(new ExtendSuperStructure());
        retractSuperStructureButton.whileHeld(new RetractSuperStructure());
    }
}