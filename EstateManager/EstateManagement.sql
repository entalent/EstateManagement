/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50015
Source Host           : localhost:3306
Source Database       : estatemanagement

Target Server Type    : MYSQL
Target Server Version : 50015
File Encoding         : 65001

Date: 2016-07-03 11:18:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cleaner
-- ----------------------------
DROP TABLE IF EXISTS `cleaner`;
CREATE TABLE `cleaner` (
  `UserID` int(11) NOT NULL COMMENT '清洁工ID',
  `CleanerID` int(11) NOT NULL COMMENT '清洁工工号',
  `ClassId` int(11) NOT NULL COMMENT '清洁工所属班ID',
  `HireTime` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '清洁工雇佣时间',
  PRIMARY KEY  (`CleanerID`,`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cleanerclass
-- ----------------------------
DROP TABLE IF EXISTS `cleanerclass`;
CREATE TABLE `cleanerclass` (
  `ClassId` int(11) NOT NULL auto_increment COMMENT '清洁工班级ID',
  `ClassName` varchar(255) NOT NULL COMMENT '清洁工班级名称',
  PRIMARY KEY  (`ClassId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cleanlog
-- ----------------------------
DROP TABLE IF EXISTS `cleanlog`;
CREATE TABLE `cleanlog` (
  `LogId` int(11) NOT NULL auto_increment COMMENT '日志ID',
  `MangerStatus` longtext NOT NULL COMMENT '情况记录',
  `CreateTime` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '创建日期',
  PRIMARY KEY  (`LogId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cleanwork
-- ----------------------------
DROP TABLE IF EXISTS `cleanwork`;
CREATE TABLE `cleanwork` (
  `WorkId` int(11) NOT NULL auto_increment COMMENT '工作检查表ID',
  `UserId` int(11) NOT NULL COMMENT '清洁工用户ID',
  `DayTable` varchar(255) default NULL COMMENT '日检表目录地址',
  `WeekTable` varchar(255) default NULL COMMENT '周检表地址',
  `MonthTable` varchar(255) default NULL COMMENT '月检表地址',
  `YearTable` varchar(255) default NULL COMMENT '年检表地址',
  `CreateTime` timestamp NULL default NULL COMMENT '创建时间',
  PRIMARY KEY  (`WorkId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for complain
-- ----------------------------
DROP TABLE IF EXISTS `complain`;
CREATE TABLE `complain` (
  `ComplainId` int(11) NOT NULL auto_increment COMMENT '投诉ID',
  `ComplainTime` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '投诉时间',
  `UserId` int(11) NOT NULL COMMENT '投诉人用户ID',
  `HandlerID` int(11) default NULL COMMENT '投诉处理人用户ID',
  `HandlerTime` timestamp NULL default NULL COMMENT '投诉处理时间',
  `ComplainText` longtext NOT NULL COMMENT '投诉内容',
  `Remark` varchar(255) default NULL COMMENT '备注',
  PRIMARY KEY  (`ComplainId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `DepartmentId` int(11) NOT NULL COMMENT '部门ID',
  `DepartmentName` varchar(255) NOT NULL COMMENT '部门名称',
  `DepartmentAddress` varchar(255) default NULL COMMENT '部门地址',
  `DepartmentDescription` longtext COMMENT '部门描述',
  PRIMARY KEY  (`DepartmentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for executive
-- ----------------------------
DROP TABLE IF EXISTS `executive`;
CREATE TABLE `executive` (
  `UserId` int(11) NOT NULL COMMENT '用户ID',
  `ExecutiveId` int(11) NOT NULL COMMENT '工号',
  `DepartmentId` int(11) NOT NULL COMMENT '部门ID',
  `ExecutiveAddress` varchar(255) default '' COMMENT '员工地址',
  `ExecutiveHireTime` timestamp NULL default NULL COMMENT '雇佣时间',
  PRIMARY KEY  (`UserId`,`ExecutiveId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for fee
-- ----------------------------
DROP TABLE IF EXISTS `fee`;
CREATE TABLE `fee` (
  `FeeId` int(11) NOT NULL auto_increment COMMENT '缴费ID',
  `UserId` int(11) NOT NULL COMMENT '住户ID',
  `CreateTime` timestamp NULL default CURRENT_TIMESTAMP COMMENT '条目创建时间',
  `WaterFee` decimal(10,4) NOT NULL COMMENT '水费',
  `ElecFee` decimal(10,4) NOT NULL COMMENT '电费',
  `GasFee` decimal(10,4) NOT NULL COMMENT '煤气',
  `ParkingFee` decimal(10,4) NOT NULL COMMENT '停车费',
  `PropertyFee` decimal(10,4) NOT NULL COMMENT '物业管理费',
  `OtherFee` decimal(10,4) NOT NULL COMMENT '其他费用',
  `Paid` decimal(10,4) NOT NULL COMMENT '已付费用',
  `PayTime` timestamp NULL default NULL COMMENT '付款时间',
  `HandlerId` int(11) default NULL COMMENT '收钱人的ID',
  `Remark` longtext COMMENT '备注',
  PRIMARY KEY  (`FeeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for file
-- ----------------------------
DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `FileId` int(11) NOT NULL auto_increment COMMENT '文件ID',
  `UserId` int(11) NOT NULL COMMENT '上传文件的用户ID',
  `FileName` varchar(255) NOT NULL COMMENT '文件名称',
  `FileAddress` varchar(255) NOT NULL COMMENT '文件储存路径',
  `FileExt` varchar(255) NOT NULL COMMENT '文件后缀',
  `FileSize` int(11) NOT NULL COMMENT '文件大小',
  `FileSha1` varchar(255) NOT NULL COMMENT '文件哈希值',
  `FileCreateTime` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '文件创建时间',
  PRIMARY KEY  (`FileId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for house
-- ----------------------------
DROP TABLE IF EXISTS `house`;
CREATE TABLE `house` (
  `HouseId` int(11) NOT NULL auto_increment,
  `HouseLayout` longtext NOT NULL COMMENT '指向房屋布局的图片url',
  `HouseInfo` longtext NOT NULL COMMENT '房屋资料',
  `HouseCheck` longtext NOT NULL COMMENT '房屋验收信息',
  `HouseSize` float unsigned NOT NULL COMMENT '房屋面积',
  `HouseUseSize` float unsigned NOT NULL,
  `HouseName` varchar(255) NOT NULL COMMENT '房间门牌名称（704等）',
  PRIMARY KEY  (`HouseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for houseexchange
-- ----------------------------
DROP TABLE IF EXISTS `houseexchange`;
CREATE TABLE `houseexchange` (
  `UserPre` int(11) NOT NULL COMMENT '卖出用户',
  `UserNew` int(11) default NULL COMMENT '买入用户',
  `HouseId` int(11) NOT NULL COMMENT '房屋id',
  `SaleTime` timestamp NULL default CURRENT_TIMESTAMP COMMENT '卖出时间',
  `BuyTime` timestamp NULL default NULL COMMENT '买入时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for houseproperty
-- ----------------------------
DROP TABLE IF EXISTS `houseproperty`;
CREATE TABLE `houseproperty` (
  `HouseId` int(11) NOT NULL COMMENT '房间id',
  `UserId` int(11) default NULL COMMENT '用户id',
  `UserInnTime` timestamp NULL default NULL COMMENT '用户迁入时间',
  `UserOutTime` timestamp NULL default NULL COMMENT '用户迁出时间',
  `UserEmergencyTel` int(11) default NULL COMMENT '用户紧急电话',
  PRIMARY KEY  (`HouseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for keys
-- ----------------------------
DROP TABLE IF EXISTS `keys`;
CREATE TABLE `keys` (
  `KeyId` int(11) NOT NULL auto_increment COMMENT '钥匙编号',
  `KeyDescription` varchar(255) NOT NULL COMMENT '钥匙描述（哪个门的）',
  `HolderId` int(11) default NULL COMMENT '拿钥匙的人（对应UserId）',
  `HoldStartTime` timestamp NULL default NULL COMMENT '持有人开始持有时间',
  `HoldEndTime` timestamp NULL default NULL COMMENT '持有人结束持有时间',
  `IsLoss` int(11) NOT NULL COMMENT '是否丢失',
  PRIMARY KEY  (`KeyId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for parking
-- ----------------------------
DROP TABLE IF EXISTS `parking`;
CREATE TABLE `parking` (
  `ParkingId` int(11) NOT NULL auto_increment COMMENT '停车位ID',
  `ParkingLocation` varchar(255) NOT NULL COMMENT '停车位位置',
  `UserId` int(11) NOT NULL COMMENT '停车位所有者用户ID',
  `StartTime` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '停车位租赁起始时间',
  `EndTime` timestamp NOT NULL default '0000-00-00 00:00:00' COMMENT '停车位租赁截止时间',
  `ParkingStatus` enum('broken','empty','using') NOT NULL COMMENT '停车位状态',
  `ParkingFee` decimal(10,4) NOT NULL COMMENT '该停车位价格',
  PRIMARY KEY  (`ParkingId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for security
-- ----------------------------
DROP TABLE IF EXISTS `security`;
CREATE TABLE `security` (
  `SecurityId` int(11) NOT NULL auto_increment COMMENT '保安工号',
  `UserId` int(11) NOT NULL COMMENT '保安用户ID',
  `ClassId` int(11) NOT NULL COMMENT '保安所属班级',
  `HireTime` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '保安雇佣时间',
  PRIMARY KEY  (`SecurityId`,`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for securityclass
-- ----------------------------
DROP TABLE IF EXISTS `securityclass`;
CREATE TABLE `securityclass` (
  `ClassId` int(11) NOT NULL auto_increment COMMENT '保安班级ID',
  `ClassName` varchar(255) NOT NULL COMMENT '保安班级名称',
  PRIMARY KEY  (`ClassId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for securitylog
-- ----------------------------
DROP TABLE IF EXISTS `securitylog`;
CREATE TABLE `securitylog` (
  `UserId` int(11) NOT NULL COMMENT '保安用户ID',
  `SecurityStatus` longtext NOT NULL COMMENT '日常管理记录',
  `CreateTime` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY  (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for securitywork
-- ----------------------------
DROP TABLE IF EXISTS `securitywork`;
CREATE TABLE `securitywork` (
  `WorkId` int(11) NOT NULL auto_increment COMMENT '工作检查表ID',
  `UserId` int(11) NOT NULL COMMENT '保安用户ID',
  `DayTable` varchar(255) default NULL COMMENT '日检表路径',
  `WeekTable` varchar(255) default NULL COMMENT '周检表路径',
  `MonthTable` varchar(255) default NULL COMMENT '月检表路径',
  `YearTable` varchar(255) default NULL COMMENT '年检表路径',
  `CreateTime` timestamp NULL default NULL COMMENT '创建日期',
  PRIMARY KEY  (`WorkId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `UserId` int(11) NOT NULL auto_increment COMMENT '用户id',
  `UserLogin` varchar(255) NOT NULL default '' COMMENT '用户登录名',
  `UserPass` varchar(255) NOT NULL default '' COMMENT '用户密码',
  `UserNickname` varchar(255) default '' COMMENT '用户昵称',
  `UserTel` varchar(255) default '',
  `UserEmail` varchar(255) default '' COMMENT '用户邮箱',
  `UserImg` longtext COMMENT '用户头像url',
  `UserAuth` int(11) NOT NULL default '0' COMMENT '用户权限登记',
  `UserRegTime` timestamp NULL default '0000-00-00 00:00:00' COMMENT '用户注册时间',
  `UserSex` enum('famale','male') default NULL COMMENT '用户性别',
  `UserName` varchar(255) default '' COMMENT '用户姓名',
  `UserType` enum('Cleaner','Security','Executive','HouseHold') NOT NULL default 'HouseHold' COMMENT '用户类型',
  PRIMARY KEY  (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
