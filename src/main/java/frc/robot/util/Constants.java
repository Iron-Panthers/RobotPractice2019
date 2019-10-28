package frc.robot.util;

public class Constants{
    //drive ports
    public static int LEFT_LEADER_PORT = 2;
    public static int LEFT_FOLLOWER_PORT = 22;
    public static int RIGHT_LEADER_PORT = 1;
    public static int RIGHT_FOLLOWER_PORT = 21;
    public static int RIGHT_CLIMB_L_PORT = 11;
    public static int RIGHT_CLIMB_F1_PORT = 12;
    public static int RIGHT_CLIMB_F2_PORT = 13;
    public static int LEFT_CLIMB_L_PORT = 8;
    public static int LEFT_CLIMB_F1_PORT = 9;
    public static int LEFT_CLIMB_F2_PORT = 10;

    //subsystem ports
    public static int INTAKE_PORT = 6;
    public static int ARM_PORT = 4;

    //stick ports
    public static int STICK_1_PORT = 2;
    public static int DRIVE_STICK_PORT = 0;

    //buttons
    public static int INTAKE_BUTTON = 5;
    public static int OUTTAKE_BUTTON = 3;
    public static int CLIMB_UP_BUTTON = 1;
    public static int CLIMB_DOWN_BUTTON = 2;

    //powers
    public static double INTAKE_POWER = 0.3;
    public static double OUTTAKE_POWER = 0.3;
    public static double CLIMB_DOWN_POWER = -0.25;
    public static double CLIMB_UP_POWER = 0.25;

    //inversions
    public static boolean IS_RIGHT_INVERTED = true;
    public static boolean IS_LEFT_INVERTED = false;

    //encoder position
    public static double ENCODER_POSITION = 140;
}