package Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import Entity.Category;
import Entity.Product;
import Interface.IAction;

public class ProductManage implements IAction {

	private Scanner scanner;
	private List<Product> ds_products;

	public ProductManage() {
		ds_products = new ArrayList();
		scanner = new Scanner(System.in);
	}

	@Override
	public Product add() {

		Date date = new Date();
		Category category = new Category();
		Product products = new Product();
		String id = String.valueOf(ds_products.size() + 1);
		System.out.println("THEM san pham: nhap id:" + id);
		products.setId(id);
		System.out.println("nhap tenSP");
		products.setName(nhapchuoi());
		System.out.println("THEM san pham: nhap giaBan");
		products.setPrice(Double.parseDouble(nhapchuoi()));
		products.setDayInsert(new Date());
		System.out.println("THEM san pham: nhap ngayHetHan");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		String dateInString = nhapchuoi();
		try {
			date = formatter.parse(dateInString);
		} catch (ParseException ex) {
			Logger.getLogger(ProductManage.class.getName()).log(Level.SEVERE, null, ex);
		}
		products.setExprivate(date);
		System.out.println("THEM san pham: nhap loaiSP");
		products.setCategory();
		ds_products.add(products);
		System.out.println("THEM san pham: nhap soLuong");
		products.setQualtity(Integer.parseInt(nhapchuoi()));
		ds_products.add(products);
		System.out.println("them san pham thanh cong");
		return products;

	}

	@Override
	public boolean edit(String id) {
		Date date = new Date();
		System.out.println("sua sp");
		System.out.println("nhap id");
		id = scanner.nextLine();
		System.out.println(id);
		// ds_products.forEach(System.out::print);
		for (int i = 0; i < ds_products.size(); i++) {
			if (id.equals(ds_products.get(i).getId())) {

				System.out.println("nhap tenSP");
				ds_products.get(i).setName(nhapchuoi());
				System.out.println("THEM san pham: nhap giaBan");
				ds_products.get(i).setPrice(Double.parseDouble(nhapchuoi()));
				ds_products.get(i).setDayInsert(new Date());
				System.out.println("THEM san pham: nhap ngayHetHan");
				SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
				String dateInString = nhapchuoi();
				try {
					date = formatter.parse(dateInString);
				} catch (ParseException ex) {
					Logger.getLogger(ProductManage.class.getName()).log(Level.SEVERE, null, ex);
				}
				ds_products.get(i).setExprivate(date);
				System.out.println("THEM san pham: nhap loaiSP");
				ds_products.get(i).setCategory();
				System.out.println("THEM san pham: nhap soLuong");
				ds_products.get(i).setQualtity(Integer.parseInt(nhapchuoi()));

				System.out.println("sua san pham thanh cong");
				break;
			}
		}
		System.out.println("ket thuc sua");
		return true;
	}

	@Override
	public boolean delete(String id) {

		System.out.println("xoa sp");
		System.out.println("nhap id");
		id = scanner.nextLine();
		for (int i = 0; i < ds_products.size(); i++) {
			if (id.equals(ds_products.get(i).getId())) {
				ds_products.remove(i);
				System.out.println("xoa san pham thanh cong");
				break;
			}
		}
		return false;
	}

	@Override
	public void searchById(String id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void viewAll() {

		System.out.println("Danh sách hoá đơn");
		ds_products.forEach(System.out::print);
		System.out.println();

	}

	private String nhapchuoi() {

		String s = scanner.nextLine();
		while (s.trim().isBlank() || s.isEmpty()) {
			System.out.println("nhap lai");
			s = scanner.nextLine();
		}

		return s;

	}

}