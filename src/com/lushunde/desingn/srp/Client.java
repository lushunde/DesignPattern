package com.lushunde.desingn.srp;

/**
 * 电话通话的时候有4个过程发生：拨号、通话、挂机3个功能，根据单一职责设计该项目。
 * @author bellus
 *
 */

public class Client {
	public static void main(String[] args) {
		IPhone phone = new Phone();
		phone.dial("010-25452154");
		phone.chat("通话数据传输中");
		phone.hangup();
	}

}
