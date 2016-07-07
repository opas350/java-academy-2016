#EXCERCISES JAVA2.

#EXCEPTIONS.

1. Can you spot the compile-time error in the following Java program?<br/>

import java.io.*;<br/>
public class test {<br/>
    public static void main(String[] args) {<br/>
        try {<br/>
            FileReader fr = new FileReader("data.txt");<br/>
        }<br/>
        catch(IOException e){}<br/>
        try {<br/>
            fr.close();<br/>
        }<br/>
        catch(IOException e){}<br/>
    }<br/>
}<br/>

2. What will be the output of the program?
try 
{ 
    int x = 0; 
    int y = 5 / x; 
} 
catch (Exception e) 
{
    System.out.println("Exception"); 
} 
catch (ArithmeticException ae) 
{
    System.out.println(" Arithmetic Exception"); 
} 
System.out.println("finished");

A.	finished
B.	Exception
C.	Compilation fails.
D.	Arithmetic Exception


3. What will be the output of the program?
public class MyProgram 
{
    public static void main(String args[])
    {
        try 
        {
            System.out.print("Hello world ");
        }
        finally 
        {
            System.out.println("Finally executing ");
        }
    }
}

A.	Nothing. The program will not compile because no exceptions are specified.
B.	Nothing. The program will not compile because no catch clauses are specified.
C.	Hello world.
D.	Hello world Finally executing


#COLLECTIONS

1. Provides a clean syntax for looping over the elements of a Set, List, array, or other collection
Set<Double> grades = new HashSet<Double>();

2. Set and Ordering. Define the way how the HashSet, TreeSet and LinkedHashSet collections handle the next elements:
Set<String> names = new …<String>();
names.add("Jake");
names.add("Robert");
names.add("Marisa");
names.add("Kasey");
System.out.println(names);

3. Write a program that prints its arguments in random order. Do not make a copy of the argument array. Demonstrate how to print out the elements using both streams and the traditional enhanced for statement. 

#ENUMERATIONS

1. Write the code for a simple enum example.

2. Write enums code in a switch statements

3. Write an example to iterate all values of an enum.

#IO
1. Write an example that counts the number of times a particular character, such as e, appears in a file. The character can be specified at the command line.

2. Create a new directory by using File object

3. Which one of the following will create an InputStreamReader correctly?
1.	new InputStreamReader(new FileInputStream("data"));
2.	new InputStreamReader(new FileReader("data"));
3.	new InputStreamReader(new BufferedReader("data"));
4.	new InputStreamReader("data");
5.	new InputStreamReader(System.in);
