--1)
select * from public.clienti where nome='Mario';

--2)
select * from public.clienti where anno_di_nascita=1998;

--3)
select * from public.fatture where iva=20;

--4)
select * from public.prodotti where extract (year from data_attivazione)=2017 and (in_produzione=true or in_commercio=true);

--5)
select * from public.fatture f inner join.clienti c on f.id_cliente=c on f.id_cliente where importo<1000;

--6)
select fa.numero_fattura,fa.importo,fa.iva,fa.data_fattura,fo.denominazione 
from public.fatture fa inner join public.fornitore fo on fa.numero_fornitore=fo.numero_fornitore;