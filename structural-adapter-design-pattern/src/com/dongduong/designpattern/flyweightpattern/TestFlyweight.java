package com.dongduong.designpattern.flyweightpattern;

public class TestFlyweight {

	public static void main(String[] args) {

		Code code = new Code();
		code.setCode("C Code...");
		Platform platform = PlatformFactory.getPlatformInstance("C");
		platform.execute(code);
		System.out.println("-------------------------------------");
		code = new Code();
		code.setCode("C Code2...");
		platform = PlatformFactory.getPlatformInstance("C");
		platform.execute(code);
		System.out.println("-------------------------------------");
		code = new Code();
		code.setCode("JAVA Code...");
		platform = PlatformFactory.getPlatformInstance("JAVA");
		platform.execute(code);
		System.out.println("-------------------------------------");
		code = new Code();
		code.setCode("JAVA Code2...");
		platform = PlatformFactory.getPlatformInstance("JAVA");
		platform.execute(code);
		System.out.println("-------------------------------------");
		code = new Code();
		code.setCode("RUBY Code...");
		platform = PlatformFactory.getPlatformInstance("RUBY");
		platform.execute(code);
		System.out.println("-------------------------------------");
		code = new Code();
		code.setCode("RUBY Code2...");
		platform = PlatformFactory.getPlatformInstance("RUBY");
		platform.execute(code);
	}

}

/*
 * The Flyweight pattern’s effectiveness depends heavily on how and where it’s
 * used. Apply the Flyweight pattern when all of the following are true: 
 * 
 * An application uses a large number of objects. 
 * 
 * Storage costs are high because of the sheer quantity of objects. Most object state can be made extrinsic. 
 * 
 * Many groups of objects may be replaced by relatively few shared objects once extrinsic state is removed. 
 * 
 * The application doesn’t depend on object identity. Since flyweight objects may be shared, identity tests will return
 * true for conceptually distinct objects.
 */
