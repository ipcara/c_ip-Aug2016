public class HourglassPeriod1 {

public static void main(String[] args) {
//print line 1
	lineWithQuotes();
//print the top half
	printTopHalf();
	for (int m=0; m<5; m++) {
		System.out.print(" ");
	}
	System.out.println("||");
	printBottomHalf();
	lineWithQuotes();
//print line 6 (middle)
//print bottom half
//print last line (looks just like line 1)
}
public static void lineWithQuotes(){
	System.out.print("|");
	for(int j = 0; j<10; j++){
		System.out.print("\"");
	}
	System.out.println("|");	
	}	

public static void printTopHalf(){
	for (int i=1; i<=4;i++){ //print the first 4 lines
//Print the spaces
		for (int s=1; s<=i;s++){
			System.out.print(" ");
		}
//Print the \
		System.out.print("\\");
// Print the colons
		for (int k=1; k<=10-2*i;k++){
			System.out.print(":");
		}
//Print the /
		System.out.println("/");
	}
}
public static void printBottomHalf() {
	for (int a=4; a>=1;a--){ 
		for (int b=1; b<=a;b++){
			System.out.print(" ");
		}
		System.out.print("/");
		for (int c=10-2*a; c>=1;c--){
			System.out.print(":");
		}
		System.out.println("\\");
	}
}
}