#include "myinclude.h"


void init_window(){
    initwindow(800,600);
	setviewport(0,0,getmaxx(),getmaxy(),0);
	setbkcolor(bkcolor);
	clearviewport();
}


void button1(int look,int ix1,int iy1,int ix2,int iy2){
    if(look==0){
         setcolor(15);rectangle(ix1,iy1,ix2,iy2);
         setcolor(0);line(ix1,iy1,ix1,iy2);line(ix1,iy1,ix2,iy1);
   }if(look==1){
         setcolor(0);rectangle(ix1,iy1,ix2,iy2);
         setcolor(15);line(ix1,iy1,ix1,iy2);line(ix1,iy1,ix2,iy1);
   }
}


void button2(int color,int look,int ix1,int iy1,int ix2,int iy2){
   if(look==0){
        setcolor(8);rectangle(ix1-1,iy1-1,ix2+1,iy2+1);
        setfillstyle(1,color);bar(ix1,iy1,ix2,iy2);
        setcolor(15);rectangle(ix1,iy1,ix2,iy2);
        setcolor(0);line(ix1,iy1,ix1,iy2);line(ix1,iy1,ix2,iy1);
   
   }if(look==1){
        setcolor(8);rectangle(ix1-1,iy1-1,ix2+1,iy2+1);
        setfillstyle(1,color);bar(ix1,iy1,ix2,iy2);
        setcolor(0);rectangle(ix1,iy1,ix2,iy2);
        setcolor(15);line(ix1,iy1,ix1,iy2);line(ix1,iy1,ix2,iy1);
   }
}
