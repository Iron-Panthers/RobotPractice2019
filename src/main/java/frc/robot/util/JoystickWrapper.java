package frc.robot.util;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;

/**
 * A wrapper which extends WPILib Joystick (which in turn extends GenericHID).
 * It consists of methods that calculate desired drive output based on
 * tele-operated controller input.
 * <p>
 * If you want to get the actual axes of a JoystickWrapper, use the inherited
 * methods getX() and getY() as usual.
 */
public class JoystickWrapper extends Joystick {
	private double x; // this does not reflect the physical joystick X-axis
	private double y; // this does not reflect the physical joystick Y-axis

	/**
	 * Creates a new JoystickWrapper. Port is the USB port of the physical device,
	 * starting at 0.
	 */
	public JoystickWrapper(int port) {
		super(port);
		x = 0;
		y = 0;
	}

	/**
	 * Updates X and Y axes. This should be done before calling
	 * {@link #findLeftPower()} or {@link #findRightPower()}.
	 * <p>
	 * To avoid redundant calls, calling this method should be periodic logic for
	 * tele-operated driving commands.
	 */
	public void update() {
		// Update X and Y to match the X and Y axes of the device
		x = getX();
		y = getY();
		SmartDashboard.putNumber("JoystickWrapper -- Raw X: ", x);
		SmartDashboard.putNumber("JoystickWrapper -- Raw Y: ", y);

		// Our joystick has unusual behavior so we must do this
		x = -1 * x;
	}

	/**
	 * Calculates the left power. Before using this method, ensure you have recently
	 * used {@link #update()}.
	 */
	public double findLeftPower() {
		double direction = Robot.drive.getReversed() ? -1 : 1;
		// A slight modification of the traditional arcade drive calculation
		// Makes X-axis nonlinear, adds sensitivity constant
		double value = (y * direction) + Math.copySign(Math.pow(Math.abs(x), Constants.SCALING_POWER), x)
				* Constants.TURN_SENSITIVITY;

		if (Constants.IS_DRIVEBASE_BACKWARDS) {
			return -1 * value;
		}
		return value;
	}

	/**
	 * Calculates the right power. Before using this method, ensure you have
	 * recently used {@link #updateMagnitude()}.
	 */
	public double findRightPower() {
		double direction = Robot.drive.getReversed() ? -1 : 1;
		// A slight modification of the traditional arcade drive calculation
		// Makes X-axis nonlinear, adds sensitivity constant
		double value = (y * direction) - Math.copySign(Math.pow(Math.abs(x), Constants.SCALING_POWER), x)
				* Constants.TURN_SENSITIVITY;

		if (Constants.IS_DRIVEBASE_BACKWARDS) {
			return -1 * value;
		}
		return value;
	}

	/**
	 * Maths which is intended to improve the turning of the robot slightly,
	 * outlined here:
	 * https://www.chiefdelphi.com/t/programming-an-arcade-drive/123985/9
	 */
	public double skim(double v) {
		// Turn gain can be substituted with the slider value on the joystick, but 1.0
		// is preferred by our drivers
		double turnGain = 1.0;
		if (v > 1.0) {
			return ((v - 1.0) * turnGain);
		} else if (v < -1.0) {
			return ((v + 1.0) * turnGain);
		}
		return 0;
	}
}
