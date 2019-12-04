package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ClimbDown;
import frc.robot.commands.ClimbUp;
import frc.robot.commands.ExtendSuperStructure;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.IntakeHatch;
import frc.robot.commands.Outtake;
import frc.robot.commands.OuttakeHatch;
import frc.robot.commands.RetractSuperStructure;
import frc.robot.util.Constants;
public class OI {
    public Joystick stick1;
  public Joystick stick2;
    public JoystickButton climbUpButton, climbDownButton;
    public JoystickButton extendSuperStructureButton, retractSuperStructureButton;
  public JoystickButton intakeButton;
  public JoystickButton outtakeButton;
  public JoystickButton intakeHatchButton;
  public JoystickButton outtakeHatchButton;

    public OI(){
        stick1 = new Joystick(Constants.STICK_1_PORT);
    stick2 = new Joystick(Constants.JOYSTICK_PORT);
        climbUpButton = new JoystickButton(stick1, Constants.CLIMB_UP_BUTTON);
        climbDownButton = new JoystickButton(stick1, Constants.CLIMB_DOWN_BUTTON);
        extendSuperStructureButton = new JoystickButton(stick1, Constants.EXTEND_SUPER_STRUCTURE_BUTTON);
        retractSuperStructureButton = new JoystickButton(stick1, Constants.RETRACT_SUPER_STRUCTURE_BUTTON);
    intakeButton = new JoystickButton(stick2, Constants.JOYSTICK_INTAKE_BUTTON_PORT);
    outtakeButton = new JoystickButton(stick2, Constants.JOYSTICK_OUTTAKE_BUTTON_PORT);
    intakeHatchButton = new JoystickButton(stick2, Constants.INTAKE_HATCH_BUTTON);
    outtakeHatchButton = new JoystickButton(stick2, Constants.OUTTAKE_HATCH_BUTTON);

        climbUpButton.whileHeld(new ClimbUp());
        climbDownButton.whileHeld(new ClimbDown());
        extendSuperStructureButton.whileHeld(new ExtendSuperStructure());
        retractSuperStructureButton.whileHeld(new RetractSuperStructure());
    intakeHatchButton.whileHeld(new IntakeHatch());
    outtakeHatchButton.whileHeld(new OuttakeHatch());
    intakeButton.whileHeld(new IntakeCommand());
    outtakeButton.whileHeld(new Outtake());
  }
}