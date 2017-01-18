/*
Navicat MySQL Data Transfer

Source Server         : centOS
Source Server Version : 50173
Source Host           : 192.168.1.132:3306
Source Database       : t

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2017-01-18 14:26:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for boardroomschedulerecord
-- ----------------------------
DROP TABLE IF EXISTS `boardroomschedulerecord`;
CREATE TABLE `boardroomschedulerecord` (
  `record_id` int(40) NOT NULL AUTO_INCREMENT COMMENT '表ID',
  `topicName` varchar(20) NOT NULL COMMENT '主题名称',
  `meeting_name` varchar(48) NOT NULL COMMENT '会议室名称',
  `account` varchar(48) NOT NULL COMMENT '预定人',
  `scheduleTime` datetime NOT NULL COMMENT '预定时间',
  `end_time` datetime NOT NULL COMMENT '结束时间',
  PRIMARY KEY (`record_id`),
  UNIQUE KEY `Record` (`record_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of boardroomschedulerecord
-- ----------------------------
