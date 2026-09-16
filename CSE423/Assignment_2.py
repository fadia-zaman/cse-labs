from OpenGL.GL import *     
from OpenGL.GLUT import *   
from OpenGL.GLU import *  
import math
import random

WINDOW_WIDTH, WINDOW_HEIGHT = 800, 800
diamond_x=random.randint(20,780)
diamond_y=750
diamond_size=20
diamond_speed=0.3
diamond_r=random.random()
diamond_g=random.random()
diamond_b=random.random()

catcher_x=400
catcher_y=50

point=0
game_off=False
pause=False
cheat=False
def find_zone(dx,dy):
    if abs(dx)>=abs(dy):
        if dx>=0 and dy>=0:
            return 0
        elif dx<0 and dy>=0:
            return 3
        elif dx<0 and dy<0:
            return 4
        else:
            return 7
        
    else:
        if dx>=0 and dy>=0:
            return 1
        elif dx<0 and dy>=0:
            return 2
        elif dx<0 and dy<0:
            return 5
        else:
            return 6
        
def convertion_to0(x,y,z):
    if z==0:
        return x,y
    if z==1:
        return y,x
    if z==2:
        return y,-x
    if z==3:
        return -x,y
    if z==4:
        return -x,-y
    if z==5:
        return -y,-x
    if z==6:
        return -y,x
    if z==7:
        return x,-y    

    
def convertion_from0(x,y,z):
    if z==0:
        return x,y
    if z==1:
        return y,x
    if z==2:
        return -y,x
    if z==3:
        return -x,y
    if z==4:
        return -x,-y
    if z==5:
        return -y,-x
    if z==6:
        return y,-x
    if z==7:
        return x,-y    

def midpointlinealgo(x1,y1,x2,y2):
    dx=x2-x1
    dy=y2-y1
    z=find_zone(dx,dy)
    x1,y1=convertion_to0(x1,y1,z)
    x2,y2=convertion_to0(x2,y2,z)
    dx=x2-x1
    dy=y2-y1
    
    d=2*dy-dx
    e=2*dy
    ne=2*(dy-dx)
    
    while x1<=x2:
        final_x,final_y=convertion_from0(x1,y1,z)
        draw_points(final_x,final_y)
        if d>0:
            d+=ne
            y1+=1
            x1+=1
        else:
            d+=e
            x1+=1
        
    
    
def draw_points(x,y):
    glPointSize(2)         
    glBegin(GL_POINTS)      
    glVertex2f(x,y)         
    glEnd()       

def draw_diamond(x,y,size):
    midpointlinealgo(x,y+size,x+size,y)
    midpointlinealgo(x+size,y,x,y-size)
    midpointlinealgo(x,y-size,x-size,y)
    midpointlinealgo(x-size,y,x,y+size)
    
def draw_catcher(x,y):
    midpointlinealgo(x-50,y+20,x+50,y+20)
    midpointlinealgo(x-70,y,x-50,y+20)
    midpointlinealgo(x+50,y+20,x+70,y)
    midpointlinealgo(x-70,y,x+70,y)
    
    
def draw_startagain():
    midpointlinealgo(70,780,50,760)
    midpointlinealgo(50,760,70,740)
    midpointlinealgo(50,760,100,760)
     
 
def draw_terminate():
    midpointlinealgo(750,780,780,740)
    midpointlinealgo(750,740,780,780)  
    

def draw_playing():
    midpointlinealgo(380,780,380,740) 
    midpointlinealgo(420,740,420,780) 
    
    
def draw_paused():
    midpointlinealgo(380,780,380,740)
    midpointlinealgo(380,780,430,760)
    midpointlinealgo(380,740,430,760)
    
def keyboard_listener(key, x, y):
    global cheat
    if key == b'c':  
        cheat=not cheat
    glutPostRedisplay()    
        
        
def special_key_listener(key, x, y):
    if game_off or pause:
        return
    
    global catcher_x
    
    if key==GLUT_KEY_LEFT:
        if catcher_x-80>0:
            catcher_x-=20
        
    elif key==GLUT_KEY_RIGHT:
        if catcher_x+80<800:
            catcher_x+=20
        
    glutPostRedisplay()
    
    
def mouse_listener(button, state, x, y):
    global point,game_off,pause,diamond_x,diamond_y,diamond_r,diamond_g,diamond_b,diamond_speed
    y=WINDOW_HEIGHT-y
    
    if button == GLUT_LEFT_BUTTON and state == GLUT_DOWN:
        if 750<=x<=780 and 740<=y<=780:
            print("GOODBYE")
            glutLeaveMainLoop()
            
        if 50<=x<=100 and 740<=y<=780:
            point=0
            game_off=False
            diamond_x=random.randint(20,780)
            diamond_y=750
            diamond_speed=0.3
            diamond_r=random.random()
            diamond_g=random.random()
            diamond_b=random.random()
            print("STARTING OVER!")
            
        if 380<=x<=430 and 740<=y<=780:
            pause=not pause    
            
            
    
def animate():
    global diamond_x,diamond_y,diamond_r,diamond_g,diamond_b,point,game_off,diamond_speed,catcher_x
    if game_off or pause:
        glutPostRedisplay()
        return 
    diamond_y-=diamond_speed
    
    if cheat:
        catcher_speed=diamond_speed+10
        if abs(catcher_x-diamond_x)<=catcher_speed:
            catcher_x=diamond_x
        elif catcher_x<diamond_x:
            catcher_x+=catcher_speed
        elif catcher_x>diamond_x:
            catcher_x-=catcher_speed
            
        if catcher_x<20:
            catcher_x=50
        if catcher_x>760:
            catcher_x=760    
    if collided():
        point+=1
        diamond_speed+=0.1
        print("score:",point)
        
        diamond_y=780
        diamond_x=random.randint(20,780)
        diamond_r=random.random()
        diamond_g=random.random()
        diamond_b=random.random()
        
    elif diamond_y<0:
        print("GAME OVER! score:",point)    
        game_off=True
    glutPostRedisplay()
    
    
def collided():
        dleft=diamond_x-diamond_size
        dright=diamond_x+diamond_size
        dtop=diamond_y+diamond_size
        dbottom=diamond_y-diamond_size
        cleft=catcher_x-70
        cright=catcher_x+70
        ctop=catcher_y+20
        cbottom=catcher_y
        
        if dright>=cleft and dleft<=cright and dbottom<=ctop and dtop>=cbottom:
            return True
        return False
        
        
def setup_projection():
    glViewport(0, 0, 800, 800)     
    glMatrixMode(GL_PROJECTION)    
    glLoadIdentity()         
    glOrtho(0.0, 800, 0.0, 800, 0.0, 1.0)  
    glMatrixMode(GL_MODELVIEW)     


def display():
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)  
    glLoadIdentity()                                    
    setup_projection()                                  
    glColor3f(diamond_r,diamond_g,diamond_b)                            
    draw_diamond(diamond_x,diamond_y,diamond_size) 
    if game_off:
        glColor3f(1.0,0.0,0.0)
    else:
        glColor3f(1.0,1.0,1.0)
    draw_catcher(catcher_x,catcher_y)
    glColor3f(0.0,1.0,0.937)
    draw_startagain()
    glColor3f(0.545,0.0,0.0)
    draw_terminate()
    glColor3f(0.96,0.9098,0.67)
    if pause:
        draw_paused()
    else:
        draw_playing()        
    glutSwapBuffers()                                   


def main():
    glutInit()                               
    glutInitDisplayMode(GLUT_RGBA|GLUT_DOUBLE)           
    glutInitWindowSize(800, 800)             
    glutInitWindowPosition(0, 0)             
    glutCreateWindow(b"OpenGL 2D Point")    
    glutDisplayFunc(display)     
    glutIdleFunc(animate)
    glutSpecialFunc(special_key_listener)
    glutMouseFunc(mouse_listener)
    glutKeyboardFunc(keyboard_listener)
    glutMainLoop()  
          

if __name__ == "__main__":
    main()
