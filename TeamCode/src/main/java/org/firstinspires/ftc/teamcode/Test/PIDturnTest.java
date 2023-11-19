package org.firstinspires.ftc.teamcode.Test;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Robot.GBrobot;
@Disabled
@Autonomous
public class PIDturnTest extends LinearOpMode {
    public GBrobot robot;
    @Override
    public void runOpMode() throws InterruptedException {
        robot = new GBrobot(this);
        waitForStart();

        robot.Drive.turnPID(90);
    }
}
