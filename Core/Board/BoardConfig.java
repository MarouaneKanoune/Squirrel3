package Core.Board;
import Help.XY;



public class BoardConfig {
	
	public final XY Size = new XY(40, 25);
    public final int wallCount = (Size.getX()*2)+((Size.getY()-2)*2);
    public final int badBeastCount = 0;
    public final int goodBeastCount = 5;
    public final int goodPlantCount = 5;
    public final int badPlantCount = 5;
    public final int wallCount2 = 0;
    public String Bot1 = "Bot.BotImpl.MasterSquirrelBot";
    public int Bot1Energy = 1000;
    public String Bot2 = "Bot.BotImpl.MasterSquirrelBot";
    public int Bot2Energy = 2000;
    public int [] energy = {Bot1Energy,Bot2Energy};
    public String []Bots = {Bot1,Bot2};
    public int botCount = 2;
    public boolean playerMode = true;
    public final int standardDuration = 50;
    public int duration = standardDuration;
    
   
	public int EntityCount(){
		return wallCount + badBeastCount + goodBeastCount +
                goodPlantCount + badPlantCount;
	}
    
    public int getEntityCount(){
    	return EntityCount();
    }
    
    
    public int getSize(){
    	return Size.getX()*Size.getY();
    }
   
    public void setBotCount(int count){
    	this.botCount = count;
    }
    
    public int getBotCount(){
    	return botCount;
    }
}
