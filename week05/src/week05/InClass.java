import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

// create a program to repeatedly ask the user for game scores
// each game has a winning team name and score, losing team name and score
// Then, print out the rankings from highest team to
// lowest team (games won, then points)

// Step 1 - create the team class
// Step 2 - write the UI loop - user enters games and you maintain the collection
// Step 3 - process a game and update the teams collection

public class Practice {

	static TreeSet<Team> teams = new TreeSet<>();
	static HashMap<String, Team> teamLookup = new HashMap<>();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter option (h for help): ");
			String option = input.nextLine();
			switch (option.toLowerCase()) {
			case "a":
				System.out.print("Enter winning team: ");
				String winningTeam = input.nextLine();
				System.out.print("Enter winning score: ");
				int winningScore = Integer.parseInt(input.nextLine());
				System.out.print("Enter losing team: ");
				String losingTeam = input.nextLine();
				System.out.print("Enter losing score: ");
				int losingScore = Integer.parseInt(input.nextLine());
				addGame(winningTeam, winningScore, losingTeam, losingScore);
				break;
			case "h":
				System.out.println("h - print help");
				System.out.println("r - print rankings");
				System.out.println("a - add games");
				break;
			case "r":
				Iterator<Team> iterator = teams.descendingIterator();
				while (iterator.hasNext())
					System.out.println(iterator.next());
				break;
			default:
				System.out.println("Unknown option");
				break;
			}
		}

	}

	private static void addGame(String winningTeamName, int winningScore, String losingTeamName, int losingScore) {

		Team winningTeam = getTeamFromName(winningTeamName);
		winningTeam.gamesWon++;
		winningTeam.totalPoints += winningScore;

		Team losingTeam = getTeamFromName(losingTeamName);
		losingTeam.totalPoints += losingScore;
	}

	private static Team getTeamFromName(String teamName) {

		// for (Team team : teams)
		// if (team.name.equals(teamName))
		// return team;

		Team team = teamLookup.get(teamName);
		if (team == null) {
			team = new Team(teamName);
			teams.add(team);
			teamLookup.put(teamName, team);
		}

		return team;
	}
}

class Team implements Comparable<Team> {
	String name;
	int totalPoints;
	int gamesWon;

	public Team(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "(" + gamesWon + ", " + totalPoints + ")";
	}

	@Override
	public int compareTo(Team otherTeam) {
		if (gamesWon > otherTeam.gamesWon)
			return 1;
		if (gamesWon < otherTeam.gamesWon)
			return -1;
		if(gamesWon > )
		return ((Integer) totalPoints).compareTo(otherTeam.totalPoints);
	}
}
