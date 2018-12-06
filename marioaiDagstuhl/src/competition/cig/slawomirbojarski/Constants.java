package competition.cig.slawomirbojarski;

/**
 * Copyright (c) 2010, Slawomir Bojarski <slawomir.bojarski@maine.edu>
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
import ch.idsia.maibe.tasks.SystemOfValues;
import ch.idsia.mario.engine.sprites.Sprite;
import ch.idsia.mario.environments.Environment;

/**
 * All constants should be placed here.
 * This makes easier to manage the settings.
 * 
 * @author Slawomir Bojarski
 */
public class Constants {

	/** constants */
	public static final int VERBOSITY = 1; // 0: quiet, 1: small talk, 2: talkative, 3: blabbermouth
	public static final boolean USE_AGENT = true;
	public static final boolean USE_CHAMP = false; // use Robin Baumgarten's A* agent
	public static final boolean INFINITE = false;
	public static final String AGENT_NAME = "REALM";
	public static final int NUM_TRIALS = 1;
	public static final int DEFAULT_NUM_RULES = 20;
	public static final int NUM_BUTTONS = 5;
	public static final int MARIO_POS_X = Environment.HalfObsWidth;
	public static final int MARIO_POS_Y = Environment.HalfObsHeight;
	public static final int CLOSE_ENEMY = 3;
	public static final int CLOSE_ITEM = 5;
	public static final int CLOSE_OBSTACLE = 2;	
	public static final int JUMP_DISTANCE_SHORT = 2;
	public static final int JUMP_DISTANCE_LONG = 5;
	public static final String P_MUTATE_PROB = "mutate-prob";
	public static final String P_DONTCARE_PROB = "dontcare-prob";
	public static final String P_POP_FILE = "pop-file";
	public static final String P_RULES_FILE = "rules-file";
	public static final SystemOfValues FITNESS_MULTIPLIERS = new REALMSystemOfValues();
	public static final long TIME_LIMIT = 30; // time limit for finding A* path (in milliseconds)
	public static final boolean LIMIT_TIME = false; // do we want to limit the time to find a path?
	
	// level scene items
	public static final int NOTHING = 0;
	public static final int MARIO = Sprite.KIND_MARIO;
	public static final int BRICK_REGULAR = 16;
	public static final int BRICK_QUESTION = 21;
	public static final int BORDER_FULL = -10;
	public static final int BORDER_HALF = -11;
	public static final int ANGRYFLOWERPOT_OR_CANON = 20;
	
	// enemy scene items
	public static final int NO_ENEMY = Sprite.KIND_NONE;	
	public static final int ENEMY_GOOMBA = Sprite.KIND_GOOMBA;
	public static final int ENEMY_REDKOOPA = Sprite.KIND_RED_KOOPA;
	public static final int ENEMY_GREENKOOPA = Sprite.KIND_GREEN_KOOPA;
	public static final int ENEMY_SPIKY = Sprite.KIND_SPIKY;
	public static final int ENEMY_WINGED_GOOMBA = Sprite.KIND_GOOMBA_WINGED;	
	public static final int ENEMY_WINGED_REDKOOPA = Sprite.KIND_RED_KOOPA_WINGED;
	public static final int ENEMY_WINGED_GREENKOOPA = Sprite.KIND_GREEN_KOOPA_WINGED;
	public static final int ENEMY_WINGED_SPIKY = Sprite.KIND_SPIKY_WINGED;
	public static final int ENEMY_BULLETBILL = Sprite.KIND_BULLET_BILL;
	public static final int ENEMY_FLOWER = Sprite.KIND_ENEMY_FLOWER;
	
	public static final int ITEM_MUSHROOM = Sprite.KIND_MUSHROOM;
	public static final int ITEM_FIREFLOWER = Sprite.KIND_FIRE_FLOWER;
	public static final int ITEM_SHELL = Sprite.KIND_SHELL;
	public static final int ITEM_COIN = Sprite.KIND_COIN_ANIM;
	public static final int FIREBALL = Sprite.KIND_FIREBALL;
	
	// misc items
	public static final int JUMP = 100;
	public static final int PIT = 200;
	public static final int BRICK_NEARBY = 300;
	
	// colors
	public static final int BLACK = 0;
	public static final int RED = 1;
	public static final int GREEN = 2;
	public static final int BLUE = 3;
	public static final int YELLOW = 4;
	public static final int PURPLE = 5;
	public static final int CYAN = 6;
	public static final int WHITE = 7;
	
	// visual
	public static final boolean SHOW_VISUAL = true;
	public static final boolean DISPLAY_ACTIONS = true; // uses modified version of GlobalOptions (set to FALSE for competition!)
	
	// seeds
	public static final boolean FORCE_SEEDS = false;
	public static final int[] SEEDS = {
		425682409,
		425694390,
		425704976,
		425715585,
		425726189,
		425736285,
		425749302,
		425761016,
		425771982,
		425784440,
		425793750,
		425803886,
		425814558,
		425824376,
		425832846,
		425840844,
		425848321,
		425858001,
		425867726,
		425877077,
		425886217,
		425894325,
		425902791,
		425912992,
		425923020,
		425933363,
		425941805,
		425949160,
		425959145,
		425969633,
		425976756,
		425986327,
		425994437,
		426004001,
		426013779,
		426024718,
		426034995,
		426044018,
		426051557,
		426060826,
		426071276,
		426079761,
		426088933,
		426098822,
		426108684,
		426115765,
		426123238,
		426131918,
		426142515,
		426152475,
		426161972,
		426171465,
		426180414,
		426187788,
		426197035,
		426206593,
		426214417,
		426224830,
		426234289,
		426243972,
		426252123,
		426259305,
		426268065,
		426274630,
		426283851,
		426293073,
		426300841,
		426309623,
		426316224,
		426324817,
		426335064,
		426344383,
		426353865,
		426363677,
		426373647,
		426379571,
		426388009,
		426397720,
		426404743,
		426414020,
		426422869,
		426428271,
		426436755,
		426446038,
		426456920,
		426466565,
		426473941,
		426479806,
		426488627,
		426495484,
		426503705,
		426512493,
		426518158,
		426527207,
		426535788,
		426543474,
		426551803,
		426561184,
		426569876,
		426579106,
		426586887,
		426593638,
		426601958,
		426608959,
		426615755,
		426625050,
		426633004,
		426642211,
		426648593,
		426654473,
		426663777,
		426671190,
		426680456,
		426690270,
		426696616,
		426706502,
		426715569,
		426723340,
		426730019,
		426737083,
		426745742,
		426753929,
		426763689,
		426774157,
		426779697,
		426787586,
		426796269,
		426805847,
		426815292,
		426823292,
		426830952,
		426838963,
		426847901,
		426854455,
		426863689,
		426873271,
		426882085,
		426888658,
		426899499,
		426908829,
		426918314,
		426925030,
		426935269,
		426944106,
		426951657,
		426960226,
		426968896,
		426977352,
		426983670,
		426993712,
		427001540,
		427010153,
		427017311,
		427024914,
		427035270,
		427045521,
		427054838,
		427063743,
		427073579,
		427081592,
		427090085,
		427099540,
		427105870,
		427115126,
		427123990,
		427131774,
		427140352,
		427148198,
		427157414,
		427167016,
		427175070,
		427183949,
		427192323,
		427198521,
		427207357,
		427214564,
		427222183,
		427229027,
		427235826,
		427243245,
		427252202,
		427259517,
		427266063,
		427274251,
		427281340,
		427290137,
		427297107,
		427303323,
		427311777,
		427318668,
		427326488,
		427335478,
		427345364,
		427354267,
		427363890,
		427372454,
		427380604,
		427388987,
		427398739,
		427407745,
		427417583,
		427424699,
		427434050,
		427443888,
		427453690,
		427459586,
		427467557,
		427474953,
		427480825,
		427488637,
		427498672,
		427508150,
		427517518,
		427527332,
		427534308,
		427543594,
		427549481,
		427559053,
		427567191,
		427573634,
		427581486,
		427590732,
		427600262,
		427607377,
		427615933,
		427626176,
		427635788,
		427643883,
		427652504,
		427659157,
		427667473,
		427675706,
		427680364,
		427687358,
		427695282,
		427703056,
		427711426,
		427720743,
		427727875,
		427736813,
		427744415,
		427753853,
		427761409,
		427771058,
		427779001,
		427787081,
		427793798,
		427803186,
		427812805,
		427820276,
		427826758,
		427831782,
		427839076,
		427847294,
		427854201,
		427862592,
		427870955,
		427878357,
		427887642,
		427897145,
		427905100,
		427913238,
		427921256,
		427930046,
		427938134,
		427944964,
		427951490,
		427958406,
		427967377,
		427975550,
		427983774,
		427989079,
		427997149,
		428004210,
		428010973,
		428019816,
		428026814,
		428033107,
		428041212,
		428044693,
		428052950,
		428058308,
		428065551,
		428069441,
		428077671,
		428086577,
		428096232,
		428104347,
		428112206,
		428122392,
		428130144,
		428137195,
		428145837,
		428154638,
		428163925,
		428170830,
		428179983,
		428188140,
		428196172,
		428204853,
		428211441,
		428216864,
		428226823,
		428236126,
		428245475,
		428251789,
		428261289,
		428270241,
		428279293,
		428287267,
		428295513,
		428303936,
		428313285,
		428323208,
		428330950,
		428338542,
		428346729,
		428354919,
		428361614,
		428368120,
		428373851,
		428383078,
		428390475,
		428398033,
		428406771,
		428416571,
		428424873,
		428435181,
		428444762,
		428453173,
		428461377,
		428471449,
		428480272,
		428489912,
		428498762,
		428508174,
		428516169,
		428524174,
		428534585,
		428544295,
		428555378,
		428565220,
		428573501,
		428584393,
		428592755,
		428600658,
		428611812,
		428619973,
		428629481,
		428639570,
		428649439,
		428659712,
		428666500,
		428674390,
		428684251,
		428692537,
		428699434,
		428707547,
		428717680,
		428723786,
		428734857,
		428744599,
		428752097,
		428759888,
		428769079,
		428777244,
		428786411,
		428794649,
		428799565,
		428807698,
		428816779,
		428825056,
		428833422,
		428841000,
		428847909,
		428854864,
		428862315,
		428871455,
		428878062,
		428883748,
		428889276,
		428895056,
		428903152,
		428911766,
		428921256,
		428929541,
		428938332,
		428948063,
		428956964,
		428964806,
		428974256,
		428982552,
		428988932,
		428997536,
		429005877,
		429013454,
		429021301,
		429028251,
		429036619,
		429044292,
		429053422,
		429062700,
		429072152,
		429080646,
		429089145,
		429096820,
		429105788,
		429112746,
		429122454,
		429129819,
		429135790,
		429140472,
		429148452,
		429154835,
		429162932,
		429170611,
		429180131,
		429188282,
		429194580,
		429203307,
		429212319,
		429219105,
		429227438,
		429236401,
		429245680,
		429255169,
		429265391,
		429271137,
		429280370,
		429287511,
		429296909,
		429304217,
		429314600,
		429320599,
		429326066,
		429333228,
		429340499,
		429349838,
		429360966,
		429370648,
		429378350,
		429386770,
		429395728,
		429404843,
		429413177,
		429422733,
		429430977,
		429436681,
		429442268,
		429452279,
		429458155,
		429464741,
		429472177,
		429479784,
		429487317,
		429497207,
		429503399,
		429511119,
		429520784,
		429528523,
		429537075,
		429544423,
		429552860,
		429561040,
		429569477,
		429579283,
		429587552,
		429595711,
		429605137,
		429613307,
		429622977,
		429631979,
		429640913,
		429651483,
		429660400,
		429667342,
		429675777,
		429685104,
		429693784,
		429698973,
		429705005,
		429713429,
		429722789,
		429731721,
		429739256,
		429746845,
		429753948,
		429760634,
		429765807,
		429772071,
		429779655,
		429787852,
		429793715,
		429802617,
		429812220,
		429820248,
		429829850,
		429837368,
		429848746,
		429854852,
		851794899,
		851804097,
		851811480,
		851821237,
		851829628,
		851837417,
		851846460,
		851854595,
		851864098,
		851871685,
		851881929,
		851889399,
		851897556,
		851907092,
		851916165,
		851925391,
		851935732,
		851945817,
		851955546,
		851965140,
		851974278,
		851983842,
		851991417,
		851999816,
		852009873,
		852019281,
		852026617,
		852032638,
		852039914,
		852046018,
		852055395,
		852061839,
		852070855,
		852079802,
		852089228,
		852096768,
		852105228,
		852113672,
		852120743,
		852128360,
		852137092,
		852146595,
		852153538,
		852161362,
		852168184,
		852175701,
		852183131,
		852192248,
		852202630,
		852210116,
		852217118,
		852222789,
		852229846,
		852237821,
		852244893,
		852251189,
		852258179,
		852267803,
		852276308,
		852283590,
		852290690,
		852296592,
		852303723,
		852312208,
		852320497,
		852328381,
		852337200,
		852343342,
		852350248,
		852359838,
		852368675,
		852376202,
		852383156,
		852389839,
		852399277,
		852405772,
		852413792,
		852421489,
		852429896,
		852433987,
		852440532,
		852449376,
		852457303,
		852464410,
		852473283,
		852480782,
		852489573,
		852495343,
		852504695,
		852512608,
		852521787,
		852529416,
		852534465,
		852543871,
		852553386,
		852563078,
		852571805,
		852580141,
		852586539,
		852595415,
		852604045,
		852610201,
		852618709,
		852626996,
		852635036,
		852643513,
		852652514,
		852662826,
		852669746,
		852679433,
		852690561,
		852698292,
		852708202,
		852716423,
		852723724,
		852732300,
		852741496,
		852750777,
		852759986,
		852770369,
		852778213,
		852787439,
		852796460,
		852805454,
		852812836,
		852822063,
		852830898,
		852839923,
		852847731,
		852856273,
		852861365,
		852869991,
		852878170,
		852887413,
		852895134,
		852904649,
		852912667,
		852921819,
		852927763,
		852936445,
		852945771,
		852953246,
		852961668,
		852968160,
		852975012,
		852984283,
		852993142,
		853000406,
		853009670,
		853020727,
		853027327,
		853034554,
		853043485,
		853049442,
		853056539,
		853064391,
		853069915,
		853078477,
		853084811,
		853090466,
		853098232,
		853105911,
		853114902,
		853122443,
		853130646,
		853138856,
		853145575,
		853152209,
		853161109,
		853167632,
		853174020,
		853182495,
		853190721,
		853196499,
		853203438,
		853213615,
		853223561,
		853230395,
		853238718,
		853247398,
		853256106,
		853262495,
		853271730,
		853281533,
		853289225,
		853295438,
		853303795,
		853315098,
		853324180,
		853333029,
		853339999,
		853349734,
		853359636,
		853365937,
		853372230,
		853380145,
		853387989,
		853395921,
		853404668,
		853413895,
		853423873,
		853433897,
		853441582,
		853449008,
		853455190,
		853460976,
		853469234,
		853478394,
		853485266,
		853493608,
		853501302,
		853509999,
		853519173,
		853526925,
		853534706,
		853543900,
		853553537,
		853560848,
		853568852,
		853574936,
		853582241,
		853589893,
		853597070,
		853606938,
		853614070,
		853622363,
		853632583,
		853639451,
		853646430,
		853652580,
		853660054,
		853669334,
		853675394,
		853681625,
		853688056,
		853695581,
		853704550,
		853711555,
		853720055,
		853727155,
		853736728,
		853745898,
		853756086,
		853764275,
		853770899,
		853779088,
		853788567,
		853798360,
		853806562,
		853814625,
		853820890,
		853825793,
		853834596,
		853841338,
		853847780,
		853856256,
		853867214,
		853873870,
		853881755,
		853891401,
		853899972,
		853907131,
		853913676,
		853923445,
		853932330,
		853939199,
		853947914,
		853955665,
		853965825,
		853974052,
		853983805,
		853993192,
		854002894,
		854008340,
		854018628,
		854027223,
		854035887,
		854041011,
		854048427,
		854055122,
		854061144,
		854070115,
		854076984,
		854082114,
		854089992,
		854098757,
		854108349,
		854117380,
		854126713,
		854135968,
		854145929,
		854155037,
		854161820,
		854170922,
		854179701,
		854187023,
		854196840,
		854204347,
		854212716,
		854220282,
		854229911,
		854236906,
		854244120,
		854250702,
		854256996,
		854263869,
		854272561,
		854280679,
		854287405,
		854295874,
		854304650,
		854313215,
		854319940,
		854327071,
		854335844,
		854345644,
		854357107,
		854364242,
		854373553,
		854380485,
		854389574,
		854400025,
		854407696,
		854413428,
		854419977,
		854429059,
		854436803,
		854443466,
		854449687,
		854458654,
		854466401,
		854474593,
		854482801,
		854491278,
		854500640,
		854510936,
		854518681,
		854526042,
		854534671,
		854544287,
		854552827,
		854562017,
		854570603,
		854578134,
		854588650,
		854597825,
		854606645,
		854613950,
		854622047,
		854631071,
		854639782,
		854645639,
		854654765,
		854664465,
		854670170,
		854678788,
		854685305,
		854693841,
		854700441,
		854707615,
		854714745,
		854723294,
		854731930,
		854740978,
		854750515,
		854760701,
		854769070,
		854776306,
		854784395,
		854792377,
		854800040,
		854809017,
		854816727,
		854826755,
		854834836,
		854842475,
		854850089,
		854857414,
		854866441,
		854874188,
		854880092,
		854885750,
		854893573,
		854900310,
		854908306,
		854916396,
		854923189,
		854931401,
		854940282,
		854949160,
		854957782,
		854966284,
		854974430,
		854983059,
		854990307,
		854998938,
		855006259,
		855014204,
		855019866,
		855027892,
		855035422,
		855044968,
		855051616,
		855058740,
		855067993,
		855075491,
		855082538,
		855091842,
		855098990,
		855106367,
		855112833,
		855121574,
		855130363,
		855138787,
		855149398,
		855156527,
		855165320,
		855173223,
		855179006,
		855184765,
		855193041,
		855199764,
		855208487,
		855217836,
		855225539,
		855234386,
		855241158,
		855249813,
		855260282,
		855269618,
		855279389,
		855287399,
		855296241,
		855305478,
		855313617,
		855322017,
		855332376,
		855339443,
		855347623,
		855355884,
		855361533,
		855369810,
		855377781,
		855384946,
		855393661,
		855402288,
		855407375,
		855416124,
		855425037,
		855433035,
		855440794,
		855447510,
		855456440,
		855464465,
		855471493,
		855478359,
		855486978,
		855495424,
		855502480,
		855511679,
		855520386,
		855529223,
		855538620,
		855549020,
		855555879,
		855564327,
		855573416,
		855583004,
		855593065,
		855601711,
		855609486,
		855618489,
		855628141,
		855636528,
		855643005,
		855653517,
		855661036,
		855669478,
		855674805,
		855682561,
		855687864,
		855696509,
		855703756,
		855711252,
		855717465,
		855728730,
		855738938,
		855745072,
		855752266,
		855761120,
		855768075,
		855774660,
		855782648,
		855789914,
		855798454,
		855806879,
		855815804,
		855823992,
		855832783,
		855841846 
	};
}
