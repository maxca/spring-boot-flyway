
CREATE TABLE `tbl_product` (
  `product_id` int(10) NOT NULL,
  `product_name` varchar(20) NOT NULL,
  `price` decimal(9,2) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;