/*
Navicat MySQL Data Transfer

Source Server         : centOS
Source Server Version : 50173
Source Host           : 192.168.1.132:3306
Source Database       : t

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2017-01-18 14:27:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` varchar(25) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL COMMENT '用户密码',
  `user_email` varchar(48) NOT NULL COMMENT '用户邮箱',
  `user_phone` int(11) NOT NULL COMMENT '用户手机号',
  `authcode` varchar(48) NOT NULL COMMENT '授权码。注意员工和企业的区分',
  `department` varchar(255) DEFAULT NULL COMMENT '员工所在公司',
  `registMark` varchar(20) DEFAULT NULL COMMENT '公司注册号',
  `manager` tinyint(1) DEFAULT '0' COMMENT '是否为管理员',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `Name` (`user_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'xinjiaqing', '4523', '77452356@qq.com', '1381834563', 'ser23r42fvw', '关爱通', null, '0');
INSERT INTO `user` VALUES ('2', 'guanaitong ', '56516', '5465654@qq.com', '1385478856', 'ser23r42fvw', null, '10102012', '1');
