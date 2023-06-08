
package spaceinvaders;

import static spaceinvaders.FrmSpaceInvaders.*;
import java.awt.Color;
import java.awt.Graphics;

public class ClaseAliens 
{
    int Ejex,Ejey;
    

    public ClaseAliens(int ejx,int ejy)
    {
        Ejex=ejx;
        Ejey=ejy;    
      
    }

    public void Alien1(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillRect(Ejex+15, Ejey, 15, 5);
        g.fillRect(Ejex+5, Ejey+5, 35, 5);
        g.fillRect(Ejex, Ejey+10, 45, 12);
        g.fillRect(Ejex+8, Ejey+22, 8, 7);
        g.fillRect(Ejex+30, Ejey+22, 8, 7);
        g.fillRect(Ejex+5, Ejey+29, 8, 5);
        g.fillRect(Ejex+33, Ejey+29,8,5);
        
        
        if(pos<0)
        {
            g.fillRect(Ejex+8, Ejey+34, 8, 3);
            g.fillRect(Ejex+30, Ejey+34, 8, 3);
        }
        else
        {
            g.fillRect(Ejex+2, Ejey+34, 8, 3);
            g.fillRect(Ejex+36, Ejey+34, 8, 3);
        }
        g.setColor(Color.BLACK);
        g.fillRect(Ejex+10, Ejey+12, 8, 6);
        g.fillRect(Ejex+27, Ejey+12, 8, 6);
        
    }
    public void Alien2(Graphics g)
    {
        g.setColor(Color.CYAN);
        g.fillRect(Ejex+3, Ejey, 5, 5);
        g.fillRect(Ejex+38, Ejey, 5, 5);
        g.fillRect(Ejex+8, Ejey+5, 5, 5);
        g.fillRect(Ejex+33, Ejey+5, 5, 5);
        g.fillRect(Ejex+3, Ejey+10,40,5);
        g.fillRect(Ejex-2, Ejey+15, 50, 5);
        g.fillRect(Ejex-7, Ejey+20, 60, 5);
        g.fillRect(Ejex+3, Ejey+25, 40, 5);
        g.fillRect(Ejex+3, Ejey+30, 5, 5);
        g.fillRect(Ejex+38, Ejey+30, 5, 5);
        
        if(pos>0)
        {
            g.fillRect(Ejex+8, Ejey+35, 10, 3);
            g.fillRect(Ejex+28,Ejey+35,10,3);
            g.fillRect(Ejex-7, Ejey+25, 5, 10);
            g.fillRect(Ejex+48, Ejey+25, 5, 10);
        }
        else
        {
            g.fillRect(Ejex-2, Ejey+35, 5, 3);
            g.fillRect(Ejex+43,Ejey+35,5,3);
            g.fillRect(Ejex-7, Ejey+10, 5, 10);
            g.fillRect(Ejex+48, Ejey+10, 5, 10);
        }
        
        g.setColor(Color.BLACK);
        g.fillRect(Ejex+10, Ejey+15, 5, 5);
        g.fillRect(Ejex+31, Ejey+15, 5, 5);
    }
    public void Alien3(Graphics g)
    {
        g.setColor(Color.ORANGE);
        g.fillRect(Ejex+20, Ejey-5, 5, 5);
        g.fillRect(Ejex+15,Ejey,15,5);
        g.fillRect(Ejex+10, Ejey+5, 25, 5);
        g.fillRect(Ejex+5,Ejey+10,35,5);
        g.fillRect(Ejex, Ejey+15, 45, 10);
        g.fillRect(Ejex+10,Ejey+25,25,5);
        g.fillRect(Ejex+5, Ejey+30, 5, 5);
        g.fillRect(Ejex+35, Ejey+30, 5, 5);
        
        if(pos<0)
        {
            g.fillRect(Ejex+10, Ejey+35, 5, 5);
            g.fillRect(Ejex+30, Ejey+35, 5, 5);
        }
        else
        {
            g.fillRect(Ejex, Ejey+35, 5, 5);
            g.fillRect(Ejex+40, Ejey+35, 5, 5);
        }
        
        g.setColor(Color.BLACK);
        g.fillRect(Ejex+10, Ejey+15, 10, 5);
        g.fillRect(Ejex+25, Ejey+15, 10, 5);
        
    }
    public void explosion(Graphics g)
    {
        g.setColor(Color.YELLOW);
        g.fillRect(Ejex+13, Ejey, 5, 5);
        g.fillRect(Ejex+30, Ejey, 5, 5);       
        g.fillRect(Ejex+17, Ejey+7, 5, 5);
        g.fillRect(Ejex+25, Ejey+7, 5, 5);
        g.fillRect(Ejex-5, Ejey+5, 5, 5);
        g.fillRect(Ejex+47, Ejey+5, 5, 5);
        g.fillRect(Ejex, Ejey+10, 5, 5);
        g.fillRect(Ejex+42,Ejey+10,5,5);
        g.fillRect(Ejex+5, Ejey+15, 10, 5);
        g.fillRect(Ejex+32, Ejey+15, 10, 5);
        g.fillRect(Ejex, Ejey+20, 5, 5);
        g.fillRect(Ejex+42, Ejey+20, 5, 5);
        g.fillRect(Ejex+17, Ejey+22, 5, 5);
        g.fillRect(Ejex+25, Ejey+22, 5, 5);
        g.fillRect(Ejex-5, Ejey+25, 5, 5);
        g.fillRect(Ejex+47, Ejey+25, 5, 5);
        g.fillRect(Ejex+13, Ejey+30, 5, 5);
        g.fillRect(Ejex+30, Ejey+30, 5, 5);

    }
    
    public void setEjeX(int ejx)
    {
        Ejex=ejx;
    }
    public void setEjeY(int ejy)
    {
        Ejey=ejy;
    }
    public int getEjeX()
    {
        return Ejex;
    }
    public int getEjeY()
    {
        return Ejey;
    }
}
