/*
SQLyog Community v13.1.7 (64 bit)
MySQL - 5.5.36 : Database - lzj
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`lzj` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `lzj`;

/*Table structure for table `lzj_banner` */

DROP TABLE IF EXISTS `lzj_banner`;

CREATE TABLE `lzj_banner` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `lzj_banner` */

insert  into `lzj_banner`(`id`,`url`) values 
(1,'/banner/banner-1.png'),
(2,'/banner/banner-2.png'),
(3,'/banner/banner-3.png'),
(4,'/banner/banner-4.png'),
(5,'/banner/banner-5.png'),
(6,'/banner/banner-6.png');

/*Table structure for table `lzj_comment` */

DROP TABLE IF EXISTS `lzj_comment`;

CREATE TABLE `lzj_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL,
  `comment` varchar(64) DEFAULT NULL,
  `start` int(11) DEFAULT '0',
  `product_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `lzj_comment` */

insert  into `lzj_comment`(`id`,`username`,`comment`,`start`,`product_id`) values 
(1,'13356233355','房子不错，价钱好，服务也好',5,9),
(2,'13742583235','这房子完全没办法住了，价钱高的离谱，服务差的要命。重点是甲醛超标，必须给个差评',1,9),
(3,'18539752425','我对门是自如房子，他们实在是过分了。装修完毕之后楼道的垃圾也不收拾，找自如管家，竟然说是装修师傅的事情，他们管不了',2,9),
(4,'15744325549','我租的比较早，价钱上还算合理。是涨价之前租的。总体还是满意的',4,9),
(5,'13913579999','太有钱了，任性不做评价',5,9),
(7,'15386695334','我的评价是还可以，就是没有钱租',0,11),
(8,'15386695334','笑死我了，根本没办法住',0,9);

/*Table structure for table `lzj_info` */

DROP TABLE IF EXISTS `lzj_info`;

CREATE TABLE `lzj_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `years` year(4) DEFAULT NULL,
  `style` varbinary(32) DEFAULT NULL,
  `type` varchar(32) NOT NULL,
  `level` varchar(32) DEFAULT NULL,
  `orientation` varchar(10) NOT NULL,
  `product_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `lzj_info` */

insert  into `lzj_info`(`id`,`years`,`style`,`type`,`level`,`orientation`,`product_id`) values 
(1,2022,'精装性','4室1厅','17/19层','朝南',9),
(2,2002,'精装性','4室一厅','17/18层','朝北',10),
(3,2012,'简装性','两室一厅','15/2层','朝东',11);

/*Table structure for table `lzj_product` */

DROP TABLE IF EXISTS `lzj_product`;

CREATE TABLE `lzj_product` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `img` varchar(32) NOT NULL,
  `title` varchar(32) NOT NULL COMMENT '标题',
  `link` varchar(32) DEFAULT 'http://www.iwenwiki.com' COMMENT '链接',
  `is_hot` tinyint(1) DEFAULT '0',
  `city` varchar(32) NOT NULL COMMENT '城市',
  `sale_count` int(11) DEFAULT '0' COMMENT '销售数量',
  `price` decimal(10,0) NOT NULL COMMENT '商品价格',
  `rent_type` varchar(32) DEFAULT NULL COMMENT '租赁方式',
  `house_type` varchar(32) DEFAULT NULL COMMENT '房屋面积',
  `product_info_id` int(11) DEFAULT NULL COMMENT '商品信息id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `lzj_product` */

insert  into `lzj_product`(`id`,`img`,`title`,`link`,`is_hot`,`city`,`sale_count`,`price`,`rent_type`,`house_type`,`product_info_id`) values 
(1,'/homehot/img_chuwugui.png','北京储物柜','',0,'北京',12,128,NULL,NULL,NULL),
(2,'/homehot/img_aijiaodeng.png','北京矮脚灯','',1,'北京',4,42,NULL,NULL,NULL),
(3,'/homehot/img_jingzi.png','杭州照妖镜','',0,'杭州',9,97,NULL,NULL,NULL),
(4,'/homehot/img_luodideng.png','上海落地灯','',0,'上海',32,55,NULL,NULL,NULL),
(5,'/homehot/img_baozhen.png','天津抱枕','',1,'天津',41,26,NULL,NULL,NULL),
(6,'/homehot/img_zhiwujia.png','上海置物架','',1,'上海',11,180,NULL,NULL,NULL),
(7,'/homehot/img_zhaoming.png','杭州照明灯','',1,'杭州',25,79,NULL,NULL,NULL),
(8,'/homehot/img_maojin.png','天津毛巾','',1,'天津',62,35,NULL,NULL,NULL),
(9,'/search/1.jpg','豪宅 · 使馆壹号院4居室-南','',0,'北京',0,130000,'整租','273.97 ㎡|17/19层| 4室1厅',1),
(10,'/search/2.JPG','豪宅 · 金茂府东区3居室-南北','',0,'上海',0,40000,'整租','201.27 ㎡| 15/24层| 3室1厅',1),
(11,'/search/3.jpg','豪宅 · 使馆壹号院2居室-南','',0,'北京',0,42000,'整租','204 ㎡| 2/19层| 2室1厅',1),
(12,'/search/4.jpg','豪宅 · 使馆壹号院3居室-南','',0,'天津',0,80000,'短租','237 ㎡| 13/19层| 3室1厅',1),
(13,'/search/5.jpg','豪宅 · 棕榈泉国际公寓2居室-南北','',0,'杭州',0,33000,'短租','176.52 ㎡| 2/30层| 2室1厅',1),
(14,'/search/6.jpg','豪宅 · 华悦国际公寓6居室-南','',0,'上海',0,50000,'整租','235.76 ㎡| 7/24层| 3室2厅',1);

/*Table structure for table `lzj_product_image` */

DROP TABLE IF EXISTS `lzj_product_image`;

CREATE TABLE `lzj_product_image` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(32) NOT NULL,
  `product_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `lzj_product_image` */

insert  into `lzj_product_image`(`id`,`url`,`product_id`) values 
(1,'/details/1.jpg',9),
(2,'/details/2.jpg',9),
(3,'/details/3.jpg',9),
(4,'/details/4.jpg',9),
(5,'/details/5.jpg',9),
(6,'/details/6.jpg',9),
(7,'/details/7.jpg',9),
(8,'/details/8.jpg',9),
(9,'/details/9.jpg',9),
(10,'/details/10.jpg',9),
(11,'/details/11.jpg',9),
(12,'/details/12.jpg',9),
(13,'/details/13.jpg',9);

/*Table structure for table `lzj_product_user` */

DROP TABLE IF EXISTS `lzj_product_user`;

CREATE TABLE `lzj_product_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL,
  `product_id` int(11) DEFAULT NULL,
  `comment_state` int(11) DEFAULT '0',
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `lzj_product_user` */

insert  into `lzj_product_user`(`id`,`username`,`product_id`,`comment_state`) values 
(2,'15386695334',11,2),
(3,'15386695334',9,2);

/*Table structure for table `lzj_user` */

DROP TABLE IF EXISTS `lzj_user`;

CREATE TABLE `lzj_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `lzj_user` */

insert  into `lzj_user`(`id`,`username`,`password`) values 
(1,'15386695334',NULL),
(2,'13890268546',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
