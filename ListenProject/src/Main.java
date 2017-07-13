import java.util.Scanner;
import java.util.Random;

public class Main {
	
	//TODO Make Album class to help streamline album sorting process
	
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
			displayAlbum(news);
		}
		// sing along
		else {
			String[] faves = {"Starred", "Random", "I Know Places", "midnight city", "summer", "rain"};
			displayAlbum(faves);
		}
	}
	
	/**
	 * displayAlbum shows the user which album has been selected for them
	 * @param array -- the String array of albums that will be chosen from randomly
	 */
	public static void displayAlbum(String[] array){
		int album = getRandom(array.length);
		System.out.println("You should listen to: " + array[album]);
	}
	
	/**
	 * getAlbum selects an album from repository
	 * @param type is an integer that determines which to do 
	 * 		0 = sing along album
	 * @param genre 
	 */
	public static void getAlbum(int type, int genre){
		// sing alongs
		if (type == 0){
			// any genre
			if (genre == 0){
				String[] singalongs = {"All This Bad Blood", "Babel", "Badlands", "Barton Hollow", "Carousel", "Ceremonials", "Contra", "Electra Heart",
						"Every Kingdom", "The Fame", "The Fault in Our Stars", "Four", "Graceland", "Happy Feet", "Hozier", "The Hunger Games",
						"I like it when you sleep for you are so beautiful yet so unaware of it", "Lines, Vines, and Trying Times", "A Little Bit Longer",
						"Made in the A.M.", "Modern Vampires of the City", "The Morning", "Night Visions", "Racine Carree", "Vampire Weekend",
						"x", "The 1975", "1989", "+"};

				displayAlbum(singalongs);
			}
			// alternative
			else if (genre == 1){
				String[] alts = {"All This Bad Blood", "Badlands", "Ceremonials", "Contra", "Electra Heart", 
						"I like it when you sleep for you are so beautiful yet so unaware of it", "Modern Vampires of the City", "Vampire Weekend",
						"The 1975", "Night Visions"};
				displayAlbum(alts);
			}
			// folk
			else if (genre == 2){
				String[] folks = {"Babel", "Barton Hollow", "Every Kingdom", "The Hunger Games"};
				displayAlbum(folks);
			}
			// french
			else if (genre == 3)
				System.out.println("Racine Caree");
			
			// hip hop
			else if (genre == 4)
				System.out.println("No such album");
			
			// indie
			else if (genre == 5){
				String[] indies = {"The Fault in Our Stars", "Contra", "Modern Vampires of the City", "Vampire Weekend"};
				displayAlbum(indies);
			}
			
			// pop
			else if (genre == 6){
				String[] pops = {"The Fame", "Four", "Happy Feet", "Lines, Vines, and Trying Times", "A Little Bit Longer",
						"Made in the A.M.", "The Morning","Racine Carree", "x", "1989", "+", "I like it when you sleep", "Electra Heart"};
				displayAlbum(pops);
			}
			
			// rock
			else if (genre == 7){
				String[] rocks = {"Graceland", "Hozier"};
				displayAlbum(rocks);
			}
			// soundtrack
			else{
				String[] soundtracks = {"Carousel", "The Fault in Our Stars", "Happy Feet", "The Hunger Games"};
				displayAlbum(soundtracks);
			}
			
		} 
		
		// new albums
		else if (type == 1){
			// all albums
			if (genre == 0){
				String[] news = {"The Names - Baio", "The Best of Bardot", "Because the Internet - Childish Gambino", "If You're Reading This It's Too Late",
						"How Big, How Blue, How Beautiful", "Jackson C. Frank", "Janis Joplin's Greatest Hits", "Room for Squares", 
						"The Search for Everything - John Mayer", "Direct Hits - The Killers", "Riot on an Empty Street - Kings of Convenience", 
						"The Best of Leonard Cohen", "Wounded Rhymes - Lykke Li", "Era Extrana - Neon Indian", "Vega Intl. Night School - Neon Indian",
						"In the Aeroplane Over the Sea - Neutral Milk Hotel", "The Dark Side of the Moon - Pink Floyd", "The Best of Simon & Garfunkel", 
						"The Graduate - Simon & Garfunkel", "Sleep in the Water - Snakadaktal", "Apocalypse - Thundercat", "Fifty Shades Darker", 
						"Paper Towns", "An Awesome Wave - alt-J", "Antidote - Foals", "Beauty Behind the Madness", "Gorilla Manor - Local Natives", 
						"Tigermilk - Belle and Sebastian", "Helplessness Blues - Fleet Foxes", "Ma Fleur - The Cinematic Orchestra", "My Beautiful Dark Twisted Fantasy",
						"Only Run - Clap Your Hands Say Yeah", "Otis Blue - Otis Redding", "Overgrown - James Blake", "Power, Corruption, and Lies - New Order",
						"Random Access Memories", "Sun Giant - Fleet Foxes", "This Is All Yours - alt-J", "Best of Francoise Hardy", "Trilogy - The Weeknd",
						"V for Vendetta - Stan Getz", "Wonder Where We Land - SBTRKT", "Yeezus", "My Maudlin Career - Camera Obscura", "Franz Ferdinand",
						"Psychocandy - The Jesus and Mary Chain", "Rave Tapes - Mogwai", "Screamadelica - Primal Scream", "Only Revolutions - Biffy Clyro",
						"Oracular Spectacular - MGMT"
				};
				displayAlbum(news);
			}
			
			// alt
			else if (genre == 1){
				String[] alts = {"The Names - Baio", "How Big, How Blue, How Beautiful", "Direct Hits - The Killers", "Riot on an Empty Street - Kings of Convenience", 
						"Wounded Rhymes - Lykke Li", "Era Extrana - Neon Indian", "Vega Intl. Night School - Neon Indian",
						"In the Aeroplane Over the Sea - Neutral Milk Hotel", "Sleep in the Water - Snakadaktal", "Apocalypse - Thundercat",
						"An Awesome Wave - alt-J", "Antidote - Foals", "Gorilla Manor - Local Natives", "Tigermilk - Belle and Sebastian", "Ma Fleur - The Cinematic Orchestra",
						"Only Run - Clap Your Hands Say Yeah", "Overgrown - James Blake", "Random Access Memories", "Sun Giant - Fleet Foxes",
						"This Is All Yours - alt-J", "Wonder Where We Land - SBTRKT", "My Maudlin Career - Camera Obscura", "Franz Ferdinand", 
						"Psychocandy - The Jesus and Mary Chain", "Screamadelica - Primal Scream", "Only Revolutions - Biffy Clyro", "Oracular Spectacular - MGMT"
				};
				displayAlbum(alts);
			}
			
			// folk
			else if (genre == 2){
				String[] folks = {"Jackson C. Frank", "The Best of Leonard Cohen", "The Best of Simon & Garfunkel", "The Graduate - Simon & Garfunkel", 
						"Otis Blue - Otis Redding"};
				displayAlbum(folks);
			}
			
			// french
			else if (genre == 3){
				String[] frenchies = {"The Best of Bardot", "Best of Francoise Hardy", "V for Vendetta - Stan Getz"};
				displayAlbum(frenchies);
			}

				
			// hip hop
			else if (genre == 4){
				String[] hiphops = {"Because the Internet - Childish Gambino", "If You're Reading This It's Too Late", "Beauty Behind the Madness",
						"My Beautiful Dark Twisted Fantasy", "Trilogy - The Weeknd", "Yeezus"};
				displayAlbum(hiphops);
			}
			
			// indie
			else if (genre == 5){
				String[] indies = {"How Big, How Blue, How Beautiful", "Riot on an Empty Street - Kings of Convenience", 
						"In the Aeroplane Over the Sea - Neutral Milk Hotel", "Antidote - Foals", "Tigermilk  - Belle and Sebastian", "Helplessness Blues - Fleet Foxes",
						"Only Run - Clap Your Hands Say Yeah", "Sun Giant - Fleet Foxes", "This Is All Yours - alt-J", "My Maudlin Career - Camera Obscura"
						};
				displayAlbum(indies);
			}
			
			// pop
			else if (genre == 6){
				String[] pops = {"Room for Squares", "The Search for Everything - John Mayer", "Era Extrana - Neon Indian", "Vega Intl. Night School - Neon Indian",
						"Power, Corruption, and Lies - New Order"};
				displayAlbum(pops);
			}
			
			// rock
			else if (genre == 7){
				String[] rocks = {"Janis Joplin's Greatest Hits",  "Direct Hits - The Killers",  "The Dark Side of the Moon - Pink Floyd",
						"Franz Ferdinand", "Psychocandy - The Jesus and Mary Chain", "Rave Tapes - Mogwai", "Screamadelica - Primal Scream",
						"Only Revolutions - Biffy Clyro"};
				displayAlbum(rocks);
			}
			
			// soundtrack
			else{
				String[] soundtracks = {"Fifty Shades Darker", "Paper Towns"};
				displayAlbum(soundtracks);
			}
		}
		
		// to listen to albums
		else {
			// all albums
			if (genre == 0){
				String[] albums = {"Fleet Foxes", "You Want It Darker", "midnight", "Melodrama", "Pure Heroine", "Our Own House", 
						"Midnight Memories", "Currents", "La La Land", "Like Crazy", "Pulp Fiction", "Starboy", "Built on Glass", "Continuum", "Days Are Gone",
						"Down the Way - Angus & Julia Stone", "En Vogue - Jacques Dutronc", "Holocene", "I Forget Where We Were", 
						"The Money Store", "SBTRKT", "Take Me Home", "Traveller - Chris Stapleton", "Up All Night"
				};
				displayAlbum(albums);
			}
			// alt
			else if (genre == 1){
				String[] alts = {"Fleet Foxes", "You Want It Darker", "Melodrama", "Pure Heroine", "Our Own House", "Currents", "Built on Glass", "Days Are Gone",
						"Down the Way - Angus & Julia Stone", "Holocene", "SBTRKT"
				};
				displayAlbum(alts);
			}
			
			// folk
			else if (genre == 2){
				String[] folks = {"Fleet Foxes", "You Want It Darker", "I Forget Where We Were", "Traveller - Chris Stapleton"};
				displayAlbum(folks);
			}
			
			// french
			else if (genre == 3){
				System.out.println("En Vogue - Jacques Dutronc");
			}
			
			// hip hop
			else if (genre == 4){
				String[] hiphops = {"Starboy", "The Money Store"};
				displayAlbum(hiphops);
			}
			
			// indie
			else if (genre == 5){
				String[] indies = {"Fleet Foxes", "Down the Way - Angus & Julia Stone", "Holocene"};
				displayAlbum(indies);
			}
			
			// pop
			else if (genre == 6){
				String[] pops = {"Melodrama", "Pure Heroine", "Our Own House", "Midnight Memories", "midnight", "Take Me Home", "Up All Night"};
				displayAlbum(pops);
			}
			
			// rock
			else if (genre == 7)
				System.out.println("Continuum");
			
			else {
				String[] soundtracks = {"La La Land", "Pulp Fiction", "Like Crazy"};
				displayAlbum(soundtracks);
			}
		}
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
