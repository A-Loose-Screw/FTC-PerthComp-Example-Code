![alt text](https://github.com/A-Loose-Screw/FTC_PerthComp_Example_Code/blob/master/ftc_app-4.3/Images/frc_0.jpg)
![alt text](https://github.com/A-Loose-Screw/FTC_PerthComp_Example_Code/blob/master/ftc_app-4.3/Images/ftc_0.jpg)



Perth First Tech Challenge Example Code
=======================================
#### Author CJBuchel
#### Email: connorbuchel@gmail.com

if any issues arise you can contact me by either my email, or if you are part of the `FIRST Tech Challenge WA Coaches Group` on Facebook. You can just message me
## Description
This repository provides an example code for First Tech Challenge teams who are either new to programming in FTC Java and/or can give a better base code to build up on. 

## How to use 

## [Setup](https://github.com/ftctechnh/ftc_app/wiki/Android-Studio-Tutorial)
The setup can be quite a nuisance but once completed it's rarely seen again, To use this SDK, download/clone the entire project to your local computer. To setup the code you can use the recommended way of installing android studio, then install java and set up the dependencies (Click the `Setup` link for a more detailed look at how to install). Or you could be a total baller and set it up manually and use the gradle files to build and install the code using your preferred IDE. the `Gradle Building` shows how to set this up.

### [TeamCode](/TeamCode)
To run code use android studio and import the required tools that you wish to use. For instance Vision Tracking requires you to import DogeCV. Which is included into the files. This can provide a basic tutorial of how to use the DogeCV library: https://www.youtube.com/watch?v=_i-EU3v9CRc

### [Current App Version Info](ftc_app-4.3) (This is the origin information from the official website that the base was provided, it may include conflicting installation methods and different file structures. See #Setup for this repositories installation )


### [Gradle Building] 
- For Windows CommandPrompt/ PowerShell Debugging and installs, open a terminal of your choice in the directory that your code is located and type `.\gradlew` (The required JAVA_HOME for this build is jre1.8, Any higher will cause a prompt for a version change)

if you are unsure how to set java_home, see here for details on setting it up https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/

and you can grab the java version that i used to test this software from here https://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html

- If installed/build is successful you can attempt to build your code via `.\gradlew teamcode:build` 
- For installing code onto a connected device (I.E a Phone) type `.\gradlew teamcode:installdebug`

- For a list of tasks and in depth gradle functions type `.\gradlew tasks` or `.\gradlew tasks --all` For a longer list

### [Current Version Info](/doc/origininfo/)
- The information provided by the oficial first repository. Holding version information and updates.