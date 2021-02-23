package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.bean.POrder;
import com.resource.DbResource;

public class POrderDao {
	
	public List<POrder> getAllPOrders() {
		
		EntityManager manager = DbResource.getEntityManager();
		Query qry	 = manager.createQuery("select p from POrder p");
		List<POrder> listOfProduct = qry.getResultList();
		return listOfProduct;
	}
	
	public void storePOrder(POrder po) {
			
		EntityManager manager = DbResource.getEntityManager();
			EntityTransaction tran = manager.getTransaction();
				tran.begin();
						manager.persist(po);
				tran.commit();
				System.out.println("Record stored successfully..");
	}
	
	public void deletePOrder(int Oid) {
			
		EntityManager manager = DbResource.getEntityManager();
		EntityTransaction tran = manager.getTransaction();
		
		POrder p	= manager.find(POrder.class, Oid);			// primary key	if record is available automatically convert record to object 
		if(p==null) {															// select * from product where pid =1
			System.out.println("Order is not present");
		}else {
			tran.begin();
						manager.remove(p);						// delete from product where pid = 1;
			tran.commit();
			System.out.println("Order Record deleted successfully");
		}
	}
	
	public void updatePOrder(POrder po) {
	
		EntityManager manager = DbResource.getEntityManager();
		EntityTransaction tran = manager.getTransaction();
		
		POrder p = manager.find(POrder.class, po.getOid());			// primary key
		if(p==null) {
			System.out.println("Order is not present");
		}else {
			tran.begin();
						p.setPrice(p.getPrice()+po.getPrice());
						manager.merge(p);									//update price using pid column 
			tran.commit();
			System.out.println("Order Record updated successfully");
		}
	}
	
		public List<POrder> getAllProductOrderByPrice(float price) {
			
			EntityManager manager = DbResource.getEntityManager();
				Query qry = manager.createQuery("select p from POrder p where p.Price > ?4");
				qry.setParameter(4, price);
				List<POrder> listOfProduct = qry.getResultList();
				return listOfProduct;
		}
}
