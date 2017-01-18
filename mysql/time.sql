/*
Navicat MySQL Data Transfer

Source Server         : centOS
Source Server Version : 50173
Source Host           : 192.168.1.132:3306
Source Database       : t

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2017-01-18 14:27:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for time
-- ----------------------------
DROP TABLE IF EXISTS `time`;
CREATE TABLE `time` (
  `time_id` int(40) NOT NULL AUTO_INCREMENT COMMENT '表ID',
  `meetingroom_id` int(40) NOT NULL COMMENT '会议室ID',
  `topicName` varchar(20) NOT NULL COMMENT '主题名称',
  `meetingroom_name` varchar(48) NOT NULL COMMENT '会议室名称',
  `time1` tinyint(1) DEFAULT '0',
  `time2` tinyint(1) DEFAULT '0',
  `time3` tinyint(1) DEFAULT '0',
  `time4` tinyint(1) DEFAULT '0',
  `time5` tinyint(1) DEFAULT '0',
  `time6` tinyint(1) DEFAULT '0',
  `time7` tinyint(1) DEFAULT '0',
  `time8` tinyint(1) DEFAULT '0',
  `time9` tinyint(1) DEFAULT '0',
  `time10` tinyint(1) DEFAULT '0',
  `time11` tinyint(1) DEFAULT '0',
  `time12` tinyint(1) DEFAULT '0',
  `time13` tinyint(1) DEFAULT '0',
  `time14` tinyint(1) DEFAULT '0',
  `time15` tinyint(1) DEFAULT '0',
  `time16` tinyint(1) DEFAULT '0',
  `time17` tinyint(1) DEFAULT '0',
  `time18` tinyint(1) DEFAULT '0',
  `time19` tinyint(1) DEFAULT '0',
  `time20` tinyint(1) DEFAULT '0',
  `time21` tinyint(1) DEFAULT '0',
  `time22` tinyint(1) DEFAULT '0',
  `time23` tinyint(1) DEFAULT '0',
  `time24` tinyint(1) DEFAULT '0',
  `time25` tinyint(1) DEFAULT '0',
  `time26` tinyint(1) DEFAULT '0',
  `time27` tinyint(1) DEFAULT '0',
  `time28` tinyint(1) DEFAULT '0',
  `time29` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`time_id`),
  UNIQUE KEY `Time` (`time_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of time
-- ----------------------------
