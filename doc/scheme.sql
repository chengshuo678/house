DROP TABLE IF EXISTS `tb_house_user` ;
CREATE TABLE `tb_house_user` (
    `userId` int(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `username` varchar(64) DEFAULT '' COMMENT '姓名',
    `nick` varchar(128) COMMENT '昵称',
    `icon` varchar(256) COMMENT '头像',
    `wechat` varchar(256) COMMENT '微信号',
    `school` varchar(128) COMMENT '学校',
    `studentId` varchar(128) COMMENT '学号',
    `mobile` char(11) COMMENT '手机号',
    `email` varchar(128) COMMENT '邮箱',
    `isValid` tinyint DEFAULT 0 COMMENT '是否认证，1是认证，0是未认证',
    `isExist` tinyint DEFAULT 1 COMMENT '是否有效，1是有效，0是无效',
    `inserttime` DATETIME COMMENT '注册时间',
    PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';


DROP TABLE IF EXISTS `tb_house_pub` ;
CREATE TABLE `tb_house_pub` (
    `pubId` int(20) NOT NULL AUTO_INCREMENT COMMENT '发布id',
    `pubType` tinyint(2)  DEFAULT '1' COMMENT '发布类型，1是住房',
    `title` varchar(128) COMMENT '发布标题',
    `area` int(4) COMMENT '房屋面积',
    `province` varchar(64) COMMENT '房屋省份',
    `city` varchar(64) COMMENT '房屋城市',
    `county` varchar(64) COMMENT '房屋县区',
    `info` varchar(256) COMMENT '详细地址',
    `houseType` varchar(64) COMMENT '房屋户型',
    `price` Decimal(10,2) COMMENT '价格',
    `priceType` tinyint(2) DEFAULT 1 COMMENT '价格类型，1月度、2年度、3面议',
    `houseLimit` varchar(256) DEFAULT '' COMMENT '招租限制',
    `tel` varchar(32) DEFAULT '' COMMENT '联系方式',
    `telName` varchar(64) DEFAULT '' COMMENT '联系人',
    `image` varchar(256) DEFAULT '' COMMENT '房屋环境照片',
    `description` varchar(512) DEFAULT '' COMMENT '描述',
    `userId` int(20) NOT NULL COMMENT '发布人Id',
    `inserttime` DATETIME COMMENT '发布时间',
    `updatetime` DATETIME COMMENT '修改时间',
    `isExist` tinyint(2) DEFAULT '1' COMMENT '是否有效',
    PRIMARY KEY (`pubId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='发布信息表';


DROP TABLE IF EXISTS `tb_house_collect` ;
CREATE TABLE `tb_house_collect` (
    `collectId` int(20) NOT NULL AUTO_INCREMENT COMMENT '收集id',
    `userId` int(20) NOT NULL COMMENT '收藏者id',
    `pubId` int(20) NOT NULL COMMENT '发布id',
    `inserttime` DATETIME COMMENT '收藏时间',
    PRIMARY KEY (`collectId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='收集表';