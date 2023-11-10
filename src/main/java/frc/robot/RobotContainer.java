package frc.robot;

import frc.robot.Constants.driveTrainConstants;
import frc.robot.Constants.operatorConstants;
import frc.robot.Subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.networktables.NetworkTable;



public class RobotContainer {

    private final Drivetrain m_driveTrain = new Drivetrain();
    public final CommandXboxController m_driverController = new CommandXboxController(operatorConstants.kDriverControllerPort);

    public void testPeriodic(){

        SmartDashboard.putNumber("X", Timer.getFPGATimestamp());
        SmartDashboard.putNumber("Y", Timer.getFPGATimestamp());
        
    }
}


