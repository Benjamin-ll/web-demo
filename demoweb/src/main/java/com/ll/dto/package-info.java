/**
 * 数据传输层
 * 刚学框架的人可能不明白这个有什么用，其实就是用于service层与web层之间传输，
 * 为什么不直接用entity（pojo）？其实在实际开发中发现，很多时间一个entity并不能满足我们的业务需求，可能呈现给用户的信息十分之多，这时候就有了dto，也相当于vo，记住一定不要把这个混杂在entity里面，答应我好吗？
 */
/**
 * @author liliang
 *
 */
package com.ll.dto;