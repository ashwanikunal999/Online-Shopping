package com.aks.shoppingbackend.test;


import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aks.shoppingbackend.dao.UserDAO;
import com.aks.shoppingbackend.dto.Address;
import com.aks.shoppingbackend.dto.Cart;
import com.aks.shoppingbackend.dto.User;

public class UserTestCase {

	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private User user = null;
	private Cart cart = null;
	private Address address = null;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.aks.shoppingbackend");
		context.refresh();
		
		userDAO = (UserDAO) context.getBean("userDAO");
	}
	
/*
	@Test
	public void testAddUser() {
		
		user = new User() ;
		user.setFirstName("Amit");
		user.setLastName("Patel");
		user.setEmail("ap@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("CUSTOMER");
		user.setEnabled(true);
		user.setPassword("user");
		
		
		address = new Address();
		address.setAddressLineOne("56/28, 3rd Cross Road, Kuvempunagar");
		address.setAddressLineTwo("BTM 2'nd Stage");
		address.setCity("Bengeluru");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setPostalCode("560076");
		address.setBilling(true);
		
		cart = new Cart();
		
		// linked the address with the user
		address.setUserId(1);
		
		// linked the cart with the user
		cart.setUser(user);
		// link the user with the cart
		user.setCart(cart);
		
		// add the user
		assertEquals("Failed to add the user!", true, userDAO.add(user));	
		// add the address
		assertEquals("Failed to add the billing address!", true, userDAO.addAddress(address));

				
		// add the shipping address
		address = new Address();
		address.setAddressLineOne("56/28, 3rd Cross Road, Kuvempunagar");
		address.setAddressLineTwo("BTM 2'nd Stage");
		address.setCity("Bengeluru");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setPostalCode("560076");
		address.setUserId(1);
		assertEquals("Failed to add the shipping address!", true, userDAO.addAddress(address));
		
	}


	// working for uni-directional

	@Test
	public void testAddAddress() {
		user = userDAO.get(1);
		
		address = new Address();
		address.setAddressLineOne("56/28, 3rd Cross Road, Kuvempunagar");
		address.setAddressLineTwo("BTM 2'nd Stage");
		address.setCity("Bengeluru");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setPostalCode("560076");
		address.setUserId(1);
		// add the address
		assertEquals("Failed to add the address!", true, userDAO.addAddress(address));	
	}

	@Test
	public void testUpdateCart() {
		user = userDAO.get(1);
		cart = user.getCart();
		cart.setGrandTotal(10000);
		cart.setCartLines(1);
		assertEquals("Failed to update the cart!", true, userDAO.updateCart(cart));			
	} 

*/
	

	
}
