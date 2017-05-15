/**
 *
 */
package joeys_hamburger_barn.models;

/**
 * @author Spit Ice
 *
 */
public class OrderDetails {

	private String order_id;
	private String item_id;
	private int item_quantity;

	public OrderDetails(final String order_id, final String item_id, final int item_quantity) {
		super();
		this.order_id = order_id;
		this.item_id = item_id;
		this.item_quantity = item_quantity;
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

	public int getItem_quantity() {
		return this.item_quantity;
	}

	public void setItem_quantity(final int item_quantity) {
		this.item_quantity = item_quantity;
	}

}
