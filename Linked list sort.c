#include <stdio.h>
#include <stdlib.h> 
int s,r,i,n,e;

 struct node { 
	int    data;
	struct node *next;
}datanode;
 
 struct node*first,*a,*j,*z,*x,*c;
 struct node*tempnode,*nodetemp;

void createnewnode(){
	e=0;
	first=NULL;
	nodetemp=(struct node *)calloc(sizeof(datanode),1);
	tempnode=nodetemp;

}void insertnode(){
	int num;
		printf("Enter Size of the list : ");scanf("%d",&n);
		e=e+n;
		for(i=0;i<n;i++){
			s=1;
			if(first==NULL){
				printf("Enter Number :");
				scanf("%d",&num);
				tempnode->data=num;
				tempnode->next=NULL;
				first=tempnode;}
			else if(first!=NULL){
				a=first;
				while(a!=NULL){
					if((a->next==NULL)&&(s==1)){
						printf("Enter Number :");
						scanf("%d",&num);
						tempnode=(struct node *)calloc(sizeof(datanode),1);
						a->next=tempnode;
						tempnode->data=num;
						tempnode->next=NULL;
						s++;} 
					 a=a->next;}}}
}void  print(){
   nodetemp=first;
   while(nodetemp!=NULL){
			 printf("%5d",nodetemp->data);
			 nodetemp=nodetemp->next;}
	printf("\n\n");

}void deletenode(){
				e--;
				a=first->next;
				c=first;
				while(c!=NULL){
					if(a->next==NULL){
						c->next=a->next;
						free(a);}
					c=c->next;
					a=a->next;}
				
}void destroylise(){
			a=first;
			for(i=e;i>0;i++){
				e--;
				first=a->next;
				c=a;
				a=a->next;
				free(c);}
}void selection(){
	struct node *min;
	int temp;
	s=r=0;
	c=first;
	for(a=c;((a!=NULL)&&(a->next!=NULL));a=a->next){
		printf("Round %d \n",s+1);
		min=a;
		for(j=a->next;j!=NULL;j=j->next){
			if(j->data<min->data)
				min=j;}

			if(min!=a){
				temp=min->data;
				min->data=a->data;
				a->data=temp;
				r++;}
		s++;
		print();}
		printf("\nThe number of moving all : %d\n",r);

}void insertion(){
	r=0;
	for(s=1;s<=e;s++){
		printf("Round %d \n",s);
				
				c=first;
				for(i=1;i<s;i++){
					x=c;
					c=c->next;}
				a=first;
				j=first->next;
				z=n=0;
				for(i=1;i<s;i++){
					if ((c->data<a->data)&&(n==0)){
							if(c==j){
								a->next=c->next;
								c->next=a;
								if(a==first)
									first=c;
								else 
									z->next=c;}
							else{
								x->next=c->next;
								c->next=a;
								if(a==first)
									first=c;
								else 
									z->next=c;}
								n++;r++;}
							z=a;
							a=a->next;
							j=j->next; }
						 print();}
							 
			printf("\nThe number of moving all : %d\n",r);

}void bubble(){
	r=0;
	for(s=1+1;s<=e;s++){
		n=0;
		printf("Round %d \n",s-1);
		  for(a=first,j=first->next,i=e,z=NULL;a!=NULL&&j!=NULL&&i>=s;z=a,a=a->next,j=j->next,i--){
					
						if (a->data>j->data){
							a->next=j->next;
							j->next=a;
							if(a==first)
								first=j;
							else 
								z->next=j;
							a=j;
							j=j->next;
							r++;n++;}
						 print();}
							 printf("\nThe number of moves in the round %d : %d\n\n",s,n);}
							 
							 printf("The number of moving all : %d\n",r);

}void main(){
	int choice;
							printf("Menu\n");
						   
					 do{   printf(" 1. Create List\n");
						   printf(" 2. Add Node\n");
			               printf(" 3. Choose a sort\n");
			               printf(" 4. Delete Node\n");
						   printf(" 5. Display\n");
			               printf(" 6. Destroy List\n");
			               printf("Choice : "); scanf("%d",&choice);
						   printf("\n");
						  switch(choice){
							case 1 : createnewnode();break;
				
							case 2 : printf("1.Add Node\n");
									 printf("2.Back To Menu\n");
									 
									 
									 do{
										printf("\nEnter :");
										scanf("%d",&r);
										switch(r){
											case 1 : insertnode();break;
											case 2 : break;}}
										while(r!=2);		
									  break;
							
							case 3 : printf("Choose a sort\n");
									 printf("1.Selection Sort\n2.Insertion Sort\n3.Bubble Sort\n4.Exit\n");
									 do{
										printf("\nEnter : ");scanf("%d",&r);
										switch(r){
											case 1 : if(first!=NULL){ print();selection();}break;
											case 2 : if(first!=NULL){print();insertion();} break;
											case 3 : if(first!=NULL){print();bubble();}	break;
											case 4 : break;}}
									while(r!=4);break;
							case 4 : deletenode();  break;
							case 5 : print();break;
							case 6 : destroylise(); break;}}
					    while(choice!=6);
}
