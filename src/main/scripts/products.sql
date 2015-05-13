select distinct matnr, maktx, mfrpn, ean11, mfrnr, mfrpn from zcrmprodus where length(ean11)>0 and (mfrnr is null or length(mfrnr)=0 or mfrpn is null or length(mfrpn)=0) and lvorm != 'X'

select mfrnr as vendor, mfrpn as partnr, maktx as descr, ean11 as ean  from zcrmprodus where mfrpn is not null and length(mfrpn)>0 and lvorm != 'X'
group by maktx, mfrnr, mfrpn
order by mfrnr


select mfrnr as vendor, mfrpn as partnr, maktx as descr, ean11 as ean  from zcrmprodus where 
(mfrpn is not null and length(mfrpn)>0 or ean11 is not null and length(ean11) > 0 )
and lvorm != 'X'
group by matnr
order by mfrnr


select distinct matnr, maktx, ean11, mfrnr, mfrpn 
from zcrmprodus where length(ean11)>0 and (mfrnr is null or length(mfrnr)=0 or mfrpn is null or length(mfrpn)=0) and lvorm != 'X'
