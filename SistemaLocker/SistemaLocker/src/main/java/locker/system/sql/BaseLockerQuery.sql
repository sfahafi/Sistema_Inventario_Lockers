use locker;

use 7Dw3hH3cia;

select * from ubicaciones;

select * from terminales;

select * from modulos;

-- 1. Listar las terminales que tengan ploteo Axion.

select      tipo as Terminal,
            modelo
from        terminales
where       ploteo = 'axion';

-- 2. Listar las terminales que esten instaladas en capital federal.

select      t.tipo as terminal,
            t.modelo,
            u.provincia
from        terminales t
join        ubicaciones u
on          t.idUbicacion = u.idUbicacion
where       u.provincia = 'CABA' and t.idUbicacion <> 1;

-- 3. Listar el total de equipos City Terminal y Home Terminal instalados.

select      count(idUbicacion) 'Total de equipos instalados'
from        terminales
where       idUbicacion not in(1,2);

-- 4. Listar el total de equipos disponibles en planta CABA, agrupados por modelo y numero de boxes.

select      modelo as modelos,
	    nBoxes 'numero de boxes',
            count(idModulo) cantidades
from        modulos
where       idTerminal = 1
group by    modelo, nBoxes;

-- 5. Listar los equipos instalados en Open 25 y sus direcciones. Ordenar por direccion.

select      concat(t.tipo,' ',t.modelo) as terminal,
            u.locacion,
            u.direccion
from        ubicaciones u
join        terminales t 
on          u.idUbicacion = t.idUbicacion
where       u.locacion = 'Open 25'
order by    u.direccion;

-- 6. Listar los equipos que tengan ploteo de la red propia con su nombre de pc.

select      concat(tipo,' ',modelo) terminales,
            nombrePc
from        terminales
where       ploteo = 'PRP';

-- 7. Lista el total de modulos disponibles en planta CABA que tengan 7 boxes.

select      count(idModulo) 'Modulos de 7 boxes disponibles en planta'
from        modulos
where       idTerminal = 1 and nBoxes = 't7';

-- 8. Listar los seriales y cantidades de boxes que contienen los modulos de la termianl F.

select      m.nSerie as Seriales,
            m.nBoxes as 'Numero de Boxes'
from        modulos m
join        terminales t
on          t.idTerminal = m.idTerminal
where       t.modelo = 'F';

-- 9. Listar la ubicacion donde esta instalada la terminal D.

select      concat(t.tipo,' ',t.modelo) as Terminal,
            u.provincia,
            u.barrio,
            u.direccion, 
            u.locacion
from        ubicaciones u
join        terminales t
on          u.idUbicacion = t.idUbicacion
where       t.modelo = 'D' and t.idUbicacion <> 1;

-- 10. Listar el total de equipos HT instalados.

select      count(idTerminal) 'Total de equipos HT'
from        terminales
where       modelo = 'HT' and idUbicacion <> 1;

