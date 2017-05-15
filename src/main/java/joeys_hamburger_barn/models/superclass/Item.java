/**
 *
 */
package joeys_hamburger_barn.models.superclass;

/**
 * @author Spit Ice
 *
 */
public class Item extends Object {

	private String name;
	private long price;

	public Item(final String name, final long price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public long getPrice() {
		return this.price;
	}

	public void setPrice(final long price) {
		this.price = price;
	}

}
