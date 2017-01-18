/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : user

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-01-17 09:34:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_boardroomschedulerecord
-- ----------------------------
DROP TABLE IF EXISTS `t_boardroomschedulerecord`;
CREATE TABLE `t_boardroomschedulerecord` (
  `record_id` int(40) NOT NULL COMMENT '表ID',
  `TopicName` varchar(20) NOT NULL COMMENT '主题名称',
  `meeting_name` varchar(48) NOT NULL COMMENT '会议室名称',
  `account` varchar(48) NOT NULL COMMENT '预定人',
  `scheduleTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '预定时间',
  `end_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '结束时间',
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_boardroomschedulerecord
-- ----------------------------
