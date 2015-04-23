package org.uengine.persistence.processinstance;

import javax.ejb.EntityContext;

/**
 * @author Jinyoung Jang
 */


public abstract class ProcessInstanceRepositoryBean implements javax.ejb.EntityBean, ProcessInstanceRepositoryLocal{

	public Long ejbCreate(Long id) throws javax.ejb.CreateException{
		setInstId(id);
		
		return null;
	}
	
	public void ejbPostCreate(Long id){}
	
  // standard call back methods
   public void setEntityContext(EntityContext ec){}
   public void unsetEntityContext(){}
   public void ejbLoad(){}
   public void ejbStore(){}
   public void ejbActivate(){}
   public void ejbPassivate(){}
   public void ejbRemove(){}

}