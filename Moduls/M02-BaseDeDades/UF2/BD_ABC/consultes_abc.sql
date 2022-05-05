use ACB;

/*90*/ select eq.nom, eq.estadi, di.nom from equip eq, membre_equip me, directiu di, estadi es where eq.nom=me.equip and me.nom=di.nom and es.nom=eq.estadi and es.aforament<(select avg(aforament) from estadi) and di.carrec='President'; 

/*91*/ select ara.arbitre from arbitra ara, partit par where ara.equip_local=par.equip_local and par.jornada=ara.jornada and par.punts_local>par.punts_visitant group by ara.arbitre having count(*)>=2;

/*92*/ select par.equip_visitant from partit par, membre_equip me, entrenador en, equip eq where par.punts_visitant>par.punts_local and par.equip_visitant=eq.nom and eq.nom=me.equip and me.nom=en.nom group by par.equip_visitant having count(*)>=2
UNION
/*92*/ 

/*93*/ select eq.nom, di.nom from directiu di, membre_equip me, equip eq, partit par where di.nom=me.nom and eq.nom=me.equip and di.carrec='President' and eq.nom=par.equip_visitant and par.punts_visitant>(select avg(punts_visitant) from partit);      
/*93*/ select par.equip_visitant, di.nom from directiu di, membre_equip me, equip eq, partit par where eq.nom=par.equip_visitant and eq.nom=me.equip and par.punts_visitant>(select avg(punts_visitants) from partit);

/*94*/ select ju.nom, ju.posicio, me.equip from jugador ju, membre_equip me, entrenador en, equip eq where ju.nom=me.nom and en.nom=me.nom order by me.equip, ju.nom;

/*95*/ select nom, equip from membre_equip where nom like '%Brunet';

/*96*/ select me.nom, me.equip from membre_equip me, directiu di where di.nom=me.nom and di.carrec<>'President';

/*97*/ select me.equip, count(ju.fitxa) from jugador ju, membre_equip me where ju.nom=me.nom group by me.equip;

/*98*/ select sum(punts_visitant), equip_visitant from partit where punts_visitant>punts_local group by equip_visitant;

/*99*/ select sum(punts_local), equip_local from partit group by equip_local; 

/*100*/ select ju.nom, me.equip from jugador ju, membre_equip me where ju.nom=me.nom and ju.fitxa>400;

/*101*/ select me.equip, count(ju.fitxa) from jugador ju, membre_equip me where ju.nom=me.nom group by me.equip; 

/*102*/ select nom from equip where pressupost in (select max(pressupost) from equip);
/*102*/ select nom, max(pressupost) from equip;

/*103*/ select year(now()), nom from arbitre where ciutat_naixement='Olot' or ;


/*104*/ select abs(punts_local, punts_visitants) from partit where abs(punts_local, punts_visitant)=(select max(punts_local) from partit);

/*105*/ 

/*106*/











