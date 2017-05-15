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
@Entity(name = "OrderDetails")
public class OrderDetails extends Object {

	private String order_id;
	private String order_made_by;
	private String item_id;
	private String item_name;
	private double item_price;
	private int total_quantity;
	private double total_amount;

	public OrderDetails() {

	}

	public OrderDetails(final String order_id, final String order_made_by, final String item_id, final String item_name,
			final double item_price, final int total_quantity, final double total_amount) {
		super();
		this.order_id = order_id;
		this.order_made_by = order_made_by;
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_price = item_price;
		this.total_quantity = total_quantity;
		this.total_amount = total_amount;
	}

	public String getOrder_id() {
		return this.order_id;
	}

	public void setOrder_id(final String order_id) {
		this.order_id = order_id;
	}

	public String getOrder_made_by() {
		return this.order_made_by;
	}

	public void setOrder_made_by(final String order_made_by) {
		this.order_made_by = order_made_by;
	}

	public String getItem_id() {
		return this.item_id;
	}

	public void setItem_id(final String item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return this.item_name;
	}

	public void setItem_name(final String item_name) {
		this.item_name = item_name;
	}

	public double getItem_price() {
		return this.item_price;
	}

	public void setItem_price(final double item_price) {
		this.item_price = item_price;
	}

	public int getTotal_quantity() {
		return this.total_quantity;
	}

	public void setTotal_quantity(final int total_quantity) {
		this.total_quantity = total_quantity;
	}

	public double getTotal_amount() {
		return this.total_amount;
	}

	public void setTotal_amount(final double total_amount) {
		this.total_amount = total_amount;
	}

}
