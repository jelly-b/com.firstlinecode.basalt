package com.firstlinecode.basalt.protocol.core.stanza.error;

import com.firstlinecode.basalt.protocol.core.LangText;

public class RemoteServerTimeout extends StanzaError {
	public static final String DEFINED_CONDITION = "remote-server-timeout";
	
	public RemoteServerTimeout() {
		this(null);
	}
	
	public RemoteServerTimeout(String text) {
		this(text, null);
	}
	
	public RemoteServerTimeout(String text, String lang) {
		super(StanzaError.Type.WAIT, DEFINED_CONDITION, text == null ? null : new LangText(text, lang));
	}
}
