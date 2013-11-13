*********************************************************************README************************************************************************
***************************************************************************************************************************************************

Name: Madhusudhan Sankaran.

***************************************************************************************************************************************************
***************************************************************************************************************************************************


This program was developed in the Eclipse Juno IDE in Microsoft Windows 7 Operating System using java as the programming language.

There are four java files included. They are:

1. calculateA.java
2. calculateActivationFunction.java
3. updateWeights.java
4. GradientDescent.java


Instructions for compiling the program:
---------------------------------------

1. Compile the programs using the javac command in the following order:

		javac calculateA.java
		javac calculateActivationFunction.java
		javac updateWeights.java
		javac GradientDescent.java


2. This should produce the .class files and the program should be ready for execution.
 

Instructions for running the program:
-------------------------------------

1. To run the program, type the following command :
		
		java GradientDescent <arg1> <arg2> <arg3> <arg4>


2. arg1 arg2 arg3 and arg4 stand for the following :

   arg1 : The name of the training file.
   arg2 : The name of the test file.
   arg3 : The learning rate.
   arg4 : The number of iterations required to run the algorithm.

3. For example, the following is a valid execution of the algorithm ;

		java GradientDescent train.dat test.dat 0.1 100

4. This should run the algorithm and the results should be produced.



