
public class Populate {
	public Populate(){
	}
	// genres: 1 = alt, 2 = folk, 3 = french, 4 = hip hop, 5 = indie, 6 = pop, 7 = rock, 8 = soundtrack, 9 = misc
	// type: 0 = singalong, 1 = new, 2 = to listen
	public Album[] go(){

		// ********** SINGALONGS ********** //
		int[] a1a = {1, 6};
		Album a1 = new Album("All This Bad Blood", "Bastille", a1a , 0);
		
		int[] a2a = {1, 2};
		Album a2 = new Album("Babel", "Mumford & Sons", a2a , 0);
		
		Album a3 = new Album("Badlands", "Halsey", a1a , 0);
		
		int[] a4a = {2};
		Album a4 = new Album("Barton Hollow", "The Civil Wars", a4a , 0);
		
		int[] a5a = {8};
		Album a5 = new Album("Carousel", "Various Artists", a5a , 0);
		
		int[] a6a = {1, 5};
		Album a6 = new Album("Ceremonials", "Florence + The Machine", a6a , 0);
		
		Album a7 = new Album("Contra", "Vampire Weekend", a6a , 0);
		
		Album a8 = new Album("Electra Heart", "Marina & The Diamonds", a1a , 0);
		
		Album a9 = new Album("Every Kingdom", "Ben Howard", a4a , 0);
		
		int[] a10a = {6};
		Album a10 = new Album("The Fame", "Lady Gaga", a10a , 0);
		
		int[] a11a = {1, 5, 8};
		Album a11 = new Album("The Fault in Our Stars", "Various Artists", a11a , 0);
		
		Album a12 = new Album("Four", "One Direction", a10a , 0);
		
		int[] a13a = {2, 6};
		Album a13 = new Album("Graceland", "Paul Simon", a13a , 0);
		
		int[] a14a = {6, 8};
		Album a14 = new Album("Happy Feet", "Various Artists", a14a , 0);
		
		int[] a15a = {2, 7};
		Album a15 = new Album("Hozier", "Hozier", a15a , 0);
		
		int[] a16a = {2, 8};
		Album a16 = new Album("The Hunger Games", "Various Artists", a16a , 0);
		
		int[] a17a = {1, 6, 7};
		Album a17 = new Album("I like it when you sleep for you are so beautiful yet so unaware of it", "The 1975", a17a , 0);
		
		Album a18 = new Album("Lines, Vines, and Trying Times", "Jonas Brothers", a10a , 0);
		
		Album a19 = new Album("A Little Bit Longer", "Jonas Brothers", a10a , 0);
		
		Album a20 = new Album("Made in the A.M.", "One Direction", a10a , 0);
		
		Album a21 = new Album("Modern Vampires of the City", "Vampire Weekend", a6a , 0);
		
		Album a22 = new Album("The Morning", "Lewis Watson", a10a , 0);
		
		int[] a23a = {6, 7};
		Album a23 = new Album("Night Visions", "Imagine Dragons", a23a , 0);
		
		int[] a24a = {3, 4, 6};
		Album a24 = new Album("Racine Caree", "Stromae", a24a , 0);
		
		Album a25 = new Album("Vampire Weekend", "Vampire Weekend", a6a , 0);
		
		Album a26 = new Album("x", "Ed Sheeran", a10a , 0);
		
		Album a27 = new Album("The 1975", "The 1975", a17a , 0);
		
		Album a28 = new Album("1989", "Taylor Swift", a10a , 0);
		
		Album a29 = new Album("+", "Ed Sheeran", a10a , 0);
		
		//********** NEW **********//
						
		Album a30 = new Album("The Names", "Baio", a1a , 1);
		
		int[] a31a = {3, 6};
		Album a31 = new Album("The Best of Bardot", "Brigitte Bardot", a31a , 1);
		
		int[] a32a = {4};
		Album a32 = new Album("Because the Internet", "Childish Gambino", a32a , 1);

		Album a33 = new Album("If You're Reading This It's Too Late", "Drake", a32a , 1);
		
		Album a34 = new Album("How Big, How Blue, How Beautiful", "Florence + The Machine", a15a , 1);
		
		Album a35 = new Album("Jackson C. Frank", "Jackson C. Frank", a4a , 1);
		
		int[] a36a = {7};
		Album a36 = new Album("Janis Joplin's Greatest Hits", "Janis Joplin", a36a , 1);

		Album a37 = new Album("Room for Squares", "John Mayer", a23a , 1);
		
		Album a38 = new Album("The Search for Everything", "John Mayer", a23a , 1);
		
		int[] a39a = {1, 7};
		Album a39 = new Album("Direct Hits", "The Killers", a39a , 1);
		
		Album a40 = new Album("Riot on an Empty Street", "Kings of Convenience", a6a , 1);
		
		Album a41 = new Album("The Best of Leonard Cohen", "Leonard Cohen", a4a , 1);
		
		Album a42 = new Album("Wounded Rhymes", "Lykke Li", a6a , 1);
		
		Album a43 = new Album("Era Extrema", "Neon Indian", a1a , 1);
		
		Album a44 = new Album("Vega International Night School", "Neon Indian", a4a , 1);
		
		Album a45 = new Album("In the Aeroplane Over the Sea", "Neutral Milk Hotel", a39a , 1);
		
		Album a46 = new Album("The Dark Side of the Moon", "Pink Floyd", a36a , 1);
		
		int[] a47a = {2};
		Album a47 = new Album("The Best of Simon & Garfunkel", "Simon & Garfunkel", a47a , 1);
		
		Album a48 = new Album("The Graduate", "Simon & Garfunkel", a47a , 1);
		
		int[] a49a = {1, 5, 7};
		Album a49 = new Album("Sleep in the Water", "Snakadaktal", a49a , 1);
		
		int[] a50a = {9};
		Album a50 = new Album("Apocalypse", "Thundercat", a50a , 1);
		
		int[] a51a = {6, 8};
		Album a51 = new Album("Fifty Shades Darker", "Various Artists", a51a , 1);
		
		Album a52 = new Album("Paper Towns", "Various Artists", a11a , 1);
		
		Album a53 = new Album("An Awesome Wave", "alt-J", a6a , 1);
		
		Album a54 = new Album("Antidote", "Foals", a49a , 1);
		
		int[] a55a = {4};
		Album a55 = new Album("Beauty Behind the Madness", "The Weeknd", a55a , 1);
		
		Album a56 = new Album("Gorilla Manor", "Local Natives", a55a , 1);
		
		int[] a57a = {1, 5, 6};
		Album a57 = new Album("Tigermilk", "Belle & Sebastian", a57a , 1);
		
		Album a58 = new Album("Helplessness Blues", "Fleet Foxes", a47a , 1);
		
		Album a59 = new Album("Ma Fleur", "Cinematic Orchestra", a6a , 1);
		
		Album a60 = new Album("My Beautiful Dark Twisted Fantasy", "Kanye West", a55a , 1);
		
		Album a61 = new Album("Only Run", "Clap Your Hands Say Yeah", a6a , 1);

		Album a62 = new Album("Otis Blue", "Otis Redding", a50a , 1);
		
		int[] a63a = {1};
		Album a63 = new Album("Overgrown", "James Blake", a63a , 1);
		
		Album a64 = new Album("Power, Corruption, and Lies", "New Order", a10a , 1);
		
		Album a65 = new Album("Random Access Memories", "Daft Punk", a1a , 1);
		
		Album a66 = new Album("Sun Giant", "Fleet Foxes", a47a , 1);

		Album a67 = new Album("This Is All Yours", "alt-J", a6a , 1);
		
		int[] a68a = {3};
		Album a68 = new Album("Best of Francoise Hardy", "Francoise Hardy", a68a , 1);

		Album a69 = new Album("Trilogy", "The Weeknd", a55a , 1);
		
		int[] a70a = {2, 3};
		Album a70 = new Album("V for Vendetta", "Stan Getz", a70a , 1);
		
		Album a71 = new Album("Wonder Where We Land", "SBTRKT", a63a , 1);
		
		Album a72 = new Album("Yeezus", "Kanye West", a55a , 1);

		Album a73 = new Album("My Maudlin Career", "Camera Obscura", a6a , 1);
		
		Album a74 = new Album("Franz Ferdinand", "Franz Ferdinand", a49a , 1);

		Album a75 = new Album("Psychocandy", "The Jesus and Mary Chain", a39a , 1);
		
		Album a76 = new Album("Rave Tapes", "Mogwai", a36a , 1);
		
		Album a77 = new Album("Screamadelica", "Primal Scream", a39a , 1);

		Album a78 = new Album("Only Revolutions", "Biffy Clyro", a36a , 1);
		
		Album a79 = new Album("Oracular Spectacular", "MGMT", a1a , 1);
		
		//********** TO LISTEN **********//
		
		Album a80 = new Album("Fleet Foxes", "Fleet Foxes", a47a, 2);
		
		Album a81 = new Album("You Want It Darker", "Leonard Cohen", a2a, 2);
		
		Album a82 = new Album("midnight", "Lewis Watson", a10a, 2);
		
		Album a83 = new Album("Melodrama", "Lorde", a1a, 2);
		
		Album a84 = new Album("Pure Heroine", "Lorde", a1a, 2);
		
		Album a85 = new Album("Our Own House", "MisterWives", a1a, 2);
		
		Album a86 = new Album("Midnight Memories", "One Direction", a10a, 2);
		
		Album a87 = new Album("Currents", "Tame Impala", a1a, 2);
		
		Album a88 = new Album("La La Land", "Various Artists", a5a, 2);
		
		Album a89 = new Album("Like Crazy", "Various Artists", a5a, 2);
		
		int[] a90a = {7,8};
		Album a90 = new Album("Pulp Fiction", "Various Artists", a90a, 2);
		
		Album a91 = new Album("Starboy", "The Weeknd", a55a, 2);
		
		Album a92 = new Album("Built on Glass", "Chet Faker", a63a, 2);
		
		Album a93 = new Album("Continuum", "John Mayer", a23a, 2);
		
		Album a94 = new Album("Days Are Gone", "HAIM", a39a, 2);
		
		int[] a95a = {2, 5};
		Album a95 = new Album("Down the Way", "Angus & Julia Stone", a95a, 2);
		
		Album a96 = new Album("En Vogue", "Jacques Dutronc", a31a, 2);
		
		Album a97 = new Album("Holocene", "Bon Iver", a95a, 2);
		
		Album a98 = new Album("I Forget Where We Were", "Ben Howard", a4a, 2);
		
		Album a99 = new Album("The Money Store", "Death Grips", a55a, 2);
		
		Album a100 = new Album("SBTRKT", "SBTRKT", a50a, 2);
		
		Album a101 = new Album("Take Me Home", "One Direction", a10a, 2);
		
		Album a102 = new Album("Traveller", "Chris Stapleton", a50a, 2);
		
		Album a103 = new Album("Up All Night", "One Direction", a10a, 2);
		
		Album[] albums = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, 
				a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33, a34, a35, a36, a37, a38, a39, a40, a41, a42, a43, a44, 
				a45, a46, a47, a48, a49, a50, a51, a52, a53, a54, a55, a56, a57, a58, a59, a60, a61, a62, a63, a64, a65, a66, 
				a67, a68, a69, a70, a71, a72, a73, a74, a75, 
				a76, a77, a78, a79, a80, a81, a82, a83, a84, a85, a86, a87, a88, a89, a90, a91, a92, a93, a94, a95, a96, a97,
				a98, a99, a100, a101, a102, a103
		};
		return albums;		
	}
}
