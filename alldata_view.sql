DROP VIEW public.alldata;

CREATE OR REPLACE VIEW public.alldata
 AS
 SELECT 
--  passport ---------------
	passport.id, passport.mesto_prozhivaniya_1_gorod_2_selo, passport.data_rozhdeniya, passport.vozrast

-- 	semya -------------
	, semya.kol_vo_chel_v_d_to_kh
	
-- 	obsled ---------------
	, obsled.pol
		--, sad1, dad1, sad2, dad2, sredn_sad, sredn_dad, sredn_raznitsa
		, bally_davlenie
		--, chss1, chss2, sredn_puls
		, bally_puls
		--, ot1, ot2, ob1, ob2, imt
		, bally_imt, ves, rost
		--, plecho, golen, golova, sila_levaya1, sila_levaya2, sila_levaya3, sila_pravaya1, sila_pravaya2, sila_pravaya3, fev1, fev1_proc, fvc, fvc_proc
		, bally_dykhanie
		--, pefr, pefr_proc, glyukoza, bally_glyukoza, kholesterin
		, bally_kholesterin
		--, triglitseridy, lpvp
		, bally_lipidy
		--, lpnp
		, bally_zhiry
		--, natriy, kaliy
		, bally_elektrolity
		--, kreatinin, polnyy_ves_tela, _proc_zhira
		, bally__proc_zhira
		--, _proc_vody
		, bally_voda
		--, myshechnaya_massa
		, bally_myshtsy
		--, fiz_sostoyanie, bmr, metab_vozrast
		, delta_metabol_i_real
		--, kost_massa, dolya_vnutr_zhira
		, ekg_norma
		--, pat_zub_q__to__perediy, pat_zub_q__to__nizhniy, pat_zub_q__to__lateralnyy, pat_zub_q__to__per_lat, pat_zub_q__to__zadniy, pat_zub_q__to__net, elevatsiya_st__to__peredniy, elevatsiya_st__to__nizhniy, elevatsiya_st__to__lateralnyy, elevatsiya_st__to__pered_lat, elevatsiya_st__to__zadniy, elevatsiya_st__to__net, depressiya_st__to__peredniy, depressiya_st__to__nizhniy, depressiya_st__to__lateralnyy, depressiya_st__to__pered_lat, depressiya_st__to__zadniy, depressiya_st__to__net, inversiya_t__to__peredniy, inversiya_t__to__nizhniy, inversiya_t__to__lateralnyy, inversiya_t__to__pered_lat, inversiya_t__to__zadniy, inversiya_t__to__net, r_more_s, gipertrofiya_lzh, voltazhnye_kriterii, depr_st__to__inver_t, otklonenie_el_osi, bally_ekg, narushenie_provodimosti, utochnenie, q_t
		, bally_qt
		--, anomalnyy_ritm
		, bally_ritm
		--, drugie_anomalii
		, bally_anomalii, zdorove
		, obsled.bally_anamnez as obsled_bally_anamnez , itog
				
-- 	sovershen1 ---------------
	, semya, etnos, natsionalnost, religiya, obrazovanie, professiya, vy_rabotaete
	-- 	, vykhod_na_pensiyu, prekraschenie_raboty_po_bolezni, sakharnyy_diabet, dlitelnost_sakharnogo_diabeta
	, arterialnaya_gipertenziya, dlitelnost_arterialnoy_gipertenzii
	, onmk
-- 	, danost_onmk
	, stenokardiya_ibs_infarkt_miokarda
-- 	, dlitelnost_stenokardii_ibs_infarkta_miokarda
	, serdechnaya_nedostatochnost
-- 	, dlitelnost_serdechnoy_nedostatochnosti
	, prochie_zabolevaniya_serdtsa
-- 	, dlitelnost_prochikh_zabolevaniy_serdtsa, gepetit, dlitelnost_gepatita_, onkologiya, onkologiya_lok_ya, dlitelnost_onkologicheskogo_protsessa, khronicheskoe_zabolevanie_legkikh, dlitelnost_khron_zabolevaniya_legkikh, bronzhialnaya_astma, dlitelnost_bronkhialnoy_astmy, tuberkulez_legkikh_, dlitelnost_tuberkuleza_legkikh, vich_to_spid, dlitelnost_vich_to_spid, 
	, sovershen1.bally_anamnez as sovershen1_bally_anamnez 
	-- 	regulyarnyy_prim_lekarstvennykh_sredstv, lekarstvo__to__davlenie, lekarstvo__to__kholesterin, lekarstvo__to__insult, lekarstvo__to__diabet, lekarstvo__to__astma, lekarstvo__to__kitay, lekarstvo__to__prochie, lekarstvo__to__prochie___utochnenie, lekarstvo__to__neizvestno, perechen_lekarstva, travmy_za_god, perelomy, chislo_perelom, let_proshlo, status_kureniya, vozrast_kureniya, sigaret_v_den, sigaret_let, sigaret_prekr_let, sigaret_prekr_mes, passivnoe_kurenie, chastota_pass_kur, alkogol, vozrast_alkog, vodka_razmer, vodka_regulyar, vodka_portsiy, vodka_let, vodka_otkaz_let, vino_regulyar, vino_portsiy, vino_let, vino_otkaz_let, pivo_razmer, pivo_regulyar, pivo_portsiy, pivo_let, pivo_otkaz_let, samogon_razmer, samogon_regulyar, samogon_portsiy, samogon_let, samogon_otkaz_let, kr_vino_regulyar, kr_vino_portsiy, kr_vino_let, kr_vino_otkaz_let, pyat_portsiy_v_den, pyat_portsiy_dney_v_mes, pyat_portsiy_chislo_portsiy, vremya_zasypaniya, vremya_probuzhdeniya, son_posle_obeda, sonchas_min, sport_kluby, sport_chastota_v_mes, sport_chastota_v_god, religiya_kluby, religiya_chastota_v_mes, religiya_chastota_v_god, prochee_kluby, konkretno, prochee_chastota_v_mes, prochee_chastota_v_god
	
-- 	dom_hoz ---------------
	-- 	tip_kryshi, elektr_vo, tip_topliva, istochnik_tepla, istochnik_vody, vody_net_min, moped, avtomobil, chislo_avto, prochie_avto, velosiped, povozki, pk, chislo_pk, stir_mashina, kukh_kombayn, kholodilnik, televizor, chislo_telev, stereo, telefon, gazonokos, snegouborsch, mikrovolnovka, posudomoech, obespechennost_byta, ezhemes_dokhod, dengi_na_pischu, dacha, ploschad_dachi, mesto_dlya_prigot_pischi, vytyazhka, gotovka_vne_doma_mesyats, vopros_10a_to__mesyats, vopros_10a_to__5_let, vopros_10b_to__mesyats, vopros_10b_to__5_let, vopros_10c_to__mesyats, vopros_10c_to__5_let, kvartira, dr_kvartira, kholodnaya_dacha, teplaya_dacha, mashina, garazh, ferma, lavka, drugoe, dr_utochnit, chast_dokhoda_na_edu, vopros_13
	, dostatok_po_srav_s_drug, tip_zhilya, chislo_komnat, ploschad_zhilya, zhilischnye_usloviya
	
-- 	fio ---------------
	,fio.fio
	
-- 	sovershen2 ---------------
	, sovershen2.stress_iz_za_finans
	, sovershen2.depressiya
	
-- 	показатели вычисляемые ---------------
	, false as hasDiagnostic
	, false as requiresAttention
	, case 
			when arterialnaya_gipertenziya = 1 then 'Болен'
		 	when ekg_norma = 0 then 'Обследуется/На лечении'
			else 'Не болен' end as isSick
FROM passport 
join semya on semya.id = passport.id 
join obsled on obsled.id = semya.id
join sovershen1 on sovershen1.id = obsled.id
join dom_hoz on dom_hoz.id = sovershen1.id
join fio on fio.id = dom_hoz.id 
join sovershen2 on sovershen2.id = fio.id
;