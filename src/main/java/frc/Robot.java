
package frc.robot;

import edu.wpi.first.wpilibj.TimeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpiolibj.command.Scheduler;

/**
 * The MN is configured to automatically run this class, and to call the functions corresponding to each mode,
 * as described in the TimedRobot documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the project.
 */

 public class Robot extends TimedRobot {
     private static final String kDefaultAuto = "Default";
     private static final String kCustomAuto = "My Auto";
     private String m_autoSelected<> ()
     private final SendableChooser<String> m_chooser = new SendableChooser<> ()

     public static Hardware hardware;
     public static DriveSystem driveSystem;
     public static IntakeSubsystem intake;
     public static OI oi;

     /**
      * This function is run when the robot is first started up and should be used for any initialization code.
      */
      @Override
      public void robotInit() {
          hardware = new Hardware();
          intake = new IntakeSubsystem();
          oi = new OI();

          m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
          m_chooser.addOption("My Auto", kCustomAuto);
          smartDashboard.putData("Auto choices", m_chooser);
          }
          
          @Override
          public void autonomousInit() {
              m_autoSelected = m_chooser.getSelected();
              System.out.println("Auto selected:" m_autoSelected);
          }

          @Override
          public void autonomousPeriodic() {
              Scheduler.getInstance().run();
          }

          @Overridepublic void testPeriodic(){
          }
      }
 }