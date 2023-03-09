package com.task.one.hibernate.entegration.batch;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.hibernate.Session;

import com.task.one.hibernate.entegration.entities.BatchData;
import com.task.one.hibernate.entegration.entities.Command;
import com.task.one.hibernate.entegration.util.HibernateUtil;

public class XBatch implements IBatch {

    
    @Override
    public void execute(int threadCount, int commitCount) {
	// TODO Auto-generated method stub
	Session session = HibernateUtil.getSessionFactory().openSession();
        List<BatchData> lst = session.createQuery("from BatchData where status = 1")
			      .list();
	ExecutorService executor = Executors.newFixedThreadPool(threadCount);
	        for (int i = 0; i < threadCount; i++) {
	            int start = i * lst.size() / threadCount;
	            int end = (i + 1) * lst.size()/ threadCount;
	            executor.execute(new BatchOperation(lst, start, end, commitCount));
	        }
	        executor.shutdown();
	        executor.awaitTermination(1, TimeUnit.MINUTES);

	        System.out.println("Batch finished...");
	    }
    }
    
    
}
