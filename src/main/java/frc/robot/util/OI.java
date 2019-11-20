package frc.robot.util;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.subsystems.drive.commands.ArcadeDrive;
import frc.robot.subsystems.drive.commands.DriveShift;
import frc.robot.subsystems.drive.commands.ReverseDrive;


public class OI {
    // Joystick for tele-op input 
    public JoystickWrapper stick1;

    // buttons for Driver 1
    JoystickButton reverseDrive, shiftGearLow, goForward; 

    public OI() {
        // initializing Joystick
        stick1 = new JoystickWrapper(Constants.Input.JOYSTICK_1_PORT); 
        
        // initializing buttons for Driver 1
        reverseDrive = new JoystickButton(stick1, Constants.Input.REVERSE_DRIVE_BUTTON); 
        shiftGearLow = new JoystickButton(stick1, Constants.Input.SHIFT_GEAR_LOW_BUTTON); 
        goForward = new JoystickButton(stick1, Constants.Input.GO_FORWARD_BUTTON); 

        // Driver 1 assignment of commands to buttons
        reverseDrive.whileHeld(new ReverseDrive()); 
        shiftGearLow.whileHeld(new DriveShift()); 
        goForward.whileHeld(new ArcadeDrive()); 
    }
}
