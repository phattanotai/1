#include <stdio.h>
#include <graphics.h>
#include <math.h>
#include <stdlib.h>

//?????? global
int data[500];
int index=0;
int qu[300],i_qu=0;
int color = 1;
int bkcolor = 0;
FILE *fp;
// function ?????????????
void m_line(int x0, int y0, int x1, int y1);
void set_color(int col);
void FloodFill(int pointx,int pointy,int OldColor);
void readFile();
void setdata();
void set_color(int col);
void rotation(int figure[],int cx,int cy,double angle);
void m_ellipse(int cx,int cy,int stangle,int endangle,int rx,int ry);
void m_circle(int cx,int cy,int radius);
void m_line(int x0, int y0, int x1, int y1);

//?????????????  file
void readFile(){
     char ch;
     char s[4];
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
//
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
//?????????
void set_color(int col){
         color = col;   
}
//????
void rotation(int figure[],int cx,int cy,double angle){
      int dx=figure[0]-cx;
      int dy=figure[1]-cy;
      angle=angle*3.14159/180;
      figure[0]=(int)(dx*cos(angle)-dy*sin(angle)+cx+0.5);
      figure[1]=(int)(dy*cos(angle)+dx*sin(angle)+cy+0.5);
}
void rotation1(int figure[],int cx,int cy,double angle,int rx,int ry){
      angle=angle*3.14159/180;
      figure[0]=(int)(cx+rx*cos(angle));
      figure[1]=(int)(cy+ry*sin(angle));     
}
//????
void m_ellipse(int cx,int cy,int stangle,int endangle,int rx,int ry){
     int figure[2],x,y;
     int i;
     figure[0]=cx+rx;
     figure[1]=cy;
     rotation1(figure,cx,cy,-stangle,rx,ry);
     for(i=stangle;i<=endangle;i+=10){
               x=figure[0];
               y=figure[1];
               rotation1(figure,cx,cy,-i,rx,ry);
               m_line(x,y,figure[0],figure[1]);        
     }   
}
void plot_pixel(int cx,int cy,int x,int y){
		putpixel(cx+x,(cy-y),color);
		putpixel(cx-x,(cy-y),color);
		putpixel(cx+x,(cy+y),color);
		putpixel(cx-x,(cy+y),color);
		putpixel(cx+y,(cy-x),color);
		putpixel(cx-y,(cy-x),color);
		putpixel(cx+y,(cy+x),color);
		putpixel(cx-y,(cy+x),color);
}
//?????
void m_circle(int cx,int cy,int radius){
		int x=0,y=radius;
		double h=1-radius;
		int dU,dD;
		plot_pixel(cx,cy,x,y);
		while(y>x){
			x++;
			if(h<0){
				dU=2*x+3;
				h=h+dU;
			}else{
				dD=2*(x-y)+5;
				h=h+dD;
				y--;
			} 
			plot_pixel(cx,cy,x,y);
		}
}
//----
//???????
void m_line(int x0, int y0, int x1, int y1){
  int dx = abs(x1-x0);
  int sx = x0<x1 ? 1 : -1;
  int dy = abs(y1-y0);
  int sy = y0<y1 ? 1 : -1; 
  int err = (dx>dy ? dx : -dy)/2, e2;
  int i=0;
  while(i==0){
    putpixel(x0,y0,color);
    if (x0==x1 && y0==y1){
            break;
    }
    e2 = err;
    if (e2 >-dx) { 
           err -= dy; 
           x0 += sx; }
    if (e2 < dy) { 
           err += dx; 
           y0 += sy; }
  }
}
//??????????
void m_bar(int x1,int y1,int x2,int y2){
     int i;
     setcolor(bkcolor);
     for(i=y1;i<=y2;i++){
          line(x1,i,x2,i);   
     }
}
//??????
void FloodFill(int pointx,int pointy,int OldColor){
    int Intensity=getpixel(pointx,pointy);
    if(Intensity==OldColor){
        putpixel(pointx,pointy,color);
        FloodFill(pointx+1,pointy,OldColor);
        FloodFill(pointx-1,pointy,OldColor);
        FloodFill(pointx,pointy+1,OldColor);
        FloodFill(pointx,pointy-1,OldColor);
    }
}
//setgraphicsmode
void setgraphics(){
	    int gd=DETECT,gm;
		initgraph(&gd,&gm,"C:\\TC\\BGI");
}
//?????
void start(){
	      setgraphics();
	    outtextxy(255,50,"Projact  Report");
		outtextxy(294,90,"on");    
		outtextxy(270,130,"Animation") ;     
		outtextxy(260,170,"Submitted by") ;    
        outtextxy(260,230,"55522201053") ; 
		outtextxy(268,290,"Present to ") ; 
		outtextxy(230,330,"Professor  Namchoke") ; 
		outtextxy(240,370,"November  30,2014") ; 
		setcolor(RED);
		outtextxy (218,460,"Press any key to view  "); 
		getch();
		clearviewport();
}
//???
void road(){
			 set_color(1);
			 m_line(0,200,getmaxx(),200);
			 m_line(0,400,getmaxx(),400);
			 set_color(GREEN);
			 m_ellipse(100,150,10,170,150,100);
			 m_ellipse(290,150,10,139,150,100);
			 m_ellipse(480,150,0,132,150,100);	
			 set_color(YELLOW);
		     m_ellipse(385,65,5,180,20,23);
			 FloodFill(385,65,0);
}
void bicycle(int x){  //????????????
	   m_circle(46+x,359,31);
       m_circle(152+x,362,32);
       m_circle(91+x,367,11);
       m_circle(47+x,361,7);
       m_line(45+x,362,91+x,367);
       m_line(46+x,360,81+x,336);
       m_line(78+x,327,90+x,365);
       m_line(92+x,368,134+x,330);
       m_line(82+x,332,131+x,326);
       m_line(129+x,319,142+x,345);
       m_line(142+x,345,151+x,362);
       m_line(78+x,330,71+x,313);
       m_line(58+x,310,63+x,316);
       m_line(65+x,316,72+x,316); 
       m_line(59+x,309,81+x,309);
       m_line(75+x,314,82+x,307);
       m_line(129+x,319,135+x,315);
       m_line(151+x,315,134+x,315);
       m_line(153+x,314,155+x,321);
       m_line(143+x,327,150+x,327);
       m_line(150+x,326,154+x,323);
       m_line(154+x,312,156+x,309);
       m_line(73+x,317,75+x,315);
       m_line(45+x,361,50+x,358); 
       m_line(80+x,333,86+x,332);
       m_line(89+x,363,93+x,367);
       m_line(89+x,366,93+x,367);
       m_line(151+x,327,155+x,323);
       m_line(154+x,315,156+x,322);
       m_line(152+x,315,155+x,315);
       m_line(73+x,315,79+x,315);
       m_line(81+x,309,82+x,312);
       m_line(78+x,315,83+x,310);
       m_line(63+x,316,67+x,316); 
       m_line(74+x,316,79+x,332);
       m_line(46+x,354,91+x,355);
       m_line(44+x,367,90+x,377);
}
void roadLine(int x){ //?????????
        m_line(50-x,300,150-x,300);
        m_line(200-x,300,300-x,300); 
        m_line(350-x,300,450-x,300);
        m_line(500-x,300,600-x,300);  
        m_line(650-x,300,750-x,300);
        m_line(800-x,300,900-x,300);
        m_line(950-x,300,1050-x,300);
        m_line(1100-x,300,1200-x,300);
}
void animate(int x,int frame){
     set_color(RED);
     bicycle(x);    
     if(frame==1){    
         set_color(1); //human1
         m_circle(134+x,274,10);
         m_line(114+x,280,132+x,302); 
         m_line(132+x,303,155+x,311); 
         m_line(125+x,277,91+x,283);
         m_line(91+x,283,70+x,306);
         m_line(71+x,306,112+x,314);
         m_line(113+x,315,102+x,348);
         m_line(71+x,305,93+x,338);
         m_line(81+x,374,93+x,336);
         m_line(117+x,279,127+x,303);
         m_line(128+x,305,147+x,321);
         m_line(155+x,319,146+x,322);       
         m_line(103+x,348,108+x,348);         
         m_line(83+x,374,87+x,380);                
         set_color(RED); //?????
         m_line(152+x,362,169+x,385);
         m_line(152+x,361,172+x,339);
         m_line(151+x,362,131+x,339);
         m_line(153+x,361,134+x,384);
         m_line(45+x,361,45+x,387);
         m_line(46+x,361,13+x,359);
         m_line(47+x,359,47+x,327);
         m_line(46+x,360,75+x,358);
         m_line(92+x,366,82+x,374);
         m_line(93+x,366,103+x,349);   
         m_line(25+x,337,47+x,360);
         m_line(45+x,360,63+x,382); 
         m_line(46+x,361,27+x,380); 
         m_line(150+x,363,122+x,362); 
         m_line(152+x,363,182+x,364); 
         m_line(152+x,365,150+x,390); 
         m_line(152+x,360,153+x,332);         
     }else if(frame==2){         
         set_color(1);         //human2
         m_circle(134+x,274,10);
         m_line(114+x,280,132+x,302); 
         m_line(132+x,303,155+x,311); 
         m_line(124+x,277,93+x,282);
         m_line(93+x,282,69+x,305);
         m_line(117+x,279,127+x,304);
         m_line(150+x,321,128+x,306);
         m_line(150+x,321,156+x,319);
         m_line(129+x,307,127+x,303);
         m_line(69+x,306,99+x,343);
         m_line(99+x,343,103+x,374);
         m_line(103+x,374,107+x,374);
         m_line(78+x,312,101+x,331);
         m_line(79+x,353,99+x,329);       
         set_color(RED);        //  ?????
         m_line(150+x,361,183+x,359);
         m_line(151+x,362,152+x,393);
         m_line(149+x,360,120+x,361);
         m_line(152+x,361,151+x,331);
         m_line(44+x,360,30+x,382);
         m_line(45+x,359,24+x,338);
         m_line(44+x,361,58+x,332);
         m_line(44+x,359,59+x,382);
         m_line(91+x,366,104+x,376);
         m_line(92+x,366,79+x,354);             
         m_line(151+x,362,174+x,382);
         m_line(152+x,362,129+x,382);
         m_line(151+x,361,173+x,338);
         m_line(45+x,359,16+x,362);
         m_line(45+x,359,41+x,330);
         m_line(45+x,358,44+x,389);                    
     }else{
         set_color(1);   //human3
         m_circle(135+x,270,11);
         m_line(125+x,277,91+x,283);
         m_line(91+x,283,70+x,306);
         m_line(115+x,279,128+x,303);
         m_line(129+x,304,150+x,320);
         m_line(154+x,320,149+x,320);
         m_line(112+x,281,132+x,300);
         m_line(133+x,300,156+x,310);
         m_line(71+x,306,100+x,327);
         m_line(100+x,327,90+x,349);
         m_line(89+x,348,95+x,348);
         m_line(76+x,314,91+x,336);
         m_line(91+x,336,93+x,379);
         m_line(93+x,379,100+x,379);          
         set_color(RED);  //?????
         m_line(91+x,367,93+x,380); 
         m_line(91+x,365,90+x,350); 
         m_line(151+x,361,141+x,389);       
         m_line(150+x,360,162+x,332);
         m_line(151+x,362,175+x,380);
         m_line(151+x,362,125+x,349);
         m_line(150+x,360,181+x,351);
         m_line(149+x,360,124+x,374);
         m_line(150+x,362,161+x,390);
         m_line(46+x,361,33+x,385);
         m_line(45+x,361,16+x,362);
         m_line(44+x,362,30+x,334);
         m_line(44+x,359,53+x,330);
         m_line(48+x,360,57+x,383);
         m_line(49+x,359,75+x,358);
     }
}
void reMove(int x,int color){   //????????????????????????
		 set_color(color);
		 setfillstyle(1,color);
		 bar(x, 250, 200+x, 400-1);
}
void keyFrame(int dx,int del){
			int x=0;		
			char ch='r';	
			int frame=1;		    
        	road();
			while(ch!='q'){
				if(kbhit()){ 				//?????????????????? keyboard
					  ch = getch();
				}
				if(x<=getmaxx()){    
					if(ch=='r'){
                        reMove(x,bkcolor);
                        roadLine(x);
                        x+=dx; 	
                        set_color(YELLOW);
                        roadLine(x);										
						animate(x,frame);		 
  	                    if(frame==1){frame++;}
                        else if(frame==2){frame++;}
                        else if(frame==3){frame=1;}  
						delay(del);	//??????  
					}      
					if(ch=='s'){       //??? ch ??????? s ?????????????
					    ch='r';
						dx+=10;
						del-=50;
				    }else if(ch=='a'){   //??? ch ??????? a ??????????
					    ch='r';
						dx-=10;
						del+=50;
				    }
				}else{
					x=-170;  
				}
			 }  
}
//main function
int main(){
    	int dx=20;
    	int del=600;
		start();
		keyFrame(dx,del);
		delay(100);
		closegraph( );
		return( 0 );
}