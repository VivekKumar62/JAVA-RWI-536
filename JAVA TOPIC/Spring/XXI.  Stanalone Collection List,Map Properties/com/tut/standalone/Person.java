package com.tut.standalone;

import java.util.List;
import java.util.Map;

public class Person {
    private List<String> family;
    private Map<String,Integer> pocketmoney;

    public Map<String, Integer> getPocketmoney() {
		return pocketmoney;
	}

	public void setPocketmoney(Map<String, Integer> pocketmoney) {
		this.pocketmoney = pocketmoney;
	}

	// Setter method for family
    public void setFamily(List<String> family) {
        this.family = family;
    }

    // Getter method for family (optional)
    public List<String> getFamily() {
        return family;
    }

	@Override
	public String toString() {
		return "Person [family=" + family + ", pocketmoney=" + pocketmoney + ", getPocketmoney()=" + getPocketmoney()
				+ ", getFamily()=" + getFamily() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

  
}
