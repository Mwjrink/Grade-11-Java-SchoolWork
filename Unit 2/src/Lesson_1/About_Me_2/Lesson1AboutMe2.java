/* 
* Saluton.java 
* A first Java application, display's a greeting 
* Max Rink 
* ICS3U 
* Date 
*/ 
package Lesson_1.About_Me_2;

/** 
* The Saluton class displays a greeting. 
*/ 

public class Lesson1AboutMe2 {	
	//start class definition	 

	public static void main(String[] args) {
		
		//print strings to screen with newline at the end
		System.out.println("Maximillian .R");
		System.out.println("Mr. Bujaki");
		System.out.println("All Saints Catholic HighSchool");
		System.out.println("Let's Go Avalanche!\n");
		
		//prints out formatted content to the screen
		System.out.format(" %-10s  %22s   %13s",	"Class", 					"Start", 		"End\n"); 
		System.out.format(" %-7s   %14s   %15s",   	"Computer Science", 		"8:20", 		"9:40\n"); 
		System.out.format(" %-7s   %23s   %16s",   	"Physics", 					"9:50", 		"11:10\n"); 
		System.out.format(" %-7s   %11s   %14s",   	"Computer Engineering", 	"12:55", 		"1:10\n"); 
		System.out.format(" %-7s   %7s    %14s",   	"Functions and Relations", 	"1:15", 		"2:30\n"); 
		System.out.format(" %-7s",   				"Semester 2\n"); 
		System.out.format(" %-7s   %14s   %15s",	"Entrepreneurship", 		"8:20", 		"9:40\n"); 
		System.out.format(" %-7s   %21s   %16s",   	"Chemistry", 				"9:50", 		"11:10\n"); 
		System.out.format(" %-7s   %16s   %14s",   	"World religions", 			"12:55", 		"1:10\n"); 
		System.out.format(" %-7s   %23s   %15s",   	"English", 					"1:15", 		"2:30\n"); 
	}
} 			//end class definition
