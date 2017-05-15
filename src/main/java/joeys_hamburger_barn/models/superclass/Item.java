/**
 *
 */
package joeys_hamburger_barn.models.superclass;

import javax.persistence.MappedSuperclass;

/**
 * @author Spit Ice
 *
 */

@MappedSuperclass
public class Item extends Object {

	private String name;
	private long price;

	public Item() {
		
	}
	
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
