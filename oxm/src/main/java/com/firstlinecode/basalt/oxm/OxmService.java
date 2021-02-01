package com.firstlinecode.basalt.oxm;

import com.firstlinecode.basalt.oxm.parsing.IParsingFactory;
import com.firstlinecode.basalt.oxm.translating.ITranslatingFactory;
import com.firstlinecode.basalt.oxm.xml.XmlParsingFactory;
import com.firstlinecode.basalt.oxm.xml.XmlProtocolWriterFactory;

public class OxmService {
	public static IOxmFactory createStreamOxmFactory() {
		return new StreamOxmFactory(createParsingFactory(), createTranslatingFactory());
	}
	
	public static IOxmFactory createMinimumOxmFactory() {
		return new MinimumOxmFactory(createParsingFactory(), createTranslatingFactory());
	}
	
	public static IOxmFactory createStandardOxmFactory() {
		return new StandardOxmFactory(createParsingFactory(), createTranslatingFactory());
	}
	
	public static ITranslatingFactory createTranslatingFactory () {
		return new TranslatingFactory(createProtocolWriterFactory());
	}
	
	public static IProtocolWriterFactory createProtocolWriterFactory() {
		return new XmlProtocolWriterFactory();
	}
	
	@SuppressWarnings("deprecation")
	public static IParsingFactory createParsingFactory() {
		if (isAndroid()) {
			try {
				Class<?> androidXmlParsingClass = Class.forName("com.firstlinecode.basalt.oxm.android.XmlParsingFactory");
				
				return (IParsingFactory)androidXmlParsingClass.newInstance();
			} catch (Exception e) {
				throw new RuntimeException("Can't initialize XML parsing factory for android. Please add com.firstlinecode.basalt.oxm.android library to your classpath.");
			}
		}
		
		return new XmlParsingFactory();
	}

	private static boolean isAndroid() {
		return (System.getProperty("basalt.runtime.name") != null
				&& System.getProperty("basalt.runtime.name").toLowerCase().equals("android"))
				|| System.getProperty("java.runtime.name").startsWith("Android");
	}
}
