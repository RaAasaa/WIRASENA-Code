package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class mecanum extends OpMode {

    DcMotor Fleft, Fright, Bleft, Bright;

    @Override
    public void init() {
        Fleft = hardwareMap.get(DcMotor.class, "Fleft");
        Fright = hardwareMap.get(DcMotor.class, "Fright");
        Bleft = hardwareMap.get(DcMotor.class, "Bleft");
        Bright = hardwareMap.get(DcMotor.class, "Bright");

    }

    @Override
    public void loop() {

    }
}