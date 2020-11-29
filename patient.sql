SELECT 
	passport.id, passport.mesto_prozhivaniya_1_gorod_2_selo, passport.data_rozhdeniya, passport.vozrast
	,fio.fio
	, obsled.pol
	, false as hasDiagnostic
	, false as requiresAttention
	, null as status
	FROM passport 
join fio on fio.id = passport.id 
join obsled on obsled.id = passport.id
;