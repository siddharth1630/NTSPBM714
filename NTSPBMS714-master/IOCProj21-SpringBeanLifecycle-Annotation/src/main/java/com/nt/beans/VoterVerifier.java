package com.nt.beans;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("voter")
public class VoterVerifier  {
	
	@Value("${vt.name}")
	private  String name;
	@Value("${vt.age}")
	private  float age;
	private  Date  verficationDate;
	
	public VoterVerifier() {
		System.out.println("VoterVerifier:: 0-param constructor");
	}
	
	
	@PostConstruct
	public    void  ourInit() {
		System.out.println("VoterVerifier.ourInit() (custom init method)");
		 verficationDate=new Date();  // initializing   bean property that is not particpating Injections
		 //validation
		 if(name==null  || age<=0)
			 throw  new IllegalArgumentException("invalid  inputs are given for  name , age propeties");
	}
	
	@PreDestroy
	public void ourDestroy()  {
		System.out.println("VoterVerifier.ourDestroy() (custome destory method) ");
		//nullifying bean properties
		name=null;
		age=0;
		verficationDate=null;
	}
	
	
	
/*	//init life cycle method /custom init method
	public    void  myInit() {
		System.out.println("VoterVerifier.myInit() (custom init method)");
		 verficationDate=new Date();  // initializing   bean property that is not particpating Injections
		 //validation
		 if(name==null  || age<=0)
			 throw  new IllegalArgumentException("invalid  inputs are given for  name , age propeties");
	} */
	
/*	@Override
	public void destroy() throws Exception {
		System.out.println("VoterVerifier.destroy() (DisposableBean(I))");
		//nullifying bean properties
		name=null;
		age=0;
		verficationDate=null;
	}
*/
/*	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VoterVerifier:: afterPropertiesSet() (InitializingBean(I))");
		 verficationDate=new Date();  // initializing   bean property that is not particpating Injections
		 //validation
		 if(name==null  || age<=0)
			 throw  new IllegalArgumentException("invalid  inputs are given for  name , age propeties");
		
	}
*/	
/*	public void  myDestroy() {
		System.out.println("VoterVerifier.myDestroy()");
		//nullifying bean properties
		name=null;
		age=0;
		verficationDate=null;
	} */
	
	//b.method
	public   String  checkVotingElgibility() {
		if(age<18)
			return  "Mr/Miss/Mrs."+ name +"   u  r not elgible for voting  .. wait "+(18-age)+"  years to cast u r vote  on -->"+verficationDate ;
		else
			return  "Mr/Miss/Mrs."+ name +"   u  r   elgible for voting  .. Do not wait  on--> "+verficationDate;
			
	}

	

}
