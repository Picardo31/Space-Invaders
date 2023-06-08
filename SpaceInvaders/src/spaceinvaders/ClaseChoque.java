
package spaceinvaders;
import java.awt.Color;
import java.awt.Graphics;


public class ClaseChoque 
{
    int EjeX,EjeY,tam_x,tam_y,choque,t;
    public ClaseChoque(int ejx,int ejy,int X,int Y,int choq)
    {
        EjeX=ejx;
        EjeY=ejy;
        tam_x=X;
        tam_y=Y;
        choque=choq;
        
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        if(choque==1)
        {
            t=4;
            dibujar(g);            
        }
        else if(choque==2)
        {
            t=5;
            dibujar(g);
        }
        else if(choque==3)
        {
            t=6;
            dibujar(g);  
        }
        else if(choque==4)
        {
            t=7;
            dibujar(g);  
        }
        else if(choque==5)
        {
            t=8;
            dibujar(g);  
        }
        else if(choque==6)
        {
            t=9;
            dibujar(g);  
        }
        else if(choque==7)
        {
            t=10;
            dibujar(g);  
        }
        else if(choque==8)
        {
            g.fillRect(EjeX, EjeY, tam_x, tam_y);
        }
        
        
    }
    public void setChoque(int choq)
    {
        choque=choq;
    }
    private void dibujar(Graphics g)
    {
       
            g.fillRect(EjeX, EjeY, t, t);
            g.fillRect(EjeX+25, EjeY, t,t);
            g.fillRect(EjeX+45, EjeY, t, t);
            g.fillRect(EjeX, EjeY+10, t, t);
            g.fillRect(EjeX+15, EjeY+10, t, t);
            g.fillRect(EjeX+40, EjeY+10, t, t);
            g.fillRect(EjeX+30, EjeY+15, t, t);
            g.fillRect(EjeX+10, EjeY+20, t, t);
            g.fillRect(EjeX+40, EjeY+20, t, t);
            g.fillRect(EjeX, EjeY+25, t, t);
            g.fillRect(EjeX+15, EjeY+25, t,t);
            g.fillRect(EjeX+25, EjeY+25, t, t);
            g.fillRect(EjeX+35, EjeY+25, t, t);
            g.fillRect(EjeX+45, EjeY+25, t, t);
            g.fillRect(EjeX, EjeY+30, t, t);
            g.fillRect(EjeX+20, EjeY+30, t, t);
            g.fillRect(EjeX+45, EjeY+30, t, t);    
    }
}
