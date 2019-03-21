# Perth First Tech Challenge Example Code
#### Author CJBuchel
#### Email: connorbuchel@gmail.com

if any issues arrise you can contact me by either my email, or if you are part of the `FIRST Tech Challenge WA Coaches Group` on facebook. You can just message me
## Discription
This repository provides an example code for First Tech Challenge teams who are either new to programming in FTC Java and/or can give a better base code to build up on. 

## How to use 

## [Setup](Setup)

### [TeamCode](ftc_app-4.3/TeamCode)
To run code use android studio and import the required tools that you wish to use. For instance Vision Tracking requires you to import DogeCV. Which is included into the files. This can provide a basic tutorial of how to use the DogeCV library: https://www.youtube.com/watch?v=_i-EU3v9CRc


### [Coaches] 
- For Windows CommandPrompt/ PowerShell Debugging and installs, open a terminal of your choice in the directory that your code is located and type `.\gradlew` (The required JAVA_HOME for this build is jre1.8, Any higher will cause a prompt for a version change)

- If installed/build is successfull you can attempt to build your code via `.\gradlew teamcode:build` 
- For installing code onto a connected device (I.E a Phone) type `.\gradlew teamcode:installdebug`

- For a list of tasks and in depth gradle functions type `.\gradlew tasks` or `.\gradlew tasks --all` For a longer list
