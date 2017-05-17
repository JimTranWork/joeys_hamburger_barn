/**
 *
 */
package joeys_hamburger_barn.models;

import javax.persistence.Entity;

import joeys_hamburger_barn.models.superclass.Object;

/**
 * @author Spit Ice
 *
 */

@Entity
public class Item extends Object {

	private String name;
	private double price;

	public Item() {

	}

	public Item(final String name, final double price) {
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

	public double getPrice() {
		return this.price;
	}

	public void setPrice(final double price) {
		this.price = price;
	}

}
