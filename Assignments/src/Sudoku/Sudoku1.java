package Sudoku;

import java.lang.reflect.Array;

public class Sudoku1{
	
       //existsInColumn() checks if the Digit already exist in the Column where the insertion point belongs to.        
       public boolean existsInColumn(int[][] sudoku , int column , int digit) {
    	   
    	   for(int i=0,j=column-1 ; i<9 ; i++) {
    		   
    			  if(sudoku[i][j] == digit) {
    				  System.out.print("Digit "+digit+" exists in the Column No. "+column+"\n");
    				  return true;
    			  }
    	   }
    	   System.out.print("Digit "+digit+" does not exists in the Column No. "+column+"\n");
    	   return false;
       }
       
 
      //existsInRow() checks if the Digit already exist in the Row where the insertion point belongs to.  
      public boolean existsInRow(int[][] sudoku , int row , int digit) {
    	   
    	   for(int i=row-1,j=0 ; j<9 ; j++) {
    		   
    			  if(sudoku[i][j] == digit) {
    				  System.out.print("Digit "+digit+" exists in the Row No. "+row+"\n");
    				  return true;
    			  }
    	   }
    	   System.out.print("Digit "+digit+" does not exists in the Row No. "+row+"\n");
    	   return false;
       }



      public boolean checkValidity(int[][] sudoku,int row,int column,int digit) {
	
        if((row>0 && row<10) && (column>0 && column<10) && (digit>0 && digit<10)) { 
    	
          if((existsInColumn(sudoku,column,digit) == false) && 
        		   (existsInRow(sudoku,row,digit) == false) && 
        		   (existsIn3x3Square(sudoku,row,column,digit) == false)) { /* Checking for all the Three Conditions */
		    return true;
	      }else {
		    return false;
	      }
        }else {
          System.out.print("Row / Column / Digit is greater than 9 or less than 1.\n");
    	  return false; 
        }
	
      }


     //existsIn3x3Square() checks if the Digit already exist in the 3x3 Square where the insertion point belongs to.
     public boolean existsIn3x3Square(int[][] sudoku , int initRow , int initColumn,int digit) {
	   
	   int row = initRow-1;
	   int column = initColumn-1;
	   
	   if((row>=0 && row<3) && (column>=0 && column<3)) {  /* defined IF STATEMENTS to identify the Square number which the insert point belongs to. 
		                                                      so that we can check inside the 3x3 square as well. */
		   for(int i = 0; i<3 ; i++) {   // For Square 1
				  for(int j = 0; j<3 ; j++) {
					  if(sudoku[i][j] == digit) {
						  System.out.print(digit+" already exists in Square 1"+"\n");
						  return true;
					  }
				  }
		   }
		   
		   }else if((row>=0 && row<3) && (column>=3 && column<6)) {
			   
			   for(int i = 0; i<3 ; i++) {  // For Square 2
				      for(int j = 3; j<6 ; j++) {
				    	  if(sudoku[i][j] == digit) {
				    		  System.out.print(digit+" already exists in Square 2"+"\n");
							  return true;
						  }
				      }
			   }
			   
		   }else if((row>=0 && row<3) && (column>=6 && column<9)) {
			   
			   for(int i = 0; i<3 ; i++) {    // For Square 3
				      for(int j = 6; j<9 ; j++) {
				    	  if(sudoku[i][j] == digit) {
				    		  System.out.print(digit+" already exists in Square 3"+"\n");
							  return true;
					      }
				      }
			   } 
			   
		   }else if((row>=3 && row<6) && (column>=0 && column<3)) {
			   
			   for(int i = 3; i<6 ; i++) {  // For Square 4
					  for(int j = 0; j<3 ; j++) {
						  if(sudoku[i][j] == digit) {
							  System.out.print(digit+" already exists in Square 4"+"\n");
							  return true;
						  }
					  }
			   }
			   
		   }else if((row>=3 && row<6) && (column>=3 && column<6)) {
			   
			   for(int i = 3; i<6 ; i++) {  // For Square 5
				    for(int j = 3; j<6 ; j++) { 
				    	if(sudoku[i][j] == digit) {
				    		System.out.print(digit+" already exists in Square 5"+"\n");
							  return true;
						}
				    }
			   }  
			   
		   }else if((row>=3 && row<6) && (column>=6 && column<9)) {
			   
			   for(int i = 3; i<6 ; i++) {  // For Square 6
					  for(int j = 6; j<9 ; j++) { 
						  if(sudoku[i][j] == digit) {
							  System.out.print(digit+" already exists in Square 6"+"\n");
							  return true;
						  }
					  }
				  }  
			   
		   }else if((row>=6 && row<9) && (column>=0 && column<3)) {
			   
			   for(int i = 6; i<9 ; i++) {  // For Square 7
					  for(int j = 0; j<3 ; j++) {
						  if(sudoku[i][j] == digit) {
							  System.out.print(digit+" already exists in Square 7"+"\n");
							  return true;
						  }
					  }
			   }  
			   
		   }else if((row>=6 && row<9) && (column>=3 && column<6)) {
			   
			   for(int i = 6; i<9 ; i++) {  // For Square 8
					  for(int j = 3; j<6 ; j++) { 
						  if(sudoku[i][j] == digit) {
							  System.out.print(digit+" already exists in Square 8"+"\n");
							  return true;
						  }
					  }
			   }  
			   
		   }else{
			   
			   for(int i = 6; i<9 ; i++) {  // // For Square 9
					  for(int j = 6; j<9 ; j++) { 
						  if(sudoku[i][j] == digit) {
							  System.out.print(digit+" already exists in Square 9"+"\n");
							  return true;
						  }
					  }
			   } 
			   
		   }
	      System.out.print(digit+" does not exists in corresponding 3x3 Square of the Sudoku."+"\n");
	      return false;
       }
   
}