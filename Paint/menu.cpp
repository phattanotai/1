#include "myinclude.h"

bool status=true;

void view(){
    setfillstyle(1,15);
    bar(0,60,getmaxx(),getmaxy()-25);
    setcolor(15);
    line(1,1,getmaxx()-1,1);
    line(1,1,1,getmaxy()-1);
    line(getmaxx()-1,1,getmaxx()-1,getmaxy()-1);
    line(1,getmaxy()-1,getmaxx()-1,getmaxy()-1);
    setcolor(0);
    line(1,getmaxy()-25,getmaxx(),getmaxy()-25);
    line(1,60,getmaxx(),60);
   
    //setbutton
    
    //button1 
    button1(1,5,20,50,37);
    outtextxy(10,21,"Point");
    //putfile("save.car",15,21,45,36); //y==15 pixel
    
    //button2
    button1(1,60,20,110,37);
    outtextxy(65,21,"Line");
    
    //button3
    button1(1,120,20,170,37);
    outtextxy(125,21,"Ciecle");
    
    //button4
    button1(1,180,20,230,37);
    outtextxy(185,21,"Save");
    
    //button4
    button1(1,240,20,290,37);
    outtextxy(245,21,"load");
    
    //button4
    button1(1,300,20,350,37);
    outtextxy(305,21,"load1");
    
}

void click_menu(int click){
     int position[2];    
     get_mouseclick(1,position); 
     //pixel   
     if(position[0]>=5&&position[1]>=20&&position[0]<=50&&position[1]<=37){
         button1(0,5,20,50,37);delay(50);//button1(1,5,20,50,37);
         if(click==0){
             status=true;
             draw_pixel(&status);  
             click=1; 
         }
     }
     //line
     else if(position[0]>=60&&position[1]>=20&&position[0]<=110&&position[1]<=37){
         button1(0,60,20,110,37);delay(50);//button1(1,60,20,110,37);
         if(click==0){ 
             status=true;          
             draw_line(&status);
             click=1; 
         }
     }
     //circle
     else if(position[0]>=120&&position[1]>=20&&position[0]<=170&&position[1]<=37){
          button1(0,120,20,170,37);delay(50);//button1(1,120,20,170,37); 
          if(click==0){
             status=true;
             draw_circle(&status);  
             click=1; 
         }
     }
     //save
     else if(position[0]>=180&&position[1]>=20&&position[0]<=230&&position[1]<=37){
          button1(0,180,20,230,37);delay(50);button1(1,180,20,230,37); 
          if(click==0){
             status=true;
             writefile();  
             click=1; 
         }
     }   
     //loadimage
     else if(position[0]>=240&&position[1]>=20&&position[0]<=290&&position[1]<=37){
          button1(0,240,20,290,37);delay(50);button1(1,240,20,290,37); 
          if(click==0){
             status=true;
             putimage("3.jpg",0,250,200,400); 
             click=1; 
         }
     }    
     //load
     else if(position[0]>=300&&position[1]>=20&&position[0]<=350&&position[1]<=37){
          button1(0,300,20,350,37);delay(50);button1(1,300,20,350,37); 
          if(click==0){
             status=true;         
             draw();
             click=1; 
         }
     }     
}

void check_menu(int position[],int click){
     //pixel    
     if(position[0]>=5&&position[1]>=20&&position[0]<=50&&position[1]<=37){ 
        button1(1,5,20,50,37);
        button1(1,60,20,110,37);
        button1(1,120,20,170,37);
        button1(1,180,20,230,37);
        if(click==1){
             click=0;
             status=false; 
        }
     }
     //line
     else if(position[0]>=60&&position[1]>=20&&position[0]<=110&&position[1]<=37){ 
        button1(1,5,20,50,37);
        button1(1,60,20,110,37);
        button1(1,120,20,170,37);
        button1(1,180,20,230,37);
        if(click==1){
             click=0;
             status=false; 
        }
     }   
     //ciecle
     else if(position[0]>=120&&position[1]>=20&&position[0]<=170&&position[1]<=37){ 
        button1(1,5,20,50,37);
        button1(1,60,20,110,37);
        button1(1,120,20,170,37);
        button1(1,180,20,230,37);
        if(click==1){
             click=0;
             status=false; 
        }
     }   
     //save
     else if(position[0]>=180&&position[1]>=20&&position[0]<=230&&position[1]<=37){ 
        button1(1,5,20,50,37);
        button1(1,60,20,110,37);
        button1(1,120,20,170,37);
        button1(1,180,20,230,37);
        if(click==1){
             click=0;
             status=false; 
        }
     } 
     else if(position[0]>=240&&position[1]>=20&&position[0]<=290&&position[1]<=37){ 
        button1(1,5,20,50,37);
        button1(1,60,20,110,37);
        button1(1,120,20,170,37);
        button1(1,180,20,230,37);
        if(click==1){
             click=0;
             status=false; 
        }
     }      
     else if(position[0]>=300&&position[1]>=20&&position[0]<=350&&position[1]<=37){ 
        button1(1,5,20,50,37);
        button1(1,60,20,110,37);
        button1(1,120,20,170,37);
        button1(1,180,20,230,37);
        if(click==1){
             click=0;
             status=false; 
        }
     }           
}
