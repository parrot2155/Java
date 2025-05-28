package com.collection.part04_generics.controller;



public class GenericsTest3<D,T>{
	private D key;
	private T val;
	
	public D getKey() {
		return key;
	}
	public T getVal() {
		return val;
	}
	public void setKey(D key) {
		this.key = key;
	}
	public void setVal(T val) {
		this.val = val;
	}
}
