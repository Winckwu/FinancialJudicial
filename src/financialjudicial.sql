/*
Navicat MySQL Data Transfer

Source Server         : 123
Source Server Version : 50633
Source Host           : localhost:3306
Source Database       : financialjudicial

Target Server Type    : MYSQL
Target Server Version : 50633
File Encoding         : 65001

Date: 2016-12-15 17:04:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `admin_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `admin_pwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1 COMMENT='管理员表';

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '555557', '123123');
INSERT INTO `admin` VALUES ('2', 'jason', '123456');
INSERT INTO `admin` VALUES ('3', 'evenmei', '666666');
INSERT INTO `admin` VALUES ('4', 'liuhuan', 'liuhuan');
INSERT INTO `admin` VALUES ('5', 'admin', 'admin');

-- ----------------------------
-- Table structure for assign
-- ----------------------------
DROP TABLE IF EXISTS `assign`;
CREATE TABLE `assign` (
  `assign_id` int(11) NOT NULL AUTO_INCREMENT,
  `lawyer_id` int(11) DEFAULT NULL,
  `case_id` int(11) DEFAULT NULL,
  `depute_time` datetime DEFAULT NULL COMMENT '委托给律师的时间',
  `is_accept` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`assign_id`),
  KEY `case_id` (`case_id`),
  KEY `lawyer_id` (`lawyer_id`),
  CONSTRAINT `assign_ibfk_1` FOREIGN KEY (`lawyer_id`) REFERENCES `lawyer` (`lawyer_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `assign_ibfk_2` FOREIGN KEY (`case_id`) REFERENCES `cases` (`case_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of assign
-- ----------------------------
INSERT INTO `assign` VALUES ('6', '1', '7', '2016-12-13 19:51:32', '0');
INSERT INTO `assign` VALUES ('7', '2', '7', '2016-12-15 19:51:32', '0');
INSERT INTO `assign` VALUES ('8', '3', '7', '2016-12-17 19:51:32', '0');
INSERT INTO `assign` VALUES ('9', '1', '1', '2016-12-13 19:52:35', '0');
INSERT INTO `assign` VALUES ('10', '2', '1', '2016-12-15 19:52:35', '0');

-- ----------------------------
-- Table structure for cases
-- ----------------------------
DROP TABLE IF EXISTS `cases`;
CREATE TABLE `cases` (
  `case_id` int(11) NOT NULL AUTO_INCREMENT,
  `lawyer_id` int(11) DEFAULT NULL COMMENT '对应最后接单的律师',
  `depute_time` datetime DEFAULT NULL COMMENT '案件的委托时间',
  `case_result` varchar(255) CHARACTER SET utf8 DEFAULT '暂无' COMMENT '案件的最终结果（诉讼成功/失败/撤诉）',
  `service_type` varchar(255) CHARACTER SET utf8 DEFAULT '暂无' COMMENT '服务类型-诉讼和律师函',
  `contract_num` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '合同号',
  `debt_plat` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '债务产生平台',
  `product_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '产品名称',
  `inver_proj` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '投资项目名称',
  `inver_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '投资人姓名',
  `inver_Idcard` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '投资人身份证',
  `inver_add` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '投资人居住地',
  `debt_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '债务人',
  `debt_Idcard` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '债务人身份证',
  `debt_add` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '债务人居住地',
  `loan_term` int(255) DEFAULT NULL COMMENT '贷款期限',
  `loan_date` date DEFAULT NULL COMMENT '放款日期',
  `repay_data` date DEFAULT NULL COMMENT '还款日',
  `overdue_date` date DEFAULT NULL COMMENT '逾期日期',
  `overdue_days` int(11) DEFAULT NULL COMMENT '逾期天数',
  `contract_money` float DEFAULT NULL COMMENT '合同金额',
  `paid_principal` float DEFAULT NULL COMMENT '已还本金',
  `paid_interest` float DEFAULT NULL COMMENT '已还利息',
  `agreed_interest` float DEFAULT NULL COMMENT '约定利息',
  `overdue_rate` float DEFAULT NULL COMMENT '逾期利率',
  `overdue_penalty` float DEFAULT NULL COMMENT '逾期违约金',
  `plat_fee` float DEFAULT NULL COMMENT '平台服务费',
  `overdue_principal` float DEFAULT NULL COMMENT '逾期本金',
  `overdue_interest` float DEFAULT NULL COMMENT '逾期利息',
  `fee_total` float DEFAULT NULL COMMENT '合计',
  `score` int(1) DEFAULT '0' COMMENT '案件评价',
  `case_file` varchar(255) DEFAULT NULL COMMENT '案件文档',
  `fiUser_id` int(11) DEFAULT NULL,
  `operator` varchar(255) CHARACTER SET utf8 DEFAULT '暂无' COMMENT '审核通过的操作人',
  `remark` text CHARACTER SET utf8 COMMENT '案件备注',
  PRIMARY KEY (`case_id`),
  KEY `fiUser_id` (`fiUser_id`),
  CONSTRAINT `cases_ibfk_1` FOREIGN KEY (`fiUser_id`) REFERENCES `financialuser` (`fiUser_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of cases
-- ----------------------------
INSERT INTO `cases` VALUES ('1', '1', '2016-12-07 10:35:30', '暂无', '诉讼', 'T02030231323', '360融资平台', '360宝', '长沙房屋建设一期工程', '李四,张三', '4305241988232923,424340340342323x', '湖南长沙,湖南常德', '王五,李四', '243423232345453,25345605332323', '湖南长沙,湖南常德', '365', '2016-12-06', '2016-12-06', '2016-12-14', '10', '25000', '1000', '250', '0.04', '0.05', '5400', '1200', '2000', '100', '10000', '0', null, '1', 'admin', '无');
INSERT INTO `cases` VALUES ('2', '2', '2016-12-05 10:35:35', '暂无', '律师函', 'T02030231323', '360融资平台', '360宝', '长沙房屋建设一期工程', '李四,张三', '4305241988232923,424340340342323x', '湖南长沙,湖南常德', '王五,李四', '243423232345453,25345605332323', '湖南长沙,湖南常德', '365', '2016-12-13', '2016-12-06', '2016-12-14', '10', '25000', '1000', '250', '0.04', '0.05', '5400', '1200', '2000', '100', '10000', '0', null, '2', 'admin', null);
INSERT INTO `cases` VALUES ('3', '2', '2016-12-05 10:35:39', '暂无', '律师函', 'T02030231323', '360融资平台', '360宝', '长沙房屋建设一期工程', '李四,张三', '4305241988232923,424340340342323x', '湖南长沙,湖南常德', '王五,李四', '243423232345453,25345605332323', '湖南长沙,湖南常德', '365', '2016-12-13', '2016-12-06', '2016-12-14', '10', '25000', '1000', '250', '0.04', '0.05', '5400', '1200', '2000', '100', '10000', '0', null, '3', 'admin', null);
INSERT INTO `cases` VALUES ('4', '2', '2016-12-05 10:35:43', '暂无', '诉讼', 'T02030231323', '360融资平台', '360宝', '长沙房屋建设一期工程', '李四,张三', '4305241988232923,424340340342323x', '湖南长沙,湖南常德', '王五,李四', '243423232345453,25345605332323', '湖南长沙,湖南常德', '365', '2016-12-20', '2016-12-06', '2016-12-14', '10', '25000', '1000', '250', '0.04', '0.05', '5400', '1200', '2000', '100', '10000', '0', null, '4', '暂无', null);
INSERT INTO `cases` VALUES ('5', '3', '2016-12-06 10:37:03', '暂无', '诉讼', 'T02030231323', '360融资平台', '360宝', '长沙房屋建设一期工程', '李四,张三', '4305241988232923,424340340342323x', '湖南长沙,湖南常德', '王五,李四', '243423232345453,25345605332323', '湖南长沙,湖南常德', '365', '2016-12-07', '2016-12-06', '2016-12-14', '10', '25000', '1000', '250', '0.04', '0.05', '5400', '1200', '2000', '100', '10000', '0', null, '3', '暂无', null);
INSERT INTO `cases` VALUES ('6', '3', '2016-12-05 10:37:07', '暂无', '诉讼', 'T02030231323', '360融资平台', '360宝', '长沙房屋建设一期工程', '李四,张三', '4305241988232923,424340340342323x', '湖南长沙,湖南常德', '王五,李四', '243423232345453,25345605332323', '湖南长沙,湖南常德', '365', '2016-12-06', '2016-12-06', '2016-12-14', '10', '25000', '1000', '250', '0.04', '0.05', '5400', '1200', '2000', '100', '10000', '0', null, '3', '暂无', null);
INSERT INTO `cases` VALUES ('7', '3', '2016-12-06 10:37:11', '暂无', '诉讼', 'T02030231323', '360融资平台', '360宝', '长沙房屋建设一期工程', '李四,张三', '4305241988232923,424340340342323x', '湖南长沙,湖南常德', '王五,李四', '243423232345453,25345605332323', '湖南长沙,湖南常德', '365', '2016-12-06', '2016-12-06', '2016-12-14', '10', '25000', '1000', '250', '0.04', '0.05', '5400', '1200', '2000', '100', '10000', '0', null, '3', '暂无', null);
INSERT INTO `cases` VALUES ('8', '3', '2016-12-06 10:37:14', '暂无', '诉讼', 'T02030231323', '360融资平台', '360宝', '长沙房屋建设一期工程', '李四,张三', '4305241988232923,424340340342323x', '湖南长沙,湖南常德', '王五,李四', '243423232345453,25345605332323', '湖南长沙,湖南常德', '365', '2016-12-07', '2016-12-06', '2016-12-14', '10', '25000', '1000', '250', '0.04', '0.05', '5400', '1200', '2000', '100', '10000', '0', null, '3', '暂无', null);
INSERT INTO `cases` VALUES ('9', '4', '2016-12-12 10:37:18', '暂无', '诉讼', 'T02030231323', '360融资平台', '360宝', '长沙房屋建设一期工程', '李四,张三', '4305241988232923,424340340342323x', '湖南长沙,湖南常德', '王五,李四', '243423232345453,25345605332323', '湖南长沙,湖南常德', '365', '2016-12-06', '2016-12-06', '2016-12-14', '10', '25000', '1000', '250', '0.04', '0.05', '5400', '1200', '2000', '100', '10000', '0', null, '3', '暂无', null);
INSERT INTO `cases` VALUES ('10', '4', '2016-12-15 10:37:22', '暂无', '诉讼', 'T02030231323', '360融资平台', '360宝', '长沙房屋建设一期工程', '李四,张三', '4305241988232923,424340340342323x', '湖南长沙,湖南常德', '王五,李四', '243423232345453,25345605332323', '湖南长沙,湖南常德', '365', '2016-12-07', '2016-12-06', '2016-12-14', '10', '25000', '1000', '250', '0.04', '0.05', '5400', '1200', '2000', '100', '10000', '0', null, '4', '暂无', null);
INSERT INTO `cases` VALUES ('11', '4', '2016-12-10 10:37:26', '暂无', '诉讼', 'T02030231323', '360融资平台', '360宝', '长沙房屋建设一期工程', '李四,张三', '4305241988232923,424340340342323x', '湖南长沙,湖南常德', '王五,李四', '243423232345453,25345605332323', '湖南长沙,湖南常德', '365', '2016-12-07', '2016-12-06', '2016-12-14', '10', '25000', '1000', '250', '0.04', '0.05', '5400', '1200', '2000', '100', '10000', '0', null, '1', '暂无', null);
INSERT INTO `cases` VALUES ('12', '4', '2016-12-07 10:37:29', '暂无', '诉讼', 'T02030231323', '360融资平台', '360宝', '长沙房屋建设一期工程', '李四,张三', '4305241988232923,424340340342323x', '湖南长沙,湖南常德', '王五,李四', '243423232345453,25345605332323', '湖南长沙,湖南常德', '365', '2016-12-06', '2016-12-06', '2016-12-14', '10', '25000', '1000', '250', '0.04', '0.05', '5400', '1200', '2000', '100', '10000', '0', null, '1', '暂无', null);
INSERT INTO `cases` VALUES ('13', '4', '2016-12-06 10:37:33', '暂无', '诉讼', 'T02030231323', '360融资平台', '360宝', '长沙房屋建设一期工程', '李四,张三', '4305241988232923,424340340342323x', '湖南长沙,湖南常德', '王五,李四', '243423232345453,25345605332323', '湖南长沙,湖南常德', '365', '2016-12-07', '2016-12-06', '2016-12-14', '10', '25000', '1000', '250', '0.04', '0.05', '5400', '1200', '2000', '100', '10000', '0', null, '1', '暂无', null);
INSERT INTO `cases` VALUES ('14', '4', '2016-12-05 10:37:37', '暂无', '诉讼', 'T02030231323', '360融资平台', '360宝', '长沙房屋建设一期工程', '李四,张三', '4305241988232923,424340340342323x', '湖南长沙,湖南常德', '王五,李四', '243423232345453,25345605332323', '湖南长沙,湖南常德', '365', '2016-11-29', '2016-12-06', '2016-12-14', '10', '25000', '1000', '250', '0.04', '0.05', '5400', '1200', '2000', '100', '10000', '0', null, '1', '暂无', null);
INSERT INTO `cases` VALUES ('15', '4', '2016-12-15 11:33:21', '暂无', '暂无', 'T123', '360', '360', '长沙', 'liuhuan', '4305241988232923,424340340342323x', '湖南长沙,湖南常德', '王五,李四', '243423232345453,25345605332323', '湖南长沙,湖南常德', '365', '2015-02-03', '2016-02-03', '2016-03-01', '10', '25000', '1000', '250', '0.04', null, '5400', '1200', null, '0.05', null, '0', null, '1', '暂无', null);

-- ----------------------------
-- Table structure for financialuser
-- ----------------------------
DROP TABLE IF EXISTS `financialuser`;
CREATE TABLE `financialuser` (
  `fiUser_id` int(11) NOT NULL AUTO_INCREMENT,
  `fiUser_email` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `fiUser_pwd` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `fiUser_image` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `corp_name` varchar(255) CHARACTER SET utf8 DEFAULT '暂无',
  `legalPerson_name` varchar(255) CHARACTER SET utf8 DEFAULT '暂无',
  `legalPerson_IDcard` varchar(255) CHARACTER SET utf8 DEFAULT '暂无',
  `IDcard_image` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `busiLicen_image` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `check_result` int(1) DEFAULT '2' COMMENT '0是审核不通过，1是审核通过，2是待审核',
  `register_time` datetime DEFAULT NULL COMMENT '注册时间',
  `submitInfo_time` datetime DEFAULT NULL COMMENT '信息提交时间',
  `check_time` datetime DEFAULT NULL COMMENT '审核时间',
  `check_advice` text CHARACTER SET utf8 COMMENT '审核意见',
  `operator` varchar(255) CHARACTER SET utf8 DEFAULT '暂无' COMMENT '审核互金用户的操作人',
  PRIMARY KEY (`fiUser_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of financialuser
-- ----------------------------
INSERT INTO `financialuser` VALUES ('1', '956574963@qq.com', '123456', null, '麓川', '刘欢', '430122199511111111', '../assets/userImages/1.jpg', '../assets/userImages/1.jpg', '2', '2016-12-08 00:00:00', '2016-12-15 10:44:26', '2016-12-08 13:29:23', null, 'admin');
INSERT INTO `financialuser` VALUES ('2', 'wuqi199509@163.com', '123456', null, '麓川', '吴淇', '123456XXXX', null, null, '0', '2016-12-06 00:00:00', '2016-12-06 00:00:00', '2016-12-05 00:00:00', null, 'admin');
INSERT INTO `financialuser` VALUES ('3', '664949905@qq.com', '123456', null, '麓川', '周倚文', '123456XXXX', null, null, '0', '2016-12-05 00:00:00', '2016-12-12 00:00:00', '2016-12-08 18:54:21', null, 'admin');
INSERT INTO `financialuser` VALUES ('4', '936285470@qq.com', '123456', null, '麓川', '周涛', '123456XXXX', null, null, '1', '2016-11-28 00:00:00', '2016-12-01 00:00:00', '2016-12-02 00:00:00', null, 'admin');
INSERT INTO `financialuser` VALUES ('5', 'liuhuan@qq.com', '123', null, '麓川', '刘欢', '4301221995', null, null, '1', '2016-12-08 10:27:47', '2016-12-08 12:03:32', '2016-12-08 12:04:48', null, 'admin');
INSERT INTO `financialuser` VALUES ('6', '123@qq.com', '123', null, 'luchuan', 'liuhuan', '430122', null, null, '1', '2016-12-08 21:16:59', '2016-12-08 21:18:54', '2016-12-08 21:20:33', null, 'admin');
INSERT INTO `financialuser` VALUES ('7', '22@qq.com', '111', null, '暂无', '暂无', '暂无', null, null, '1', '2016-12-06 10:53:41', '2016-12-22 10:41:58', '2016-12-13 10:41:55', null, 'admin');
INSERT INTO `financialuser` VALUES ('8', '111@qq.com', '111', null, '暂无', '暂无', '暂无', null, null, '1', '2016-12-22 10:53:45', null, '2016-12-12 10:51:34', null, 'admin');
INSERT INTO `financialuser` VALUES ('9', '222@qq.com', '111', null, '暂无', '暂无', '暂无', null, null, '0', '2016-12-14 10:53:49', null, '2016-12-12 10:51:47', null, 'admin');
INSERT INTO `financialuser` VALUES ('10', '333@qq.com', '111', null, '暂无', '暂无', '暂无', null, null, '2', '2016-12-14 10:53:52', null, null, null, '暂无');
INSERT INTO `financialuser` VALUES ('11', '444444@qq.com', '111', null, '暂无', '暂无', '暂无', null, null, '2', '2016-12-21 10:53:57', null, null, null, '暂无');
INSERT INTO `financialuser` VALUES ('12', '56656@qq.com', '111', null, '暂无', '暂无', '暂无', null, null, '2', '2016-12-17 10:54:02', null, null, null, '暂无');
INSERT INTO `financialuser` VALUES ('13', '456@qq.com', '111', null, '暂无', '暂无', '暂无', null, null, '2', '2016-12-13 10:54:05', null, null, null, '暂无');

-- ----------------------------
-- Table structure for image
-- ----------------------------
DROP TABLE IF EXISTS `image`;
CREATE TABLE `image` (
  `image_id` int(11) NOT NULL AUTO_INCREMENT,
  `case_image` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `image_type` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `case_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`image_id`),
  KEY `case_id` (`case_id`),
  CONSTRAINT `image_ibfk_1` FOREIGN KEY (`case_id`) REFERENCES `cases` (`case_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of image
-- ----------------------------

-- ----------------------------
-- Table structure for lawyer
-- ----------------------------
DROP TABLE IF EXISTS `lawyer`;
CREATE TABLE `lawyer` (
  `lawyer_id` int(11) NOT NULL AUTO_INCREMENT,
  `lawyer_telp` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `lawyer_pwd` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `lawyer_image` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `lawyer_name` varchar(255) CHARACTER SET utf8 DEFAULT '暂无',
  `IDcard_number` varchar(255) CHARACTER SET utf8 DEFAULT '暂无',
  `IDcard_image` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `lawyer_license` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `office` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '事务所',
  `work_exp` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '工作经验',
  `specialized_areas` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `check_result` int(1) DEFAULT '2' COMMENT '0未通过1通过2未审核',
  `register_time` datetime DEFAULT NULL COMMENT '注册时间',
  `submitInfo_time` datetime DEFAULT NULL COMMENT '提交时间',
  `check_time` datetime DEFAULT NULL COMMENT '审核时间',
  `check_advice` text CHARACTER SET utf8 COMMENT '审核结果',
  `operator` varchar(255) CHARACTER SET utf8 DEFAULT '暂无' COMMENT '对律师用户的操作人',
  `join_case` varchar(255) CHARACTER SET utf8 DEFAULT '暂无' COMMENT '律师参与案件',
  PRIMARY KEY (`lawyer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of lawyer
-- ----------------------------
INSERT INTO `lawyer` VALUES ('1', '13017147646', '123456', null, '刘欢', '430122XXXXXXXXXXXX', '../assets/userImages/1.jpg', '../assets/userImages/1.jpg', null, null, null, '2', '2016-12-08 10:48:09', '2016-12-15 13:03:23', '2016-12-08 00:00:00', null, 'admin', '0');
INSERT INTO `lawyer` VALUES ('2', '15526463436', '123456', null, '吴淇', '430122XXX', null, null, null, null, null, '0', '2016-12-10 10:48:22', '2016-12-08 10:48:26', '2016-12-08 10:48:29', null, 'admin', '0');
INSERT INTO `lawyer` VALUES ('3', '15575839449', '123456', null, '周倚文', '430122XXX', null, null, null, null, null, '0', '2016-12-08 10:48:33', '2016-12-09 10:48:37', '2016-12-08 16:52:43', null, 'admin', '0');
INSERT INTO `lawyer` VALUES ('4', '15717495351', '123456', null, '周涛', '430122XXX', null, null, null, null, null, '1', '2016-12-09 10:48:45', '2016-12-27 10:48:48', '2016-12-07 10:48:52', null, 'admin', '0');
INSERT INTO `lawyer` VALUES ('5', '13011111111', '123456', null, 'liuhuan', '430', null, null, null, null, null, '1', '2016-12-08 16:24:32', '2016-12-08 16:49:49', '2016-12-08 16:51:55', null, 'admin', '0');
INSERT INTO `lawyer` VALUES ('6', '13122222222', '123456', null, '暂无', '暂无', null, null, null, null, null, '0', '2016-12-13 10:54:20', null, '2016-12-12 10:35:30', null, '暂无', '0');
INSERT INTO `lawyer` VALUES ('7', '13222222222', '123456', null, '暂无', '暂无', null, null, null, null, null, '0', '2016-12-14 10:54:23', null, '2016-12-12 10:36:03', null, '暂无', '0');
INSERT INTO `lawyer` VALUES ('8', '13245678999', '123456', null, '暂无', '暂无', null, null, null, null, null, '0', '2016-12-14 10:54:27', null, '2016-12-12 10:53:55', null, 'admin', '0');
INSERT INTO `lawyer` VALUES ('9', '13433333333', '333333', null, '暂无', '暂无', null, null, null, null, null, '0', '2016-12-14 10:54:31', null, '2016-12-12 10:54:02', null, 'admin', '0');
INSERT INTO `lawyer` VALUES ('10', '13333333333', '222222', null, '暂无', '暂无', null, null, null, null, null, '2', '2016-12-21 10:54:34', null, null, null, '暂无', '0');
INSERT INTO `lawyer` VALUES ('11', '15555555555', '555555', null, '暂无', '暂无', null, null, null, null, null, '2', '2016-12-14 10:54:38', null, null, null, '暂无', '0');
INSERT INTO `lawyer` VALUES ('12', '15666666666', '666666', null, '暂无', '暂无', null, null, null, null, null, '2', '2016-12-06 10:54:41', null, null, null, '暂无', '0');

-- ----------------------------
-- Table structure for status
-- ----------------------------
DROP TABLE IF EXISTS `status`;
CREATE TABLE `status` (
  `status_id` int(11) NOT NULL AUTO_INCREMENT,
  `status_type` int(11) DEFAULT '1' COMMENT '1提交未发布2发布待审核3通过4未通过56789',
  `status_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `case_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`status_id`),
  KEY `case_id` (`case_id`),
  CONSTRAINT `status_ibfk_1` FOREIGN KEY (`case_id`) REFERENCES `cases` (`case_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of status
-- ----------------------------
INSERT INTO `status` VALUES ('1', '1', '2016-12-06 18:14:27', '1');
INSERT INTO `status` VALUES ('2', '1', '2016-12-14 10:50:17', '2');
INSERT INTO `status` VALUES ('3', '1', '2016-12-14 10:50:24', '3');
INSERT INTO `status` VALUES ('4', '1', '2016-12-14 10:50:27', '4');
INSERT INTO `status` VALUES ('5', '1', '2016-12-14 10:50:29', '5');
INSERT INTO `status` VALUES ('6', '1', '2016-12-14 10:50:31', '6');
INSERT INTO `status` VALUES ('7', '1', '2016-12-14 10:50:33', '7');
INSERT INTO `status` VALUES ('8', '1', '2016-12-14 10:50:35', '8');
INSERT INTO `status` VALUES ('9', '1', '2016-12-14 10:50:37', '9');
INSERT INTO `status` VALUES ('10', '1', '2016-12-14 10:50:40', '10');
INSERT INTO `status` VALUES ('11', '1', '2016-12-14 10:50:42', '11');
INSERT INTO `status` VALUES ('12', '1', '2016-12-14 10:50:45', '12');
INSERT INTO `status` VALUES ('13', '1', '2016-12-14 10:50:49', '13');
INSERT INTO `status` VALUES ('14', '1', '2016-12-14 10:51:07', '14');
INSERT INTO `status` VALUES ('15', '1', '2016-12-14 10:51:13', '15');
INSERT INTO `status` VALUES ('16', '2', '2016-12-14 10:52:02', '1');
INSERT INTO `status` VALUES ('17', '3', '2016-12-14 10:52:06', '1');
INSERT INTO `status` VALUES ('18', '4', '2016-12-14 10:55:11', '1');
INSERT INTO `status` VALUES ('19', '2', '2016-12-14 10:55:18', '2');
INSERT INTO `status` VALUES ('20', '3', '2016-12-14 10:55:24', '2');
INSERT INTO `status` VALUES ('21', '2', '2016-12-14 10:55:28', '3');
INSERT INTO `status` VALUES ('22', '15', '2016-12-14 10:55:46', '4');
INSERT INTO `status` VALUES ('23', '2', '2016-12-14 10:55:51', '5');
INSERT INTO `status` VALUES ('24', '5', '2016-12-15 13:26:00', '1');

-- ----------------------------
-- Table structure for workscope
-- ----------------------------
DROP TABLE IF EXISTS `workscope`;
CREATE TABLE `workscope` (
  `workscope_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '工作范围ID',
  `workscope_add` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '具体工作范围',
  `lawyer_id` int(11) DEFAULT NULL COMMENT '律师ID',
  PRIMARY KEY (`workscope_id`),
  KEY `workplace_ibfk_1` (`lawyer_id`) USING BTREE,
  CONSTRAINT `workscope_ibfk_1` FOREIGN KEY (`lawyer_id`) REFERENCES `lawyer` (`lawyer_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='律师工作范围的表';

-- ----------------------------
-- Records of workscope
-- ----------------------------
