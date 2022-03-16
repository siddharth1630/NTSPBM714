package com.nt.runner;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Actor;
import com.nt.service.IActorAssociationMgmtService;

@Component
public class MongoTemplateOperationsRunner implements CommandLineRunner {
	@Autowired
	private IActorAssociationMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		
	 //============ save /insert opeation=========================
		/*Actor actor=new Actor(new Random().nextInt(400000),
			                                    "akshay",
			                                    "hero",
			                                     58.0f,
			                                     5435435535L);
		System.out.println(service.registerActor(actor));*/
		/* System.out.println("----------------------------------------");
		 String msg=service.registerActorsGroup(List.of
				                                                  (new Actor(new Random().nextInt(400000),
				                                                   "sonu sood",
				                                                    "hero",
				                                                     45.0f,
				                                                     5455545345L),
				                                                    new Actor(new Random().nextInt(400000),
		                                                                              "salman",
		                                                                              "hero",
		                                                                               60.0f,
		                                                                               5555545345L)
				                                                    ));
         System.out.println(msg);*/
    //--------------------------------------find methods for select opeations ----------------------------
         //service.getAllActors().forEach(System.out::println);
		 // service.getActorsByCategory("hero").forEach(System.out::println);
		//System.out.println(service.getActorByActorId(163421));
		
		//-----------------------   findAndModify , updateMulti methods  for  update operations------------
		//System.out.println(service.updateActorByActorId(163421, "mumbai",9999999999L));
		 // System.out.println(service.updateActorsRenumerationByCategoryAndAge("hero", 40.0f, 10000000.0));
		//out.println(service.saveOrUpdateActorByRenumeration(50000000.0, 1000000000.0, "hyd",34.0f , 53455345354L));
		
		//-----------------------   findAndRemove , findAllAndRemove methods  for delete operations------------
		   System.out.println(service.removeDocByAge(34.0f));
	}

}
