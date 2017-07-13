
public class Album {
	public String title;
	public String artist;
	public static int[] genres;
	public int cat;			// 0 = singalong, 1 = new music, 2 = to listen
	
	public Album(String name, String artist, int[] genre, int type){
		title = name;
		this.artist = artist;
		Album.genres = genre;
		this.cat = type;
	}
	
	public void setCategory(int type){
		this.cat = type;
	}
	
	/**
	 * isIn finds a certain genre in the list of an album's genres
	 * @param genre -- int relating to genre number
	 * @return	-- returns boolean true if the album is that genre
	 */
	public static boolean isIn(int genre){
		for (int i = 0; i < genres.length; i++){
			if (genre == genres[i]){
				//System.out.println(title + ":" + genre + genres[i]);
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		int[] genres1 = {1, 6, 7};
		Album the1975 = new Album("The 1975", "The 1975", genres1, 0);
		System.out.println(Album.isIn(5));
	}
}
