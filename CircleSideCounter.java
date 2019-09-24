/** Circle has infinite sides */
public class CircleSideCounter implements SideCounter {
	@Override
	public int chooseSides() {
		return Integer.MAX_VALUE;
	}
}
