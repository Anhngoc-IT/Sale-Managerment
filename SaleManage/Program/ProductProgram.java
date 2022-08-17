package Program;

import java.util.Scanner;

import Controller.ProductManage;

public class ProductProgram {
	
	 public static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        String choose = null;
	        boolean exit = false;
	        ProductManage pm = new ProductManage();
	        showMenu();
	        while (true) {
	            choose = scanner.nextLine();
	            switch (choose) {
	                case "1":
	                    pm.add();
	                    break;
	                case "2":
	                    pm.edit(choose);
	                    break;
	                case "3":
	                    pm.delete(choose);
	                    break;
	                case "4":
	                    pm.viewAll();
	                    break;
	                case "5" :
	                	pm.searchById(choose);
	                	break;
	                case "0":
	                    System.out.println("exited!");
	                    exit = true;
	                    break;
	                default:
	                    System.out.println("invalid! please choose action in below menu:");
	                    break;
	            }
	            if (exit) {
	                break;
	            }
	            // show menu
	            showMenu();
	        }
	    }

	    /**
	     * create menu
	     */
	    public static void showMenu() {
	        System.out.println("-----------menu------------");
	        System.out.println("1. Add product.");
	        System.out.println("2. Edit product by id.");
	        System.out.println("3. Delete product by id.");
	        System.out.println("4. Show product.");
	        System.out.println("5. Search product.");
	        System.out.println("0. exit.");
	        System.out.println("---------------------------");
	        System.out.print("Please choose: ");
	    }


}
