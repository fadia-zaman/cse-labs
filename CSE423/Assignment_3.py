from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *
import math 
import random


camera_pos = (0,500,500)

fovY = 120  # Field of view
GRID_LENGTH = 600 
p_x=0
p_y=0
p_angle=0
bullet=[]
enemy=[]
eScale=1
chng_Scale=0.001
gScore=0
pLife=5
bMissed=0
over=False
cAngle=90
thirdPerson=True
cheat=False
count=0
vision=False


def draw_text(x, y, text, font=GLUT_BITMAP_HELVETICA_18):
    glColor3f(1,1,1)
    glMatrixMode(GL_PROJECTION)
    glPushMatrix()
    glLoadIdentity()
    
    # Set up an orthographic projection that matches window coordinates
    gluOrtho2D(0, 1000, 0, 800)  # left, right, bottom, top

    
    glMatrixMode(GL_MODELVIEW)
    glPushMatrix()
    glLoadIdentity()
    
    # Draw text at (x, y) in screen coordinates
    glRasterPos2f(x, y)
    for ch in text:
        glutBitmapCharacter(font, ord(ch))
    
    # Restore original projection and modelview matrices
    glPopMatrix()
    glMatrixMode(GL_PROJECTION)
    glPopMatrix()
    glMatrixMode(GL_MODELVIEW)
    
def draw_walls():
    glPushMatrix()
    glColor3f(0,1,0)
    glTranslatef(-600,0,50)
    glScalef(10,1200,100)
    glutSolidCube(1)
    glPopMatrix()


    glPushMatrix()
    glColor3f(0,0,1)
    glTranslatef(600, 0, 50)
    glScalef(10,1200,100)
    glutSolidCube(1)
    glPopMatrix()

    glPushMatrix()
    glColor3f(1,1,1)
    glTranslatef(0,600, 50)
    glScalef(1200,10,100)
    glutSolidCube(1)
    glPopMatrix()

    glPushMatrix()
    glColor3f(0,1,1)
    glTranslatef(0, -600,50)
    glScalef(1200,10,100)
    glutSolidCube(1)
    glPopMatrix()
    
    
def draw_enemy():
    for e in enemy:
        glPushMatrix()
        glTranslatef(e[0],e[1],0)
        glScalef(eScale,eScale,eScale)
        
        glPushMatrix()
        glColor3f(1,0,0)
        glTranslatef(0,0,60)
        gluSphere(gluNewQuadric(), 60, 20, 20)  
        glPopMatrix()
        
        glPushMatrix()
        glColor3f(0,0,0)
        glTranslatef(0,0,150)
        gluSphere(gluNewQuadric(), 30, 20, 20)  
        glPopMatrix()
        
        glPopMatrix()
        
         
    
def draw_bullet():
    glColor3f(0.4,0.055,0.062)
    for b in bullet:
        glPushMatrix()
        glTranslatef(b[0],b[1],220)
        glutSolidCube(10)
        glPopMatrix()
    
    
def draw_player():
    global p_x,p_y,p_angle,over
    glPushMatrix()
    glTranslatef(p_x,p_y,0)
    glRotatef(-p_angle,0,0,1)
    
    if over:
        glRotatef(90,1,0,0)
    
    glPushMatrix()
    glColor3f(0.35,0.4,0.25)
    glTranslatef(0, 0, 160)  
    glScalef(1,0.5,2)
    glutSolidCube(80) 
    glPopMatrix()
    
    glPushMatrix()
    glColor3f(0.075, 0.149, 0.36)
    glTranslatef(0, 0, 280) 
    gluSphere(gluNewQuadric(), 40, 20, 20)  
    glPopMatrix()
    
    glPushMatrix()
    glColor3f(1, 0.85, 0.698)
    glTranslatef(-40, 0, 220) 
    glRotatef(-90, 1, 0, 0)  
    gluCylinder(gluNewQuadric(), 20, 10, 80, 10, 10)
    glPopMatrix()
    
    glPushMatrix()
    glColor3f(1, 0.85, 0.698)
    glTranslatef(40, 0, 220) 
    glRotatef(-90, 1, 0, 0)  
    gluCylinder(gluNewQuadric(), 20, 10, 80, 10, 10)
    glPopMatrix()
    
    glPushMatrix()
    glColor3f(0.447, 0.447, 0.447)
    glTranslatef(0, 0, 220) 
    glRotatef(-90, 1, 0, 0)  
    gluCylinder(gluNewQuadric(), 20, 10, 100, 10, 10)
    glPopMatrix()
    
    glPushMatrix()
    glColor3f(0.075, 0.149, 0.36)
    glTranslatef(-40, 0,100)  
    glRotatef(180, 1, 0, 0) 
    gluCylinder(gluNewQuadric(), 20, 10, 80, 10, 10)
    glPopMatrix()
    
    glPushMatrix()
    glColor3f(0.075, 0.149, 0.36)
    glTranslatef(40, 0,100)  
    glRotatef(180, 1, 0, 0) 
    gluCylinder(gluNewQuadric(), 20, 10, 80, 10, 10)
    glPopMatrix()
    
    glPopMatrix()
    
def keyboardListener(key, x, y):
    global p_angle,p_x,p_y,over,pLife,bMissed,gScore,bullet,over,cheat,vision
    
    if  not over:
        if key == b'w':  
            p_x+=10*math.sin(math.radians(p_angle))
            p_y+=10*math.cos(math.radians(p_angle))
            
        if key == b's':
            p_x-=10*math.sin(math.radians(p_angle))
            p_y-=10*math.cos(math.radians(p_angle))
                
        if key == b'a':
            p_angle-=5
        if key == b'd':
            p_angle+=5
                
        if p_x>550:
            p_x=550
        if p_x<-550:
            p_x=-550    
        if p_y>550:
            p_y=550
        if p_y<-550:
            p_y=-550       
                    
    if key == b'r' and over:
            p_x=0
            p_y=0
            p_angle=0
            pLife=5
            bMissed=0
            gScore=0
            over=False
            bullet.clear()
            for e in enemy:
                e[0]=random.randint(-500,500)
                e[1]=random.randint(-500,500)
                print("GAME RESTARTED!") 
                    
                
    if key == b'c':
        cheat=not cheat
    if key == b'v' and cheat:
        vision=not vision
    


def specialKeyListener(key, x, y):
    global camera_pos,cAngle
    x, y, z = camera_pos
    
    if key == GLUT_KEY_UP:
        z+=10
    
    if key == GLUT_KEY_DOWN:
        z-=10

    
    if key == GLUT_KEY_LEFT:
        cAngle+=5 

    
    if key == GLUT_KEY_RIGHT:
        cAngle-=5  

    camera_pos = (x, y, z)


def mouseListener(button, state, x, y):
        global thirdPerson
        if not over:
            if button == GLUT_LEFT_BUTTON and state == GLUT_DOWN:
                bullet.append([p_x,p_y,p_angle])
                print("player bullet fired")
        
            if button == GLUT_RIGHT_BUTTON and state == GLUT_DOWN:
                thirdPerson=not thirdPerson
                
                


def setupCamera():
    global p_x,p_y,cAngle,camera_pos,cheat,vision
    
    glMatrixMode(GL_PROJECTION)  
    glLoadIdentity()  
   
    gluPerspective(fovY, 1.25, 0.1, 1500) 
    glMatrixMode(GL_MODELVIEW)  
    glLoadIdentity()  

    
    x, y, z = camera_pos
    if thirdPerson:
        x=p_x+500*math.sin(math.radians(cAngle))
        y=p_y+500*math.cos(math.radians(cAngle))
        c_x=p_x
        c_y=p_y
        c_z=150
        
    else:
        x=p_x
        y=p_y
        z=350
        
        if cheat and vision:
            c_x=p_x+150*math.sin(math.radians(p_angle))
            c_y=p_y+150*math.cos(math.radians(p_angle))
            c_z=280
        else:
            c_x=p_x+100*math.sin(math.radians(p_angle))
            c_y=p_y+100*math.cos(math.radians(p_angle))
            c_z=320
        
        
    gluLookAt(
        x, y, z,  
        c_x,c_y,c_z,  
        0, 0, 1
    )  
    
def appearEnemeies():
    for i in range(5):  
        x=random.randint(-500,500)
        y=random.randint(-500,500)
        enemy.append([x,y,1])

def moveEnemies():
    for e in enemy:
        diffx=p_x-e[0]
        diffy=p_y-e[1]
        d=math.sqrt(diffx*diffx+diffy*diffy)
        
        if d!=0:
            diffx/=d
            diffy/=d
            e[0]+=0.05*diffx
            e[1]+=0.05*diffy
            
def killEnemies():
    global gScore
    for b in bullet:
        for e in enemy:
            diffx=b[0]-e[0]
            diffy=b[1]-e[1]
            d=math.sqrt(diffx*diffx + diffy*diffy)  
            
            if d<60:
                bullet.remove(b)
                e[0]=random.randint(-500,500)
                e[1]=random.randint(-500,500)
                gScore+=1
                break
            
def playerLife():
    global pLife,over,cheat
    if not over and not cheat:
        for e in enemy:
            diffx=e[0]-p_x
            diffy=e[1]-p_y
            d=math.sqrt(diffx*diffx + diffy*diffy)
            if d<80 and pLife>0:
                pLife-=1
                print("remaining player life:",pLife)
                e[0]=random.randint(-500,500)
                e[1]=random.randint(-500,500)
            
def gameOver():
    global over
    if pLife<=0 or bMissed>=10:
        over=True
            
def cheatKillEnemy():
    global p_x,p_y
    for e in enemy:
        diffx=e[0]-p_x
        diffy=e[1]-p_y
        eAngle=math.degrees(math.atan2(diffx,diffy))
        diffAngle=abs(eAngle-p_angle)
        if diffAngle>180:
            diffAngle=360-diffAngle         
        if diffAngle<10:
            bullet.append([p_x,p_y,p_angle])
            print("bullet fired")
            
            break

def idle():
    global eScale,chng_Scale,bMissed,over,p_angle,cheat,count
    moveEnemies()
    
    if cheat:
        p_angle-=1
        count+=1
        if count==20:
            cheatKillEnemy()
            count=0
            
    if not over:
        for b in bullet:
            b[0]+=2*math.sin(math.radians(b[2]))
            b[1]+=2*math.cos(math.radians(b[2]))
                    
            if b[0]>600 or b[0]<-600 or b[1]>600 or b[1]<-600 :
                bMissed+=1
                print("buller missed:",bMissed)
                bullet.remove(b)
            
    
    killEnemies() 
    playerLife()
    gameOver()
     
    eScale+=chng_Scale
    if(eScale>=1.1):
        chng_Scale=-0.001
    if(eScale<=0.8):
        chng_Scale=0.001
             
    glutPostRedisplay()


def showScreen():
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glLoadIdentity()  
    glViewport(0, 0, 1000, 800)  

    setupCamera()  

    
    glPointSize(20)
    glBegin(GL_POINTS)
    glVertex3f(-GRID_LENGTH, GRID_LENGTH, 0)
    glEnd()

    checkerSize=80
    for x in range(-GRID_LENGTH, GRID_LENGTH, checkerSize):
        for y in range(-GRID_LENGTH, GRID_LENGTH, checkerSize):
            if ((x//checkerSize)+(y//checkerSize))%2==0:
                glColor3f(0.659,0.396,0.788)
            else:
                glColor3f(1,1,1)
                
            glBegin(GL_QUADS)
            glVertex3f(x,y,0) 
            glVertex3f(x+checkerSize, y, 0)
            glVertex3f(x+checkerSize,y+checkerSize, 0)
            glVertex3f(x,y+checkerSize, 0)
            glEnd()
            
    draw_walls()
    if over:
            draw_text(10,760,f"GAME OVER! Your score is: {gScore}")
            draw_text(10, 740, "Press "R" to RESTART the game")
            
    else: 
        draw_text(10,760,f"Player Life Remaining: {pLife}")
        draw_text(10, 740, f"Game Score: {gScore}")
        draw_text(10, 720, f"Player Bullet Missed: {bMissed}")
    
    
    draw_player()
    
    if not over:
        draw_bullet()
        draw_enemy()

    glutSwapBuffers()
    
    
def main():
    glutInit()
    glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH) 
    glutInitWindowSize(1000, 800)  
    glutInitWindowPosition(0, 0)  
    wind = glutCreateWindow(b"3D OpenGL Intro") 

    glutDisplayFunc(showScreen) 
    glutKeyboardFunc(keyboardListener)  
    glutSpecialFunc(specialKeyListener)
    glutMouseFunc(mouseListener)
    glutIdleFunc(idle)  
    appearEnemeies()

    glutMainLoop()  

if __name__ == "__main__":
    main()