package com.firstlinecode.basalt.oxm;

import com.firstlinecode.basalt.protocol.core.ProtocolChain;
import com.firstlinecode.basalt.oxm.parsing.IParserFactory;
import com.firstlinecode.basalt.oxm.parsing.IParsingFactory;
import com.firstlinecode.basalt.oxm.translating.ITranslatingFactory;
import com.firstlinecode.basalt.oxm.translating.ITranslatorFactory;

public interface IOxmFactory {
	Object parse(String message);
	Object parse(String message, boolean stream);
	String translate(Object object);
	
	void setParsingFactory(IParsingFactory parsingFactory);
	IParsingFactory getParsingFactory();
	
	void setTranslatingFactory(ITranslatingFactory translatingFactory);
	ITranslatingFactory getTranslatingFactory();
	
	void register(ProtocolChain chain, IParserFactory<?> parserFactory);
	void unregister(ProtocolChain chain);
	
	void register(Class<?> type, ITranslatorFactory<?> translatorFactory);
	void unregister(Class<?> type);
}
