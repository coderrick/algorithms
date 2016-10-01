package com.devdaily.system;

import java.io.IOException;
import java.util.*;

public class ProcessBuilderExample
{
  
  public static void main(String[] args) throws Exception
  {
    new ProcessBuilderExample();
  }

  // can run basic ls or ps commands
  // can run command pipelines
  // can run sudo command if you know the password is correct
  public ProcessBuilderExample() 
  throws IOException, InterruptedException
  {
    // determine the number of processes running on the current
    // linux, unix, or mac os x system.
    List<String> commands = new ArrayList<String>();
    commands.add("/bin/sh");
    commands.add("-c");
    commands.add("ps aux | wc -l");

    SystemCommandExecutor commandExecutor = new SystemCommandExecutor(commands);
    int result = commandExecutor.executeCommand();

    // stdout and stderr of the command are returned as StringBuilder objects
    StringBuilder stdout = commandExecutor.getStandardOutputFromCommand();
    StringBuilder stderr = commandExecutor.getStandardErrorFromCommand();
    System.out.println("The numeric result of the command was: " + result);
    System.out.println("\nSTDOUT:");
    System.out.println(stdout);
    System.out.println("\nSTDERR:");
    System.out.println(stderr);
  }
}