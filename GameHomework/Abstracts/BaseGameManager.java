package Abstracts;

import Entities.Game;

public abstract class BaseGameManager implements IGameManagerService {
	
	public void add(Game game) {
		System.out.println(game.getName() + " is added to the games.");
	}
	
	public void delete(Game game) {
		System.out.println(game.getName() + " is removed from the games.");
	}

}
