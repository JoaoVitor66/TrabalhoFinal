CREATE TABLE IF NOT EXISTS produto(
id int AUTO_INCREMENT PRIMARY KEY ,
nome varchar(200) not null,
quantidade int  ,
preco double



);


    CREATE TABLE IF NOT EXISTS estoque(
id int AUTO_INCREMENT PRIMARY KEY ,
adim varchar(200) not null,
produto_id int not null ,
foreign key (produto_id) references produto(id)




);

CREATE TABLE IF NOT EXISTS carinho(
                                      id int AUTO_INCREMENT PRIMARY KEY ,
                                      cliente varchar(200) not null,
                                      produto_id int not null ,
                                      foreign key (produto_id) references produto(id)




);



