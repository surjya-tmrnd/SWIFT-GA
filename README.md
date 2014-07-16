SWIFT-GA
========

A repository for TMRND SWIFT Genetic algorithm project

What the package contains?
--------------------------
This java package contains following classes
1. GA.java - This the main GA class to be used for GA engine. To be used by the package user.
2. FixJobData.java - This is a supporting class for GA.java. To be used by the package user.
3. GAState.java - Contains the GA engine states. Can be used to check the run status anytime.
4. JobData.java - This is a supporting class for GA.java. To be used by package user.
5. MatchMatrix.java - This is a supporting class for GA.java. To be used by the package user.
6. Result.java - This is a supporting class for GA.java. Have members which stores different parameters for GA engine result.
7. TeamData.java - This is a supporting class for GA.java. To be used by the package user. 


How to use this package
-----------------------
1. import this package to your project
2. Create the objects of type JobData,TeamData,FixJobData and MatchMatrix from the available lists of GA adapter module
3. Create an object of GA class. Initialize the GA engine object with constructor or by set methods provided.Following members are to be initialized before calling to run method of GA object
    a. private JobData jData - Contains the unassigned jobs
    b. private TeamData tData - Contains the team information
    c. private FixJobData fJobData - Contains the pre-allocated job data
    d. private MatchMatrix mMatrix - The compatibility matrix for given constraints.
4. Call the GA.run() method after initialising the member variables of GA object

For the details about the class member datatypes please refer the respective class code of JobData,TeamData,FixJobData and MatchMatrix.

 



