package chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class GeminiAstronautsRDBMS {

	private static Connection postgres;
	
	public static void main(String[] args) {
		
		connectToPostgres();

		System.out.println("Project Gemini Astronauts:");
		
		try {
			String astronautSQL = "SELECT name FROM astronauts LIMIT 20;";
			Statement pgStatement = postgres.createStatement();
			ResultSet geminiAstronauts = pgStatement.executeQuery(astronautSQL);
			
			while (geminiAstronauts.next()) {
				System.out.println(geminiAstronauts.getString("name"));
			}
			
			System.out.println();

			Set<Integer> randomMissions = new HashSet<>();
			Random random = new Random();
			// generate 3 random numbers
			while (randomMissions.size() < 3) {
				int missionNumber = random.nextInt(10) + 3;
				randomMissions.add(missionNumber);
			}
			
			String missionSQL = "SELECT m.name AS missionname, m.start_date, m.end_date, a.name "
					+ "FROM astronauts a "
					+ "INNER JOIN astronaut_missions am ON am.astronaut_name = a.name "
					+ "INNER JOIN missions m ON m.id = am.mission_id "
					+ "WHERE m.name = ?;";

			PreparedStatement missionStatement = postgres.prepareStatement(missionSQL);			
			
			for (Integer missionNum : randomMissions) {
				
				StringBuilder mission = new StringBuilder("Gemini ");
				mission.append(missionNum.toString());
				missionStatement.setString(1, mission.toString());
				ResultSet missionAstronauts = missionStatement.executeQuery();
				
				while (missionAstronauts.next()) {
					System.out.print(missionAstronauts.getString("missionname") + " ");
					System.out.print(missionAstronauts.getString("start_date") + " -> ");
					System.out.print(missionAstronauts.getString("end_date") + " - ");
					System.out.println(missionAstronauts.getString("name"));
				}
				
				System.out.println();
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		closePostgresConnection();
	}

	private static void connectToPostgres() {
		
		// from ElephantSQL - postgres://iubylxio:QYKQfZNgDFShS_EY8lcpAh1yZoi6nbA0@rajje.db.elephantsql.com/iubylxio
		// works! jdbc:postgresql://rajje.db.elephantsql.com/iubylxio
		String url = System.getenv("POSTGRES_URL");
        String username = System.getenv("POSTGRES_USER");
        String password = System.getenv("POSTGRES_PASSWORD");

        try {
        	// connects to database
        	postgres = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void closePostgresConnection() {
		try {
			postgres.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
