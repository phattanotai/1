#include <stdio.h>
#include <stdlib.h>
#define L 10
//Selection Sort
int num[L],num1[L],i,j,temp,w,index;
void selection(){	
	int min,c;
	printf("\t\t\tNUMBER \n");
	for(i=0;i<L;i++){
		 num[i]=num1[i];
		 printf("%5d",num1[i]);}
	printf("\n\n");
	w=0;
	for(i=0;i<L-1;i++){
		index=i;
		min=num[i];
		for(j=i+1;j<L;j++)
			if(num[j]<min){
			min=num[j];
			index=j;}
		if(index!=i){
			temp=num[i];
			num[i]=num[index];
			num[index]=temp;
			w++;}
	    printf("\nRound %d \n\n",i+1);
	    for(c=0;c<L;c++)
			printf("%5d",num[c]);
	    printf("\n");}
	printf("...................................................\n\n");
	for(i=0;i<L;i++)
		printf("%5d",num[i]);
	printf("\n\n The number of moving all %d \n",w);
}

//Insertion Sort
void insertion(){
	int c;
	printf("\t\t\tNUMBER \n");
	for(i=0;i<L;i++){
		 num[i]=num1[i];
		 printf("%5d",num[i]);}
    printf("\n\n");
	w=c=0;
	for(i=1;i<L;i++){
      temp=num[i];										 
	  for(j=i-1;(j>=0)&&(temp<num[j]);j--){
		  num[j+1]=num[j];
		  w++;}
      if(num[j+1]!=temp){
		  num[j+1]=temp;
		  c++;}
	  printf("\nRound %d \n\n",i);
		   for(j=0;j<L;j++)
		     printf("%5d",num[j]);
	  printf("\n");}

	printf("\n The number of comparisons %d ",w);
	printf("\n The number of moving all %d ",c);
}


//Bubble Sort
void bubble(){
	int c,z;
	printf("\t\t\tNUMBER \n");
	for(i=0;i<L;i++){
		 num[i]=num1[i];
		printf("%5d",num[i]);}
	printf("\n\n");
	w=0;
	for(i=1;i<=L-1;i++){
		z=0;
		printf("\nRound %d \n\n",i);
		for(j=L-1;j>=i;j--){
			if (num[j]<num[j-1]){
				temp=num[j];
				num[j]=num[j-1];
				num[j-1]=temp;
				w++;z++;}
			for(c=0;c<L;c++)		
				printf("%5d",num[c]);
		    printf("\n");}
		printf("\n The number of moves in the round %d : %d ",i,z);
		printf("\n");}	
	printf("\n The number of moving all : %d ",w);
}void main(){
	int choice;
	randomize();
	
		for(i=0;i<10;i++){
			num1[i]=random(100)+1;}
	do{	
	     printf("\n\nMENU \n");
		 printf(" 1. Selection sort\n");
		 printf(" 2. Insertion sort\n");
		 printf(" 3. Dubble sort\n");
		 printf(" 4. Exit\n");
		 printf("Choice : "); scanf("\n%d",&choice);
		 switch(choice){
				case 1 : selection(); break;
				case 2 : insertion(); break;
				case 3 : bubble(); break;
				case 4 : break;}}
	while(choice!=4);
}