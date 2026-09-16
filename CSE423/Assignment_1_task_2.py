from OpenGL.GL import *     
from OpenGL.GLUT import *    
from OpenGL.GLU import *     
import math
import random

WINDOW_WIDTH, WINDOW_HEIGHT = 500, 500
ball_size = 5               
balls=[]
bg_color=False
visible=True
count=0
stop=False

def convert_coordinate(x, y):
    a = x - (WINDOW_WIDTH / 2)
    b = (WINDOW_HEIGHT / 2) - y
    return a, b


def draw_point(x, y, size):
    glPointSize(size)
    glBegin(GL_POINTS)
    glVertex2f(x, y)
    glEnd()


def keyboard_listener(key, x, y):
    
    global stop
    if key == b' ':  
        stop=not stop
        glutPostRedisplay()
        return
    
    glutPostRedisplay()


def special_key_listener(key, x, y):
    if stop:
        return
    
    if key == GLUT_KEY_UP:
        for ball in balls:
           ball["x_direction"] *= 2
           ball["y_direction"] *= 2
       
    elif key == GLUT_KEY_DOWN:
        for ball in balls:
           ball["x_direction"] /= 2
           ball["y_direction"] /= 2
    glutPostRedisplay()


def mouse_listener(button, state, x, y):
    if stop:
        return
    global bg_color, visible, count
    if button == GLUT_LEFT_BUTTON and state == GLUT_DOWN:
        bg_color=not bg_color
        if not bg_color:
            visible = True
            count = 0
    elif button == GLUT_RIGHT_BUTTON and state == GLUT_DOWN:
        new_x,new_y= convert_coordinate(x, y)
        ball={
              "x":new_x,
              "y":new_y,
              "r":random.random(),
              "g":random.random(),
              "b":random.random(),
              "x_direction":random.choice([0.2,-0.2]),
              "y_direction":random.choice([0.2,-0.2])
            }
        balls.append(ball)
        print(balls)
    
    glutPostRedisplay()


def animate():
    if stop:
        return
    global count, visible
    for ball in balls:
        ball["x"]+=ball["x_direction"]
        ball["y"]+=ball["y_direction"]
        
        if ball["x"]>=250 or ball["x"]<=-250:
            ball["x_direction"]*=-1
        if ball["y"]>=250 or ball["y"]<=-250:
            ball["y_direction"]*=-1
        
    if bg_color:
        count+=1
        if count==100:
            visible= not visible
            count=0
    
    glutPostRedisplay()


def setup_projection():
    glViewport(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(-250, 250, -250, 250, 0, 1)
    glMatrixMode(GL_MODELVIEW)



def display():
    
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glLoadIdentity()
    setup_projection()

    for ball in balls:
        if visible:
            glColor3f(ball["r"], ball["g"],ball["b"])
        else:
            glColor3f(0,0,0)
            
        draw_point(ball["x"], ball["y"], ball_size)

    glutSwapBuffers()


def main():
    glutInit()
    glutInitDisplayMode(GLUT_RGBA)
    glutInitWindowSize(WINDOW_WIDTH, WINDOW_HEIGHT)
    glutInitWindowPosition(100, 100)
    glutCreateWindow(b"OpenGL Interactive Animation")


    glutDisplayFunc(display)
    glutIdleFunc(animate)
    glutKeyboardFunc(keyboard_listener)
    glutSpecialFunc(special_key_listener)
    glutMouseFunc(mouse_listener)

    glutMainLoop()


if __name__ == "__main__":
    main()
