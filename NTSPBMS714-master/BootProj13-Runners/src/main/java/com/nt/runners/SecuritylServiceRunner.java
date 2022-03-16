package com.nt.runners;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class SecuritylServiceRunner implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("SecurityServiceRunner.run()");
		System.out.println("Nonoption args"+args.getNonOptionArgs());  //only value will be there no key
		System.out.println("option arg names/keys"+args.getOptionNames());  //contains  --key=val  , this  method gives only keys
				System.out.println("Source args"+Arrays.toString(args.getSourceArgs()));
		
	}

}
