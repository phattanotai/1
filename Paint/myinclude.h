#include <stdlib.h>
#include <stdio.h>
#include <math.h>
#include <time.h>
#include <string.h>
#include <graphics.h>
#include <iostream>
#include <conio.h>

#define bkcolor 7

using namespace std;


//file
void putfile(char *fname,int x1,int y1,int x2,int y2);
void putimage(char *fname,int left,int top,int x_max,int y_max);

//window
void view();
void init_window();
void button1(int look,int ix1,int iy1,int ix2,int iy2);
void button2(int color,int look,int ix1,int iy1,int ix2,int iy2);

//mouse

void show_mousexy();
int * get_mouseclick(int index);
void get_mouseclick(int loop,int position[],int type);
void get_mouseclick(int index,int position[]);


//function
void draw_pixel(bool *status);
void draw_line(bool *status);
void draw_circle(bool *status);
void writefile();
void draw();

// menu
void click_menu(int click);
void check_menu(int position[],int click);

