#include "myinclude.h"
int data[2000],;
FILE * fp;
int index=0;
int qu[500],i_qu=0;

void writefile(){ 
     fp = fopen("data.dat","w");
     int k=0;
     cout<<1;
     int i=0;
     while(i<=index){
         while(data[k]!=0){
             fprintf(fp,"%d\t",data[k]);
             k++;     
         } 
         if(data[k]==0){k++;}
         fprintf(fp,"\n");
         i=k;;
     }
     
     fclose(fp);
}

void readFile(){
     char ch;
     char s[3];
     int k=0,i=0;    
	 fp = fopen("data.dat","r");
     while(!feof(fp)){
         fscanf(fp,"%c",&ch);
         if(ch=='\n'){k++;}     
         if(ch!='\t'){ 
             s[i]=ch;  
             i++; 
             s[i]=' ';        
         }else if(ch=='\t'){
             i=0;
             data[k]=atoi(s);
             k++;
         } 
     } 
     index=k-2;
     fclose(fp);
}
void setdata(){
    int l=0,i;
    readFile();
	for( i=0;i<=index;i++){
        if(data[i]!=0){
              l++;               
        }else if(data[i]==0){
              qu[i_qu]=l;
              l=0;
              i_qu++;
        }
    }      
}
void draw(){
    readFile();
    setdata();
	int i;
	i_qu=0;
	setcolor(RED);
	for(i=0;i<index;i++){
              if(data[i]==0){i++;}
              if(qu[i_qu]==4){
                  line(data[i],data[i+1],data[i+2],data[i+3]); 
                  i+=4; 
              }else if(qu[i_qu]==3){
                  circle(data[i],data[i+1],data[i+2]);
                  i+=3;  
              }
              i_qu++;
        }
}
void draw_pixel(bool *status){
      int position[2],x,y;
      show_mousexy();
      while(*status){
            get_mouseclick(1,position);
            x=position[0];
            y=position[1];
            if(position[1]<=60){
                 check_menu(position,1);                   
            }else{
                 putpixel(x,y,RED);
                 data[index]=x;
                 data[index+1]=y;
                 index+=3;
            }
       }                                                                                  
}

void draw_line(bool *status){
      int position[2],x2,y2,x1,y1;
      show_mousexy();
      while(*status){
            get_mouseclick(1,position);
            x1=position[0];
            y1=position[1];
            if(position[1]<=60){
                 check_menu(position,1);                   
            }else{
                 get_mouseclick(1,position);
                 x2=position[0];
                 y2=position[1];
                 setcolor(RED); 
                 line(x1,y1,x2,y2);
                 data[index]=x1;
                 data[index+1]=y1;
                 data[index+2]=x2;
                 data[index+3]=y2;
                 index+=5;
            }
       }               
}
void draw_circle(bool *status){
      int position[2],x,y,x2,y2,r;
      double dx,dy;
      show_mousexy();
      while(*status){
            get_mouseclick(1,position);
            x=position[0];
            y=position[1];
            if(position[1]<=60){
                 check_menu(position,1);                   
            }else{
                 get_mouseclick(1,position);
                 x2=position[0];
                 y2=position[1];
                 dx=abs(x2-x);
                 dy=abs(y2-y);
                 dx=pow(dx,2);
                 dy=pow(dy,2);
                 r=round(sqrt(dx+dy));
                 setcolor(RED);
                 circle(x,y,r);
                 data[index]=x;
                 data[index+1]=y;
                 data[index+2]=r;
                 index+=4;
            }
       }        
              
}
void draw_fill(bool *status){
     int position[2],x,y;
      show_mousexy();
      while(*status){
            get_mouseclick(1,position);
            x=position[0];
            y=position[1];
            if(position[1]<=60){
                 check_menu(position,1);                   
            }else{
                 putpixel(x,y,RED);

            }
       }                                                      
}
