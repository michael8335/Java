package com.yf.linkedlist;

public class LinkList {
	// 对第一个链结点的引用
	Link first;

	/**
	 * 链表的构造方法
	 */
	public LinkList() {
		first = null;
	}

	/**
	 * 链表首部插入一个元素
	 * 
	 * @param iData
	 */
	public void insertFirst(int iData) {
		Link link = new Link(iData);
		link.next = first;
		first = link;
	}

	/**
	 * 删除链表首部元素
	 * 
	 * @return
	 */
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	/**
	 * 显示某个链表的所有元素
	 */
	public void display() {
		Link current = first;
		while (!(current == null)) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}

	/**
	 * 查找链表中某个特定的元素
	 * 
	 * @param key
	 * @return
	 */
	public Link find(int key) {
		Link current = first;
		while (current.iData != key) {
			if (current.next == null) {
				return null;
			}
			current = current.next;
		}
		return current;
	}

	/**
	 * 删除链表中某个特定的元素
	 * 
	 * @param key
	 * @return
	 */
	public Link delete(int key) {
		Link current = first;
		Link previous = first;
		while (current.iData != key) {
			if (current.next == null) {
				return null;
			} else {
				previous = current;
				current = current.next;
			}
		}
		if (current == first) {
			first = first.next;
		} else {
			previous.next = current.next;
		}
		return current;
	}

	/*
	 * 计算链表的长度
	 */
	public int size() {
		int length = 0;
		Link current=first;
		if(current==null)
			return 0;
		while(current.next!=null){
			++length;
			current=current.next;
		}
		/*
		 * 由于While里面判断的是下一个链接点，所以总个数需加上本身的那一个
		 */
		return length+1;
	}
}