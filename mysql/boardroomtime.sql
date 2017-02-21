/*
Navicat MySQL Data Transfer

Source Server         : centOS
Source Server Version : 50173
Source Host           : 192.168.1.132:3306
Source Database       : t

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2017-01-18 14:26:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for boardroomtime
-- ----------------------------
DROP TABLE IF EXISTS `boardroomtime`;
CREATE TABLE `boardroomtime` (
  `table_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '表ID',
  `meetingroom_id` int(20) NOT NULL COMMENT '会议室ID',
  `time_id` int(20) NOT NULL COMMENT '会议室预订ID',
  PRIMARY KEY (`table_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of boardroomtime
-- ----------------------------
