#include <stdio.h>
#include <conio.h>
#include <graphics.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include<conio.h>
#include<dos.h>
#include <thread>
int xc,yc;
int v=0,z=0;
union REGS in,out;
       int callmouse()
       {
              in.x.ax=1;
              int86(51,&in,&out);
              return 1;
       }
       void mouseposi(int &xpos,int &ypos,int &click)
       { 
              in.x.ax=3;
              int86(51,&in,&out);
              click=out.x.bx;
              xpos=out.x.cx;
              ypos=out.x.dx;
        }
       int mousehide()
       {
              in.x.ax=2;
              int86(51,&in,&out);
              return 1;
       }
      void setposi(int &xpos,int &ypos)
      { 
             in.x.ax=4;
             in.x.cx=xpos;
             in.x.dx=ypos;	 
             int86(51,&in,&out);
      }	
     
    
	 
	 void fill(int x,int y,int fc,int bc){
      
	  unsigned int c=getpixel(x,y);
	  if(c!=fc&&c!=bc){
		    delay(50);
			putpixel(x,y,fc);	
			fill(x-1,y,fc,bc);
			fill(x+1,y,fc,bc);
			fill(x,y-1,fc,bc);
			fill(x,y+1,fc,bc);
			v++;
			
	  }
     } 
	 
	 void drawline(int x,int y,int cl){   
			if(cl==1){
					if(z==0){
					    xc=x;
						yc=y;
						z=1;
				    }
					setcolor(1);
				    line(xc,yc,x,y);
					delay(200);
					setcolor(0);
					line(xc,yc,x,y);
					v=1;
           }if(cl==0&&v==1){
				   setcolor(1);
				   line(xc,yc,x,y);
				   v=0;
				   z=0;
		   }
	 }
	 
	 void drawpen(int x,int y,int cl){
			if(cl==1){
					if(z==0){
					    xc=x;
						yc=y;
						z=1;
				    }
					setcolor(1);
				    line(xc,yc,x,y);
					v=1;
					xc=x;
					yc=y;
           }if(cl==0&&v==1){
				   v=0;
				   z=0;
		   }
	 }	
     int main()
      {       
             int x,y,cl,a,b;	
             clrscr();
             int g=DETECT,m;
             initgraph(&g,&m,"c:\tc\bgi");
             a=200;
             b=200;
             setposi(a,b);
             callmouse();
			 setcolor(1);
			 circle(200,200,100);
			 do{
                mouseposi(x,y,cl);
				if(cl==1){
				    fill(x,y,2,1);
					z=1;
				}
				if(z==1){
				    printf("%d",v);
				}
			 }while(!kbhit());
	         getch();
             mousehide();
             getch();
     }

			