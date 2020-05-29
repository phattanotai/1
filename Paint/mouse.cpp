#include "myinclude.h"

int color=0;

void show_mousexy(){                   
         if(mousey()>=60&&mousey()<=getmaxy()-25){
              int dy;
              char x[4],y[3];
              dy=mousey()-60;
              itoa(mousex(),x,10);                 
              itoa(dy,y,10);
              setcolor(0);
              outtextxy(5,getmaxy()-17,x);
              outtextxy(36,getmaxy()-17,",");
              outtextxy(44,getmaxy()-17,y);
              setcolor(bkcolor);
              delay(100);
              outtextxy(5,getmaxy()-17,x);
              outtextxy(36,getmaxy()-17,",");
              outtextxy(44,getmaxy()-17,y);
         } 
}


void get_mouseclick(int index,int position[]){
      int x=0,xc,yc;
      int i=0;
      while(i<index){
         show_mousexy();
         if(ismouseclick(WM_LBUTTONDOWN)){
            getmouseclick(WM_LBUTTONDOWN, xc, yc);
            position[x]= xc;
            position[x+1]= yc;
            x=x+2;
            i++; 
         }
      }
}

int * get_mouseclick(int index){
      int x=0,xc,yc;
      int i=0;
      int position[2];
      while(i<index){
         show_mousexy();
         if(ismouseclick(WM_LBUTTONDOWN)){
            getmouseclick(WM_LBUTTONDOWN, xc, yc);
            position[x]= xc;
            position[x+1]= yc;
            x=x+2;
            i++; 
         }
      }
      return position;
}

void get_mouseclick(int loop,int position[],int type){
      
      if(type==0){
           type=WM_MOUSEMOVE;
      }else if(type==1){
            type=WM_LBUTTONDBLCLK;
      }else if(type==2){
            type=WM_LBUTTONDOWN;
      }else if(type==3){
            type=WM_LBUTTONUP;
      }else if(type==4){
            type=WM_MBUTTONDBLCLK;
      }else if(type==5){
            type=WM_MBUTTONDOWN;
      }else if(type==6){
            type=WM_MBUTTONUP;
      }else if(type==7){
            type=WM_RBUTTONDBLCLK;
      }else if(type==8){
            type=WM_RBUTTONDOWN;
      }else if(type==9){
            type=WM_RBUTTONUP;
      }
      int x=0,xc,yc;
      int i=0;
      while(i<loop){
         show_mousexy();
         if(ismouseclick(type)){
            getmouseclick(type, xc, yc);
            position[x]= xc;
            position[x+1]= yc;
            x=x+2;
            i++; 
         }
      }
}

