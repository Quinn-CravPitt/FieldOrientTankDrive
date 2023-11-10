package frc.robot.Subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Constants.driveTrainConstants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.sensors.CANCoder;

public class Drivetrain extends SubsystemBase {
    
    private final CANSparkMax m_frontLeftMotor = 
    new CANSparkMax(driveTrainConstants.FRONT_LEFT_MOTOR_ID, MotorType.kBrushless);
    private final CANSparkMax m_frontRightMotor = 
    new CANSparkMax(driveTrainConstants.FRONT_RIGHT_MOTOR_ID, MotorType.kBrushless);
    private final CANSparkMax m_backLeftMotor = 
    new CANSparkMax(driveTrainConstants.BACK_LEFT_MOTOR_ID, MotorType.kBrushless);
    private final CANSparkMax m_backRightMotor = 
    new CANSparkMax(driveTrainConstants.BACK_RIGHT_MOTOR_ID, MotorType.kBrushless);

    private final MotorControllerGroup m_leftControllerGroup =
    new MotorControllerGroup(m_frontLeftMotor, m_backLeftMotor);
    private final MotorControllerGroup m_rightControllerGroup =
    new MotorControllerGroup(m_frontRightMotor, m_backRightMotor);

    private final DifferentialDrive m_differentialDrive =
    new DifferentialDrive(m_leftControllerGroup, m_rightControllerGroup);

      // Odometry
    private final CANCoder m_leftDriveEncoder =
    new CANCoder(driveTrainConstants.LEFT_DRIVE_ENCODER_ID);
    private final CANCoder m_rightDriveEncoder =
    new CANCoder(driveTrainConstants.RIGHT_DRIVE_ENCODER_ID);

}


