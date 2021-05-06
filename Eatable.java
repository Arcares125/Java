
public interface Eatable extends Healing {
	String sound = "nyam nyam nyam";
	default void eat() {
		System.out.println("Eat 1");
	};
}
