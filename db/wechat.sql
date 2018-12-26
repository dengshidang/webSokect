CREATE TABLE `t_wechat_auth_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `open_id` varchar(64) NOT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `sex_desc` varchar(11) DEFAULT NULL,
  `sex_int` int(11) DEFAULT '0',
  `language` varchar(64) DEFAULT NULL,
  `city` varchar(64) DEFAULT NULL,
  `province` varchar(64) DEFAULT NULL,
  `country` varchar(64) DEFAULT NULL,
  `head_imgurl` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `refresh_token` varchar(255) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8
