
package spaceinvaders;
import static spaceinvaders.FrmSpaceInvaders.*;


public class ClaseEscudo 
{   
    public int escudo1y[]=new int[12];  
    public int escudo2y[]=new int[12];  
    public int escudo3y[]=new int[12];  
    public int escudo4y[]=new int[12];
    public int escudo1x[]=new int[12];  
    public int escudo2x[]=new int[12];  
    public int escudo3x[]=new int[12];  
    public int escudo4x[]=new int[12];
    
    public ClaseEscudo()
    {
        for(int i=0;i<12;i++)
        {   
            escudo1x[i]=escudo_x[i]+10;
            escudo1y[i]=escudo_y[i]-130;
        }
        for(int i=0;i<12;i++)
        {   
            escudo2x[i]=escudo_x[i]+140;
            escudo2y[i]=escudo_y[i]-130;
        }
        for(int i=0;i<12;i++)
        {   
            escudo3x[i]=escudo_x[i]+270;
            escudo3y[i]=escudo_y[i]-130;
        }
        for(int i=0;i<12;i++)
        {   
            escudo4x[i]=escudo_x[i]+400;
            escudo4y[i]=escudo_y[i]-130;
        }
    }
   
}    
