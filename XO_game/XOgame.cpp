#include<iostream>
using namespace std;

void draw();
void replace(int in , char c);
bool noRepeat(int);
bool checkWinner();
bool oCheckWinner();
bool xCheckWinner();
void initialization();
char c1 , c2 , c3 , c4 , c5 , c6 , c7 , c8 , c9;
int input;
char currentPlayer = 'X';

int main(){
	
 //it will be wrong if we put the counter in the next while loop
	
	do{
		cout<<"hello in X - O game \n";
		int counter=1;
		initialization();
		while(true){
			draw();  
			cout<<currentPlayer<<" : \n";      
			cin>>input;
			
			while(noRepeat(input)==false){
			cout<<"wrong ! \nenter a right number :\n";
			cin>>input;
			}
			
			if(counter%2==0){
	
			 	replace(input , currentPlayer); 
			 	currentPlayer='X';
			 }
			else{
				
			 	replace(input , currentPlayer  ); 
			 	currentPlayer='O';
			 }
	
			counter++;
			
			if(checkWinner()){cout<<"do u want to play again? \n "; break;}
			else if(counter==10){ cout<<"there is no winner \ndo u want to play again? \n "; break;}
			}
			
			int x;
			cout<<"enter 1 to play again \n";
			cin>>x;
			if(x==1){continue;}
			else{exit(0);}

}while(true);
}
void initialization(){
	 c1='1';
	 c2='2';
	 c3='3';
	 c4='4';
	 c5='5';
	 c6='6';
	 c7='7';
	 c8='8';
	 c9='9';
}

void draw(){
	cout<<"\n\t"<<c1<<"\t | \t"<<c2<<"\t | \t"<<c3<<"\n";
	cout<<"\t---------------------------------\n";
	cout<<"\t"<<c4<<"\t | \t"<<c5<<"\t | \t"<<c6<<"\n";
	cout<<"\t---------------------------------\n";
	cout<<"\t"<<c7<<"\t | \t"<<c8<<"\t | \t"<<c9<<"\n";
	cout<<"\t---------------------------------\n";
}
void replace(int in , char c){	
		switch(in){	
			case 1:
				c1=c;
				break;
			case 2:
				c2=c;
				break;
			case 3:
				c3=c;
				break;
			case 4:
				c4=c;
				break;
			case 5:
				c5=c;
				break;
			case 6:
				c6=c;
				break;
			case 7:
				c7=c;
				break;
			case 8:
				c8=c;
				break;
			case 9:
				c9=c;
				break;

		}

}

bool noRepeat(int i){
		if ( i >0 && i<10 )
		{
			switch(i){	
				case 1:
					if(c1=='1'){return true;}
					else{return false;}
					break;
				case 2:
					if(c2=='2'){return true;}
					else{return false;}
					break;
				case 3:
					if(c3=='3'){return true;}
					else{return false;}
					break;
				case 4:
					if(c4=='4'){return true;}
					else{return false;}
					break;
				case 5:
					if(c5=='5'){return true;}
					else{return false;}
					break;
				case 6:
					if(c6=='6'){return true;}
					else{return false;}				
					break;
				case 7:
					if(c7=='7'){return true;}
					else{return false;}					
					break;
				case 8:
					if(c8=='8'){return true;}
					else{return false;}					
					break;
				case 9:
					if(c9=='9'){return true;}
					else{return false;}					
					break;
		}
	}
	else{
	return false;}
	
}

bool checkWinner(){
	return xCheckWinner() || oCheckWinner();
}

bool xCheckWinner(){
	
	bool r1=(c1=='X' && c2=='X' && c3=='X' );
	bool r2=(c4=='X' && c5=='X' && c6=='X' );
	bool r3=(c7=='X' && c8=='X' && c9=='X' );
	
	bool co1=(c1=='X' && c4=='X' && c7=='X' );
	bool co2=(c2=='X' && c5=='X' && c8=='X' );
	bool co3=(c3=='X' && c6=='X' && c9=='X' );		
	
	bool d1=(c1=='X' && c5=='X' && c9=='X' );
	bool d2=(c3=='X' && c5=='X' && c7=='X' );
	
	if(r1 || r2 || r3 || co1 || co2 || co3 || d1 || d2 ){
		cout<<"X : is the winner \n";
		return true;
	}
	return false;

}

bool oCheckWinner(){
	
	bool r1=(c1=='O' && c2=='O' && c3=='O' );
	bool r2=(c4=='O' && c5=='O' && c6=='O' );
	bool r3=(c7=='O' && c8=='O' && c9=='O' );
	
	bool co1=(c1=='O' && c4=='O' && c7=='O' );
	bool co2=(c2=='O' && c5=='O' && c8=='O' );
	bool co3=(c3=='O' && c6=='O' && c9=='O' );		
	
	bool d1=(c1=='O' && c5=='O' && c9=='O' );
	bool d2=(c3=='O' && c5=='O' && c7=='O' );
	
	if(r1 ||r2 || r3 || co1 || co2 || co3 || d1 || d2 ){
		cout<<"O : is the winner \n";
		return true;
	}
	else 
		return false;


}