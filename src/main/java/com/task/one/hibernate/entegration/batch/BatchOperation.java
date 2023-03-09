package com.task.one.hibernate.entegration.batch;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.sun.org.apache.xerces.internal.util.Status;
import com.task.one.hibernate.entegration.entities.Account;
import com.task.one.hibernate.entegration.entities.AccountTransaction;
import com.task.one.hibernate.entegration.entities.BatchData;
import com.task.one.hibernate.entegration.enums.StatusEnum;
import com.task.one.hibernate.entegration.enums.TransactionType;
import com.task.one.hibernate.entegration.exception.DataNotFoundException;
import com.task.one.hibernate.entegration.util.HibernateUtil;

public class BatchOperation implements Runnable {

    private List<BatchData> batchDataList;
    private int startNumber;
    private int endNumber;
    private int commitCount;
    
    
    
    /**
     * @param batchDataList
     * @param startNumber
     * @param endNumber
     */
    public BatchOperation(List<BatchData> batchDataList, int startNumber, int endNumber, int commitCount) {
	super();
	this.batchDataList = batchDataList;
	this.startNumber = startNumber;
	this.endNumber = endNumber;
	this.commitCount = commitCount;
    }



    @Override
    public void run() {
	// TODO Auto-generated method stub
	    int commitCountNumber = commitCount;
	    int commitCounter = 0;
	    int maxCommitCount = endNumber - startNumber;
 	    
	    if(commitCount >= maxCommitCount) {
		commitCountNumber = maxCommitCount;
	    }
	
	Session session = HibernateUtil.getSessionFactory().openSession();

 	try {

 	    for (int i = startNumber; i < endNumber; i++)  {
 		if(batchDataList.get(i).getStatus() == StatusEnum.ISLENECEK.getValue()) {
 		BigDecimal amount = null;     
 		AccountTransaction trx = new AccountTransaction();
 		Account account = session.get(Account.class, batchDataList.get(i).getAccountNo());
 		
 		if(account == null) {
 		    throw new DataNotFoundException("Account record that must be updated  is not found.");
 		}
 		
 		session.beginTransaction();
 		
 		if(batchDataList.get(i).getTransactionType() == TransactionType.A.name()) {
 		    amount = account.getTotalAmount().add(batchDataList.get(i).getAmount()) ;
 		    trx.setTransactionType(TransactionType.A.getValue());
 		    
 		}else if(batchDataList.get(i).getTransactionType() == TransactionType.B.name()) {
 		    amount = account.getTotalAmount().subtract(batchDataList.get(i).getAmount()) ;
 		    trx.setTransactionType(TransactionType.B.getValue());

 		}
 		
 		batchDataList.get(i).setStatus(StatusEnum.ISLENDI.getValue());
 		account.setTotalAmount(amount);
 		trx.setAccountNumber(account.getAccountNumber());
 	        session.save(trx);
 	        session.saveOrUpdate(account);
 	        session.saveOrUpdate(batchDataList.get(i));
 	
 	        if(commitCounter == commitCountNumber) {
 	           commitCounter = 0;
 	 	   session.getTransaction().commit();

 	        }
 		commitCounter ++;
 	    }
 		session.close();
 	    }

 	} catch (HibernateException e) {
 	    session.getTransaction().rollback();
	    session.close();

 	    e.printStackTrace();
 	} catch (DataNotFoundException e) {
	    // TODO Auto-generated catch block
            session.close();
	    e.printStackTrace();
	}
	
    }

    
    
}
