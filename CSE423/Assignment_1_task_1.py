#Assignment_1_Task_2
from OpenGL.GL import *     
from OpenGL.GLUT import *   
from OpenGL.GLU import *    
import math

rain_x1=100
rain_y1=700

rain_x3=200
rain_y3=750

rain_x2=400
rain_y2=720

rain_x6=560
rain_y6=770

rain_x8=640
rain_y8=835

rain_x4=870
rain_y4=850

rain_x7=800
rain_y7=820

rain_x5=700
rain_y5=800

rain_speed=2
rain_direction=0
bg=0.0

def draw_house():   
    glColor3f(0.0, 0.0, 0.55)        
    glBegin(GL_TRIANGLES)     
    glVertex2f(750,600) 
    glVertex2f(250,600) 
    glVertex2f(250,400) 
    glEnd()
    
    glColor3f(0.0, 0.0, 0.54)  
    glBegin(GL_TRIANGLES)      
    glVertex2f(750,400) 
    glVertex2f(750,600) 
    glVertex2f(250,400) 
    glEnd()
    
    glColor3f(0.9, 0.33, 0.5)  
    glBegin(GL_TRIANGLES)      
    glVertex2f(850,600) 
    glVertex2f(500,750) 
    glVertex2f(150,600) 
    glEnd()               
    
     
    
def draw_floor():    
    glColor3f(0.6, 0.4, 0.0)
    glBegin(GL_TRIANGLES)      
    glVertex2f(1000,650) 
    glVertex2f(0,650) 
    glVertex2f(0,0) 
    glEnd()
    
    glBegin(GL_TRIANGLES)      
    glVertex2f(1000,0) 
    glVertex2f(1000,650) 
    glVertex2f(0,0) 
    glEnd()      
 
def draw_greens():
    glColor3f(0.0, 1.0, 0.0)        
    glBegin(GL_TRIANGLES)      
    glVertex2f(85,550) 
    glVertex2f(42,640) 
    glVertex2f(0,550) 
    glEnd()
    
    glColor3f(0.0, 1.0, 0.0)  
    glBegin(GL_TRIANGLES)      
    glVertex2f(165,550) 
    glVertex2f(125,640) 
    glVertex2f(85,550) 
    glEnd()
       
    
    glColor3f(0.0, 1.0, 0.0)        
    glBegin(GL_TRIANGLES)     
    glVertex2f(250,550) 
    glVertex2f(208,640) 
    glVertex2f(165,550) 
    glEnd()
    
    glColor3f(0.0, 1.0, 0.0)  
    glBegin(GL_TRIANGLES)      
    glVertex2f(835,550) 
    glVertex2f(792,640) 
    glVertex2f(750,550) 
    glEnd()     
    
    glColor3f(0.0, 1.0, 0.0)  
    glBegin(GL_TRIANGLES)     
    glVertex2f(918,550) 
    glVertex2f(877,640) 
    glVertex2f(835,550) 
    glEnd()
    
    glColor3f(0.0, 1.0, 0.0)  
    glBegin(GL_TRIANGLES)      
    glVertex2f(1000,550) 
    glVertex2f(960,640) 
    glVertex2f(918,550) 
    glEnd()             
     
def draw_windowdoor():
    glColor3f(1.0, 1.0, 1.0)  
    glBegin(GL_TRIANGLES)      
    glVertex2f(650,550) 
    glVertex2f(550,550) 
    glVertex2f(550,450) 
    glEnd()
    
    glColor3f(1.0, 1.0, 1.0)  
    glBegin(GL_TRIANGLES)     
    glVertex2f(650,450) 
    glVertex2f(650,550) 
    glVertex2f(550,450) 
    glEnd()  
    
    glColor3f(1.0, 1.0, 1.0)  
    glBegin(GL_TRIANGLES)    
    glVertex2f(500,525) 
    glVertex2f(375,525) 
    glVertex2f(375,400) 
    glEnd()
    
    glColor3f(1.0, 1.0, 1.0)  
    glBegin(GL_TRIANGLES)     
    glVertex2f(500,400) 
    glVertex2f(500,525) 
    glVertex2f(375,400) 
    glEnd()  
    
    glColor3f(0.0, 0.0, 0.0)
    glLineWidth(2)
    glBegin(GL_LINES)
    glVertex2f(600,550) 
    glVertex2f(600,450)
    glEnd() 
    
    glColor3f(0.0, 0.0, 0.0)
    glLineWidth(2)
    glBegin(GL_LINES)
    glVertex2f(550,500) 
    glVertex2f(650,500)
    glEnd() 
    
    glPointSize(10)  
    glColor3f(0.0, 0.0, 0.0)
    glBegin(GL_POINTS)  
    glVertex2f(475,450) 
    glEnd()            
    
def draw_rain(x,y):
    if bg>0.5:
        glColor3f(0.53, 0.81, 0.92)
    else:
        glColor3f(0.04, 0.66, 0.9)
    glBegin(GL_LINES)
    glVertex2f(x,y) 
    glVertex2f(x+rain_direction,y-30)
    glEnd()
    
def animate():
    global rain_x1, rain_y1, rain_x2, rain_y2, rain_x3, rain_y3, rain_x4, rain_y4, rain_x5, rain_y5, rain_x6, rain_y6, rain_x7, rain_y7, rain_x8, rain_y8
    rain_x1+=rain_direction
    rain_y1-=rain_speed
    
    rain_x2+=rain_direction
    rain_y2-=rain_speed
    
    rain_x3+=rain_direction
    rain_y3-=rain_speed
    
    rain_x4+=rain_direction
    rain_y4-=rain_speed
    
    rain_x5+=rain_direction
    rain_y5-=rain_speed
    
    rain_x6+=rain_direction
    rain_y6-=rain_speed
    
    rain_x7+=rain_direction
    rain_y7-=rain_speed
    
    rain_x8+=rain_direction
    rain_y8-=rain_speed
    
    if(rain_y1<0):
     rain_y1=700
     rain_x1=100
     
    if(rain_y2<0):
     rain_y2=720
     rain_x2=400
     
    if(rain_y3<0):
     rain_y3=750
     rain_x3=200
     
    if(rain_y4<0):
     rain_y4=850
     rain_x4=870
     
    if(rain_y5<0):
     rain_y5=800  
     rain_x5=700
     
    if(rain_y6<0):
     rain_y6=770
     rain_x6=560
     
    if(rain_y7<0):
     rain_y7=820
     rain_x7=800
     
    if(rain_y8<0):
     rain_y8=835
     rain_x8=640
    glutPostRedisplay()
    
def special_key_listener(key, x, y):
    
    global rain_direction
    if key == GLUT_KEY_RIGHT and rain_direction<10:
        rain_direction+=1
        
    elif key == GLUT_KEY_LEFT and rain_direction>-10:
        rain_direction-=1
        
    glutPostRedisplay()    
    
def keyboard_listener(key, x, y):
    
    global bg
    if key == b'f': 
        bg=min(1.0,bg+0.05)
    elif key == b'z':  
        bg=max(0.0,bg-0.05)
    glutPostRedisplay()    
    

def setup_projection():
    glViewport(0, 0, 1000, 1000)     
    glMatrixMode(GL_PROJECTION)    
    glLoadIdentity()               
    glOrtho(0.0, 1000, 0.0, 1000, 0.0, 1.0)  
    glMatrixMode(GL_MODELVIEW)     


def display():
    glClearColor(bg,bg,bg,1.0)
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)  
    glLoadIdentity()                                  
    setup_projection()                                  
    glColor3f(0.0, 0.8, 1.0)                            
    draw_floor()
    draw_greens()
    draw_house()      
    draw_windowdoor()
    draw_rain(rain_x1,rain_y1)
    draw_rain(rain_x2,rain_y2)
    draw_rain(rain_x3,rain_y3)
    draw_rain(rain_x4,rain_y4)
    draw_rain(rain_x5,rain_y5)
    draw_rain(rain_x6,rain_y6)
    draw_rain(rain_x7,rain_y7)
    draw_rain(rain_x8,rain_y8)
    glutSwapBuffers()                                  
def main():
    glutInit()                              
    glutInitDisplayMode(GLUT_RGBA)          
    glutInitWindowSize(1000, 1000)            
    glutInitWindowPosition(0, 0)     
    glutCreateWindow(b"OpenGL 2D Point")     
    glutDisplayFunc(display)     
    glutIdleFunc(animate)
    glutSpecialFunc(special_key_listener)
    glutKeyboardFunc(keyboard_listener)
    glutMainLoop()                           

if __name__ == "__main__":
    main()
