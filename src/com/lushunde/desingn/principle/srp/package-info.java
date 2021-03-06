
/**
 * @author bellus
 *
 * 电话通话的时候有4个过程发生：拨号、通话、回应、挂机4个功能，根据单一职责设计该项目。
 * 
 * # 单一职责原则-SRP（Single Responsibility Principle）
定义：一个接口、类、方法，只有一个引起它变化的原因。
优点：
- 类的复杂度降低，实现职责都有清晰明确的定义
- 可读性提高，复杂性降低自然可读性高
- 可维护性提高，降低变更引发的风险 

最佳实践：
- 单一职责确实有非常多的因素制约，纯理论上来讲，这个原则是非常优秀的，但是现实有现实的难处，你必须去考虑项目工期、成本、人员技术水平、硬件情况、网络情况甚至有时候还要考虑政府政策、垄断协议等因素妥协，**建议 接口一定要做到单一职责，类的设计尽量做到只有一个原因引起变化**。

 * 
 * 
 */
package com.lushunde.desingn.principle.srp;