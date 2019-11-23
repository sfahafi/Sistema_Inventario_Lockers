use locker;

use a19MVQ8iJ7;

insert into ubicaciones(provincia, barrio, direccion, locacion) values
    ('CABA','Colegiales','Concepcion Arenal 2644','Planta'),
    ('Cordoba','Arguello','Recta Martinolli 6858','Planta_2'),
    ('CABA','San Nicolas','Av. Cordoba 315','Open 25'),
    ('CABA','Palermo','Av. Medrano 908','Open 25'),
    ('Gran Buenos Aires','Tigre','Luis Garcia 650','Estacion Tigre'),
    ('CABA','Villa Crespo','Av. Corrientes 6020','Estacion Axion'),
    ('CABA','Puerto Madero','Olga Cossettini 263','Open 25'),
    ('Gran Buenos Aires','Vicente Lopez','Av. Maipú 1055','McDonalds'),
    ('Nueva1','Nueva1','Nueva1','Nueva1'),
    ('Nueva2','Nueva2','Nueva2','Nueva2');
    
insert into terminales(idTerminal, idUbicacion, nombrePc, tipo, modelo, nBoxes, ploteo) values
    (1,1,'Deposito','New_Modulo','M','t00','Sin_Plot'),
    (2,2,'Deposito','New_Modulo','M','t00','Sin_Plot');

insert into terminales(idUbicacion, nombrePc, tipo, modelo, nBoxes, ploteo) values
    (6,'054CT00001','City_Terminal','A','t56','PRP'),
    (7,'054CT00002','City_Terminal','B','t75','Correo'),
    (8,'054CT00003','City_Terminal','D','t60','Axion'),
    (5,'054CT00004','City_Terminal','F','t79','YPF'),
    (4,'054HT00001','Home_Terminal','HT','t16','PRP'),
    (3,'054HT00002','Home_Terminal','HT','t16','Sin_Plot'),
    (2,'Nueva1','City_Terminal','A','t56','Sin_Plot'),
    (1,'Nueva2','City_Terminal','B','t75','Sin_Plot'),
    (1,'Nueva3','City_Terminal','D','t60','Sin_Plot'),
    (1,'Nueva4','City_Terminal','F','t79','Sin_Plot'),
    (1,'Nueva5','Home_Terminal','HT','t16','Sin_Plot'),
    (1,'Nueva6','Home_Terminal','HT','t16','Sin_Plot'),
    (1,'Nueva7','New_Modulo','M','t00','Sin_Plot'),
    (1,'Nueva8','New_Modulo','M','t00','Sin_Plot');
    
insert into modulos(idModulo, idTerminal, modelo, nSerie, nBoxes, apertura) values
    (null,3,'HLD_FZ3','MOD001','t3','right'),
    (null,3,'HLD_FZ9','MOD002','t9','left'),
    (null,3,'HLD_FZ20','MOD003','t20','left'),
    (null,3,'HLD_FZ22','MOD004','t22','right'),
    (null,3,'HLD_FZAT','CEN001','t2','left'),     -- CTA
    (null,4,'HLD_FZ9','MOD005','t9','left'),
    (null,4,'HLD_FZ20','MOD006','t20','left'),
    (null,4,'HLD_FZ22','MOD007','t22','right'),
    (null,4,'HLD_FZ20','MOD008','t20','right'),
    (null,4,'HLD_FZAT','CEN002','t2','left'),     -- CTB
    (null,5,'HLD_FZ9','MOD009','t9','left'),
    (null,5,'HLD_FZ20','MOD010','t20','left'),
    (null,5,'HLD_FZ22','MOD011','t22','right'),
    (null,5,'HLD_FZ7','MOD012','t7','right'),
    (null,5,'HLD_FZAT','CEN003','t2','left'),      -- CTD
    (null,6,'HLD_FZ3','MOD013','t3','right'),
    (null,6,'HLD_FZ3','MOD014','t3','left'),
    (null,6,'HLD_FZ9','MOD015','t9','left'),
    (null,6,'HLD_FZ20','MOD016','t20','left'),
    (null,6,'HLD_FZ22','MOD017','t22','right'),
    (null,6,'HLD_FZ22','MOD018','t22','right'),
    (null,6,'HLD_FZAT','CEN004','t2','left'),     -- CTF
    (null,7,'HLD_FZ16','HT1601','t16','left'),     -- HT
    (null,8,'HLD_FZ16','HT1602','t16','left');
    

insert into modulos(idModulo, idTerminal, modelo, nSerie, nBoxes, apertura) values
    (null,1,'HLD_FZ7','MOD019','t7','right'),
    (null,1,'HLD_FZAT','CEN005','t2','left'),
    (null,1,'HLD_FZ3','MOD020','t3','right'),
    (null,2,'HLD_FZ3','MOD021','t3','left'),
    (null,1,'HLD_FZ9','MOD022','t9','left'),
    (null,1,'HLD_FZ20','MOD023','t20','left'),
    (null,1,'HLD_FZ22','MOD024','t22','right'),
    (null,1,'HLD_FZ22','MOD025','t22','right'),
    (null,1,'HLD_FZAT','CEN006','t2','left'),
    (null,2,'HLD_FZ16','HT1603','t16','left'),
    (null,1,'HLD_FZ16','HT1604','t16','left'),
    (null,1,'HLD_FZ16','HT1605','t16','left');