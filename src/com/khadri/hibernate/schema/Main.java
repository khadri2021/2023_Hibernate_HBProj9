package com.khadri.hibernate.schema;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.khadri.hibernate.entity.Remote;

public class Main {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure(
				"C:/KHADRI/2022_BATCH_28AUG/Eclipse_Workspaces/HIbernate/HBProj9/config/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		Remote remote = new Remote();
		remote.setName("SAMSUNG");
		session.save(remote);

		txn.commit();
		session.close();
		factory.close();

	}
}
