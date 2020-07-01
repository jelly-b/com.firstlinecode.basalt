package com.firstlinecode.basalt.oxm.xep.xdata;

import java.util.ArrayList;
import java.util.List;

import com.firstlinecode.basalt.oxm.convention.annotations.Array;
import com.firstlinecode.basalt.oxm.convention.annotations.BooleanOnly;
import com.firstlinecode.basalt.oxm.convention.annotations.TextOnly;
import com.firstlinecode.basalt.oxm.convention.conversion.annotations.String2Enum;

public class TField {
	public enum Type {
		BOOLEAN,
		FIXED,
		HIDDEN,
		JID_MULTI,
		JID_SINGLE,
		LIST_MULTI,
		LIST_SINGLE,
		TEXT_MULTI,
		TEXT_PRIVATE,
		TEXT_SINGLE
	}
	
	private String desc;
	@BooleanOnly
	private boolean required;
	@Array(value=String.class, elementName="value")
	@TextOnly
	private List<String> values;
	@String2Enum(TField.Type.class)
	private Type type;
	private String label;
	@Array(value=TOption.class, elementName="option")
	private List<TOption> options;
	private String var;
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public boolean isRequired() {
		return required;
	}
	
	public void setRequired(boolean required) {
		this.required = required;
	}
	
	public List<String> getValues() {
		if (values == null)
			values = new ArrayList<>();
		
		return values;
	}
	
	public void setValues(List<String> values) {
		this.values = values;
	}
	
	public Type getType() {
		return type;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public List<TOption> getOptions() {
		if (options == null) {
			options = new ArrayList<>();
		}
		
		return options;
	}
	
	public void setOptions(List<TOption> options) {
		this.options = options;
	}
	
	public String getVar() {
		return var;
	}
	
	public void setVar(String var) {
		this.var = var;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
}
