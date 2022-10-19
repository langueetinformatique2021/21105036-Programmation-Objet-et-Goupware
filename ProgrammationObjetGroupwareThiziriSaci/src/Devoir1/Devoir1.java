package Devoir1;
/*médiane des variables p1, p2, p3, p4 et p5 dans p6
@author: SACI Thiziri, N° étudiant: 21105036
@param p1=10, p2=9, p3=-1, p4=4, p5=8;
@return p6 
*/ 
public class Devoir1 {
	public static void main (String[] args) {
		int p1=10, p2=9, p3=-1, p4=4, p5=8;     
		int p6=0;
		if (p1<p2) {
			if (p4<p5) {
				if (p2<p3) {
					if (p3<p4)
						p6=p3;                       //on a p1<p2<p3<p4<p5
					else {	        //p4<p3
					   if (p2<p4)
						   p6=p4;                    //on a p1<p2<p4<p3<p5     ou p1<p2<p4<p5<p3
					   else         //p4<p2
						   p6=p2;                    //on a p1<p4<p2<p3<p5     ou p4<p1<p2<p3<p5
					}
				}
				else {              //p3<p2
					if (p2<p4)
						p6=p4;                       //on a p1<p2<p4<p3<p5
					else            //p4<p2
						p6=p2;                       //on a p1<p4<p2<p3<p5
				}
				if (p3<p2) {              //p3<p2
					if  (p2<p4)                      //on a p1<p3<p2<p4<p5   
						p6=p2;
					else {          //p4<p2                         
						if (p1<p3)
							p6= p4;                  //on a p1<p3<p4<p2<p5 
						else        //p3<p1
							p6=p4;                   //on a p3<p1<p4<p2<p5 
				}}
				if (p3<p1) {
					if (p3<p4) {
						if (p2<p4)
							p6=p2;                   //on a p3<p1<p2<p4<p5
						else         //p4<p2  
							p6=p4;                   //on a p3<p1<p4<p2<p5 ou p3<p1<p4<p5<p2
						}}}
				}
			else {                  //p5<p4
				if (p2<p3) {
					if (p3<p5)
						p6=p3;                       //on a p1<p2<p3<p5<p4
					else {          //p5<p3
						if (p2<p5)
							p6=p5;                   //on a p1<p2<p5<p3<p4
						else        //p5<p2
							p6=p2;                   //on a p1<p5<p2<p3<p4         //peut etre p5<p1
					}
				}
				if (p3<p2) {              //p3<p2      
					if (p2<p5)
						p6=p2;                      //on a p1<p3<p2<p5<p4
					else {          //p5<p2
						if (p1<p3) {
							if (p3<p5)
								p6=p5;              //on a p1<p3<p5<p2<p4
							else    //p5<p3    
								p6=p3;              //on a p1<p5<p3<p2<p4           //peut etre p5<p1
						}
						else {      //p3<p1
							if (p1<p5)
								p6=p5;              //on a p3<p1<p5<p2<p4
							else    //p5<p1           
								p6=p1;              //on a p3<p5<p1<p2<p4
						}
					}}
				if (p3<p1) {
					if (p3<p5) {
						if (p2<p5)
							p6=p2;                   //on a p3<p1<p2<p5<p4
						else         //p4<p2  
							p6=p5;                   //on a p3<p1<p5<p2<p4 ou p3<p1<p5<p4<p2
						}}}
		if (p2<p1) {                //p2<p1 
			if (p4<p5) {
				if (p1<p3) {
					if (p3<p4)
						p6=p3;                      //on a p2<p1<p3<p4<p5
					else {
						if (p1<p4)
							p6=p4;                  //on a p2<p1<p4<p3<p5
						else        //p4<p1
							p6=p1;                  //on a p2<p4<p1<p3<p5  ou p4<p2<p1<p3<p5
					}}
				if(p3<p1) {         //p3<p1
					if (p1<p4)
						p6=p1;                      //on a p2<p3<p1<p4<p5
					else {          //p4<p1
						if (p3<p4)
							p6=p4;                  //on a p2<p3<p4<p1<p5
						else        //p4<p3
							p6=p3;                  //on a p2<p4<p3<p1<p5  
					}}
				if (p3<p2) {
					if (p3<p4) {
						if (p1<p4)
							p6=p1;                   //on a p3<p2<p1<p4<p5
						else         //p4<p2  
							p6=p4;                   //on a p3<p2<p4<p1<p5 ou p3<p2<p4<p5<p1
						}}}
			else {                  //p5<p4
				if (p1<p3) {
					if (p3<p5)
						p6=p3;                      //on a p2<p1<p3<p5<p4
					else {          //p5<p3 
						if (p1<p5)
							p6=p5;                  //on a p2<p1<p5<p3<p4
						else        //p5<p1
							p6=p1;                  //on a p2<p5<p1<p3<p4
					}}
				if (p3<p1) {              //p3<p1
					if (p1<p5)
						p6=p1;                      //on a p2<p3<p1<p5<p4
					else {          //p5<p1 
						if (p3<p5)
							p6=p5;                  //on a p2<p3<p5<p1<p4
						else        //p5<p3
							p6=p3;                  //on a p2<p5<p3<p1<p4
					}}
				if (p3<p2) {
					if (p3<p5) {
						if (p1<p5)
							p6=p1;                   //on a p3<p2<p1<p5<p4
						else         //p4<p2  
							p6=p5;                   //on a p3<p2<p5<p1<p4 ou p3<p2<p5<p4<p1
						}}}
			}
		if (p4<p5) {
			if (p1<p2) {
				if (p5<p3) {
					if (p3<p1)
						p6=p3;                     //on a p4<p5<p3<p1<p2
					else {          //p1<p3  
						if (p5<p1)
							p6=p1;                 //on a p4<p5<p1<p3<p2
						else        //p1<p5
							p6=p5;                 //on a p4<p1<p5<p3<p2
					}}
				if(p3<p5) {              //p3<p5  
					if (p5<p1)
						p6=p5;                     //on a p4<p3<p5<p1<p2
					else {          //p1<p5
						if (p3<p1)
							p6=p1;                 //on a p4<p3<p1<p5<p2     ou p3<p4<p1<p5<p2
						else        //p1<p3
							p6=p3;                 //on a p4<p1<p3<p5<p2
					}}
				if (p3<p4) {
					if (p3<p1) {
						if (p5<p1)
							p6=p5;                   //on a p3<p4<p5<p1<p2
						else         //p1<p5  
							p6=p1;                   //on a p3<p4<p1<p5<p2 ou p3<p4<p1<p2<p5
						}}
				}
			else {                  //p2<p1
				if (p5<p3) {
					if (p3<p2)
						p6=p3;                     //on a p4<p5<p3<p2<p1
					else {            //p2<p3
						if (p5<p2)
							p6=p2;                 //on a p4<p5<p2<p3<p1
						else        //p2<p5
							p6=p5;                 //on a p4<p2<p5<p3<p1
					}}
				if(p3<p5) {              //p3<p5
					if (p5<p2)
						p6=p5;                     //on a p4<p3<p5<p2<p1
					else {           //p2<p5
						if (p3<p2)
							p6=p2;                 //on a p4<p3<p2<p5<p1   ou p3<p4<p2<p5<p1
						else
							p6=p3;                 //on a p4<p2<p3<p5<p1
				}}
				if (p3<p4) {
					if (p3<p2) {
						if (p5<p2)
							p6=p5;                   //on a p3<p4<p5<p2<p1   
						else         //p2<p5  
							p6=p2;                   //on a p3<p4<p2<p5<p1    
						}}
			}
			}//a suiiiiiivre
		if(p5<p4) {
			if (p1<p2) {
				if (p4<p3) {
					if (p3<p1)
						p6=p3;                     //on a p5<p4<p3<p1<p2
					else            //p1<p3
						p6=p1;                     //on a p5<p4<p1<p3<p2
				}
				if(p3<p4) {              //p3<p4
					if (p4<p1)
						p6=p4;                     //on a p5<p3<p4<p1<p2
					else            //p1<p4
						p6=p1;                     //on a p5<p3<p1<p4<p2  ou p3<p5<p1<p4<p2
				}
				if (p3<p5) { 
					if (p3<p1) {
						if (p4<p1)
							p6=p4;                   //on a p3<p5<p4<p1<p2   
						else         //p2<p5  
							p6=p1;                   //on a p3<p5<p1<p4<p2    
						}}
			}
			else {                  //p2<p1
				if (p4<p3) {
					if (p3<p2)
						p6=p3;                     //on a p5<p4<p3<p2<p1
					else {          //p2<p3
						if (p4<p2)
							p6=p2;                 //on a p5<p4<p2<p3<p1
						else
							p6=p4;                 //on a p5<p2<p4<p3<p1
					}}
				if (p3<p4) {         //p3<p4
					if (p4<p2)
						p6=p4;                     //on a p5<p3<p4<p2<p1
					else {          //p2<p4
						if (p3<p2)
							p6=p2;                 //on a p5<p3<p2<p4<p1
						else        //p2<p3
							p6=p3;                 //on a p5<p2<p3<p4<p1
					}}
				if (p3<p5) {     
					if (p3<p2) {
						if (p4<p2)
							p6=p4;                   //on a p3<p5<p4<p2<p1   
						else         //p2<p4  
							p6=p2;                   //on a p3<p5<p2<p4<p1    
						}}
				}}
System.out.println(p6);	
}}