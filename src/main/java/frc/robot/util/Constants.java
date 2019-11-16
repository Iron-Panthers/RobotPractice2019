package frc.robot.util;

public class Constants {
    public class Arm {
        public static final int INTAKE_ARM_MOTOR_PORT = 6;
		public static final int INTAKE_MOTOR_PORT = 4;

		public static final int HATCH_PISTON_SOLENOID_PORT = 2;
		public static final int HATCH_EXTENDER_PISTON_SOLENOID_PORT = 0;

		public static final boolean IS_INTAKE_INVERTED = true;

		// INTAKE JOYSTICK - TODO Tune To Driver Preference
		public static final double Y_DEADZONE = 0.1;
		public static final double SLOW_Y_DEADZONE = 0.7; // Deadzone for fine control
		public static final double SLOW_POWER_SCALE = 0.2; // Power scale for fine control
		public static final double POWER_SCALE = 0.7; // Should be greater than SLOW_POWER_SCALE

		// INTAKE ARM SETPOINTS - TODO Double Check Measurements
		public static final double TICKS_TO_DEGREES = 360.0 / (4096.0 * 4.0); // 360 / (ticks per rotation * sprocket
																				// ratio)
		public static final double BASE_ANGLE_OFFSET = -20; // degrees
		public static final double CARGO_DIAMETER = 13; // in
		public static final double ARM_LENGTH = 27.4; // in
		public static final double ARM_BASE_HEIGHT = 18.75; // in
		public static final double HATCH_HEIGHT = 16.0 - ARM_BASE_HEIGHT; // May not be used, can just use the bottom
																			// instead
		public static final double HATCH_HOLDING_HEIGHT = 18.75 - ARM_BASE_HEIGHT;// Value for lifting the intake to
																					// hold and also score the hatch.
																					// TODO: test value - may not be
																					// accurate
		public static final double CARGO_SHIP_HEIGHT = 39.0 - ARM_BASE_HEIGHT + CARGO_DIAMETER; // in
		public static final double ROCKET_LOW_HEIGHT = 34.0 - ARM_BASE_HEIGHT; // in
		public static final double CARGO_SHIP_FRONT_BACK_ADJUST = 9; // in
		public static final double DEGRESS_TO_RADIANS = Math.PI / 180;
		public static final double RADIANS_TO_DEGREES = 180 / Math.PI;

		// INTAKE ARM PID
		public static final double INTAKE_ARM_MAX_POWER = 0.35;
		public static final double INTAKE_ARM_P = 0.002; //Robot smoked cause went to fast p is equal to .35(max power we want) divided by 180(max possible error)
		public static final double INTAKE_ARM_I = 0;
		public static final double INTAKE_ARM_D = 0;
		public static final double ERROR_TOLERANCE = 3; // degrees
		public static final long ERROR_TOLERANCE_TIME = 100; // ms
		public static final double STALL_TORQUE_COEFFICIENT = -0.09;

		// INTAKE
		public static final double INTAKE_POWER = 0.5; // TODO Find Best Power
		public static final double OUTTAKE_POWER = -0.7;
		public static final double FAST_OUTTAKE_POWER = -1.0; // For Level 2 Rocket
		public static final double SLOW_OUTTAKE_POWER = -0.5; // For close cargo ship
		public static final double RETRACT_HATCH_PISTON_DELAY = 0.1;
	}    
}