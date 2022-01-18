package Main;

/**
 * Die Spieler-Klasse.
 * @author Mika Thein
 * @version 1.0
 */
public class Player extends Entity {
	
	/**
	 * Die Standardrange eines Spielers.
	 */
	private static final float standardRange = 1.5f;
	
	/**
	 * Erstellt einen neuen Spieler.
	 * @param x die Start-x-Koordinate
	 * @param y die Start-y-Koordinate
	 * @param hp die Lebenspunkte
	 * @param attackDamage die Schadensst�rke
	 * @param imageSet das imageSet
	 */
	public Player(float x, float y, float hp, float attackDamage, EntityImageSet imageSet) {
		super(x, y, hp, attackDamage, standardRange, imageSet);
	}

}
