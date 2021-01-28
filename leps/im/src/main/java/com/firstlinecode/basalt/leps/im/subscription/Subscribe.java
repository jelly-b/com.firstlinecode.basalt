package com.firstlinecode.basalt.leps.im.subscription;

import com.firstlinecode.basalt.protocol.core.Protocol;
import com.firstlinecode.basalt.oxm.convention.annotations.ProtocolObject;
import com.firstlinecode.basalt.oxm.convention.annotations.TextOnly;

@ProtocolObject(namespace="urn:leps:subscription", localName="subscribe")
public class Subscribe {
	public static final Protocol PROTOCOL = new Protocol("urn:leps:subscription", "subscribe");
	
	@TextOnly
	private String message;
	
	public Subscribe() {}
	
	public Subscribe(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
}
