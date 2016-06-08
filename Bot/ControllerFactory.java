package Bot;

import Bot.BotImpl.MasterSquirrelBot;
import Bot.BotImpl.MiniSquirrelBot;
import Bot.BotImpl.masterBotController;
import Bot.BotImpl.miniBotController;

public class ControllerFactory implements BotControllerFactory{

	public ControllerFactory() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public BotController createMasterBotController() {
		BotController controller = new masterBotController();
		return controller;
	}

	@Override
	public BotController createMiniBotController() {
		BotController controller = new miniBotController();
		return controller;
	}

}
