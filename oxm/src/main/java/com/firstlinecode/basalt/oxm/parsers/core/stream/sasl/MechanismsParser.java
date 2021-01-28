package com.firstlinecode.basalt.oxm.parsers.core.stream.sasl;

import com.firstlinecode.basalt.protocol.core.stream.sasl.Mechanisms;
import com.firstlinecode.basalt.oxm.Value;
import com.firstlinecode.basalt.oxm.annotations.Parser;
import com.firstlinecode.basalt.oxm.annotations.ProcessText;
import com.firstlinecode.basalt.oxm.parsing.IParsingContext;

@Parser(namespace="urn:ietf:params:xml:ns:xmpp-sasl", localName="mechanisms", objectType=Mechanisms.class)
public class MechanismsParser {
	@ProcessText("/mechanism")
	public void processText(IParsingContext<Mechanisms> context, Value<?> text) {
		if (text != null) {
			context.getObject().getMechanisms().add(text.toString());
		}
	}
}
