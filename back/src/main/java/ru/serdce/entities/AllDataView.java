package ru.serdce.entities;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Immutable
@Subselect("select * from alldata")
public class AllDataView implements Serializable {

//  private Long ;
//  private Double ;
//  private String ;

  @Id
  private String id;
  private Double  mesto_prozhivaniya_1_gorod_2_selo;
  private String  data_rozhdeniya;
  private Double  vozrast;
  private Double  kol_vo_chel_v_d_to_kh;
  private String  pol;
  private String  sad1;
  private String  dad1;
  private String  sad2;
  private String  dad2;
  private String  sredn_sad;
  private String  sredn_dad;
  private String  sredn_raznitsa;
  private String  bally_davlenie;
  private String  chss1;
  private String  chss2;
  private String  sredn_puls;
  private String  bally_puls;
  private String  ot1;
  private String  ot2;
  private String  ob1;
  private String  ob2;
  private Double  ves;
  private Double  rost;
  private String  imt;
  private String  bally_imt;
  private String  plecho;
  private String  golen;
  private String  golova;
  private String  sila_levaya1;
  private String  sila_levaya2;
  private String  sila_levaya3;
  private String  sila_pravaya1;
  private String  sila_pravaya2;
  private String  sila_pravaya3;
  private String  fev1;
  private String  fev1_proc;
  private String  fvc;
  private String  fvc_proc;
  private String  bally_dykhanie;
  private String  pefr;
  private String  pefr_proc;
  private String  glyukoza;
  private String  bally_glyukoza;
  private String  kholesterin;
  private String  bally_kholesterin;
  private String  triglitseridy;
  private String  lpvp;
  private String  bally_lipidy;
  private String  lpnp;
  private String  bally_zhiry;
  private String  natriy;
  private String  kaliy;
  private String  bally_elektrolity;
  private String  kreatinin;
  private String  polnyy_ves_tela;
  private String  _proc_zhira;
  private String  bally__proc_zhira;
  private String  _proc_vody;
  private String  bally_voda;
  private String  myshechnaya_massa;
  private String  bally_myshtsy;
  private String  fiz_sostoyanie;
  private String  bmr;
  private String  metab_vozrast;
  private String  delta_metabol_i_real;
  private String  kost_massa;
  private String  dolya_vnutr_zhira;
  private Double  ekg_norma;
  private String  pat_zub_q__to__perediy;
  private String  pat_zub_q__to__nizhniy;
  private String  pat_zub_q__to__lateralnyy;
  private String  pat_zub_q__to__per_lat;
  private String  pat_zub_q__to__zadniy;
  private String  pat_zub_q__to__net;
  private String  elevatsiya_st__to__peredniy;
  private String  elevatsiya_st__to__nizhniy;
  private String  elevatsiya_st__to__lateralnyy;
  private String  elevatsiya_st__to__pered_lat;
  private String  elevatsiya_st__to__zadniy;
  private String  elevatsiya_st__to__net;
  private String  depressiya_st__to__peredniy;
  private String  depressiya_st__to__nizhniy;
  private String  depressiya_st__to__lateralnyy;
  private String  depressiya_st__to__pered_lat;
  private String  depressiya_st__to__zadniy;
  private String  depressiya_st__to__net;
  private String  inversiya_t__to__peredniy;
  private String  inversiya_t__to__nizhniy;
  private String  inversiya_t__to__lateralnyy;
  private String  inversiya_t__to__pered_lat;
  private String  inversiya_t__to__zadniy;
  private String  inversiya_t__to__net;
  private String  r_more_s;
  private String  gipertrofiya_lzh;
  private String  voltazhnye_kriterii;
  private String  depr_st__to__inver_t;
  private String  otklonenie_el_osi;
  private String  bally_ekg;
  private String  narushenie_provodimosti;
  private String  utochnenie;
  private String  q_t;
  private String  bally_qt;
  private String  anomalnyy_ritm;
  private String  bally_ritm;
  private String  drugie_anomalii;
  private String  bally_anomalii;
  private String  zdorove;
  private String  obsled_bally_anamnez;
  private String  itog;
  private String  semya;
  private String  etnos;
  private String  natsionalnost;
  private String  religiya;
  private String  obrazovanie;
  private String  professiya;
  private Double  vy_rabotaete;
  private String  vykhod_na_pensiyu;
  private String  prekraschenie_raboty_po_bolezni;
  private String  sakharnyy_diabet;
  private String  dlitelnost_sakharnogo_diabeta;
  private Double  arterialnaya_gipertenziya;
  private String  dlitelnost_arterialnoy_gipertenzii;
  private Double  onmk;
  private String  danost_onmk;
  private Double  stenokardiya_ibs_infarkt_miokarda;
  private String  dlitelnost_stenokardii_ibs_infarkta_miokarda;
  private Double  serdechnaya_nedostatochnost;
  private String  dlitelnost_serdechnoy_nedostatochnosti;
  private Double  prochie_zabolevaniya_serdtsa;
  private String  dlitelnost_prochikh_zabolevaniy_serdtsa;
  private String  gepetit;
  private String  dlitelnost_gepatita_;
  private String  onkologiya;
  private String  onkologiya_lok_ya;
  private String  dlitelnost_onkologicheskogo_protsessa;
  private String  khronicheskoe_zabolevanie_legkikh;
  private String  dlitelnost_khron_zabolevaniya_legkikh;
  private String  bronzhialnaya_astma;
  private String  dlitelnost_bronkhialnoy_astmy;
  private String  tuberkulez_legkikh_;
  private String  dlitelnost_tuberkuleza_legkikh;
  private String  vich_to_spid;
  private String  dlitelnost_vich_to_spid;
  private String  sovershen1_bally_anamnez;
  private String  regulyarnyy_prim_lekarstvennykh_sredstv;
  private String  lekarstvo__to__davlenie;
  private String  lekarstvo__to__kholesterin;
  private String  lekarstvo__to__insult;
  private String  lekarstvo__to__diabet;
  private String  lekarstvo__to__astma;
  private String  lekarstvo__to__kitay;
  private String  lekarstvo__to__prochie;
  private String  lekarstvo__to__prochie___utochnenie;
  private String  lekarstvo__to__neizvestno;
  private String  perechen_lekarstva;
  private String  travmy_za_god;
  private String  perelomy;
  private String  chislo_perelom;
  private String  let_proshlo;
  private String  status_kureniya;
  private String  vozrast_kureniya;
  private String  sigaret_v_den;
  private String  sigaret_let;
  private String  sigaret_prekr_let;
  private String  sigaret_prekr_mes;
  private String  passivnoe_kurenie;
  private String  chastota_pass_kur;
  private String  alkogol;
  private String  vozrast_alkog;
  private String  vodka_razmer;
  private String  vodka_regulyar;
  private String  vodka_portsiy;
  private String  vodka_let;
  private String  vodka_otkaz_let;
  private String  vino_regulyar;
  private String  vino_portsiy;
  private String  vino_let;
  private String  vino_otkaz_let;
  private String  pivo_razmer;
  private String  pivo_regulyar;
  private String  pivo_portsiy;
  private String  pivo_let;
  private String  pivo_otkaz_let;
  private String  samogon_razmer;
  private String  samogon_regulyar;
  private String  samogon_portsiy;
  private String  samogon_let;
  private String  samogon_otkaz_let;
  private String  kr_vino_regulyar;
  private String  kr_vino_portsiy;
  private String  kr_vino_let;
  private String  kr_vino_otkaz_let;
  private String  pyat_portsiy_v_den;
  private String  pyat_portsiy_dney_v_mes;
  private String  pyat_portsiy_chislo_portsiy;
  private String  vremya_zasypaniya;
  private String  vremya_probuzhdeniya;
  private String  son_posle_obeda;
  private String  sonchas_min;
  private String  sport_kluby;
  private String  sport_chastota_v_mes;
  private String  sport_chastota_v_god;
  private String  religiya_kluby;
  private String  religiya_chastota_v_mes;
  private String  religiya_chastota_v_god;
  private String  prochee_kluby;
  private String  konkretno;
  private String  prochee_chastota_v_mes;
  private String  tip_kryshi;
  private String  elektr_vo;
  private String  tip_topliva;
  private String  istochnik_tepla;
  private String  istochnik_vody;
  private String  vody_net_min;
  private String  moped;
  private String  avtomobil;
  private String  chislo_avto;
  private String  prochie_avto;
  private String  velosiped;
  private String  povozki;
  private String  pk;
  private String  chislo_pk;
  private String  stir_mashina;
  private String  kukh_kombayn;
  private String  kholodilnik;
  private String  televizor;
  private String  chislo_telev;
  private String  stereo;
  private String  telefon;
  private String  gazonokos;
  private String  snegouborsch;
  private String  mikrovolnovka;
  private String  posudomoech;
  private String  obespechennost_byta;
  private String  ezhemes_dokhod;
  private String  dengi_na_pischu;
  private String  dacha;
  private String  ploschad_dachi;
  private String  mesto_dlya_prigot_pischi;
  private String  vytyazhka;
  private String  gotovka_vne_doma_mesyats;
  private String  vopros_10a_to__mesyats;
  private String  vopros_10a_to__5_let;
  private String  vopros_10b_to__mesyats;
  private String  vopros_10b_to__5_let;
  private String  vopros_10c_to__mesyats;
  private String  vopros_10c_to__5_let;
  private String  kvartira;
  private String  dr_kvartira;
  private String  kholodnaya_dacha;
  private String  teplaya_dacha;
  private String  mashina;
  private String  garazh;
  private String  ferma;
  private String  lavka;
  private String  drugoe;
  private String  dr_utochnit;
  private String  chast_dokhoda_na_edu;
  private String  vopros_13;
  private String  dostatok_po_srav_s_drug;
  private String  tip_zhilya;
  private Double  chislo_komnat;
  private String  ploschad_zhilya;
  private String  zhilischnye_usloviya;
  private String fio;
  private String stress_iz_za_finans;
  private Double depressiya;
  private Boolean hasDiagnostic;
  private Boolean requiresAttention;
  private String isSick;
  private Double score;

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public String getStress_iz_za_finans() {
    return stress_iz_za_finans;
  }

  public void setStress_iz_za_finans(String stress_iz_za_finans) {
    this.stress_iz_za_finans = stress_iz_za_finans;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFio() {
    return fio;
  }

  public void setFio(String fio) {
    this.fio = fio;
  }

  public String getData_rozhdeniya() {
    return data_rozhdeniya;
  }

  public void setData_rozhdeniya(String data_rozhdeniya) {
    this.data_rozhdeniya = data_rozhdeniya;
  }

  public String getPol() {
    return pol;
  }

  public void setPol(String pol) {
    this.pol = pol;
  }

  public String getSad1() {
    return sad1;
  }

  public void setSad1(String sad1) {
    this.sad1 = sad1;
  }

  public String getDad1() {
    return dad1;
  }

  public void setDad1(String dad1) {
    this.dad1 = dad1;
  }

  public String getSad2() {
    return sad2;
  }

  public void setSad2(String sad2) {
    this.sad2 = sad2;
  }

  public String getDad2() {
    return dad2;
  }

  public void setDad2(String dad2) {
    this.dad2 = dad2;
  }

  public String getSredn_sad() {
    return sredn_sad;
  }

  public void setSredn_sad(String sredn_sad) {
    this.sredn_sad = sredn_sad;
  }

  public String getSredn_dad() {
    return sredn_dad;
  }

  public void setSredn_dad(String sredn_dad) {
    this.sredn_dad = sredn_dad;
  }

  public String getSredn_raznitsa() {
    return sredn_raznitsa;
  }

  public void setSredn_raznitsa(String sredn_raznitsa) {
    this.sredn_raznitsa = sredn_raznitsa;
  }

  public String getBally_davlenie() {
    return bally_davlenie;
  }

  public void setBally_davlenie(String bally_davlenie) {
    this.bally_davlenie = bally_davlenie;
  }

  public String getChss1() {
    return chss1;
  }

  public void setChss1(String chss1) {
    this.chss1 = chss1;
  }

  public String getChss2() {
    return chss2;
  }

  public void setChss2(String chss2) {
    this.chss2 = chss2;
  }

  public String getSredn_puls() {
    return sredn_puls;
  }

  public void setSredn_puls(String sredn_puls) {
    this.sredn_puls = sredn_puls;
  }

  public String getBally_puls() {
    return bally_puls;
  }

  public void setBally_puls(String bally_puls) {
    this.bally_puls = bally_puls;
  }

  public String getOt1() {
    return ot1;
  }

  public void setOt1(String ot1) {
    this.ot1 = ot1;
  }

  public String getOt2() {
    return ot2;
  }

  public void setOt2(String ot2) {
    this.ot2 = ot2;
  }

  public String getOb1() {
    return ob1;
  }

  public void setOb1(String ob1) {
    this.ob1 = ob1;
  }

  public String getOb2() {
    return ob2;
  }

  public void setOb2(String ob2) {
    this.ob2 = ob2;
  }

  public String getImt() {
    return imt;
  }

  public void setImt(String imt) {
    this.imt = imt;
  }

  public String getBally_imt() {
    return bally_imt;
  }

  public void setBally_imt(String bally_imt) {
    this.bally_imt = bally_imt;
  }

  public String getPlecho() {
    return plecho;
  }

  public void setPlecho(String plecho) {
    this.plecho = plecho;
  }

  public String getGolen() {
    return golen;
  }

  public void setGolen(String golen) {
    this.golen = golen;
  }

  public String getGolova() {
    return golova;
  }

  public void setGolova(String golova) {
    this.golova = golova;
  }

  public String getSila_levaya1() {
    return sila_levaya1;
  }

  public void setSila_levaya1(String sila_levaya1) {
    this.sila_levaya1 = sila_levaya1;
  }

  public String getSila_levaya2() {
    return sila_levaya2;
  }

  public void setSila_levaya2(String sila_levaya2) {
    this.sila_levaya2 = sila_levaya2;
  }

  public String getSila_levaya3() {
    return sila_levaya3;
  }

  public void setSila_levaya3(String sila_levaya3) {
    this.sila_levaya3 = sila_levaya3;
  }

  public String getSila_pravaya1() {
    return sila_pravaya1;
  }

  public void setSila_pravaya1(String sila_pravaya1) {
    this.sila_pravaya1 = sila_pravaya1;
  }

  public String getSila_pravaya2() {
    return sila_pravaya2;
  }

  public void setSila_pravaya2(String sila_pravaya2) {
    this.sila_pravaya2 = sila_pravaya2;
  }

  public String getSila_pravaya3() {
    return sila_pravaya3;
  }

  public void setSila_pravaya3(String sila_pravaya3) {
    this.sila_pravaya3 = sila_pravaya3;
  }

  public String getFev1() {
    return fev1;
  }

  public void setFev1(String fev1) {
    this.fev1 = fev1;
  }

  public String getFev1_proc() {
    return fev1_proc;
  }

  public void setFev1_proc(String fev1_proc) {
    this.fev1_proc = fev1_proc;
  }

  public String getFvc() {
    return fvc;
  }

  public void setFvc(String fvc) {
    this.fvc = fvc;
  }

  public String getFvc_proc() {
    return fvc_proc;
  }

  public void setFvc_proc(String fvc_proc) {
    this.fvc_proc = fvc_proc;
  }

  public String getBally_dykhanie() {
    return bally_dykhanie;
  }

  public void setBally_dykhanie(String bally_dykhanie) {
    this.bally_dykhanie = bally_dykhanie;
  }

  public String getPefr() {
    return pefr;
  }

  public void setPefr(String pefr) {
    this.pefr = pefr;
  }

  public String getPefr_proc() {
    return pefr_proc;
  }

  public void setPefr_proc(String pefr_proc) {
    this.pefr_proc = pefr_proc;
  }

  public String getGlyukoza() {
    return glyukoza;
  }

  public void setGlyukoza(String glyukoza) {
    this.glyukoza = glyukoza;
  }

  public String getBally_glyukoza() {
    return bally_glyukoza;
  }

  public void setBally_glyukoza(String bally_glyukoza) {
    this.bally_glyukoza = bally_glyukoza;
  }

  public String getKholesterin() {
    return kholesterin;
  }

  public void setKholesterin(String kholesterin) {
    this.kholesterin = kholesterin;
  }

  public String getBally_kholesterin() {
    return bally_kholesterin;
  }

  public void setBally_kholesterin(String bally_kholesterin) {
    this.bally_kholesterin = bally_kholesterin;
  }

  public String getTriglitseridy() {
    return triglitseridy;
  }

  public void setTriglitseridy(String triglitseridy) {
    this.triglitseridy = triglitseridy;
  }

  public String getLpvp() {
    return lpvp;
  }

  public void setLpvp(String lpvp) {
    this.lpvp = lpvp;
  }

  public String getBally_lipidy() {
    return bally_lipidy;
  }

  public void setBally_lipidy(String bally_lipidy) {
    this.bally_lipidy = bally_lipidy;
  }

  public String getLpnp() {
    return lpnp;
  }

  public void setLpnp(String lpnp) {
    this.lpnp = lpnp;
  }

  public String getBally_zhiry() {
    return bally_zhiry;
  }

  public void setBally_zhiry(String bally_zhiry) {
    this.bally_zhiry = bally_zhiry;
  }

  public String getNatriy() {
    return natriy;
  }

  public void setNatriy(String natriy) {
    this.natriy = natriy;
  }

  public String getKaliy() {
    return kaliy;
  }

  public void setKaliy(String kaliy) {
    this.kaliy = kaliy;
  }

  public String getBally_elektrolity() {
    return bally_elektrolity;
  }

  public void setBally_elektrolity(String bally_elektrolity) {
    this.bally_elektrolity = bally_elektrolity;
  }

  public String getKreatinin() {
    return kreatinin;
  }

  public void setKreatinin(String kreatinin) {
    this.kreatinin = kreatinin;
  }

  public String getPolnyy_ves_tela() {
    return polnyy_ves_tela;
  }

  public void setPolnyy_ves_tela(String polnyy_ves_tela) {
    this.polnyy_ves_tela = polnyy_ves_tela;
  }

  public String get_proc_zhira() {
    return _proc_zhira;
  }

  public void set_proc_zhira(String _proc_zhira) {
    this._proc_zhira = _proc_zhira;
  }

  public String getBally__proc_zhira() {
    return bally__proc_zhira;
  }

  public void setBally__proc_zhira(String bally__proc_zhira) {
    this.bally__proc_zhira = bally__proc_zhira;
  }

  public String get_proc_vody() {
    return _proc_vody;
  }

  public void set_proc_vody(String _proc_vody) {
    this._proc_vody = _proc_vody;
  }

  public String getBally_voda() {
    return bally_voda;
  }

  public void setBally_voda(String bally_voda) {
    this.bally_voda = bally_voda;
  }

  public String getMyshechnaya_massa() {
    return myshechnaya_massa;
  }

  public void setMyshechnaya_massa(String myshechnaya_massa) {
    this.myshechnaya_massa = myshechnaya_massa;
  }

  public String getBally_myshtsy() {
    return bally_myshtsy;
  }

  public void setBally_myshtsy(String bally_myshtsy) {
    this.bally_myshtsy = bally_myshtsy;
  }

  public String getFiz_sostoyanie() {
    return fiz_sostoyanie;
  }

  public void setFiz_sostoyanie(String fiz_sostoyanie) {
    this.fiz_sostoyanie = fiz_sostoyanie;
  }

  public String getBmr() {
    return bmr;
  }

  public void setBmr(String bmr) {
    this.bmr = bmr;
  }

  public String getMetab_vozrast() {
    return metab_vozrast;
  }

  public void setMetab_vozrast(String metab_vozrast) {
    this.metab_vozrast = metab_vozrast;
  }

  public String getDelta_metabol_i_real() {
    return delta_metabol_i_real;
  }

  public void setDelta_metabol_i_real(String delta_metabol_i_real) {
    this.delta_metabol_i_real = delta_metabol_i_real;
  }

  public String getKost_massa() {
    return kost_massa;
  }

  public void setKost_massa(String kost_massa) {
    this.kost_massa = kost_massa;
  }

  public String getDolya_vnutr_zhira() {
    return dolya_vnutr_zhira;
  }

  public void setDolya_vnutr_zhira(String dolya_vnutr_zhira) {
    this.dolya_vnutr_zhira = dolya_vnutr_zhira;
  }

  public String getPat_zub_q__to__perediy() {
    return pat_zub_q__to__perediy;
  }

  public void setPat_zub_q__to__perediy(String pat_zub_q__to__perediy) {
    this.pat_zub_q__to__perediy = pat_zub_q__to__perediy;
  }

  public String getPat_zub_q__to__nizhniy() {
    return pat_zub_q__to__nizhniy;
  }

  public void setPat_zub_q__to__nizhniy(String pat_zub_q__to__nizhniy) {
    this.pat_zub_q__to__nizhniy = pat_zub_q__to__nizhniy;
  }

  public String getPat_zub_q__to__lateralnyy() {
    return pat_zub_q__to__lateralnyy;
  }

  public void setPat_zub_q__to__lateralnyy(String pat_zub_q__to__lateralnyy) {
    this.pat_zub_q__to__lateralnyy = pat_zub_q__to__lateralnyy;
  }

  public String getPat_zub_q__to__per_lat() {
    return pat_zub_q__to__per_lat;
  }

  public void setPat_zub_q__to__per_lat(String pat_zub_q__to__per_lat) {
    this.pat_zub_q__to__per_lat = pat_zub_q__to__per_lat;
  }

  public String getPat_zub_q__to__zadniy() {
    return pat_zub_q__to__zadniy;
  }

  public void setPat_zub_q__to__zadniy(String pat_zub_q__to__zadniy) {
    this.pat_zub_q__to__zadniy = pat_zub_q__to__zadniy;
  }

  public String getPat_zub_q__to__net() {
    return pat_zub_q__to__net;
  }

  public void setPat_zub_q__to__net(String pat_zub_q__to__net) {
    this.pat_zub_q__to__net = pat_zub_q__to__net;
  }

  public String getElevatsiya_st__to__peredniy() {
    return elevatsiya_st__to__peredniy;
  }

  public void setElevatsiya_st__to__peredniy(String elevatsiya_st__to__peredniy) {
    this.elevatsiya_st__to__peredniy = elevatsiya_st__to__peredniy;
  }

  public String getElevatsiya_st__to__nizhniy() {
    return elevatsiya_st__to__nizhniy;
  }

  public void setElevatsiya_st__to__nizhniy(String elevatsiya_st__to__nizhniy) {
    this.elevatsiya_st__to__nizhniy = elevatsiya_st__to__nizhniy;
  }

  public String getElevatsiya_st__to__lateralnyy() {
    return elevatsiya_st__to__lateralnyy;
  }

  public void setElevatsiya_st__to__lateralnyy(String elevatsiya_st__to__lateralnyy) {
    this.elevatsiya_st__to__lateralnyy = elevatsiya_st__to__lateralnyy;
  }

  public String getElevatsiya_st__to__pered_lat() {
    return elevatsiya_st__to__pered_lat;
  }

  public void setElevatsiya_st__to__pered_lat(String elevatsiya_st__to__pered_lat) {
    this.elevatsiya_st__to__pered_lat = elevatsiya_st__to__pered_lat;
  }

  public String getElevatsiya_st__to__zadniy() {
    return elevatsiya_st__to__zadniy;
  }

  public void setElevatsiya_st__to__zadniy(String elevatsiya_st__to__zadniy) {
    this.elevatsiya_st__to__zadniy = elevatsiya_st__to__zadniy;
  }

  public String getElevatsiya_st__to__net() {
    return elevatsiya_st__to__net;
  }

  public void setElevatsiya_st__to__net(String elevatsiya_st__to__net) {
    this.elevatsiya_st__to__net = elevatsiya_st__to__net;
  }

  public String getDepressiya_st__to__peredniy() {
    return depressiya_st__to__peredniy;
  }

  public void setDepressiya_st__to__peredniy(String depressiya_st__to__peredniy) {
    this.depressiya_st__to__peredniy = depressiya_st__to__peredniy;
  }

  public String getDepressiya_st__to__nizhniy() {
    return depressiya_st__to__nizhniy;
  }

  public void setDepressiya_st__to__nizhniy(String depressiya_st__to__nizhniy) {
    this.depressiya_st__to__nizhniy = depressiya_st__to__nizhniy;
  }

  public String getDepressiya_st__to__lateralnyy() {
    return depressiya_st__to__lateralnyy;
  }

  public void setDepressiya_st__to__lateralnyy(String depressiya_st__to__lateralnyy) {
    this.depressiya_st__to__lateralnyy = depressiya_st__to__lateralnyy;
  }

  public String getDepressiya_st__to__pered_lat() {
    return depressiya_st__to__pered_lat;
  }

  public void setDepressiya_st__to__pered_lat(String depressiya_st__to__pered_lat) {
    this.depressiya_st__to__pered_lat = depressiya_st__to__pered_lat;
  }

  public String getDepressiya_st__to__zadniy() {
    return depressiya_st__to__zadniy;
  }

  public void setDepressiya_st__to__zadniy(String depressiya_st__to__zadniy) {
    this.depressiya_st__to__zadniy = depressiya_st__to__zadniy;
  }

  public String getDepressiya_st__to__net() {
    return depressiya_st__to__net;
  }

  public void setDepressiya_st__to__net(String depressiya_st__to__net) {
    this.depressiya_st__to__net = depressiya_st__to__net;
  }

  public String getInversiya_t__to__peredniy() {
    return inversiya_t__to__peredniy;
  }

  public void setInversiya_t__to__peredniy(String inversiya_t__to__peredniy) {
    this.inversiya_t__to__peredniy = inversiya_t__to__peredniy;
  }

  public String getInversiya_t__to__nizhniy() {
    return inversiya_t__to__nizhniy;
  }

  public void setInversiya_t__to__nizhniy(String inversiya_t__to__nizhniy) {
    this.inversiya_t__to__nizhniy = inversiya_t__to__nizhniy;
  }

  public String getInversiya_t__to__lateralnyy() {
    return inversiya_t__to__lateralnyy;
  }

  public void setInversiya_t__to__lateralnyy(String inversiya_t__to__lateralnyy) {
    this.inversiya_t__to__lateralnyy = inversiya_t__to__lateralnyy;
  }

  public String getInversiya_t__to__pered_lat() {
    return inversiya_t__to__pered_lat;
  }

  public void setInversiya_t__to__pered_lat(String inversiya_t__to__pered_lat) {
    this.inversiya_t__to__pered_lat = inversiya_t__to__pered_lat;
  }

  public String getInversiya_t__to__zadniy() {
    return inversiya_t__to__zadniy;
  }

  public void setInversiya_t__to__zadniy(String inversiya_t__to__zadniy) {
    this.inversiya_t__to__zadniy = inversiya_t__to__zadniy;
  }

  public String getInversiya_t__to__net() {
    return inversiya_t__to__net;
  }

  public void setInversiya_t__to__net(String inversiya_t__to__net) {
    this.inversiya_t__to__net = inversiya_t__to__net;
  }

  public String getR_more_s() {
    return r_more_s;
  }

  public void setR_more_s(String r_more_s) {
    this.r_more_s = r_more_s;
  }

  public String getGipertrofiya_lzh() {
    return gipertrofiya_lzh;
  }

  public void setGipertrofiya_lzh(String gipertrofiya_lzh) {
    this.gipertrofiya_lzh = gipertrofiya_lzh;
  }

  public String getVoltazhnye_kriterii() {
    return voltazhnye_kriterii;
  }

  public void setVoltazhnye_kriterii(String voltazhnye_kriterii) {
    this.voltazhnye_kriterii = voltazhnye_kriterii;
  }

  public String getDepr_st__to__inver_t() {
    return depr_st__to__inver_t;
  }

  public void setDepr_st__to__inver_t(String depr_st__to__inver_t) {
    this.depr_st__to__inver_t = depr_st__to__inver_t;
  }

  public String getOtklonenie_el_osi() {
    return otklonenie_el_osi;
  }

  public void setOtklonenie_el_osi(String otklonenie_el_osi) {
    this.otklonenie_el_osi = otklonenie_el_osi;
  }

  public String getBally_ekg() {
    return bally_ekg;
  }

  public void setBally_ekg(String bally_ekg) {
    this.bally_ekg = bally_ekg;
  }

  public String getNarushenie_provodimosti() {
    return narushenie_provodimosti;
  }

  public void setNarushenie_provodimosti(String narushenie_provodimosti) {
    this.narushenie_provodimosti = narushenie_provodimosti;
  }

  public String getUtochnenie() {
    return utochnenie;
  }

  public void setUtochnenie(String utochnenie) {
    this.utochnenie = utochnenie;
  }

  public String getQ_t() {
    return q_t;
  }

  public void setQ_t(String q_t) {
    this.q_t = q_t;
  }

  public String getBally_qt() {
    return bally_qt;
  }

  public void setBally_qt(String bally_qt) {
    this.bally_qt = bally_qt;
  }

  public String getAnomalnyy_ritm() {
    return anomalnyy_ritm;
  }

  public void setAnomalnyy_ritm(String anomalnyy_ritm) {
    this.anomalnyy_ritm = anomalnyy_ritm;
  }

  public String getBally_ritm() {
    return bally_ritm;
  }

  public void setBally_ritm(String bally_ritm) {
    this.bally_ritm = bally_ritm;
  }

  public String getDrugie_anomalii() {
    return drugie_anomalii;
  }

  public void setDrugie_anomalii(String drugie_anomalii) {
    this.drugie_anomalii = drugie_anomalii;
  }

  public String getBally_anomalii() {
    return bally_anomalii;
  }

  public void setBally_anomalii(String bally_anomalii) {
    this.bally_anomalii = bally_anomalii;
  }

  public String getZdorove() {
    return zdorove;
  }

  public void setZdorove(String zdorove) {
    this.zdorove = zdorove;
  }

  public String getObsled_bally_anamnez() {
    return obsled_bally_anamnez;
  }

  public void setObsled_bally_anamnez(String obsled_bally_anamnez) {
    this.obsled_bally_anamnez = obsled_bally_anamnez;
  }

  public String getItog() {
    return itog;
  }

  public void setItog(String itog) {
    this.itog = itog;
  }

  public String getSemya() {
    return semya;
  }

  public void setSemya(String semya) {
    this.semya = semya;
  }

  public String getEtnos() {
    return etnos;
  }

  public void setEtnos(String etnos) {
    this.etnos = etnos;
  }

  public String getNatsionalnost() {
    return natsionalnost;
  }

  public void setNatsionalnost(String natsionalnost) {
    this.natsionalnost = natsionalnost;
  }

  public String getReligiya() {
    return religiya;
  }

  public void setReligiya(String religiya) {
    this.religiya = religiya;
  }

  public String getObrazovanie() {
    return obrazovanie;
  }

  public void setObrazovanie(String obrazovanie) {
    this.obrazovanie = obrazovanie;
  }

  public String getProfessiya() {
    return professiya;
  }

  public void setProfessiya(String professiya) {
    this.professiya = professiya;
  }

  public String getVykhod_na_pensiyu() {
    return vykhod_na_pensiyu;
  }

  public void setVykhod_na_pensiyu(String vykhod_na_pensiyu) {
    this.vykhod_na_pensiyu = vykhod_na_pensiyu;
  }

  public String getPrekraschenie_raboty_po_bolezni() {
    return prekraschenie_raboty_po_bolezni;
  }

  public void setPrekraschenie_raboty_po_bolezni(String prekraschenie_raboty_po_bolezni) {
    this.prekraschenie_raboty_po_bolezni = prekraschenie_raboty_po_bolezni;
  }

  public String getSakharnyy_diabet() {
    return sakharnyy_diabet;
  }

  public void setSakharnyy_diabet(String sakharnyy_diabet) {
    this.sakharnyy_diabet = sakharnyy_diabet;
  }

  public String getDlitelnost_sakharnogo_diabeta() {
    return dlitelnost_sakharnogo_diabeta;
  }

  public void setDlitelnost_sakharnogo_diabeta(String dlitelnost_sakharnogo_diabeta) {
    this.dlitelnost_sakharnogo_diabeta = dlitelnost_sakharnogo_diabeta;
  }

  public Double getArterialnaya_gipertenziya() {
    return arterialnaya_gipertenziya;
  }

  public void setArterialnaya_gipertenziya(Double arterialnaya_gipertenziya) {
    this.arterialnaya_gipertenziya = arterialnaya_gipertenziya;
  }

  public String getDlitelnost_arterialnoy_gipertenzii() {
    return dlitelnost_arterialnoy_gipertenzii;
  }

  public void setDlitelnost_arterialnoy_gipertenzii(String dlitelnost_arterialnoy_gipertenzii) {
    this.dlitelnost_arterialnoy_gipertenzii = dlitelnost_arterialnoy_gipertenzii;
  }


  public String getDanost_onmk() {
    return danost_onmk;
  }

  public void setDanost_onmk(String danost_onmk) {
    this.danost_onmk = danost_onmk;
  }


  public String getDlitelnost_stenokardii_ibs_infarkta_miokarda() {
    return dlitelnost_stenokardii_ibs_infarkta_miokarda;
  }

  public void setDlitelnost_stenokardii_ibs_infarkta_miokarda(String dlitelnost_stenokardii_ibs_infarkta_miokarda) {
    this.dlitelnost_stenokardii_ibs_infarkta_miokarda = dlitelnost_stenokardii_ibs_infarkta_miokarda;
  }


  public String getDlitelnost_serdechnoy_nedostatochnosti() {
    return dlitelnost_serdechnoy_nedostatochnosti;
  }

  public void setDlitelnost_serdechnoy_nedostatochnosti(String dlitelnost_serdechnoy_nedostatochnosti) {
    this.dlitelnost_serdechnoy_nedostatochnosti = dlitelnost_serdechnoy_nedostatochnosti;
  }

  public Double getOnmk() {
    return onmk;
  }

  public void setOnmk(Double onmk) {
    this.onmk = onmk;
  }

  public Double getStenokardiya_ibs_infarkt_miokarda() {
    return stenokardiya_ibs_infarkt_miokarda;
  }

  public void setStenokardiya_ibs_infarkt_miokarda(Double stenokardiya_ibs_infarkt_miokarda) {
    this.stenokardiya_ibs_infarkt_miokarda = stenokardiya_ibs_infarkt_miokarda;
  }

  public Double getSerdechnaya_nedostatochnost() {
    return serdechnaya_nedostatochnost;
  }

  public void setSerdechnaya_nedostatochnost(Double serdechnaya_nedostatochnost) {
    this.serdechnaya_nedostatochnost = serdechnaya_nedostatochnost;
  }

  public Double getProchie_zabolevaniya_serdtsa() {
    return prochie_zabolevaniya_serdtsa;
  }

  public void setProchie_zabolevaniya_serdtsa(Double prochie_zabolevaniya_serdtsa) {
    this.prochie_zabolevaniya_serdtsa = prochie_zabolevaniya_serdtsa;
  }

  public String getDlitelnost_prochikh_zabolevaniy_serdtsa() {
    return dlitelnost_prochikh_zabolevaniy_serdtsa;
  }

  public void setDlitelnost_prochikh_zabolevaniy_serdtsa(String dlitelnost_prochikh_zabolevaniy_serdtsa) {
    this.dlitelnost_prochikh_zabolevaniy_serdtsa = dlitelnost_prochikh_zabolevaniy_serdtsa;
  }

  public String getGepetit() {
    return gepetit;
  }

  public void setGepetit(String gepetit) {
    this.gepetit = gepetit;
  }

  public String getDlitelnost_gepatita_() {
    return dlitelnost_gepatita_;
  }

  public void setDlitelnost_gepatita_(String dlitelnost_gepatita_) {
    this.dlitelnost_gepatita_ = dlitelnost_gepatita_;
  }

  public String getOnkologiya() {
    return onkologiya;
  }

  public void setOnkologiya(String onkologiya) {
    this.onkologiya = onkologiya;
  }

  public String getOnkologiya_lok_ya() {
    return onkologiya_lok_ya;
  }

  public void setOnkologiya_lok_ya(String onkologiya_lok_ya) {
    this.onkologiya_lok_ya = onkologiya_lok_ya;
  }

  public String getDlitelnost_onkologicheskogo_protsessa() {
    return dlitelnost_onkologicheskogo_protsessa;
  }

  public void setDlitelnost_onkologicheskogo_protsessa(String dlitelnost_onkologicheskogo_protsessa) {
    this.dlitelnost_onkologicheskogo_protsessa = dlitelnost_onkologicheskogo_protsessa;
  }

  public String getKhronicheskoe_zabolevanie_legkikh() {
    return khronicheskoe_zabolevanie_legkikh;
  }

  public void setKhronicheskoe_zabolevanie_legkikh(String khronicheskoe_zabolevanie_legkikh) {
    this.khronicheskoe_zabolevanie_legkikh = khronicheskoe_zabolevanie_legkikh;
  }

  public String getDlitelnost_khron_zabolevaniya_legkikh() {
    return dlitelnost_khron_zabolevaniya_legkikh;
  }

  public void setDlitelnost_khron_zabolevaniya_legkikh(String dlitelnost_khron_zabolevaniya_legkikh) {
    this.dlitelnost_khron_zabolevaniya_legkikh = dlitelnost_khron_zabolevaniya_legkikh;
  }

  public String getBronzhialnaya_astma() {
    return bronzhialnaya_astma;
  }

  public void setBronzhialnaya_astma(String bronzhialnaya_astma) {
    this.bronzhialnaya_astma = bronzhialnaya_astma;
  }

  public String getDlitelnost_bronkhialnoy_astmy() {
    return dlitelnost_bronkhialnoy_astmy;
  }

  public void setDlitelnost_bronkhialnoy_astmy(String dlitelnost_bronkhialnoy_astmy) {
    this.dlitelnost_bronkhialnoy_astmy = dlitelnost_bronkhialnoy_astmy;
  }

  public String getTuberkulez_legkikh_() {
    return tuberkulez_legkikh_;
  }

  public void setTuberkulez_legkikh_(String tuberkulez_legkikh_) {
    this.tuberkulez_legkikh_ = tuberkulez_legkikh_;
  }

  public String getDlitelnost_tuberkuleza_legkikh() {
    return dlitelnost_tuberkuleza_legkikh;
  }

  public void setDlitelnost_tuberkuleza_legkikh(String dlitelnost_tuberkuleza_legkikh) {
    this.dlitelnost_tuberkuleza_legkikh = dlitelnost_tuberkuleza_legkikh;
  }

  public String getVich_to_spid() {
    return vich_to_spid;
  }

  public void setVich_to_spid(String vich_to_spid) {
    this.vich_to_spid = vich_to_spid;
  }

  public String getDlitelnost_vich_to_spid() {
    return dlitelnost_vich_to_spid;
  }

  public void setDlitelnost_vich_to_spid(String dlitelnost_vich_to_spid) {
    this.dlitelnost_vich_to_spid = dlitelnost_vich_to_spid;
  }

  public String getSovershen1_bally_anamnez() {
    return sovershen1_bally_anamnez;
  }

  public void setSovershen1_bally_anamnez(String sovershen1_bally_anamnez) {
    this.sovershen1_bally_anamnez = sovershen1_bally_anamnez;
  }

  public String getRegulyarnyy_prim_lekarstvennykh_sredstv() {
    return regulyarnyy_prim_lekarstvennykh_sredstv;
  }

  public void setRegulyarnyy_prim_lekarstvennykh_sredstv(String regulyarnyy_prim_lekarstvennykh_sredstv) {
    this.regulyarnyy_prim_lekarstvennykh_sredstv = regulyarnyy_prim_lekarstvennykh_sredstv;
  }

  public String getLekarstvo__to__davlenie() {
    return lekarstvo__to__davlenie;
  }

  public void setLekarstvo__to__davlenie(String lekarstvo__to__davlenie) {
    this.lekarstvo__to__davlenie = lekarstvo__to__davlenie;
  }

  public String getLekarstvo__to__kholesterin() {
    return lekarstvo__to__kholesterin;
  }

  public void setLekarstvo__to__kholesterin(String lekarstvo__to__kholesterin) {
    this.lekarstvo__to__kholesterin = lekarstvo__to__kholesterin;
  }

  public String getLekarstvo__to__insult() {
    return lekarstvo__to__insult;
  }

  public void setLekarstvo__to__insult(String lekarstvo__to__insult) {
    this.lekarstvo__to__insult = lekarstvo__to__insult;
  }

  public String getLekarstvo__to__diabet() {
    return lekarstvo__to__diabet;
  }

  public void setLekarstvo__to__diabet(String lekarstvo__to__diabet) {
    this.lekarstvo__to__diabet = lekarstvo__to__diabet;
  }

  public String getLekarstvo__to__astma() {
    return lekarstvo__to__astma;
  }

  public void setLekarstvo__to__astma(String lekarstvo__to__astma) {
    this.lekarstvo__to__astma = lekarstvo__to__astma;
  }

  public String getLekarstvo__to__kitay() {
    return lekarstvo__to__kitay;
  }

  public void setLekarstvo__to__kitay(String lekarstvo__to__kitay) {
    this.lekarstvo__to__kitay = lekarstvo__to__kitay;
  }

  public String getLekarstvo__to__prochie() {
    return lekarstvo__to__prochie;
  }

  public void setLekarstvo__to__prochie(String lekarstvo__to__prochie) {
    this.lekarstvo__to__prochie = lekarstvo__to__prochie;
  }

  public String getLekarstvo__to__prochie___utochnenie() {
    return lekarstvo__to__prochie___utochnenie;
  }

  public void setLekarstvo__to__prochie___utochnenie(String lekarstvo__to__prochie___utochnenie) {
    this.lekarstvo__to__prochie___utochnenie = lekarstvo__to__prochie___utochnenie;
  }

  public String getLekarstvo__to__neizvestno() {
    return lekarstvo__to__neizvestno;
  }

  public void setLekarstvo__to__neizvestno(String lekarstvo__to__neizvestno) {
    this.lekarstvo__to__neizvestno = lekarstvo__to__neizvestno;
  }

  public String getPerechen_lekarstva() {
    return perechen_lekarstva;
  }

  public void setPerechen_lekarstva(String perechen_lekarstva) {
    this.perechen_lekarstva = perechen_lekarstva;
  }

  public String getTravmy_za_god() {
    return travmy_za_god;
  }

  public void setTravmy_za_god(String travmy_za_god) {
    this.travmy_za_god = travmy_za_god;
  }

  public String getPerelomy() {
    return perelomy;
  }

  public void setPerelomy(String perelomy) {
    this.perelomy = perelomy;
  }

  public String getChislo_perelom() {
    return chislo_perelom;
  }

  public void setChislo_perelom(String chislo_perelom) {
    this.chislo_perelom = chislo_perelom;
  }

  public String getLet_proshlo() {
    return let_proshlo;
  }

  public void setLet_proshlo(String let_proshlo) {
    this.let_proshlo = let_proshlo;
  }

  public String getStatus_kureniya() {
    return status_kureniya;
  }

  public void setStatus_kureniya(String status_kureniya) {
    this.status_kureniya = status_kureniya;
  }

  public String getVozrast_kureniya() {
    return vozrast_kureniya;
  }

  public void setVozrast_kureniya(String vozrast_kureniya) {
    this.vozrast_kureniya = vozrast_kureniya;
  }

  public String getSigaret_v_den() {
    return sigaret_v_den;
  }

  public void setSigaret_v_den(String sigaret_v_den) {
    this.sigaret_v_den = sigaret_v_den;
  }

  public String getSigaret_let() {
    return sigaret_let;
  }

  public void setSigaret_let(String sigaret_let) {
    this.sigaret_let = sigaret_let;
  }

  public String getSigaret_prekr_let() {
    return sigaret_prekr_let;
  }

  public void setSigaret_prekr_let(String sigaret_prekr_let) {
    this.sigaret_prekr_let = sigaret_prekr_let;
  }

  public String getSigaret_prekr_mes() {
    return sigaret_prekr_mes;
  }

  public void setSigaret_prekr_mes(String sigaret_prekr_mes) {
    this.sigaret_prekr_mes = sigaret_prekr_mes;
  }

  public String getPassivnoe_kurenie() {
    return passivnoe_kurenie;
  }

  public void setPassivnoe_kurenie(String passivnoe_kurenie) {
    this.passivnoe_kurenie = passivnoe_kurenie;
  }

  public String getChastota_pass_kur() {
    return chastota_pass_kur;
  }

  public void setChastota_pass_kur(String chastota_pass_kur) {
    this.chastota_pass_kur = chastota_pass_kur;
  }

  public String getAlkogol() {
    return alkogol;
  }

  public void setAlkogol(String alkogol) {
    this.alkogol = alkogol;
  }

  public String getVozrast_alkog() {
    return vozrast_alkog;
  }

  public void setVozrast_alkog(String vozrast_alkog) {
    this.vozrast_alkog = vozrast_alkog;
  }

  public String getVodka_razmer() {
    return vodka_razmer;
  }

  public void setVodka_razmer(String vodka_razmer) {
    this.vodka_razmer = vodka_razmer;
  }

  public String getVodka_regulyar() {
    return vodka_regulyar;
  }

  public void setVodka_regulyar(String vodka_regulyar) {
    this.vodka_regulyar = vodka_regulyar;
  }

  public String getVodka_portsiy() {
    return vodka_portsiy;
  }

  public void setVodka_portsiy(String vodka_portsiy) {
    this.vodka_portsiy = vodka_portsiy;
  }

  public String getVodka_let() {
    return vodka_let;
  }

  public void setVodka_let(String vodka_let) {
    this.vodka_let = vodka_let;
  }

  public String getVodka_otkaz_let() {
    return vodka_otkaz_let;
  }

  public void setVodka_otkaz_let(String vodka_otkaz_let) {
    this.vodka_otkaz_let = vodka_otkaz_let;
  }

  public String getVino_regulyar() {
    return vino_regulyar;
  }

  public void setVino_regulyar(String vino_regulyar) {
    this.vino_regulyar = vino_regulyar;
  }

  public String getVino_portsiy() {
    return vino_portsiy;
  }

  public void setVino_portsiy(String vino_portsiy) {
    this.vino_portsiy = vino_portsiy;
  }

  public String getVino_let() {
    return vino_let;
  }

  public void setVino_let(String vino_let) {
    this.vino_let = vino_let;
  }

  public String getVino_otkaz_let() {
    return vino_otkaz_let;
  }

  public void setVino_otkaz_let(String vino_otkaz_let) {
    this.vino_otkaz_let = vino_otkaz_let;
  }

  public String getPivo_razmer() {
    return pivo_razmer;
  }

  public void setPivo_razmer(String pivo_razmer) {
    this.pivo_razmer = pivo_razmer;
  }

  public String getPivo_regulyar() {
    return pivo_regulyar;
  }

  public void setPivo_regulyar(String pivo_regulyar) {
    this.pivo_regulyar = pivo_regulyar;
  }

  public String getPivo_portsiy() {
    return pivo_portsiy;
  }

  public void setPivo_portsiy(String pivo_portsiy) {
    this.pivo_portsiy = pivo_portsiy;
  }

  public String getPivo_let() {
    return pivo_let;
  }

  public void setPivo_let(String pivo_let) {
    this.pivo_let = pivo_let;
  }

  public String getPivo_otkaz_let() {
    return pivo_otkaz_let;
  }

  public void setPivo_otkaz_let(String pivo_otkaz_let) {
    this.pivo_otkaz_let = pivo_otkaz_let;
  }

  public String getSamogon_razmer() {
    return samogon_razmer;
  }

  public void setSamogon_razmer(String samogon_razmer) {
    this.samogon_razmer = samogon_razmer;
  }

  public String getSamogon_regulyar() {
    return samogon_regulyar;
  }

  public void setSamogon_regulyar(String samogon_regulyar) {
    this.samogon_regulyar = samogon_regulyar;
  }

  public String getSamogon_portsiy() {
    return samogon_portsiy;
  }

  public void setSamogon_portsiy(String samogon_portsiy) {
    this.samogon_portsiy = samogon_portsiy;
  }

  public String getSamogon_let() {
    return samogon_let;
  }

  public void setSamogon_let(String samogon_let) {
    this.samogon_let = samogon_let;
  }

  public String getSamogon_otkaz_let() {
    return samogon_otkaz_let;
  }

  public void setSamogon_otkaz_let(String samogon_otkaz_let) {
    this.samogon_otkaz_let = samogon_otkaz_let;
  }

  public String getKr_vino_regulyar() {
    return kr_vino_regulyar;
  }

  public void setKr_vino_regulyar(String kr_vino_regulyar) {
    this.kr_vino_regulyar = kr_vino_regulyar;
  }

  public String getKr_vino_portsiy() {
    return kr_vino_portsiy;
  }

  public void setKr_vino_portsiy(String kr_vino_portsiy) {
    this.kr_vino_portsiy = kr_vino_portsiy;
  }

  public String getKr_vino_let() {
    return kr_vino_let;
  }

  public void setKr_vino_let(String kr_vino_let) {
    this.kr_vino_let = kr_vino_let;
  }

  public String getKr_vino_otkaz_let() {
    return kr_vino_otkaz_let;
  }

  public void setKr_vino_otkaz_let(String kr_vino_otkaz_let) {
    this.kr_vino_otkaz_let = kr_vino_otkaz_let;
  }

  public String getPyat_portsiy_v_den() {
    return pyat_portsiy_v_den;
  }

  public void setPyat_portsiy_v_den(String pyat_portsiy_v_den) {
    this.pyat_portsiy_v_den = pyat_portsiy_v_den;
  }

  public String getPyat_portsiy_dney_v_mes() {
    return pyat_portsiy_dney_v_mes;
  }

  public void setPyat_portsiy_dney_v_mes(String pyat_portsiy_dney_v_mes) {
    this.pyat_portsiy_dney_v_mes = pyat_portsiy_dney_v_mes;
  }

  public String getPyat_portsiy_chislo_portsiy() {
    return pyat_portsiy_chislo_portsiy;
  }

  public void setPyat_portsiy_chislo_portsiy(String pyat_portsiy_chislo_portsiy) {
    this.pyat_portsiy_chislo_portsiy = pyat_portsiy_chislo_portsiy;
  }

  public String getVremya_zasypaniya() {
    return vremya_zasypaniya;
  }

  public void setVremya_zasypaniya(String vremya_zasypaniya) {
    this.vremya_zasypaniya = vremya_zasypaniya;
  }

  public String getVremya_probuzhdeniya() {
    return vremya_probuzhdeniya;
  }

  public void setVremya_probuzhdeniya(String vremya_probuzhdeniya) {
    this.vremya_probuzhdeniya = vremya_probuzhdeniya;
  }

  public String getSon_posle_obeda() {
    return son_posle_obeda;
  }

  public void setSon_posle_obeda(String son_posle_obeda) {
    this.son_posle_obeda = son_posle_obeda;
  }

  public String getSonchas_min() {
    return sonchas_min;
  }

  public void setSonchas_min(String sonchas_min) {
    this.sonchas_min = sonchas_min;
  }

  public String getSport_kluby() {
    return sport_kluby;
  }

  public void setSport_kluby(String sport_kluby) {
    this.sport_kluby = sport_kluby;
  }

  public String getSport_chastota_v_mes() {
    return sport_chastota_v_mes;
  }

  public void setSport_chastota_v_mes(String sport_chastota_v_mes) {
    this.sport_chastota_v_mes = sport_chastota_v_mes;
  }

  public String getSport_chastota_v_god() {
    return sport_chastota_v_god;
  }

  public void setSport_chastota_v_god(String sport_chastota_v_god) {
    this.sport_chastota_v_god = sport_chastota_v_god;
  }

  public String getReligiya_kluby() {
    return religiya_kluby;
  }

  public void setReligiya_kluby(String religiya_kluby) {
    this.religiya_kluby = religiya_kluby;
  }

  public String getReligiya_chastota_v_mes() {
    return religiya_chastota_v_mes;
  }

  public void setReligiya_chastota_v_mes(String religiya_chastota_v_mes) {
    this.religiya_chastota_v_mes = religiya_chastota_v_mes;
  }

  public String getReligiya_chastota_v_god() {
    return religiya_chastota_v_god;
  }

  public void setReligiya_chastota_v_god(String religiya_chastota_v_god) {
    this.religiya_chastota_v_god = religiya_chastota_v_god;
  }

  public String getProchee_kluby() {
    return prochee_kluby;
  }

  public void setProchee_kluby(String prochee_kluby) {
    this.prochee_kluby = prochee_kluby;
  }

  public String getKonkretno() {
    return konkretno;
  }

  public void setKonkretno(String konkretno) {
    this.konkretno = konkretno;
  }

  public String getProchee_chastota_v_mes() {
    return prochee_chastota_v_mes;
  }

  public void setProchee_chastota_v_mes(String prochee_chastota_v_mes) {
    this.prochee_chastota_v_mes = prochee_chastota_v_mes;
  }

  public String getTip_kryshi() {
    return tip_kryshi;
  }

  public void setTip_kryshi(String tip_kryshi) {
    this.tip_kryshi = tip_kryshi;
  }

  public String getElektr_vo() {
    return elektr_vo;
  }

  public void setElektr_vo(String elektr_vo) {
    this.elektr_vo = elektr_vo;
  }

  public String getTip_topliva() {
    return tip_topliva;
  }

  public void setTip_topliva(String tip_topliva) {
    this.tip_topliva = tip_topliva;
  }

  public String getIstochnik_tepla() {
    return istochnik_tepla;
  }

  public void setIstochnik_tepla(String istochnik_tepla) {
    this.istochnik_tepla = istochnik_tepla;
  }

  public String getIstochnik_vody() {
    return istochnik_vody;
  }

  public void setIstochnik_vody(String istochnik_vody) {
    this.istochnik_vody = istochnik_vody;
  }

  public String getVody_net_min() {
    return vody_net_min;
  }

  public void setVody_net_min(String vody_net_min) {
    this.vody_net_min = vody_net_min;
  }

  public String getMoped() {
    return moped;
  }

  public void setMoped(String moped) {
    this.moped = moped;
  }

  public String getAvtomobil() {
    return avtomobil;
  }

  public void setAvtomobil(String avtomobil) {
    this.avtomobil = avtomobil;
  }

  public String getChislo_avto() {
    return chislo_avto;
  }

  public void setChislo_avto(String chislo_avto) {
    this.chislo_avto = chislo_avto;
  }

  public String getProchie_avto() {
    return prochie_avto;
  }

  public void setProchie_avto(String prochie_avto) {
    this.prochie_avto = prochie_avto;
  }

  public String getVelosiped() {
    return velosiped;
  }

  public void setVelosiped(String velosiped) {
    this.velosiped = velosiped;
  }

  public String getPovozki() {
    return povozki;
  }

  public void setPovozki(String povozki) {
    this.povozki = povozki;
  }

  public String getPk() {
    return pk;
  }

  public void setPk(String pk) {
    this.pk = pk;
  }

  public String getChislo_pk() {
    return chislo_pk;
  }

  public void setChislo_pk(String chislo_pk) {
    this.chislo_pk = chislo_pk;
  }

  public String getStir_mashina() {
    return stir_mashina;
  }

  public void setStir_mashina(String stir_mashina) {
    this.stir_mashina = stir_mashina;
  }

  public String getKukh_kombayn() {
    return kukh_kombayn;
  }

  public void setKukh_kombayn(String kukh_kombayn) {
    this.kukh_kombayn = kukh_kombayn;
  }

  public String getKholodilnik() {
    return kholodilnik;
  }

  public void setKholodilnik(String kholodilnik) {
    this.kholodilnik = kholodilnik;
  }

  public String getTelevizor() {
    return televizor;
  }

  public void setTelevizor(String televizor) {
    this.televizor = televizor;
  }

  public String getChislo_telev() {
    return chislo_telev;
  }

  public void setChislo_telev(String chislo_telev) {
    this.chislo_telev = chislo_telev;
  }

  public String getStereo() {
    return stereo;
  }

  public void setStereo(String stereo) {
    this.stereo = stereo;
  }

  public String getTelefon() {
    return telefon;
  }

  public void setTelefon(String telefon) {
    this.telefon = telefon;
  }

  public String getGazonokos() {
    return gazonokos;
  }

  public void setGazonokos(String gazonokos) {
    this.gazonokos = gazonokos;
  }

  public String getSnegouborsch() {
    return snegouborsch;
  }

  public void setSnegouborsch(String snegouborsch) {
    this.snegouborsch = snegouborsch;
  }

  public String getMikrovolnovka() {
    return mikrovolnovka;
  }

  public void setMikrovolnovka(String mikrovolnovka) {
    this.mikrovolnovka = mikrovolnovka;
  }

  public String getPosudomoech() {
    return posudomoech;
  }

  public void setPosudomoech(String posudomoech) {
    this.posudomoech = posudomoech;
  }

  public String getObespechennost_byta() {
    return obespechennost_byta;
  }

  public void setObespechennost_byta(String obespechennost_byta) {
    this.obespechennost_byta = obespechennost_byta;
  }

  public String getEzhemes_dokhod() {
    return ezhemes_dokhod;
  }

  public void setEzhemes_dokhod(String ezhemes_dokhod) {
    this.ezhemes_dokhod = ezhemes_dokhod;
  }

  public String getDengi_na_pischu() {
    return dengi_na_pischu;
  }

  public void setDengi_na_pischu(String dengi_na_pischu) {
    this.dengi_na_pischu = dengi_na_pischu;
  }

  public String getDacha() {
    return dacha;
  }

  public void setDacha(String dacha) {
    this.dacha = dacha;
  }

  public String getPloschad_dachi() {
    return ploschad_dachi;
  }

  public void setPloschad_dachi(String ploschad_dachi) {
    this.ploschad_dachi = ploschad_dachi;
  }

  public String getMesto_dlya_prigot_pischi() {
    return mesto_dlya_prigot_pischi;
  }

  public void setMesto_dlya_prigot_pischi(String mesto_dlya_prigot_pischi) {
    this.mesto_dlya_prigot_pischi = mesto_dlya_prigot_pischi;
  }

  public String getVytyazhka() {
    return vytyazhka;
  }

  public void setVytyazhka(String vytyazhka) {
    this.vytyazhka = vytyazhka;
  }

  public String getGotovka_vne_doma_mesyats() {
    return gotovka_vne_doma_mesyats;
  }

  public void setGotovka_vne_doma_mesyats(String gotovka_vne_doma_mesyats) {
    this.gotovka_vne_doma_mesyats = gotovka_vne_doma_mesyats;
  }

  public String getVopros_10a_to__mesyats() {
    return vopros_10a_to__mesyats;
  }

  public void setVopros_10a_to__mesyats(String vopros_10a_to__mesyats) {
    this.vopros_10a_to__mesyats = vopros_10a_to__mesyats;
  }

  public String getVopros_10a_to__5_let() {
    return vopros_10a_to__5_let;
  }

  public void setVopros_10a_to__5_let(String vopros_10a_to__5_let) {
    this.vopros_10a_to__5_let = vopros_10a_to__5_let;
  }

  public String getVopros_10b_to__mesyats() {
    return vopros_10b_to__mesyats;
  }

  public void setVopros_10b_to__mesyats(String vopros_10b_to__mesyats) {
    this.vopros_10b_to__mesyats = vopros_10b_to__mesyats;
  }

  public String getVopros_10b_to__5_let() {
    return vopros_10b_to__5_let;
  }

  public void setVopros_10b_to__5_let(String vopros_10b_to__5_let) {
    this.vopros_10b_to__5_let = vopros_10b_to__5_let;
  }

  public String getVopros_10c_to__mesyats() {
    return vopros_10c_to__mesyats;
  }

  public void setVopros_10c_to__mesyats(String vopros_10c_to__mesyats) {
    this.vopros_10c_to__mesyats = vopros_10c_to__mesyats;
  }

  public String getVopros_10c_to__5_let() {
    return vopros_10c_to__5_let;
  }

  public void setVopros_10c_to__5_let(String vopros_10c_to__5_let) {
    this.vopros_10c_to__5_let = vopros_10c_to__5_let;
  }

  public String getKvartira() {
    return kvartira;
  }

  public void setKvartira(String kvartira) {
    this.kvartira = kvartira;
  }

  public String getDr_kvartira() {
    return dr_kvartira;
  }

  public void setDr_kvartira(String dr_kvartira) {
    this.dr_kvartira = dr_kvartira;
  }

  public String getKholodnaya_dacha() {
    return kholodnaya_dacha;
  }

  public void setKholodnaya_dacha(String kholodnaya_dacha) {
    this.kholodnaya_dacha = kholodnaya_dacha;
  }

  public String getTeplaya_dacha() {
    return teplaya_dacha;
  }

  public void setTeplaya_dacha(String teplaya_dacha) {
    this.teplaya_dacha = teplaya_dacha;
  }

  public String getMashina() {
    return mashina;
  }

  public void setMashina(String mashina) {
    this.mashina = mashina;
  }

  public String getGarazh() {
    return garazh;
  }

  public void setGarazh(String garazh) {
    this.garazh = garazh;
  }

  public String getFerma() {
    return ferma;
  }

  public void setFerma(String ferma) {
    this.ferma = ferma;
  }

  public String getLavka() {
    return lavka;
  }

  public void setLavka(String lavka) {
    this.lavka = lavka;
  }

  public String getDrugoe() {
    return drugoe;
  }

  public void setDrugoe(String drugoe) {
    this.drugoe = drugoe;
  }

  public String getDr_utochnit() {
    return dr_utochnit;
  }

  public void setDr_utochnit(String dr_utochnit) {
    this.dr_utochnit = dr_utochnit;
  }

  public String getChast_dokhoda_na_edu() {
    return chast_dokhoda_na_edu;
  }

  public void setChast_dokhoda_na_edu(String chast_dokhoda_na_edu) {
    this.chast_dokhoda_na_edu = chast_dokhoda_na_edu;
  }

  public String getVopros_13() {
    return vopros_13;
  }

  public void setVopros_13(String vopros_13) {
    this.vopros_13 = vopros_13;
  }

  public String getDostatok_po_srav_s_drug() {
    return dostatok_po_srav_s_drug;
  }

  public void setDostatok_po_srav_s_drug(String dostatok_po_srav_s_drug) {
    this.dostatok_po_srav_s_drug = dostatok_po_srav_s_drug;
  }

  public String getTip_zhilya() {
    return tip_zhilya;
  }

  public void setTip_zhilya(String tip_zhilya) {
    this.tip_zhilya = tip_zhilya;
  }

  public String getPloschad_zhilya() {
    return ploschad_zhilya;
  }

  public void setPloschad_zhilya(String ploschad_zhilya) {
    this.ploschad_zhilya = ploschad_zhilya;
  }

  public String getZhilischnye_usloviya() {
    return zhilischnye_usloviya;
  }

  public void setZhilischnye_usloviya(String zhilischnye_usloviya) {
    this.zhilischnye_usloviya = zhilischnye_usloviya;
  }

  public Boolean getHasDiagnostic() {
    return hasDiagnostic;
  }

  public void setHasDiagnostic(Boolean hasDiagnostic) {
    this.hasDiagnostic = hasDiagnostic;
  }

  public Boolean getRequiresAttention() {
    return requiresAttention;
  }

  public void setRequiresAttention(Boolean requiresAttention) {
    this.requiresAttention = requiresAttention;
  }

  public String getIsSick() {
    return isSick;
  }

  public void setIsSick(String isSick) {
    this.isSick = isSick;
  }

  public Double getMesto_prozhivaniya_1_gorod_2_selo() {
    return mesto_prozhivaniya_1_gorod_2_selo;
  }

  public void setMesto_prozhivaniya_1_gorod_2_selo(Double mesto_prozhivaniya_1_gorod_2_selo) {
    this.mesto_prozhivaniya_1_gorod_2_selo = mesto_prozhivaniya_1_gorod_2_selo;
  }

  public Double getVozrast() {
    return vozrast;
  }

  public void setVozrast(Double vozrast) {
    this.vozrast = vozrast;
  }

  public Double getKol_vo_chel_v_d_to_kh() {
    return kol_vo_chel_v_d_to_kh;
  }

  public void setKol_vo_chel_v_d_to_kh(Double kol_vo_chel_v_d_to_kh) {
    this.kol_vo_chel_v_d_to_kh = kol_vo_chel_v_d_to_kh;
  }

  public Double getVes() {
    return ves;
  }

  public void setVes(Double ves) {
    this.ves = ves;
  }

  public Double getRost() {
    return rost;
  }

  public void setRost(Double rost) {
    this.rost = rost;
  }

  public Double getEkg_norma() {
    return ekg_norma;
  }

  public void setEkg_norma(Double ekg_norma) {
    this.ekg_norma = ekg_norma;
  }

  public Double getVy_rabotaete() {
    return vy_rabotaete;
  }

  public void setVy_rabotaete(Double vy_rabotaete) {
    this.vy_rabotaete = vy_rabotaete;
  }

  public Double getChislo_komnat() {
    return chislo_komnat;
  }

  public void setChislo_komnat(Double chislo_komnat) {
    this.chislo_komnat = chislo_komnat;
  }

  public Double getDepressiya() {
    return depressiya;
  }

  public void setDepressiya(Double depressiya) {
    this.depressiya = depressiya;
  }
}
