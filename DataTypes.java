package com.edu.akshata;

public class DataTypes {

	public static void main(String[] args) {
		//int ,float , double , char , byte ,short ,long  it is keyword ,data type 
		//String is non primitive datatype
        // all class are non primitive datatype
		
	int i= 10; //4 byte
	byte b= 127;//1byte
	short s = 32167; //2 byte take memory
	
	float f=56.3f;
	double d =8787686.3;
	char c = 'A';
	long l = 879879879l;
	
	i=(int) l; //explicit casting
	s=b; //implicit casting 
	//f=(float)d;
	i=(int)f ;  //56.3
	
	System.out.println(i);
	
	
	
	
	}

}
