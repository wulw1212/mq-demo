CREATE TABLE `wechat_sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `state` int(255) DEFAULT NULL,
  `operator` varchar(255) DEFAULT NULL,
  `operator_time` datetime DEFAULT NULL,
  `operator_ip` varchar(255) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `demo`.`wechat_sys_user` (`id`, `username`, `password`, `telephone`, `email`, `remark`, `state`, `operator`, `operator_time`, `operator_ip`, `dept_id`) VALUES ('2', 'admins', '123456', '12345678912', '9632587@qq.com', NULL, '0', '', '2019-05-27 14:22:26', '1', '1');



CREATE TABLE `spring_cloud_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `balance` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

INSERT INTO `demo`.`spring_cloud_user` (`id`, `username`, `name`, `age`, `balance`) VALUES ('1', 'user1', '张三', '20', '100');
INSERT INTO `demo`.`spring_cloud_user` (`id`, `username`, `name`, `age`, `balance`) VALUES ('2', 'user2', '李四', '20', '100');
INSERT INTO `demo`.`spring_cloud_user` (`id`, `username`, `name`, `age`, `balance`) VALUES ('3', 'user3', '王五', '20', '100');
INSERT INTO `demo`.`spring_cloud_user` (`id`, `username`, `name`, `age`, `balance`) VALUES ('4', 'user4', '马六', '20', '100');


CREATE TABLE `blog_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

