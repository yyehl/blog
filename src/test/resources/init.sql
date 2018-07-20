DROP TABLE IF EXISTS `blog`.`user`;
CREATE TABLE `blog`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT "主键",
  `name` VARCHAR(45) NOT NULL COMMENT "用户名字",
  `password` VARCHAR(45) NOT NULL COMMENT "密码",
  `salt` VARCHAR(45) NOT NULL COMMENT "用于密码加密",
  `type` INT NOT NULL COMMENT "用户类型，1为管理员，2为普通用户",
  `status` INT NOT NULL COMMENT "用户状态，1为正常，2为封禁，3为注销",
  `email` VARCHAR(45) NULL COMMENT "电子邮件，可为空",
  `created_date` DATETIME NOT NULL COMMENT "用户注册时间",
  `updated_date` DATETIME NOT NULL COMMENT "用户最后更新时间，更新名字，密码等",
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
  ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `blog`.`login_ticket`;
CREATE TABLE `blog`.`login_ticket` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT "主键",
  `user_id` INT NOT NULL COMMENT "用户id",
  `login_date` DATETIME NOT NULL COMMENT "本次登陆时间",
  `ip` VARCHAR(45) NOT NULL COMMENT "本次登陆ip地址",
  PRIMARY KEY (`id`))
  ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `blog`.`topic`;
CREATE TABLE `blog`.`topic` (
  `id` INT NOT NULL AUTO_INCREMENT  COMMENT "主键",
  `name` VARCHAR(45) NOT NULL COMMENT "话题名称",
  `description` VARCHAR(200) NULL DEFAULT 'Hi~Welcome to this topic!'  COMMENT "话题描述",
  `status` INT NOT NULL COMMENT "话题状态，1为正常，2为删除",
  `created_date` DATE NOT NULL COMMENT "话题创建时间",
  `updated_date` DATE NOT NULL COMMENT "话题更新时间",
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
  ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `blog`.`post`;
CREATE TABLE `blog`.`post` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT "主键",
  `user_id` INT NOT NULL COMMENT "发表帖子的用户id",
  `title` INT NOT NULL COMMENT "帖子的标题",
  `content` VARCHAR(1000) NOT NULL COMMENT "帖子的内容",
  `created_date` DATETIME NOT NULL COMMENT "帖子创建时间",
  `updated_date` DATETIME NOT NULL COMMENT "帖子更新时间",
  `view_count` INT NOT NULL COMMENT "帖子浏览数",
  `status` INT NOT NULL COMMENT "帖子状态，1为正常，2为被删除",
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  PRIMARY KEY (`id`))
  ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `blog`.`comment`;
CREATE TABLE `blog`.`comment` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT "主键",
  `user_id` INT NOT NULL COMMENT "发表评论的用户id",
  `post_id` INT NOT NULL COMMENT "此条评论所属的帖子id",
  `content` VARCHAR(1000) NOT NULL COMMENT "此条评论的内容",
  `created_date` DATETIME NOT NULL COMMENT "评论创建时间",
  `updated_date` DATETIME NOT NULL COMMENT "评论更新时间",
  `status` INT NOT NULL COMMENT "评论状态，1为正常，2为被删除",
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  PRIMARY KEY (`id`))
  ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

