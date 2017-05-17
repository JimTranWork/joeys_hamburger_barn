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
public class Order extends Object {

	private String made_by = "Joey";

	public Order() {

	}

	public Order(final String made_by) {
		super();
		this.made_by = made_by;
	}

	public String getMade_by() {
		return this.made_by;
	}

	public void setMade_by(final String made_by) {
		this.made_by = made_by;
	}

}
