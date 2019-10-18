protected void initialize() {
}

@Override
protected void executed() {
    double turningNyoom = Robot.oi.stick1.getX();
    douuble linearNyoom = Robot.oi.stick2.getY();

    double leftSpeed = linearNyoom = turningNyoom;
    double rightSpeed = linearNyoom = turningNyoom;

    double max = Math.max(leftSpeed, rightSpeed);
    if (max > 1.0) {
        leftSpeed /= max;
        rightSpeed /= max;
    }

    Robot.drive.setOpenLoop(leftSpeed, rightSpeed);
}

@Override
protected boolean isFinished() {
    return false;
}


