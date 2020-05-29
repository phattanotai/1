#include <stdio.h>
#include <graphics.h>

FILE *gp;

void putfile(char *fname,int x1,int y1,int x2,int y2){
     int i,j,a;
     gp=fopen(fname,"r");
     if(gp==NULL)printf("%s",fname);
     if(gp!=NULL){
         for(i=x1;i<=x2;i++)
              for(j=y1;j<=y2;j++){
                    a=fgetc(gp);
                    if(a==20)a=13;
                    putpixel(i,j,a);
              }
     }
     fclose(gp);
}

void putimage(char *fname,int left,int top,int x_max,int y_max){ 
     readimagefile(fname,left,top,x_max,y_max); 
}

