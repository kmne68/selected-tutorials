/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomGenerics;

/**
 *
 * @author Keith
 */
public class Main {
 
    public static void main(String[] args) {
        
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        
//        Team adelaideCrows = new Team("Adelaide Crows");
//        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);
        
        //System.out.println(adelaideCrows.numPlayers());
    
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        
        
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorne = new Team<>("Hawthorne");
        Team<FootballPlayer> freemantle = new Team<>("Freemantle");
        
        Team<BaseballPlayer> cardinals = new Team<>("Cardinals");
        
        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorne);
        footballLeague.add(freemantle);
        
        hawthorne.matchResult(melbourne, 1, 0);
        hawthorne.matchResult(adelaideCrows, 5, 3);
        hawthorne.matchResult(freemantle, 1, 4);
        
        footballLeague.showLeagueTable();
        
        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(beckham);
        rawTeam.addPlayer(pat);
        
        footballLeague.add(rawTeam);
               
        League<Team> rawLeague = new League<>("Raw");
        rawLeague.add(adelaideCrows);
        rawLeague.add(cardinals);
        rawLeague.add(rawTeam);
        
        League reallyRaw = new League("Really Raw");
        reallyRaw.add(adelaideCrows);
        reallyRaw.add(cardinals);
        reallyRaw.add(rawTeam);
        
                
    }
}
