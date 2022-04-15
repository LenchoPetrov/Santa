package project;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Topic topic = new Topic();
		Observer obs1 = new TopicSubscriber("Дядо Коледа");
		Observer obs2 = new TopicSubscriber("Джуджетата");
		Observer obs3 = new TopicSubscriber("Магическа дъска");
		
		WorkshopFactory dollFactory = new DollFactory();
		WorkshopFactory bicycleFactory = new BicycleFactory();
		
		MagicBoard board = new MagicBoard();
		Dwarf dwarf = new Dwarf();
		Command giveByciclesCommand = new GiveBicyclesCommand(dwarf);
		Command giveDollsCommand = new GiveDollsCommand(dwarf);

		Santa santa = new Santa();
		int dolls = 0;
		int bicycles = 0;
		
		boolean process = true;
		
		while (process) {
			topic.subscribe(obs3);
			topic.setTopic(": Кажи магическите думи!");
			topic.unsubscribe(obs3);
			
			topic.subscribe(obs1);
			topic.setTopicSameLine(": ");
			
			String input = scanner.nextLine();
			
			if (input.equals("Трябват ми кукли")) {
				topic.unsubscribe(obs1);
				topic.subscribe(obs2);
				topic.setTopicSameLine(": ");
				Toy doll = dollFactory.produceToy("DOLL");
			
				topic.unsubscribe(obs2);
				topic.subscribe(obs3);
				topic.setTopicSameLine(": ");
				
				board.setCommand(giveDollsCommand);
				board.sayMagicWords();
				
				dolls++;
				santa.setDollsCount(dolls);
				
				topic.setTopic(": Искаш ли да видиш колко играчки има в торбата(да/не)?");
				topic.unsubscribe(obs3);
				topic.subscribe(obs1);
				topic.setTopicSameLine(": ");
				input = scanner.nextLine();
				topic.unsubscribe(obs1);
				topic.subscribe(obs3);
		
				if (input.equals("да")) {
					topic.setTopic(santa.toysInBag());		
				}
				
				topic.setTopic(": Приключваш ли работа(да/не)?");
				topic.unsubscribe(obs3);
				topic.subscribe(obs1);
				topic.setTopicSameLine(": ");				
				input = scanner.nextLine();
				
				if (input.equals("да")) {
					break;
				}else 
				
				topic.unsubscribe(obs1);		
				
			}else if (input.equals("Трябват ми колела")){
				topic.unsubscribe(obs1);
				topic.subscribe(obs2);
				topic.setTopicSameLine(": ");
				Toy bicycle = bicycleFactory.produceToy("BICYCLE");
			
				topic.unsubscribe(obs2);
				topic.subscribe(obs3);
				topic.setTopicSameLine(": ");
				
				board.setCommand(giveByciclesCommand);
				board.sayMagicWords();
				
				bicycles++;
				santa.setBicyclesCount(bicycles);
				
				topic.setTopic(": Искаш ли да видиш колко играчки има в торбата(да/не)?");
				topic.unsubscribe(obs3);
				topic.subscribe(obs1);
				topic.setTopicSameLine(": ");
				input = scanner.nextLine();
				
				topic.unsubscribe(obs1);
				topic.subscribe(obs3);
				
				if (input.equals("да")) {
					topic.setTopic(santa.toysInBag());
				}
				
				topic.setTopic(": Приключваш ли работа(да/не)?");
				topic.unsubscribe(obs3);
				topic.subscribe(obs1);
				topic.setTopicSameLine(": ");				
				input = scanner.nextLine();
				
				if (input.equals("да")) {
					break;
				}else 
				
				topic.unsubscribe(obs1);		

			}else {
				topic.unsubscribe(obs1);
				topic.subscribe(obs3);
				topic.setTopic(": Невалидна команда!");
				topic.unsubscribe(obs3);
			}
		}
	}
}