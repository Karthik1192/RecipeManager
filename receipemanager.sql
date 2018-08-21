CREATE DATABASE `ass2` /*!40100 DEFAULT CHARACTER SET utf8 */;

DROP TABLE IF EXISTS `ass2`.`recipemanager`;
CREATE TABLE  `ass2`.`recipemanager` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(100) NOT NULL default '',
  `ing1` varchar(100) NOT NULL default '',
  `ing2` varchar(100) NOT NULL default '',
  `ing3` varchar(100) NOT NULL default '',
  `ing4` varchar(100) NOT NULL default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
