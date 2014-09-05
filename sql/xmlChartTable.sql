create table xml_chart(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    date varchar(60),
    quantity int,
    description varchar(60)
);

INSERT INTO `jquery_data_source`.`xml_chart` (`id`, `date`, `quantity`, `description`) VALUES (NULL, '1/1/2011', '10', 'Beverages');
INSERT INTO `jquery_data_source`.`xml_chart` (`id`, `date`, `quantity`, `description`) VALUES (NULL, '2/2/2011', '15', 'Condiments');
INSERT INTO `jquery_data_source`.`xml_chart` (`id`, `date`, `quantity`, `description`) VALUES (NULL, '3/3/2011', '20', 'Grains/Cereals');
INSERT INTO `jquery_data_source`.`xml_chart` (`id`, `date`, `quantity`, `description`) VALUES (NULL, '4/6/2011', '30', 'Beverages');
INSERT INTO `jquery_data_source`.`xml_chart` (`id`, `date`, `quantity`, `description`) VALUES (NULL, '5/10/2011', '40', 'Beverages');
INSERT INTO `jquery_data_source`.`xml_chart` (`id`, `date`, `quantity`, `description`) VALUES (NULL, '5/12/2011', '50', 'Grains/Cereals');