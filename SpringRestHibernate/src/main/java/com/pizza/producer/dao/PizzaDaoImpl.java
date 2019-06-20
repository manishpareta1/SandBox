package com.pizza.producer.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pizza.producer.model.PizzaOrder;

@Repository("pizzaDaoImpl")
public class PizzaDaoImpl implements PizzaDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * This method will get us object of Session from session factory
	 * @return Session object
	 */
	public Session getSession() {
		
		return sessionFactory.getCurrentSession();
	}
	
	/**
	 * this method will save pizza order in DB.
	 * @param it accepts PizzaOrder object
	 * @return returns nothing on success.
	 * @exception thorws Hibernate Exception if any unexpected situation occurs.
	 */
	public void placeOrder(PizzaOrder pizzaOrder) throws HibernateException {
		// TODO Auto-generated method stub
		Session session = getSession();
		try {
			session.beginTransaction();
			session.save(pizzaOrder);
			session.getTransaction().commit();
		}catch(HibernateException e) {
			throw new HibernateException("Some Exception Occured while looking up for Pizza Orders");
		}finally {
			session.close();
		}
	}

	/**
	 * this method will delete pizza order for the provided order id.
	 * @param it accepts PizzaOrder orderId
	 * @return returns nothing on success.
	 * @exception thorws Hibernate Exception if any unexpected situation occurs.
	 */
	public void deleteOrder(Integer id) throws HibernateException {
		// TODO Auto-generated method stub
		Session session = getSession();
		try {
			session.beginTransaction();
			PizzaOrder order = (PizzaOrder) session.get(PizzaOrder.class, id);
			if(order != null && order.getPizzaId() == id) {
				session.delete(order);
				session.getTransaction().commit();
			}else {
				throw new HibernateException("Sorry!! Your Pizza Order is Not Found for id: "+id);
			}
		}catch(HibernateException e) {
			throw new HibernateException("Some Exception Occured while looking up for Pizza Orders");
		}finally {
			session.close();
		}
	}

	/**
	 * this method will get all list of pizza order created so far.
	 * @return returns List of PizzaOrder object on success.
	 * @exception thorws Hibernate Exception if any unexpected situation occurs.
	 */
	@SuppressWarnings("unchecked")
	public List<PizzaOrder> getAllOrder() throws HibernateException {
		// TODO Auto-generated method stub
		Session session = getSession();
		List<PizzaOrder> pizzaOrderList = null;
		try {
			Criteria criteria = session.createCriteria(PizzaOrder.class);
			pizzaOrderList = (List<PizzaOrder>)criteria.list();
			if(pizzaOrderList == null || pizzaOrderList.size()<=0)
				throw new HibernateException("Sorry!! No Pizza Order Found");
		}catch(HibernateException e) {
			throw new HibernateException("Some Exception Occured while looking up for Pizza Orders");
		}finally {
			session.close();
		}
		return pizzaOrderList;
	}

	/**
	 * this method will get pizza order for the provided orderId.
	 * @param it accept pizza order id
	 * @return returns PizzaOrder object on success.
	 * @exception thorws Hibernate Exception if any unexpected situation occurs.
	 */
	public PizzaOrder getCustomerOrderDetail(Integer customerId) throws HibernateException {
		// TODO Auto-generated method stub
		Session session = getSession();
		PizzaOrder pizzaOrder = null;
		try {
			Criteria criteria = session.createCriteria(PizzaOrder.class)
					.add(Restrictions.eq("customerId", customerId));
			List<PizzaOrder> orderList = criteria.list();
			if(orderList != null && orderList.size()>0) {
				pizzaOrder = orderList.get(0);
			}else {
				throw new HibernateException("Sorry!! No Pizza Order is Not Found for Customer id: "+customerId);
			}
		}catch(HibernateException e) {
			throw new HibernateException("Some Exception Occured while looking up for Pizza Orders");
		}finally {
			session.close();
		}
		return pizzaOrder;
	}

	/**
	 * this method will get pizza order for the provided orderId.
	 * @param it accept pizza order id
	 * @return returns PizzaOrder object on success.
	 * @exception thorws Hibernate Exception if any unexpected situation occurs.
	 */
	public PizzaOrder getOrderDetail(Integer orderId) throws HibernateException {
		// TODO Auto-generated method stub
		Session session = getSession();
		PizzaOrder pizzaOrder = null;
		try {
			session.beginTransaction();
			pizzaOrder = (PizzaOrder) session.get(PizzaOrder.class, orderId);
			session.getTransaction().commit();
			if(pizzaOrder == null)
				throw new HibernateException("Sorry!! Your Pizza Order is Not Found for id: "+orderId);
		}catch(HibernateException e) {
			throw new HibernateException("Some Exception Occured while looking up for Pizza Orders");
		}finally {
			session.close();
		}
		return pizzaOrder;
	}

}
