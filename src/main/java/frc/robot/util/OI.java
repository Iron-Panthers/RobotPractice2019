package frc.robot.util;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.subsystems.drive.commands.ArcadeDrive;
import frc.robot.subsystems.drive.commands.DriveShift;
import frc.robot.subsystems.drive.commands.ReverseDrive;


public class OI {
    public final JoystickWrapper driverAController; 
    public final JoystickButton reverseDrive, driveShift; 

    public OI() {
        /* Driver A */
        driverAController = new JoystickWrapper(0); 
        reverseDrive = new JoystickButton(driverAController, 1); 
        driveShift = new JoystickButton(driverAController, 2); 

        configureButtonBindings(); 
    }

    private void configureButtonBindings() {
        /* Driver A */
        reverseDrive.whileHeld(new ReverseDrive()); 
        driveShift.whileHeld(new DriveShift()); 
        
    }
}
