create table json_chart(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    country varchar(60),
    population varchar(60),
    percent int
);

INSERT INTO `jquery_data_source`.`json_chart` (`id` , `country` , `population` , `percent`) VALUES (NULL , 'China', '134', '45');
INSERT INTO `jquery_data_source`.`json_chart` (`id` , `country` , `population` , `percent`) VALUES (NULL , 'India', '121', '35');
INSERT INTO `jquery_data_source`.`json_chart` (`id` , `country` , `population` , `percent`) VALUES (NULL , 'USA', '313', '80');
INSERT INTO `jquery_data_source`.`json_chart` (`id` , `country` , `population` , `percent`) VALUES (NULL , 'India', '237', '90');
INSERT INTO `jquery_data_source`.`json_chart` (`id` , `country` , `population` , `percent`) VALUES (NULL , 'China', '192', '49');