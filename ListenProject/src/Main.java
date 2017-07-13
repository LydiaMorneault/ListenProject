import java.util.Scanner;
import java.util.Random;

public class Main {
	
	static Album[] albums;
	static Album chosen;
	
	static Scanner scanner = new Scanner(System.in);

	/**
	 * getRandMusic chooses what type of music you should listen to for you
	 * The choices are new music, sing along, and to listen
	 */
	public static void getRandMusic(){
		int rand = getRandom(3);
		if (rand == 0)
			newMusic();
		else if (rand == 1)
			singAlong();
		else
			toListen();
	}
	
	/**
	 * getPlaylist chooses which playlist you should listen to
	 * @param choice is whether or not you want to listen to new music or sing along
	 */
	public static void getPlaylist(int choice){
		// new playlist
		if (choice == 0){
			String[] news = {"Discover Weekly", "Indie Acoustic", "Stomp & Holler", "Totally 80s", "Woodstock"};
			displayPlaylist(news);
		}
		// sing along
		else {
			String[] faves = {"Starred", "Random", "I Know Places", "midnight city", "summer", "rain"};
			displayPlaylist(faves);
		}
	}
	
	/**
	 * displayPlaylist shows the user which playlist has been selected for them
	 * @param pl -- the String array of playlists that will be chosen from randomly
	 */
	public static void displayPlaylist(String[] pl){
		int playlist = getRandom(pl.length);
		System.out.println("You should listen to: " + pl[playlist]);
	}
	
	/**
	 * displayAlbum shows the user which album has been selected for them
	 * @param array -- the Album array of albums that will be chosen from randomly
	 */
	@SuppressWarnings("static-access")
	public static Album displayAlbum(Album[] array, int cat, int genre){
		int album;
		Album thisOne;
		boolean keepGoing = true;
		
		// genre doesn't matter, goes through all 
		if (genre == 0){
			do {
				album = getRandom(albums.length);
				System.out.println(album);
				thisOne = albums[album];
			} while (cat != thisOne.cat);
			return thisOne;
		}
		
		do {
			System.out.println("In the right loop");
			album = getRandom(albums.length+1);
			System.out.println(album);
			thisOne = albums[album];
			System.out.println(thisOne.isIn(genre) + " " + thisOne.title + "   Preconditional!");
			if (Album.isIn(genre)){
				System.out.println(thisOne.isIn(genre) + " " + thisOne.title + " It is in!");
				keepGoing = false;
				
			}
		} while ((cat != thisOne.cat) && keepGoing);

		return thisOne;

	}
	
	/**
	 * getAlbum selects an album from repository
	 * @param type is an integer that determines which to do 
	 * 		0 = sing along album
	 * 		1 = new music
	 * 		2 = to listen
	 * @param genre 
	 */
	public static void getAlbum(int type, int genre){
		// sing alongs
		chosen = displayAlbum(albums, type, genre);
		System.out.println("You should listen to: " + chosen.title + " by " + chosen.artist);
	}
	
	public static int getGenre(){

		System.out.println("The genres for new music are:\n     1. Alternative\n     2. Folk\n     3. French\n     4. Hip-Hop\n     5. Indie");
		System.out.println("     6. Pop\n     7. Rock\n     8. Soundtrack");
		
		int input = scanner.nextInt();
		return input;
	}
	
	/**
	 * chooseGenre displays genre choices and allows the user to choose which genre they want
	 * @param type is an int that directs which to do
	 * 		0 = new music
	 * 		1 = to listen
	 */

	public static void chooseGenre(int type){
		int input = getGenre();
		
		// 0 means new music
		if (type == 0)
			getAlbum(1, input);
		// 1 means toListen
		else if (type == 1)
			getAlbum(2, input);
		
	}
	
	/**
	 * newMusic is the portal for choosing albums you haven't yet listened to
	 */
	public static void newMusic(){
		System.out.println("1. Choose genre\n2. Random");
		int input = scanner.nextInt();
		if (input == 1)
			chooseGenre(0);
		else
			getAlbum(1, 0);
	}
	
	/**
	 * singAlong is the portal for choosing music that you want to sing along to
	 */
	public static void singAlong(){
		System.out.println("1. Album\n2. Playlist\n3. Random");
		int input = scanner.nextInt();
		if (input == 1)
			getAlbum(0, 0);
		else if (input == 2)
			getPlaylist(1);
		else
			getAlbum(0, 0);
	}
	
	/**
	 * toListen is the portal for choosing music you've been meaning to listen to and learn by heart
	 */
	public static void toListen(){
		System.out.println("1. Choose genre\n2. Random");
		int input = scanner.nextInt();
		if (input == 1)
			chooseGenre(1);
		else
			getAlbum(2, 0);
	}
	
	/**
	 * chooseMusic is the portal for choosing which music you want to listen to
	 */
	public static void chooseMusic(){
		System.out.println("1. New music\n2. Sing along\n3. To Listen\n4. Random");
		int input = scanner.nextInt();
		if (input == 1)
			newMusic();
		else if (input == 2)
			singAlong();
		else if (input == 3)
			toListen();
		else
			getRandMusic();
	}
	
	/**
	 * getRandom is a helper function for getting a random number for indices
	 * @param bound -- the highest possible random number you wish to get
	 * @return the random integer
	 */
	public static int getRandom(int bound){
		Random random = new Random();
		return random.nextInt(bound);
	}
	
	/**
	 * getPodcast selects a podcast for you to listen to
	 */
	public static void getPodcast(){
		String[] podcasts = {"Rookie", "MBMBAM"};
		int randCast = getRandom(podcasts.length);
		System.out.println("You should listen to: " + podcasts[randCast]);
	}
	
	/**
	 * MorP allows the user to choose whether they want to listen to music or a podcast
	 */
	public static void MorP(){
		System.out.println("1. Music\n2. Podcast");
		int input = scanner.nextInt();
		
		if (input == 1)
			chooseMusic();
		else
			getPodcast();
	}
	

	public static void main(String[] args) {
		Populate populater = new Populate();
		albums = populater.go();
		System.out.println("Welcome to the Listen Project.\n     1. Choose your listening experience\n     2. Random");
		int input = scanner.nextInt();
		
		if (input == 1)
			MorP();
		else{ 
			int rando = getRandom(2);
			if (rando == 0)
				chooseMusic();
			else
				getPodcast();
		}
	}

}
