/*
Navicat MySQL Data Transfer

Source Server         : centOS
Source Server Version : 50173
Source Host           : 192.168.1.132:3306
Source Database       : t

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2017-01-18 14:26:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for device
-- ----------------------------
DROP TABLE IF EXISTS `device`;
CREATE TABLE `device` (
  `device_id` int(40) NOT NULL AUTO_INCREMENT COMMENT '设备ID',
  `device_name` varchar(48) NOT NULL COMMENT '设备名',
  PRIMARY KEY (`device_id`),
  UNIQUE KEY `Device` (`device_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of device
-- ----------------------------
INSERT INTO `device` VALUES ('1', '画板');
INSERT INTO `device` VALUES ('2', '笔记本电脑');
INSERT INTO `device` VALUES ('3', '翻页笔');
INSERT INTO `device` VALUES ('4', '智能电话');
INSERT INTO `device` VALUES ('5', '投影仪');
