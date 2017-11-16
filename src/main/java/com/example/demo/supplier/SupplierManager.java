package com.example.demo.supplier;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.supplier.impl.Xiaoka;
import com.example.demo.supplier.impl.Yangchele;
import com.example.demo.utils.ClassUtil;

public class SupplierManager {

	static private Map<String, Supplier> suppliers = new HashMap<>();

	static {

		List<Class> supplierClasses = ClassUtil.getAllClassByInterface(Supplier.class);

		try {
			for (Class class1 : supplierClasses) {
				suppliers.put(class1.getSimpleName().toLowerCase(), (Supplier) class1.newInstance());
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// suppliers.put("xiaoka", new Xiaoka());
		// suppliers.put("yangchele", new Yangchele());
	}

	static public Supplier getSupplier(String supplierName) {
		return suppliers.get(supplierName.toLowerCase());
	}
	
	static public void printSupplierMap()
	{
		for (Map.Entry<String, Supplier> entry : suppliers.entrySet()) {
			System.out.println(entry.getKey() + "----" + entry.getValue());
		}
	}

}
