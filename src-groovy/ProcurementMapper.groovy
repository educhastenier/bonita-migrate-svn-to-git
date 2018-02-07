import java.sql.ResultSet;
import java.sql.SQLException;

import org.bonitasoft.procurement.Invoice;
import org.bonitasoft.procurement.Order;
import org.bonitasoft.procurement.OrderItem;
import org.bonitasoft.procurement.Product;
import org.bonitasoft.procurement.Vendor;

def static List<Vendor> mapVendors(ResultSet resultSet){
	List<Vendor> vendors = new ArrayList();
	while(resultSet.next()){
		vendors.add(mapVendor(resultSet));
	}
	return vendors;
}

def static List<Product> mapProducts(ResultSet resultSet){
	List products = new ArrayList();
	while(resultSet.next()){
		Product product = new Product();
		product.setId(resultSet.getLong("id"));
		product.setVendorId(resultSet.getLong("vendor_id"))
		product.setProductName(resultSet.getString("product_name"));
		product.setPartNumber(resultSet.getString("part_number"));
		product.setPricePerUnit(resultSet.getDouble("unit_price"));
		product.setCommodityCategory(resultSet.getString("commodity_category"));
		products.add(product);
	}
	return products;
}

def static List<Order> mapOrders(ResultSet resultSet){
	List orders = new ArrayList();
	while(resultSet.next()){
		Order order = new Order();
		order.setId(resultSet.getLong("order_id"));
		order.setVendorId(resultSet.getLong("vendor_id"))
		order.setPoNumber(resultSet.getString("po_number"));
		order.setRequestorBonitaId(resultSet.getLong("requestor_id"));
		order.setTotalPrice(resultSet.getDouble("total_price"));
		order.setStatus(resultSet.getString("status"));
		if(resultSet.getDate("delivery_date") != null)
			order.setDeliveryDate(resultSet.getDate("delivery_date"));
		order.setVendor(mapVendor(resultSet));
		orders.add(order);
	}
	return orders;
}


def static List<OrderItem> mapOrderItems(ResultSet resultSet){
	List items = new ArrayList();
	while(resultSet.next()){
		OrderItem orderItem = new OrderItem();
		orderItem.setId(resultSet.getLong("id"));
		orderItem.setVendorId(resultSet.getLong("vendor_id"))
		orderItem.setProductName(resultSet.getString("product_name"));
		orderItem.setPartNumber(resultSet.getString("part_number"));
		orderItem.setPrice(resultSet.getDouble("price"));
		orderItem.setCommodityCategory(resultSet.getString("commodity_category"));
		orderItem.setPoId(resultSet.getLong("po_id"));
		orderItem.setQuantity(resultSet.getLong("quantity"));
		items.add(orderItem);
	}
	return items;
}

def static Invoice mapInvoice(ResultSet resultSet){
	Invoice invoice = new Invoice();
	while(resultSet.next()){
		invoice.setId(resultSet.getLong("id"));
		invoice.setPoId(resultSet.getLong("po_id"))
		invoice.setInvoiceNumber(resultSet.getString("invoice_number"));
		invoice.setPriceBeforeTax(resultSet.getDouble("price_before_tax"));
		invoice.setTax(resultSet.getDouble("tax"));
		invoice.setPriceAfterTax(resultSet.getDouble("price_after_tax"));
		invoice.setInvoiceDate(resultSet.getDate("invoice_date"));
		invoice.setInvoiceDueDate(resultSet.getDate("invoice_due_date"));
	}
	return invoice;
}

private def static Vendor mapVendor(ResultSet resultSet){
	Vendor vendor = new Vendor();
	vendor.setId(resultSet.getLong("id"));
	vendor.setOrgName(resultSet.getString("org_name"))
	vendor.setContactName(resultSet.getString("contact_name"));
	vendor.setContactEmail(resultSet.getString("contact_email"));
	vendor.setAddress(resultSet.getString("address"));
	vendor.setCountry(resultSet.getString("country"));
	vendor.setContactPhone(resultSet.getString("contact_phone"));
	vendor.setFax(resultSet.getString("fax"));
	vendor.setVatNumber(resultSet.getString("vat_number"));
	vendor.setCommodities(resultSet.getString("commodities"));
	vendor.setIsActive(getBoolean(resultSet, "is_active"));
	vendor.setIsApproved(getBoolean(resultSet, "is_approved"));
	vendor.setCode(resultSet.getString("code"));
	return vendor;
}

def static Boolean getBoolean(ResultSet resultset, String parameterName){
	return 1 == resultset.getInt(parameterName);
}

def static Date getDate(ResultSet result, String parameterName)
{
	   try {
			return result.getDate(parameterName) == null ? null :
					new Date(result.getDate(parameterName).getTime()) ;
		} catch (SQLException e) {
		   throw new RuntimeException(e);
		}
}
