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
	private String order_made_by;
	private String item_id;
	private String item_name;
	private double item_price;
	private int total_quantity;
	private double total_amount;

	public OrderDetails() {

	}

	public OrderDetails(String order_id, String order_made_by, String item_id, String item_name, double item_price,
			int total_quantity, double total_amount) {
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
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getOrder_made_by() {
		return order_made_by;
	}

	public void setOrder_made_by(String order_made_by) {
		this.order_made_by = order_made_by;
	}

	public String getItem_id() {
		return item_id;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public double getItem_price() {
		return item_price;
	}

	public void setItem_price(double item_price) {
		this.item_price = item_price;
	}

	public int getTotal_quantity() {
		return total_quantity;
	}

	public void setTotal_quantity(int total_quantity) {
		this.total_quantity = total_quantity;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}



}
