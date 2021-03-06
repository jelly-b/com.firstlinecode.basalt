package com.firstlinecode.basalt.protocol.core.stream.error;

import com.firstlinecode.basalt.protocol.core.LangText;

public class ConnectionTimeout extends StreamError {
	public static final String DEFINED_CONDITION = "connection-timeout";
	
	public ConnectionTimeout() {
		this(null);
	}
	
	public ConnectionTimeout(String text) {
		super(DEFINED_CONDITION);
		if (text != null) {
			setText(new LangText(text));
		}
	}
}
