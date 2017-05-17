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
public class OrderDetails extends Object {

	private String order_id;
	private String item_id;
	private int total_quantity;

	public OrderDetails() {

	}

	public OrderDetails(final String order_id, final String item_id, final int total_quantity) {
		super();
		this.order_id = order_id;
		this.item_id = item_id;
		this.total_quantity = total_quantity;
	}

	public String getOrder_id() {
		return this.order_id;
	}

	public void setOrder_id(final String order_id) {
		this.order_id = order_id;
	}

	public String getItem_id() {
		return this.item_id;
	}

	public void setItem_id(final String item_id) {
		this.item_id = item_id;
	}

	public int getTotal_quantity() {
		return this.total_quantity;
	}

	public void setTotal_quantity(final int total_quantity) {
		this.total_quantity = total_quantity;
	}

}
