/**
 *
 */
package joeys_hamburger_barn.models;

import joeys_hamburger_barn.models.superclass.Item;

/**
 * @author Spit Ice
 *
 */
public class Hamburger extends Item {

	private boolean has_cheese;

	public Hamburger(final String name, final long price, final boolean has_cheese) {
		super(name, price);
		this.has_cheese = has_cheese;
	}

	public boolean isHas_cheese() {
		return this.has_cheese;
	}

	public void setHas_cheese(final boolean has_cheese) {
		this.has_cheese = has_cheese;
	}

}
