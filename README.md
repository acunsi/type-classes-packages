# Persona Statement
As a Java instructor, I need to evaluate your understanding of classes, types, and packages.  
The code you have been provided will not compile because it contains errors.  Below is a list of some of the potential errors that are present.
- Methods have been mislabelled as public/private.
- Method parameters representing arrays are not declared properly.
- Methods are returning values that do not make sense with respect to their intended purpose.
- A required package has not been created.  The functions that belong to that package are not aware they are part of the package.
- Class variables are labeled incorrectly (public vs private).
- Similar named variables are being confused with variables passed to the method and ones belonging to the class (e.g. this.blah).
- Class variables are not being used when they should be and other variables (perhaps same name) are needlessly present.
- Variable typos are using the same variable instead of a similar named variable (e.g.num1 should be num2).

There may be other problems, but the list above is a great starting point.
# DO NOT CHANGE Main.java

Do not make any changes to the Main class (Main.java).  This file is simply the driver file to test your submission.
A checksum will be computed on the file to make sure there have been **absolutely** no changes to the file.  
Simply adding a stray space to this file will cause the checksum to change.  If you made a change to the file accidentally, then you need to copy and paste the exact code from the git repo.
### There will be no points awarded if a change to Main.java (Main class) is detected!!!!

# Command Line Argument
The Main class (Main.java) is the driver class for this program.  It accepts a single command-line argument in the form of an integer.
This single integer argument seeds the random number generator. When a random number generated is seeded, it will reliably produce the same sequence of random numbers.  Random numbers are used throughout this program to test your modifications to the classes under different scenarios.
The file test_script.sh should not be touched and is not part of the assignment.  The script was used to generate several outputs that you can use to see if your program is running as expected in a general sense (different scenarios).
The directory output_samples contains sample outputs.  You can use these samples to compare your finished code against.
For example, test-114.txt contains the output when the seed value 114 is passed into the command line as an argument.  
If no command line argument is passed, the seed value 150 is used.  As such, if you do not pass a command line argument the  output should be identical to the contents in file test-150.txt in the output_samples directory.

## Command line arguments in Intellij
Command line arguments can be set for Intellij to use when pressing the green play (compile/run) button. Click the three vertical dots close to the green run button and select edit. In the **Build and Run** section, click the second row text box.  It will display a help message about "CLI Arguments...".  Simply type the seed value you want there.  This represents the command line arguments that Intellij will use when running your program.

# Acceptance Criteria
Below are the items that represent the acceptance criteria for this task.  In order to achieve a perfect score on this assignment you must submit work that satisfies all the ACs listed below.

- The Main class (Main.java) must not be altered in any fashion.  This includes added whitespace (spaces and newlines).
- The program must compile.
- A package must be created containing the classes DoubleArithmetic and IntegerArithmetic.
    - The two classes have already been created but contain errors.
    - This AC requires adding a directory (named CoolMath) to the src directory.
    - You must move ONLY the two class files that belong to the package called CoolMath into the directory named CoolMath.
    - The two classes must contain a line at the very top of them indicating they are part of the CoolMath package.
- All errors must be removed.
- Both IntegerArithmetic and DoubleArithmetic have effectively the same methods with respect to intended function.  The two classes must be modified in the following ways:
    - Only methods named add(), subtraction(), multiplication(), division(),getValueOfNum1(), getValueOfNum2(), and increaseValues() should be accessible outside the class.
    - All methods in DoubleArithmetic and IntegerArithmetic need the class to be initialized before being called except for the sumTwoValues method. The sumTwoValues method (in both IntegerArithmetic and DoubleArithmetic) does not directly require the class to be initialized.
    - The class variables (num1 and num2) should not be accessible from outside the class.  You are not permitted to change the name of these two class variables (e.g. must stay named num1 and num2).
    - The DoubleArithmetic class handles types that are doubles.  The IntegerArithmetic class handles types that are integers.  Ensure these types are present throughout the two classes.
- The SillyFunctions class is not part of a package and should stay in the src directory.
    - Only the methods labeled addValueToArrayElements, testCoolMathFunction, and commaSeperatedArray should be accessible outside the class.
    - Methods in SillyFunctions should be accessible without initializing the class.  Make sure the methods contain a keyword that makes them available without having to initialize the class.
    - SillyFunctions should not have a constructor or class variables defined.




# GitHub Web-Hook Tests
The following tests will be checked, as GitHub web-hooks, when new code is pushed to this repository. Some of the tests below may not be in individual tests.  Some of the items below may entail several individual tests. The tests may only provide general feedback and may not provide insight on which specific tests have failed.
- A checksum will be computed to ensured Main class (Main.java) has not been changed.
- Verification the program compiles.
- The methods associated with the classes return appropriate values.
- A check whether keywords like static, public, and private are used appropriately.
- A check to see whether functions that should be private are not accessible outside the class.


# Slack Channel **Java-Prog-Assignment-2**

A Slack channel named **java-program-assignment-2** has been created for students to collaborate on this assignment.  No one is allowed to engage in academic dishonesty. Everyone should submit their own work.  However, students are able to provide general advice and guidance.  The instructor will monitor the communication and may provide hints.


