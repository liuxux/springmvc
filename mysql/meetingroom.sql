/*
Navicat MySQL Data Transfer

Source Server         : centOS
Source Server Version : 50173
Source Host           : 192.168.1.132:3306
Source Database       : t

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2017-01-18 14:26:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for meetingroom
-- ----------------------------
DROP TABLE IF EXISTS `meetingroom`;
CREATE TABLE `meetingroom` (
  `meetingroom_id` int(40) NOT NULL AUTO_INCREMENT COMMENT '会议室ID',
  `createTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `meetingroom_name` varchar(48) NOT NULL COMMENT '会议室名称',
  `assignmentTime` varchar(48) NOT NULL COMMENT '预定时间',
  `num_min` int(40) NOT NULL COMMENT '会议室最小人数',
  `num_max` int(40) NOT NULL COMMENT '会议室人最大人数',
  `remarks` varchar(48) DEFAULT NULL COMMENT '备注',
  `meeting_Type` tinyint(1) NOT NULL COMMENT '会议可见',
  PRIMARY KEY (`meetingroom_id`),
  UNIQUE KEY `MeetingRoom` (`meetingroom_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of meetingroom
-- ----------------------------
