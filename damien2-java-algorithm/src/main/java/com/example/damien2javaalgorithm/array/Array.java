package com.example.damien2javaalgorithm.array;

public class Array {

	private int[] data;
	private int size;
	
	public Array(int capacity) {
		data = new int[capacity];
		size = 0;
	}
	
	public Array() {
		this(10);
	}
	
	public int getSize() {
		
		return size;
	}

	/**
	 *
	 * 获取数组容量
	 */
	public int getCapacity() {
		
		return data.length;
	}

	/**
	 * 判断数组是否为空
	 */
	public boolean isEmpty() {
		
		return size == 0;
	}

	/**
	 * 往数组尾部中添加元素
	 * */
	public void addLast(int e) {
				
		add(size,e);
	}

	/**
	 *
	 * 往数组头部中添加元素
	 */
	public void addFirst(int e) {
		
		add(0,e);
	}

	/**
	 *
	 * 往数组中添加元素
	 */
	public void add(int index, int e) {
		
		if(size == data.length) {
			System.out.println(size);
		}
		if(index < 0 || index > size) {
			
		}
		
		for (int i = size-1; i >= index; i--) {
			data[i+1] = data[i];
		}
		
		data[index] = e;
		size++;
	}
	

	/**
	 * 获取数组指定位置的元素
	 * */
	public int get(int index) {
		return data[index];
	}

	/**
	 * 给数组指定位置赋值
	 * */
	public void set(int index,int e){
		data[index] = e;
	}
	
	
	public static void main(String[] args) {
		
		Array arr = new Array();
		for (int i = 0; i < 7; i++) {
			
			arr.addLast((int)(Math.random()*10000));
		}
		
		System.out.println(arr.toString());
	}


	@Override
	public String toString() {

		StringBuilder sbu = new StringBuilder();
		sbu.append("[");
		for (int i = 0; i < size; i++) {
			sbu.append(data[i]);
			if(i != size-1) {
				sbu.append(", ");
			}
		}
		sbu.append("]");
		return sbu.toString();

	}
	
}
