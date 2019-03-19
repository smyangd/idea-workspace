package com.example.damien2javaalgorithm.array;

import java.util.UUID;

public class Array<E> {

	private E[] data;
	private int size;
	
	public Array(int capacity) {
		data = (E[]) new Object[capacity];
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
	public void addLast(E e) {
				
		add(size,e);
	}

	/**
	 *
	 * 往数组头部中添加元素
	 */
	public void addFirst(E e) {
		
		add(0,e);
	}

	/**
	 *
	 * 往数组中添加元素
	 */
	public void add(int index, E e) {
		
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
	public E get(int index) {
		return data[index];
	}

	/**
	 * 给数组指定位置赋值
	 * */
	public void set(int index,E e){
		data[index] = e;
	}

	/**
	 *
	 * */
	public boolean contains(E e){
		for (int i = 0; i < size; i++) {
			if(data[i] == e){
				return true;
			}
		}
		return false;
	}

	/**
	 *
	 *
	 * */
	public int find(E e){
		for (int i = 0; i < size; i++) {
			if(data[i] == e){
				return i;
			}
		}
		return -1;
	}

	/**
	 *
	 * */
	public E delete(int index){

		E delete = null;
		for (int i = index; i < size; i++) {
			delete = data[i];
			data[i] = data[i+1];
//			if(i == size-1){
//				data[i] = 0;
//			}
		}
		size--;
		return delete;

	}

	/**
	 *
	 *
	 * */
	public E deleteFirst(){
		return delete(0);
	}

	/**
	 *
	 *
	 * */
	public E deleteLast(){
		return delete(size-1);
	}

	/**
	 *
	 *
	 * */
	public void deleteElement(E e){
		int i = find(e);
		if(i != -1){
			delete(i);
		}
	}

	public static void main(String[] args) {
		
		Array arr = new Array();
		for (int i = 0; i < 7; i++) {
			
			//arr.addLast((int)(Math.random()*10));
			arr.addLast(UUID.randomUUID().toString());
		}
		System.out.println(arr.toString());
		arr.delete(1);
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
