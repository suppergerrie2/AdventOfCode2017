package com.suppergerrie2.adventofcode2017;

import java.util.Arrays;

public class Day4 {

	static String input = "vxjtwn vjnxtw sxibvv mmws wjvtxn icawnd rprh\r\n" + 
			"fhaa qwy vqbq gsswej lxr yzl wakcige mwjrl\r\n" + 
			"bhnlow huqa gtbjc gvj wrkyr jgvmhj bgs umo ikbpdto\r\n" + 
			"drczdf bglmf gsx flcf ojpj kzrwrho owbkl dgrnv bggjevc\r\n" + 
			"ndncqdl lncaugj mfa lncaugj skt pkssyen rsb npjzf\r\n" + 
			"kdd itdyhe pvljizn cgi\r\n" + 
			"jgy pyhuq eecb phwkyl oeftyu pyhuq hecxgti tpadffm jgy\r\n" + 
			"zvc qdk mlmyj kybbh lgbb fvfzcer frmaxa yzgw podt dbycoii afj\r\n" + 
			"zfr msn mns leqem frz\r\n" + 
			"golnm ltizhd dvwv xrizqhd omegnez nan yqajse lgef\r\n" + 
			"gbej rvek aehiz bgje\r\n" + 
			"yej cphl jtp swe axhljo ddwk obwsq mnewiwu klddd\r\n" + 
			"ipiev henods rpn qfpg gjfdgs zcpt sswab eosdhn teeil\r\n" + 
			"gzje ydu oiu jzge udy sqjeoo olxej\r\n" + 
			"mgn gox tcifta vzc lxry gox gox mvila qdl jipjnw dvu\r\n" + 
			"hxk xhk unhdmdz yomze povrt nbww bxu qqsqc rvuk tgffy twddm\r\n" + 
			"fyx fyx nzkm fyx\r\n" + 
			"ymnoc zogudq yncom tqrob sidvy dfuu ccjpiej yidvs\r\n" + 
			"bxebny akknwxw jeyxqvj syl cedps akknwxw akknwxw zpvnf kuoon pnkejn wqjgc\r\n" + 
			"kcebrkj zmuf ueewxhi mgyepbr nleviqc dez\r\n" + 
			"argavx fqguii gebohvw klnrq rkqnl goevhbw\r\n" + 
			"ywqi abwi eswph nlplbl pswhe lnqx fpgk lllnpb\r\n" + 
			"abpb mpkw ampey yapme xnuyj\r\n" + 
			"tmuaq asd bhbs sqmbsnw wsbnqsm ydwdncn rpa vrllkh\r\n" + 
			"dnltf cck djy ydj\r\n" + 
			"wywwl scezo clowuz dkgqaj dohyzcp\r\n" + 
			"diimshr vlmsnlj whqb dkicau ckdaiu terp kgcii npqc vvzrqzv nol\r\n" + 
			"wfpxe sqf tbb ruqpcq zfgb\r\n" + 
			"kajykuz tsxgtys vuz kglmgg ihnnn plyjxj rcrvo mij plyjxj jqiur\r\n" + 
			"pxs hmet dwgvd mvhkvn cjxg yvid vmhnkv kwxz rfemsua wdgvd okixk\r\n" + 
			"lzwxas ddtyeh ivyama crrhxdt hedytd jfw\r\n" + 
			"vjfv oyd fvjv kfwlj mradbx mckseee xradmb\r\n" + 
			"llga yytxyvj lstspek lstspek lstspek\r\n" + 
			"fabgf wgop fabgf bvsfoaw\r\n" + 
			"grqnbvo tntomdw hizg tmotdwn\r\n" + 
			"mau ufkw cxfi rhehj ebe xyv rhehj acxngo arl qtl rhehj\r\n" + 
			"kbkto stqjtm tpcwshj saerkrt pffj dthp pfjf axc gwmmfdw glnqtdy xmskw\r\n" + 
			"veff zqm hzhxap lgwnwq twsdk mqz xbbarbv cdx fhnwt qjcji bbvbrxa\r\n" + 
			"fjw eds hofskl nkbsv des hvx xyn\r\n" + 
			"qzort qzort qesz rtq oonk vwzlw wapoj ifr cta\r\n" + 
			"pja hvy nhjg paj smtfe fmtse\r\n" + 
			"xvi tcjj xvkjtab nqftt aumijl xkd cmilegf hvsmodx uuo igmcelf mslkq\r\n" + 
			"mdhezgv lelzy kzfvsqu hvmvaxw pxiqjc hvmvaxw kzfvsqu\r\n" + 
			"hsicsav csshrhx znojm eapi lhmzq bbwnz seao gfk azk\r\n" + 
			"pup xtgjyzy wqt ijeektl\r\n" + 
			"ktwh qdegzs btj pfwzzho\r\n" + 
			"xdkmdm izqtjrr iqbke vtp\r\n" + 
			"fmrbpdr zpccv tmtwx tmtwx tmtwx bys\r\n" + 
			"ehphfgq idd ehphfgq ehphfgq uphe hvrc jcscne nbnslqy\r\n" + 
			"xzqucgj fcih fljk barz lvln hcfi azrb\r\n" + 
			"cmfmclv mfgvifw rnxgn jpg bsnq wnduzj ymsdx smdxy pqomf\r\n" + 
			"rlqsm qrsml emts qsmcowv scmvwqo\r\n" + 
			"tshzkpa zwtpda ftsiwo nil tpawdz kjpa ptzashk\r\n" + 
			"mnep sfc swjawtd vnwud gyulluw zpa kmwyvln evd btnmoi dnwe\r\n" + 
			"jwq scepq redoxmw rbdzsa wlkzso kxpm bttg vxuc moxwdre ijtdd rzsabd\r\n" + 
			"wpvo dsjox amuwjm pls lgwksva ctakgpl rmsjj lzwwpr zzm udg\r\n" + 
			"bji obbn tmwyc afpmkxr glvrd kahhgpq rna qkxyntp vmd mloshc\r\n" + 
			"ymq rtnr nxjzm pqiddrn qmy vgxw ull\r\n" + 
			"mmzk ikge zhtzhs xyo qwe lll gjjm icetq qgrr mzwqa knec\r\n" + 
			"kxomfck idlh xrbowo nyetbnl qskh xuwkkxe upmmmf zhvuyp\r\n" + 
			"srcwyhl czgr xmhuws jueyh xcuib xhsuwm bxuic\r\n" + 
			"crkueh beyxopz xpyozbe dxgadw qktmce rjropjg\r\n" + 
			"lbktun imdpcp fkssp fhcpt fehho jqdnt aoewa\r\n" + 
			"jmun pynzjo trs ijwcc pelf oft pcsqdxg zvql\r\n" + 
			"mneaaq vjrg jidlrzz phd mvxpivd ldkhu\r\n" + 
			"sao xqw nrukn gatkz quscpsx vmz oscoeb\r\n" + 
			"goi wzxhb rrk aylqqcd mlcbvvf ororn heptid kdu byevr\r\n" + 
			"qsj lsbieef deez vzwdx hez iwd\r\n" + 
			"lmgfb keqt mqbsuis ogrr errbi xiqe xsszacp\r\n" + 
			"ato hmk zfjaj kmh plxup cida dqd pfwh nkbxvpr buajw pxkrvnb\r\n" + 
			"cli bdwu vrwott vowtrt grle\r\n" + 
			"zisgks ciuaqr zvk tcb kvz ugmtv\r\n" + 
			"oegrojm wofpwp gnaocx rweyull ellhwow dtefylf dqsz oiw varr bcirpf oxusz\r\n" + 
			"oydkmib oydkmib yefts gbl gbl\r\n" + 
			"sruwjk pgkrp kea gppkr zdcky cfljh\r\n" + 
			"obpxbax jhpcrj slcsa lgd fborz vvpaus wsrpsws ifijuzo\r\n" + 
			"rixz jwh uhdaf hoacv hdfua\r\n" + 
			"kntk qprmfow kntk tbmcjx\r\n" + 
			"vnqe ooyxtb ixl hdmnpn orpz ykspl xromvj kowtq wmho gquos\r\n" + 
			"ynk xjjqw sut lmtub bmtlu zdo dztlk bpkuul smhpx rbczg\r\n" + 
			"zals csdbe sbj dibicq kdfwwt\r\n" + 
			"coyy pjddlfc lwvhyms ldjdcfp ryubz kfwst dqjrjja jtv jjjaqrd\r\n" + 
			"jaexhms iqoiln ewgyr exmnrr fsr lgmyy fdofhn\r\n" + 
			"pjgyn hfoz zbcnz nczbz\r\n" + 
			"ovntivq vcey vdrkse giu ohyaxy ionyy fvpn yvwrgrv qta\r\n" + 
			"yelpz htbk njgeyub tggh mdthzp fwyux rduqli twlhfp pnh gywif ttn\r\n" + 
			"yxhsbil vplsmmx rgtq grsf lyibxhs hctnkfr awg lmloz jroy lpgb wga\r\n" + 
			"kzytass szyksat tyskasz ehmhhu\r\n" + 
			"jkus hwjv ymnnkk yffugg cvtnits gbl lywkn szihcn dbrbalf rxqpbqh\r\n" + 
			"koyfcef wkom mwok qgjrytl\r\n" + 
			"slmhry lcr slmhry lcr\r\n" + 
			"mvoxbt cfkz purnsui xar ouhtc thbx\r\n" + 
			"xcdifw kvvxyrj knac qmypw bou tmukqy eusgaoo bktiu\r\n" + 
			"ablgnhb axumg bwpxnjp zqpc vtw ghhoxu zqpc znfpvl ghhoxu jlg ntdk\r\n" + 
			"vmvc cdkhrx cvz rvxk mmcuo udpcayd lsmm gufduzt linj\r\n" + 
			"mgyeqkv hqionh rgnqgz kkc qrgnzg egkmqyv topdp\r\n" + 
			"koa dimwx gjxa atlfdy\r\n" + 
			"uuez ueuz zeuu ezo daq\r\n" + 
			"ofpaw bgomvmt mqa dexpy mbipd epyzcoa nuwrh vwly xppz qkjrleo rwhnu\r\n" + 
			"wok grxk lchvtg plrzr lwaax cfeu ijapws dmkdwc cfeu\r\n" + 
			"zkd hysxxip hlydw wicsvy gbwoaw dapre ktjn dzg uri\r\n" + 
			"blzh hblz qgmjceg fyf\r\n" + 
			"vkhpn xnc ogva pjrh cxn hkpnv\r\n" + 
			"aja cldzta tdcazl lorr fwmxxh knilf ges tdhp gnlo vihrl\r\n" + 
			"ucpr peair nlbmc msfg\r\n" + 
			"trv ppq bmo xqd vbui yegsr xqxawu fvuz aclhspo wnan\r\n" + 
			"loiq fvg kare rmgq hir rzo ossd ziw renh ygtkjys vda\r\n" + 
			"xmans kio alexs ujekfl vvf ddghn\r\n" + 
			"fcxvsf bjuytet zrzsobo uhn mlfzhlq bjefs\r\n" + 
			"zys htlqvky plno pbcqfuf fjwc vshkxrl lonp lyzmy dqmui vyyc glad\r\n" + 
			"tlc krhcter krhcter bolk tlc opryl\r\n" + 
			"idcii dverl uswb wusb zgax zhbt gjsnlso yhs\r\n" + 
			"cti npri rcbxjdw ollj nirp ghfvxzh\r\n" + 
			"blyhug aflnrrz zudyw ccnstq cyoju jxtqoj ntuknjq gunjiwy ycuoj igac cqctns\r\n" + 
			"bul yehpnw jifjrhc ifetu ufrodp hqzpeqf hdvpc qtvgxg ibb wcxsitx xztshb\r\n" + 
			"xzct scetn eoaufyo jtudgkx xrpgxip lpubtq juezstc nuc hokswh obkf ipbu\r\n" + 
			"nfq lwpmn qltal xnphsqs zlrgf iewtrtd mqzsob duokpy kfbqs icg\r\n" + 
			"vil zjz xkqrvni uay ystq\r\n" + 
			"terrrnt lnfg clm lbs ptpiy ybcuup ayzjm pqugx lmc yppit mbf\r\n" + 
			"dtajh vqivg vnblt fmn qxkw stiwna pclrrr fro khu wbslnqp tjyosu\r\n" + 
			"uqlehn tjuiy obt uedct bbwiq uxndqn\r\n" + 
			"hiqfovy xiimca zwne ivunvjk cmctzi mxnnrx dclib xzaoq ieztkg\r\n" + 
			"shpr xuorihj chuwq poadbo mhtvex gymsp iltgl sypjfua fmyh sgiv\r\n" + 
			"alv nxjt txnj bhact\r\n" + 
			"vjvtrex obmrxk fgigs meixbc fggsi awi rxdjpeg\r\n" + 
			"ypwo oicmbdw xbpeeyj uabzj cjvutvc oicmbdw immtmks\r\n" + 
			"exijri hogl epr gzdqyur xiiejr pre ihzlgzu\r\n" + 
			"rlh qfhx lrh qmvrx\r\n" + 
			"kogq okhd mivmivb mivmivb okhd\r\n" + 
			"taekt nhjaa znbaahn iaospxy jawwf\r\n" + 
			"ytdvq ghtqwud jkiig mre kzmmjxu jba nwpykc\r\n" + 
			"ktyzr aczd exgadhb uinrgac izazxky yyfe\r\n" + 
			"yrifb qgc lsiuapg teyelxn ugezu\r\n" + 
			"wdzkc ltx fkhncb hwrecp kfbchn sfcpc hjvq\r\n" + 
			"rjdjyt ahwxh nvggsmx lmz oshd xbcik powse ahhxw yhiq gxmgsnv\r\n" + 
			"qdr qjnam gag qjamn kooek mqnaj\r\n" + 
			"pza gml opf ilfbblu kjp luilbfb rhfrzgp ixagj ofp\r\n" + 
			"yphz runy dhull bozcsgk wfxekrd akgkbz urcphc\r\n" + 
			"tfyxwol lhcl npik beug\r\n" + 
			"szatel yfkve yfkve lzqhs\r\n" + 
			"yjzqon pcjibu bdncmcl kczuymm pbmg nyn\r\n" + 
			"rerqvs aoxucwi pmstl sstawu joqu abvcchg mvgjn mslpt vhmfkr utusuh\r\n" + 
			"gqbec jjpqdh yeaiavi nledfi jhzwc vyxjpf momnm vnknjs nvgjzik ipm\r\n" + 
			"psirt rispt lrkgma irtsp\r\n" + 
			"jbbaph xvunete gsvnr mjd ifxhpry cpsx hmuokkx vhcm yth shrrl zbhd\r\n" + 
			"gfa bcmlxtf sqyanrp cugg qxfvftz pbl ujsgc jajxltm gugc oil\r\n" + 
			"xjuhyg aht vmyvzhh oby oyb ybo xbybgmx\r\n" + 
			"atfk qjudfzz mky tfy\r\n" + 
			"nxk yzy jqgg qxgjt bevvvv efi xcbw bohc zaqlqjq\r\n" + 
			"hdc qpnx ygmtqw acvoa udboxw dhc klh mwgpk xfpuri\r\n" + 
			"cycgbkq skwhyf skwhyf veaqss skwhyf\r\n" + 
			"jnezf jowjt vsdu uck scgxd fvopomz vfajslp\r\n" + 
			"djvi epgkyqn apzd cpm owm kpwih fsr adlhqu jicp pmc\r\n" + 
			"erxlmhj wqxvofi ugj ttrmtsb\r\n" + 
			"omku vmrgoy tdicbje ewml dfnwbap\r\n" + 
			"gpih pyt ptsmzc gmdbu rqxkqmz objm nurxjz oozbere ztxug koth\r\n" + 
			"jpnl jpnl dmeh qed\r\n" + 
			"intdwv ksgw qwlzhq zpd lrl mwjl dozrjwq aujbet bsnf vhqyg\r\n" + 
			"eqs uot qyz xor aem kmrh mrhk jqx tsbrf\r\n" + 
			"irytjab mdzm qbb kkjt gofiwo xgbovg kyeyxqn tcks tljhx\r\n" + 
			"zgejy qodgah nqavvx xnigdvt\r\n" + 
			"eqve bizrxq lkhz yzwxgt nwe zfe sxypkz xnssept\r\n" + 
			"bxqn lkfg yfxbszo sphwifz wnj crhbq dvokzw\r\n" + 
			"vzn afatwye ogzvnu vnz rfjba xtugnj kpbgly ocsjd\r\n" + 
			"xrc cxr rahv yvhk khyv bed ctgbuq cmqwpqa jlbg hpj vmesvw\r\n" + 
			"jbshkya dgqw lfl mzcch jxsg czcmh ifruvlw ufwrlvi xcczlol cqqchmr\r\n" + 
			"rbk mhn tnmqdc sxnnn kvoa mhn sxnnn mgemob ieiyajs\r\n" + 
			"cqi ghxg ghxg ghxg\r\n" + 
			"uqwdxn qli gdtkngp gnptdgk udxqwn\r\n" + 
			"dmcczr dnjaqc qwdta rhrbi hkdwe qdjcan peic iulaz xns\r\n" + 
			"tcmppb nzq ecy sitdud nft ecy afrbf wvnc vmfpzx tcmppb cgb\r\n" + 
			"plitv efnpq mjqav nrxxo izg lpitv rwbzdo rdbzwo\r\n" + 
			"day dntga adtng agndt hhvtd\r\n" + 
			"yrg iudsh gyr ryg\r\n" + 
			"qttyeew tco flq bszw jkzftc wdh efcwnp mja rfmju\r\n" + 
			"moch prkze uslzyv plhjuy kxczyq qlmm hgq\r\n" + 
			"xtg ypz izy ixg bvs xlqgj xcy sepza abiylsg\r\n" + 
			"wxvsxn bqag jnlzgxq ikxwa dfd plqxl xlgqnjz nuqvoyb emhodso gaqb\r\n" + 
			"bzjdsm xmxkj fhuqn gauyw ntl kjxmx zcxdr vrds\r\n" + 
			"ofjcc uxyzlk ofjcc ofjcc\r\n" + 
			"zwosex kkvwobl cpudsmb kes zklf bayuojr otqnyr udbbs\r\n" + 
			"iqpvzh ybds piovrh oivprh voprih pov sfl\r\n" + 
			"upns cpeelht xboyk itb hsxdmt dnwgfbw upns fygf kwdpxzm mli dyy\r\n" + 
			"djwutl sikh shki ikhs gecd jqkon trqyw\r\n" + 
			"prbbdf vdp bvvfjcg ydqb muxygg\r\n" + 
			"vhpurzn psemqe xwqfk hrvonxu nxkxacq\r\n" + 
			"xicmhss tnpja qiad woipfy uvadcq usljh hzgs jntvfv wzikk\r\n" + 
			"mmupc twntp upcmm pumcm\r\n" + 
			"qnisuzy lppnfd uiqr eyqbain uxlp eyrfwjo olgkrps sbikam zin vckr\r\n" + 
			"nmokl skfni jcdfot njzqeaj nqzjjea\r\n" + 
			"slmaxx offfzqp wudicrf nfn rwfcdui cwirufd\r\n" + 
			"paffi murnjd oyj lbtjdqe babuas dtqh qkt stapzl yrqlp\r\n" + 
			"eedc rig zmnfmn edec ecde\r\n" + 
			"bcfdf edovdj lacx nzvze sordvxj ybs ujh zvvvp rzstejg ueosuq\r\n" + 
			"xrrfsd okuvem znzlvmb jwzcb bfg bmuxbc qzwfry\r\n" + 
			"pqgxybd cvgra acgn ocd ancg fvfcx fbb bfb zfzv\r\n" + 
			"tmmv mpywyg fwl bnvcv lcnv flw\r\n" + 
			"xxnfbro papc ianru beuzx apcp rnt\r\n" + 
			"wuyhycj nrnc cka ebg rncn rvo wcyhjuy\r\n" + 
			"thh cmoog hwf imqfp okzpxd\r\n" + 
			"rzxiqt rtaiy ytria tyria\r\n" + 
			"cjkmro myif myif xyirn aqxlol wlhwibi dhzsen pzwgm bfbz bufjs qwffg\r\n" + 
			"mxhiui umiihx zomyll vfieccs\r\n" + 
			"yyntf rjk iivgj mwh rjk\r\n" + 
			"dsshx wsmaxhc xcwuelh rdsgtr wsmaxhc rgtsfj\r\n" + 
			"rdh nwlxiwu xsjzbpr bsgps\r\n" + 
			"ufyo vqtzkg kpeohu mxzt fyuo gawgaq youf\r\n" + 
			"hzbhut bxsnjwb zuhhbt zhhtbu\r\n" + 
			"pdz sgntypg ragev hrrji goitft yphnebs xjzoo sqf jsuzijq dsocb hcxg\r\n" + 
			"pptsq woomypc woomypc woomypc\r\n" + 
			"axcg wfbnpql ejqb cmnn nncm csvlc wraludb pkmp whtht tfpicer\r\n" + 
			"moom oomm ommo vfqeii\r\n" + 
			"xvrgpp rofl yxyrkb oage nypzau pwfnkn jxnhkw cyxsi clzb adwpuh\r\n" + 
			"mfbz vdtt muzhm wvwwfl ttdv\r\n" + 
			"cpqgvbu byc pgfrlkr aftl tqm zcqxi juu gnf ppovxh huoa\r\n" + 
			"konpcp lzordid jqng lwxs nqgj gghkxmf kyn ngqj\r\n" + 
			"iorhccj xfygc cnfr tysqc xpcyf vmjpitf nut zmrk mgbrtb tcblxwf dkadwrm\r\n" + 
			"kov jtmp xoatesx qxkilp rmggpfx ltpxzwf vko reqms mqq nps\r\n" + 
			"hjigmk fyqy wpuwe mwmso thsimfs okcmeyh mzqkez duzaq vzhyrm uyvpkox cwivpls\r\n" + 
			"ukoerf korufe zhs ntwfz hugem vriyk enfaib hrrcdgf zllsk vkiyr\r\n" + 
			"shkx khxs wntpjv qdevaw noqyht nwpvjt egh hgok mukdjfi law bzbvjz\r\n" + 
			"dquk kczxsq tdu trnkjs wqtdc ybvcb\r\n" + 
			"hlrotxn cumcjkm qwufgle ylm nejh hnje pvaigrx myl sfvsd\r\n" + 
			"szmvisn aywic vsnimsz iufmybr\r\n" + 
			"zjozr zojzr qmn ffrggdh wam dafvok\r\n" + 
			"nxkvlhr posmf posmf posmf zhlzb\r\n" + 
			"ywis kpqpyb qae zqxpuz pcj hbsfz ejlwa lajew znuom\r\n" + 
			"qxsl ussivur dstd avojo\r\n" + 
			"yoeagao egpaqm ymzf kkauy ivm illir wsvchne skmamvn nqxc\r\n" + 
			"cldo ixzzy vhk nra zhypgab\r\n" + 
			"qjdd ecxud tbuqq mpotbdk tjdpczn knncm tyy\r\n" + 
			"rbfc fhhjf innia tsjbbbv fmtcuup rapvhqz ebpzt whdbms gvjoy lykl fquvcby\r\n" + 
			"bihhfwi lhal udxz uwjwp dmb\r\n" + 
			"fekxamy uophet yzvv rqj zawlp ldrv mdymkzy taauf\r\n" + 
			"rcwxvmh edueui ltdyo xfghz dgjig senm ifj\r\n" + 
			"qcu fii axmgijj ifi oixjfsg jxagijm\r\n" + 
			"sdtyr rbdh yvnvq czzuig wro\r\n" + 
			"lot xkto cmpiena nht ozcg aotcw xiegl cyaouj und lsclep cexn\r\n" + 
			"pgihljk cmgmv sajhi zfvbqij ogwoc ajsih zmppe\r\n" + 
			"jexwkdp dwpexjk mzjydfu bff rubgdb\r\n" + 
			"yshfhx emkl hshxyf mkle\r\n" + 
			"dxgti jdo tkwprv pbxbrqd oiz gsbdphd qotu utfdnq tzvve bqc\r\n" + 
			"ovdf bshfxyl xspjpd vljdsm mgkd djlsvm mlsjdv\r\n" + 
			"etyia eytai sfq qafj xzgp ewhsn snwhe lhqp\r\n" + 
			"zjz mwh dorxm ges gexo rckwsa dltoq mmntha\r\n" + 
			"hqkuj ypsjcxo dixbe rmvnhjh ovnr\r\n" + 
			"edc iffaxc lolu xwrvpb gva vti vit\r\n" + 
			"ceuxq xbwejr lzyvm rozseit cwe mham fivpwj qtv omaktaw\r\n" + 
			"alzdrk tsxbuld mdbq pgbdtoo xwf vzalric nqe jqwlxsy cbtylu dtubxsl lqm\r\n" + 
			"rqjmjcs exjpn kpilcgu ihcm lfadjm mlri hpd vqs cxqwqhu twxrtk\r\n" + 
			"aeuvlcp aubvnw riedvz arypagp uuvg kliehx cokt ogh xsdw cdsyywv\r\n" + 
			"ddwrgvp bscaq bbfv qrbutp\r\n" + 
			"jpdg uey eyu uyarl zgbk qyhqq fdvlql zmwkp\r\n" + 
			"kbt bkt lebhpfu smrzt xalw mmwa zmtzfry tkb\r\n" + 
			"fcvcv oewfzu fvvcc mldww lwdmw\r\n" + 
			"ejrltsu sqoyx wfvsdbp bfdspvw bfir jqhgrmt ofdmrjg ysq\r\n" + 
			"jzwucwn erqjd eikq knpf cvk xvqnscy eei wvfjzmj xujq cqaim boev\r\n" + 
			"jqhkmr ipjpj zwno ybu krhqjm zqfyyzb dyciy\r\n" + 
			"ugwsw rpwteje qtvwi pwyhrzt hfcdfmc qbovk ibws\r\n" + 
			"ffy kdder qjookz bfvmvvq yjzuaj fvxllfb pjyz jcezhye fimyydt qjookz qjookz\r\n" + 
			"loupd nwsc yytvuqo ltcqxnf\r\n" + 
			"iho ulvxguz fxbf iqu ofjtmvq xhs ybbusd kxg mebdnah ucttcf zufb\r\n" + 
			"wzdb wumuhtv kef aavv buu xmjtlur faaccl wospwff bjasr eapfsi\r\n" + 
			"jau qzszci ciu inagax\r\n" + 
			"kui tqig fyovsp fvwol fyovsp mzth tcp nhoq\r\n" + 
			"ajdla wtpj amylu jly tvq wjqef\r\n" + 
			"ofqc einz bdze tows bdze eew\r\n" + 
			"avwavzt aesrsjv lbmpi hllv chdbul ezelxn\r\n" + 
			"imcprs cafb clfg rsjo iylqu nvk vkrq izezlnu vkqr tyhnv\r\n" + 
			"rwj zboui reh buzio wuhpvid cpzy jrw tsbuiby hmxwqr ute\r\n" + 
			"ixq luwbi uoiwsjh souz ysoubw uilbw ffwjvw ewzswoh hci zmfdaov whowzse\r\n" + 
			"xrhgqf xrhgqf giyv giyv\r\n" + 
			"toiqgzv gakg udgdlb wvi carrn pjyha muqclu\r\n" + 
			"wuxthi srtszr ourab hpds bakvy fnk yefe yfee doowxcx\r\n" + 
			"ijdc ujhvls xmy hwg yetsda qelbe nang xgywo wgh\r\n" + 
			"bhm icq cnam dec enksf qfctz pwxoo bdf cnma xoowp rbls\r\n" + 
			"jguzh fextz yax kesaunn waljo jltcza tfzxe dezs syi ebwxnks\r\n" + 
			"flvq bzgd clvqw ahtyvu xbdyv wssxx boscm grgl nqcg\r\n" + 
			"caskpli hqctxxc nwpyo wjlqfqf ebti dva\r\n" + 
			"wmsz fzpd ikgeq gti ejftoou ezs cqef mybojc rgwz\r\n" + 
			"mdaay yfppa pavl fuuvfkh hpod tpb dhxmia emdecm rbqcwbk vecyt\r\n" + 
			"neha rmvl ndp vlrm dpn debghi vyhvc\r\n" + 
			"bnp zkxdu iqqkesd abtlx hmjasdq kyvekr krt srrjyd oxmfev oot\r\n" + 
			"dumlcqd ccm hyir oritdz madjjw\r\n" + 
			"oakqrs advfmu verrc zkfdcn btndsp\r\n" + 
			"onlkinl rdtm bscfxre bnu oumyrvv kgc zkj\r\n" + 
			"tfxfsgm uwmic agswclg uofezgc\r\n" + 
			"wpfdyjn kjlihk etbot fbu scm gwccce xgownte wig cuaijbo\r\n" + 
			"bzbdk etozk qracb oftfoo lkooe\r\n" + 
			"xupzw vmxwu sis wzpxu\r\n" + 
			"gbz oqbgh jwgrru bzg kwmxcfc jrurgw\r\n" + 
			"agyjnyc tuec imxlult omwiyjg fiwnoqx nhmnro qtg kbr agyjnyc\r\n" + 
			"koiq llreotu elrtoul dubfvgy whq\r\n" + 
			"htm lll crzppb gdjaae nsmxzh gnfvn obiuy ymspzbo iuboy\r\n" + 
			"thm xlfrr pbxdfo mht tygi sapxgbv mmngzf dej\r\n" + 
			"eus seu qmstw ues\r\n" + 
			"yvfsw esut biblze kbjcpk estu xih qzki ezlbbi blzv\r\n" + 
			"ohq ugc tqqeo jygvpwm vfs ldnfibp ycbpa sml rmime\r\n" + 
			"kuuow gbg nzwdaf wiimtg lam oqmm\r\n" + 
			"wsbwkdd hda nqk ticz mvt\r\n" + 
			"gqbljyh zqugqs cjod sxwlqy qkfs wwvwvt dsojb qbhjlgy riusoa uosari\r\n" + 
			"jkphfx dbt les jsvoij rnuw mxmmchu dol vto swn\r\n" + 
			"qqxe vwvephr twdqlyg cvdu xjiych clooq vkwavl whvverp yuz vkwval\r\n" + 
			"txtbudi tiutdbx wqhx tws utgbf amh hmf izsez ooz\r\n" + 
			"egdube nhsxjs nxjshs xoy sjsxnh\r\n" + 
			"egdziod diodegz ejxn zogedid uhhkr rnm cyvvuc uqbl\r\n" + 
			"rbn pinwag sidwdwv jqdbe jlbemk blkeaqq ipfqbtn zkrbp\r\n" + 
			"bdryz sbh wxvn mhot wemsfm oemkff\r\n" + 
			"vxyn xvdwwo xhd vyca zxjaw vfkz xhg ofsphks dyq mmzzd\r\n" + 
			"yjrqsjf iiesdh envwyx rmtbmiv ggzsg ukx bprfym qmyqc vag ymho hjtoh\r\n" + 
			"fuxxrd wbweptd vkoffr wbweptd\r\n" + 
			"gfwcez smetli yjyh pslpz qyokpsm qsy cxjymg wqfkf obuq awz\r\n" + 
			"eqhm ceest kayf heqm\r\n" + 
			"rdi dti vntcf ewkmpvf jjwoihc\r\n" + 
			"sfq qlb xrm ocy vtnj zdznbal zvon stln zwnj wsgalvq vhphap\r\n" + 
			"pya jay mgnyo pya xmapdn\r\n" + 
			"hrwbj xhr gvwl ktq ktq gvwl\r\n" + 
			"rzgqi hjwtthl kxhggbl wepc hgavj ctmqug\r\n" + 
			"tzfwkc xeqfath iiuwq iiuwq dhwuvy\r\n" + 
			"gibagy smq getjofc lum msq ulm xuxu bilrus ily\r\n" + 
			"xlv ndrkch hdcknr nqltoze xvl\r\n" + 
			"wmc vuzlrj mwc atp cvpx atv ujatz\r\n" + 
			"hxpafgl ymjltv nvvpy ahycdk jhpdcks ettm lvqyw ertpivm dnezwxx usi kdhcay\r\n" + 
			"vrh hqyomv mcq ilwjbkz yprjxad\r\n" + 
			"ugv szfitxg zeluib pfj ijm zmiigxx gltxzz jzljhgh otskue\r\n" + 
			"mxp bilj jlbi tce yfted zxsqas ftyed\r\n" + 
			"ykasqv ehye kirmnl upmi dojwmw wzj ykasqv ifixn vreoypz\r\n" + 
			"kerbgub nnroqk onkqnr gbebkur tjhl knjo ccsem yozvrcg\r\n" + 
			"ygq evkoj wkn ffljhds scxeibh egsybeg mwvi vgjblj qda ywqpp\r\n" + 
			"hocvpl ozgkxp xgmj ejzyxm\r\n" + 
			"gernu kks lxe nxzv sypg xle goz\r\n" + 
			"xoatis fjp wzlbo dzkonz jtutyj vdonj swro tqclemv xhomap ymeqkua vaxcw\r\n" + 
			"mxcyjs ywyxndk wng vpftv nsuvu\r\n" + 
			"jmiyyhh gwser shgcu jmyg cjzegc hmhe eopg kmkan\r\n" + 
			"smdd dmds mgqhtkh qtamih haqmit skkcy\r\n" + 
			"dnj rmggy rgymg uburbao rymgg\r\n" + 
			"klcpjgq ons ajyv sqryt son pjlcgkq xlobdt\r\n" + 
			"piw shonk tzi mcdumz noskh tebolw yaypn\r\n" + 
			"ozm mvmjgtg nxj weommiq asnmhzq xjn uobztuo cqgjh utfb oydt ommiewq\r\n" + 
			"qlwgsc vvpe xgft ahpjc zjtx iyof scwqlg dxgcokx ltrefj xyzq rwto\r\n" + 
			"ggqdd dqgdg ggdqd kjkmmfp\r\n" + 
			"htzjam fjbg iagc xls iagc iydtf ihxl boa iydtf\r\n" + 
			"vhe nqj bwgdoi hhaoa qtulz\r\n" + 
			"axvyja hpdkwee hnryj prou rgadv oubjdqg knjbc\r\n" + 
			"caz xibj wqkzwe peioeya vmz hesy ftb\r\n" + 
			"dudwcr gupj sjrtzc xsqbb hiet nujv bebcvsj eks uuzlcx gex\r\n" + 
			"kywozi tfzuc mflssw hnxxxqt zzc tzfuc hkokuv mnjg lwkavjp lvpwjak xez\r\n" + 
			"izgh zfv cingjt dkf cknite qox vfz zvf\r\n" + 
			"ojpu dzk tehpgnt gntpteh\r\n" + 
			"glxfxa uxq ajtles ahgzn ajlste zwgc mrpu adz wuunwhc zda\r\n" + 
			"hdgdtn hnoyz aromkb qujfv yjgmn tbf atw\r\n" + 
			"uyvsv oaopjv uyvemxk ldpp tthe iisjk txr hebmd yxevukm rkziao znt\r\n" + 
			"ypdr mnwuzvw acpg kzwz ywbn wcrr umrnlbe lkult ljify azyhu mgqoo\r\n" + 
			"abmpl omsd xmyl mxyl mgoq kracrf ufm ppwi zpggh\r\n" + 
			"uxfdpv jnm vvc vchunhl ubv ktj mxolsxz\r\n" + 
			"fcja eci edzrb nlvksaw lhf ycohh tfztt xso ceub tyv\r\n" + 
			"rkwtp tcmmvv kufg cxui hdamg suuaej fgku cvjlv\r\n" + 
			"oldbgy riadoyo djsi wca zxoeq pmemqap aijxa\r\n" + 
			"nyy ruxcosx xisqoz yny jvzfpbe tlfdiaj ybd jifatdl zuzv\r\n" + 
			"kxwdz qvrvx svllp ergmme\r\n" + 
			"swjfuv eronk favcxfm acptbh pnbjn ciqcrlt rgvdnlt icgahb\r\n" + 
			"ddza xxfn use obqka bfzwjp gmf bld fyvde mxdfdl\r\n" + 
			"ame bmxbyf ame bmxbyf\r\n" + 
			"rdgby pyfog dybrg gdryb lpztd\r\n" + 
			"sntg impd uxgxai naoalb ntnk xgix\r\n" + 
			"oadpmqj oso criln izih oos\r\n" + 
			"ouzjq gtl ito xefqt phnv ouzjq hoyjjj\r\n" + 
			"mlp rboq lpm roqb whvp\r\n" + 
			"tghcw ggshevw dzsgj ggshevw kec ggshevw\r\n" + 
			"kmwhb kfcb mbhkw gemz fdh\r\n" + 
			"euve veue kplrq evue\r\n" + 
			"hikfiw bcdktj hcnawja gjasvwc vcht igrzly rkxijxe ikfwhi dvmp\r\n" + 
			"hvksis kafs ktcs sfyqzyt etctrgt vodwr wff tskc juobnm\r\n" + 
			"dpcsodn ehwc pglywfl yhdp mdiyzx\r\n" + 
			"ibog umftejh cfm pnxhna wqwx yabnk ygws dqw\r\n" + 
			"dezz tqw qism rarfe fpmlab xvbau irwtfs wwmoyss yvn xetqp xtqep\r\n" + 
			"pchqwk npsmd jefec qok uuc ucnpz rlkakn\r\n" + 
			"kudh rjysb xrdbx bkbmjfo xrdbx\r\n" + 
			"rogu ssdwsus voa ncw obkxsr\r\n" + 
			"tflf hlevus scq rrbpat tau wxsq wxoblt\r\n" + 
			"rzr lex kqdy whtj ffnys xlgkkff msjhy dimaq hrc wyde qkwf\r\n" + 
			"ghtwd wernjpn tdgwh olrfvmr edq gxvp\r\n" + 
			"rjirvf skhdgln aauit bipu mubjiwp kowz gyjfbjx cmgdqs\r\n" + 
			"aftfpbv agajyy aqjll vsf twh robpys lebt eav yribup\r\n" + 
			"sby ymkla sxkbfwl awmd nhb vlp\r\n" + 
			"kizvjj ycjswr jkzjiv vuy jijzkv jcs\r\n" + 
			"cwvch xzqfal tephz lqfzax cnkbdcr mql zflaxq\r\n" + 
			"jjxzwl himpra ssjf bibfiui seeaq pzse\r\n" + 
			"jogrn jogrn sqew jogrn oixgwr\r\n" + 
			"khonpyw iiyxir vybhc ndnxxv kzlt ipmncn\r\n" + 
			"okqkqu svbemi nfn ovd xgwy edd ujet nrrbv dde vdo\r\n" + 
			"jobvf dus asvio vaosi sovia\r\n" + 
			"knmz qbz nkmz zmkn\r\n" + 
			"isbmopr unduey impobrs hea zswciev sopbmri duuj\r\n" + 
			"ocs ntgnrdu kbvtzp cvyieu fiyn znmh lhrz ixtnzrj vktbpz lbpqx vzkpbt\r\n" + 
			"muduhc sabc dlyoisz kuaz ogpyepw yuog ictiiqt\r\n" + 
			"xjflsf nfklvml thfh uajnmby cichyj xxoqi lpime bxpyx\r\n" + 
			"riahifn bohbgd obhdgb jni qzvkf ybp hjkkwq ytutd cakcsh smfdoe tuytd\r\n" + 
			"iddku nccp zgtl yne ppzpqcx lwm\r\n" + 
			"refpcz uqt uqt uqt\r\n" + 
			"mtn czxkagb nmt caqacrg bcakxgz\r\n" + 
			"itxjii uethxbj vpds bsqod diqax inv zrwt doepe\r\n" + 
			"bfyaj nbvhg zmi buf\r\n" + 
			"dtre dkwdr nrapm qtfth odvt bbcnae vxuk gqm enlg\r\n" + 
			"ybt qcfozrk yzrh bfp euuozuz pzsdkxx mhi nbkzprb\r\n" + 
			"vpuhqn gyx caint antci vfep incat kqdakdx\r\n" + 
			"ddhi chgnjk ibg xbemitr mjtdph eovw\r\n" + 
			"ngbtuvq qdttlsg dbqhhwk bkrqze qdttlsg qdttlsg\r\n" + 
			"evn smvhi dgcmn xjo ascc ahbpj uvzc pwn tung\r\n" + 
			"ksu thr omg onvsqzz rllakar ysfjtfj grxwyx oawix gpk suk\r\n" + 
			"qvb iouav yhtndkd vuoia ouaiv\r\n" + 
			"kud kofcip hcczrgc cvvxxlk rvyamwe duthdzr dftun\r\n" + 
			"rgv ynw gph tmxwfup nwy\r\n" + 
			"dnc trawj kwzbx trawj zvp\r\n" + 
			"ogqxijy tbqtsg tbo vqinnlq jbvgl sfafh rve mcxqs ubh\r\n" + 
			"qccr lpv puuvdyb tydaflf uxic\r\n" + 
			"tlon tbfwkxg tlon tlon\r\n" + 
			"iytiz qjlqaqw uixb lnt zwro uzgxqfi gklgnqs zwgoidw iifk wkwdo\r\n" + 
			"tmvhxw tmvhxw tmvhxw fhiqpjy ejk kvysd\r\n" + 
			"cmphg xjjz groiccd dvetuk xbwa zhm lyi ohhd neg bxaw yil\r\n" + 
			"kdmzopy lxx bvhach goxmxu qbqvzcm qbbrhvb nrfom aixmio grpxz hbrqbbv lkucih\r\n" + 
			"bnqn phqr uycuxc mopyyfh bbpesqm stgigq stggqi cwtjm asqhpl imvlxj lbmloo\r\n" + 
			"pws iuvbvjr cwccm qbr srqnstz cjebq\r\n" + 
			"bfh jobkcy gtbroe lpagq icmax jobyck fbh\r\n" + 
			"ounqdo qrrr pwi alho rrqr beao rsioepe\r\n" + 
			"vrccqge qvcgrce cbslkjs qnclw rvmjkw\r\n" + 
			"aaxjns deupjs wtgxtp penad depbho tbrdt depbho qxg zhjxpgd\r\n" + 
			"drqfo kbp jfa jaf\r\n" + 
			"izn oczcitj cpae quvzqo iwwk jck idjdpm\r\n" + 
			"ecort zgcvxx bvh vrprsf\r\n" + 
			"fhubfvy ndcfjo kol hyufbfv hvpka\r\n" + 
			"kpt zgajpc rjvsxa gayznjd\r\n" + 
			"xeoixk peq kfu lqa mjnv mzvh bicl hlfk\r\n" + 
			"wyt imdx lksy twy\r\n" + 
			"xeptp ilxs qbsqzwn rsy slxi xtpep dsdkekl\r\n" + 
			"rotvbt fuirp elos ciu nhx bxej trmtx ixn xbpc vrxtma\r\n" + 
			"skcprn yns sao ghlq vftezvc aaryahy telt\r\n" + 
			"fkaov gexa xijv yiksa xega dhgw okfva gxxs edkecag mqbqvrm nrzcqub\r\n" + 
			"ljc jujxeof fdj gdzjzr mabbktu pmyrfv uspven zxry snt hrah\r\n" + 
			"nhujhdr jdhrnuh midm bbavhpp cpjk zmpbasz eptrpou znq zqn\r\n" + 
			"ywzfq wuu lfflon uuw rke qzwyf hjbms gakx\r\n" + 
			"yqrq zsk jzn uuuzrml kzs lseupsg waynfh blech\r\n" + 
			"gwyqej weyjqg uwuje uujwe\r\n" + 
			"lxud rnwkc bgygkh csq rfvtos ystqp keb gkakodj uthcce eqxifl\r\n" + 
			"elvj evj rfwo vvgkosh aarcgjs utsbh orwf jxcqvmh uowmktl qtgf\r\n" + 
			"bqszre oxntty ombwiz mbiwzo\r\n" + 
			"ccp iilcc tacf czk giwv erqi jgdfah wip xtrzhv wosvbyb\r\n" + 
			"gymyw rwsxeg gvydr izyk spsonkg knospsg\r\n" + 
			"djj tbr tbr tbr ice\r\n" + 
			"yyzh zkykapw puydtik ysxc hjumhsd cuhhw dnnhida yyzh lnklymg\r\n" + 
			"nhbcxsu ccrbbyw scbxunh ghxrkqh brcwcyb\r\n" + 
			"latdaav sexa ipzuzjl ayusb etb fshh\r\n" + 
			"giz akqd vjmabii arfuzgv efrww jxkvolg efrww vrnzgbx\r\n" + 
			"jmcc vqy adkzj fqrkdo tjrczp ccmj cfponk rptzjc\r\n" + 
			"jsviu sraw imsj fujm cdf xwqhl lhz ojejzuy trtqblg\r\n" + 
			"ibz dulm muoq quom etvjzxn tuhrpp jfukac jqctqn qhgbae msgmcit ludm\r\n" + 
			"zgx bpfa elhp rnyqtq wyceube nkeuxz\r\n" + 
			"lzxfo vygpecv jszacku zfxlo\r\n" + 
			"cpmv ysaaj xnp wbvqg hrsiuj venjxna yeqvwmk ftaga dcqxc jgapb rqdixp\r\n" + 
			"xpbbe tyn hfdlu fto wrgzkou sxylv cqto wdv xqc pnu rapk\r\n" + 
			"pkrxypl wnu oipq tzbhnc gpug tgzf ofjb\r\n" + 
			"mvaz bwcv gll itgcye dessw szt gzimgeu bvmohh wbywyhc kzerxbr anjsive\r\n" + 
			"lhvnrzs qkmjwy pnyciwp mgp jfdz ghvtf yusfzg upab\r\n" + 
			"xbscukx aubulj snbcmc uscxkbx ddpucyg\r\n" + 
			"hgv ollh yzpjmpy fcicyae vhg gvh\r\n" + 
			"prd onyd iux oik xui\r\n" + 
			"zipadig nvewx cir lbpcusx dljqy\r\n" + 
			"ifyxzsc btmy lsu tmyb lus ldyzx\r\n" + 
			"egmyxbe ieasvek dylmj qahtatr uyqgbk\r\n" + 
			"mejjczw spj vaekp kdud\r\n" + 
			"vwan mgenld mnlged vpfuil euoxlr rclkpi dfknyoa rhthij kcyxl qaxab crlpik\r\n" + 
			"pqm eihogk iwml nuauxi ngilkoh jmu mbdi cqxz nblb rmuj zczdgp\r\n" + 
			"pswbe mtzch wbeps fxtnc psa aioff pas\r\n" + 
			"prwrpvz oadpqvz tgzrt giom pjyihh rxdir dmya xjolzxv\r\n" + 
			"khdybe obqkjn kdq jkvmgwo enpat wyw qjbnko waid msest wwkoyts\r\n" + 
			"yep liv ofmtpod imdd qyw\r\n" + 
			"afnrx jgn gxarpb myltj ggrsajy mdaobjo vbtn vbtn zlziz eds\r\n" + 
			"hqr kqu oub skoeqk icnfm cqvld aay bto\r\n" + 
			"rga odaf exoosh pwevx zpbd plaa xoseoh\r\n" + 
			"mbr gqu oxvchrt nqa larxmjx pfozej\r\n" + 
			"ozuo ywubjbg xcua eblwqp nfdvw hmhen zkjfu gmhgp bsyi ktprtf\r\n" + 
			"src vrysby srybvy znwjm hmypwdl gdmau pqe\r\n" + 
			"cldr crhi lbaq fbuduyn hygbz uhida\r\n" + 
			"qrxukq dygkp oaks soka oask\r\n" + 
			"vpido ajgfq pwlv hezt fmg epwrxo rqvjke iovpd hhkjm\r\n" + 
			"anxf ydl xnfa hqph olorp\r\n" + 
			"exydcg onxjm psqlbv ehz boar hze qsblpv\r\n" + 
			"mnzrvc ipj swg ijp sgw gdkntsd fzz grqwly\r\n" + 
			"erpq qghpj fay gci uglm afy\r\n" + 
			"jwbq hbxaub jpdilyt yvalrlk topl qup\r\n" + 
			"eczonk ftcc paltirb owz tihhe dglxory wthvqcb qdnxm lirejh alyxsr\r\n" + 
			"ooruaby gboyeu lkv arrz jcqyzl uxlfk fhmeony fcmh\r\n" + 
			"wzr xjb pwmf okqj adwcedy lkidve uwekxf asbdzr biub\r\n" + 
			"dikhur pxgh urdinjh wednf ulzdxs\r\n" + 
			"iplf byt tyt qnnlba pzt bednml ljjtkvo tjovlkj uwms xat\r\n" + 
			"htzk ltmfha xikeze atfmhl fchxhyz\r\n" + 
			"lqala bqwgcul vetaa xuxjau zcb wtdmomu wfqmpq sief uyblyz ahv\r\n" + 
			"aytvvo awm ojaaigg awm dbfaokz\r\n" + 
			"abq npcyld fzbfku oia qss jkxldm wgtmki pasgxi dieix rpqnuac tecnfy\r\n" + 
			"nmr qzfj qjfz lsz vnahex\r\n" + 
			"djxoo jzlkh svy xige\r\n" + 
			"tjlkkg glcuvmh fwzlhi ecun qlgulj hrfhyql qgdlf ofakqdf zokkvm gelxkq oowgs\r\n" + 
			"upfpk gfstjlv lxc rjd nhj sbq jpzsz zsjzp\r\n" + 
			"favd nzqfdid nekfjsf mtjndu\r\n" + 
			"sgdqx uvpuefv vhwrgd aivav gsqxd jdhfoq\r\n" + 
			"llaf cthbgy njrpw fqgkx jzf xqkgf lnrfrm gkxqf\r\n" + 
			"wzdwlc wisst alw kyjeur sjsqfcr tta bijnyn whfyoxl\r\n" + 
			"dtjr baxkj lmnyrlg nrmyllg\r\n" + 
			"mtgky xmwf zdko nnocxye gytkm ygp hixk xwmf\r\n" + 
			"maudjy okgjga uadjmy dzfrk omd\r\n" + 
			"azz ajdcqkd bcafn zaz dcjaqdk gylyzo\r\n" + 
			"xzvfbf fopmfxu mvftgr mfupoxf coyhof talcc vpkslo";
	
	public static void main(String[] args) {
		System.out.println("Day 4");
		System.out.println(task1(input));
		System.out.println(task2(input));
	}
	
	static int task1(String input) {
		int validAmount=0;
		
		String[] lines = input.split("\r\n");
		
		for(String line : lines) {
			String[] words = line.split(" ");
			boolean valid = true;
			for(int i = 0; i < words.length; i++) {
				for(int j = 0; j < words.length; j++) {
					if(j==i) {
						continue;
					}
					if(words[i].equals(words[j])) {
						valid = false;
					}
				}
			}
			if(valid) {
				validAmount++;
			}
		}
		
		return validAmount;
	}
	
	static int task2(String input) {
		int validAmount=0;
		
		String[] lines = input.split("\r\n");
		
		for(String line : lines) {
			String[] words = line.split(" ");
			boolean valid = true;
			for(int i = 0; i < words.length; i++) {
				char[] chars = words[i].toCharArray();
				Arrays.sort(chars);
				for(int j = 0; j < words.length; j++) {
					if(j==i) {
						continue;
					}
					char[] chars2 = words[j].toCharArray();
					Arrays.sort(chars2);
					if(chars.length==chars2.length) {
						boolean same = true;
						for(int k = 0; k < chars.length; k++) {
							if(chars[k]!=chars2[k]) {
								same = false;
								break;
							}
						}
						if(same) {
							valid = false;
						}
					}
				}
			}
			if(valid) {
				validAmount++;
			}
		}
		
		return validAmount;
	}
	
}
