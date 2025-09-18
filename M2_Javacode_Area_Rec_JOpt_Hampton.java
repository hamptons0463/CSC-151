// PROGRAM TO CALC AREA OF A RECTANGLE AND ALSO A CIRCLE
// STEPHANIE HAMPTON
// 09/12/2025

//pseudo code

//main menus pops
//gives options for circle are, rect area, and exit
//enclosed in while loop so menu will pop up afterwards unless exit or close is selected
//rectangle - will pop dialog box for each length and width
//another will pop for the dialog of area, will then circle back to menu
//circle - will pop for a request for radius
//will then do math and pop up with area of circle
//return to while loop menu. 

import javax.swing.JOptionPane; //for dialog boxes

public class M2_Javacode_Area_Rec_JOpt_Hampton 
{
    public static void main(String[] args) 
    
    {
        runMenu();
    }


    //main menu - choose which option you want to do ie. are of circle or rectangle
    public static void runMenu()
    {
    // will prob need to add in a while loop here to keep the menu going until user wants to exit
    //intialize while loop with choice NOT menu as that is not what i called the variable

    int choice = 100; //initialize choice to enter the loop

    while (choice != 2 && choice != JOptionPane.CLOSED_OPTION)
        {

            // Array for Dialog box options
            String[] menu_options = {"Area of a Rectangle", "Area of a Circle", "Exit"};
            choice = JOptionPane.showOptionDialog
            
            (null, ///// PARENT - NOT SURE WHAT IS REAL TALK
            "Which calculation do you need?", ///// MESSAGE TO DISPLAY
            "Main Menu", ///// TITLE FOR THE BOX
            JOptionPane.DEFAULT_OPTION, ///// OPTION TYPE - I CUSTOMIZED
            JOptionPane.INFORMATION_MESSAGE, ///// TYPE OF DEFAULT ICON AND TYPE OF PROMPT BOX
            null, ///// CAN CUSTOMIZE. I DID NOT.
            menu_options, ///// THE CUSTOMIZED OPTIONS FOR THE BOX IN AN ARRAY.
            menu_options[2]); ///// WHICH OPTIONS IS SELECTED AUTOMATICALLY. I CHOSE EXIT/CANCEL
            
            //menu option breakdown

            if (choice == 0)
            {
                // area of rectangle stuff
                //need to have different methods for each length, width, and area math
                rectangleArea();

            } 
            else if (choice == 1)
            {
                // area of circle stuff
                //need to have different methods for  radius, and area math - pi is built in\
                circleArea();
            }
            else
            {
                //program exits no second chances in this program 
            }

        } //while true loop ending 
    }


    ////////////////////////////////////////////////// ALL METHODS HERE/////////////////////////////////////////////

    /////////   RECTANGLE METHODS HERE
    public static void rectangleArea()
    {

        //use methods to get length, width numbers

        double length = getLength();
        double width = getWidth();

        //send length and width to displayArea so the math can be calculated and displayed

        displayRectangleArea(length, width);
    }
    
    //RECTANGLE GET LENGTH
    public static double getLength()
    {
        //Prompt user to input Length.
        return Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the rectangle: "));
    }
    //RECTANGLE GET WIDTH
    public static double getWidth()
    {
        //Prompt user to input width.
        return Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the rectangle: "));
    }
    //RECTANGLE CALCULATE AND DISPLAY AREA
    public static void displayRectangleArea(double length, double width)
    {
        //math 
        double area = length * width;
        JOptionPane.showMessageDialog(null, "Area of rectangle is " + String.format("%.5f",area) + " units.");
    }

    /////////   CIRCLE METHODS HERE ////// less methods cause less numbers needed
    
    public static void circleArea()
    {
        //use methods to get radius
        double radius = getRadius();
        //send to circ
        displayCircleArea(radius);

    }
    //CIRCLE GET RADIUS
    public static double getRadius()
    {
        //Prompt user to input radius.
        return Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle: "));
    }
    public static void displayCircleArea(double radius)
    {
        //math I know it should be rounded instead of trunicated or whatever but seemed like a lot more mental work then i was prepared for
        double area = Math.PI * Math.pow(radius,2);
        JOptionPane.showMessageDialog(null, "Area of circle is " + String.format("%.5f",area) + " units.");
    }

}
