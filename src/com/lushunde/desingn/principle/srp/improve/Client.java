package com.lushunde.desingn.principle.srp.improve;

/**
 * 电话通话的时候有4个过程发生：拨号、通话、挂机3个功能，根据单一职责设计该项目。
 * @author bellus
 * 
 * 实现了接口单一原则，但是类违背了该原则，这也是最佳实践
 */

public class Client {
	public static void main(String[] args) {
		IConnectionManager phone = new Phone();
		phone.dial("010-25452154");
		IDataTransfer data= (IDataTransfer)phone;
		data.chat("通话数据传输中");
		phone.hangup();
	}

}
