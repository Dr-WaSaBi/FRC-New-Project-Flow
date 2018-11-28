/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.command.Command;

public class AutonMoves extends Command {
  public AutonMoves() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }

  private static boolean submergeRobot(int depth, int speed){
    /**
     * A function that will submerge the robot to a depth passed in 
     * in inches, and do it at a speed also passed in.
     * If the move is successful, return success (true or 1) to calling,
     * Otherwise return fail (false or 0)
     */
    return(true); //send back that we did it. Yeah!
  }

  private static boolean thustRobotStarboard(int distance, int speed){
    /**
     * A function to move the robot sideways thru the water to the right (starboard)
     */
    return(true);
  }

  private static boolean thrustRobotPort(int distance, int speed){
    /**
     * Function to move the robot sideways thru the water to left (port)
     */
    return(true);
  }
}
