/* 1. Mention the difference between interpreter and compiler.

Interpreter
1)Interpreter translates just one statement of the program at a 
time into machine code.
2)An interpreter takes very less time to analyze the source code. 
However, the overall time to execute the process is much slower.
3)Interpreters are used by programming languages like Ruby and 
Python for example



Compiler
1)Compiler scans the entire program and translates the whole of 
it into machine code at once
2)A compiler takes a lot of time to analyze the source code. 
However, the overall time taken to execute the process is much faster.
3)Compliers are used by programming languages like C and C++ for example

2. Define a class Student with following members:
*/

import java.util.Scanner;
class Students 
{
    private int roll; 
    private String name;
    private float marks;
    

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Roll no of student: ");
        roll = sc.nextInt();
        
        System.out.print("Enter the name of student: ");
        name = sc.next();
        
        System.out.print("Enter the marks of student: ");
        marks = sc.nextFloat(); 
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
 
    }
    public static void main(String[] args){
        Students obj = new Students();
        obj.accept();
        obj.display();
    }
}


     
 