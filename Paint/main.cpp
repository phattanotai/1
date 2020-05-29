#include "myinclude.h"


int main() {   
    init_window();
    bool ch=true;
    view(); 
    //putimage("2.jpg",0,200,200,300); 
    
    while(ch){      
          show_mousexy();
          click_menu(0);
    }          
    getch(); 
    closegraph();
	
} 
