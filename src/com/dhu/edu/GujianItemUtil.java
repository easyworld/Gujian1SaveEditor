package com.dhu.edu;

import java.util.HashMap;
import java.util.Map;

/**
 * 古剑奇谭 物品对照表（数据来自http://bbs.52miji.com/thread-6489-1-1.html）
 * 
 * @author Home
 *
 */
public class GujianItemUtil {
	public static Map<String, String> itemMap;
	static {
		itemMap = new HashMap<String, String>();
		itemMap.put("1001", "鹿活草（回血100）");
		itemMap.put("1002", "金创药（回血300）");
		itemMap.put("1003", "舒筋定痛散（回复大量精）");
		itemMap.put("1006", "化香果（回蓝100）");
		itemMap.put("1007", "养心丹（回蓝300）");
		itemMap.put("1013", "帝女玄霜（完全恢复单人的精、神）");
		itemMap.put("1014", "七返灵砂（单人复活，并恢复少量精）");
		itemMap.put("1016", "苏酥甜心糕（恢复微量精、神，并提升对屠苏的好感度）");
		itemMap.put("1201", "八风散（解混乱、残废）");
		itemMap.put("1202", "木香活气散（解冰冻、金属化）");
		itemMap.put("1203", "广灵丹（解毒）");
		itemMap.put("1204", "扶元散（解衰弱）");
		itemMap.put("1205", "白花丹参（解单人所有不良状态）");
		itemMap.put("1206", "五行七叶丸（一时提升五行各属性灵力）");
		itemMap.put("1207", "决明果（一时提升土灵力，降低水灵力）");
		itemMap.put("1208", "寒食散（一时提升水灵力，降低火灵力）");
		itemMap.put("1209", "紫阳丹（一时提升火灵力，降低金灵力）");
		itemMap.put("1210", "玉泉酿（一时提升金灵力，降低木灵力）");
		itemMap.put("1211", "莲花饮（一时提升木灵力，降低土灵力）");
		itemMap.put("1212", "七杀破军符（一时提升攻击）");
		itemMap.put("1213", "红鸾天喜符（一进提升吉运）");
		itemMap.put("1214", "空劫疾遁符（一进提升敏捷）");
		itemMap.put("1215", "天府金钟符（一时提升防御）");
		itemMap.put("1216", "九鹭香（一时进入无敌状态）");
		itemMap.put("1217", "真如幻镜（一时进入法术反弹状态）");
		itemMap.put("1218", "护心鉴（一时进入物理反弹状态）");
		itemMap.put("1219", "狗皮膏药（随机获得有利状态）");
		itemMap.put("1220", "清神定气符（一时攻防敏运全面上升）");
		itemMap.put("1221", "归星砂（重置星蕴）");
		itemMap.put("1222", "玉女元参（中和地仙扑卖带来的效果）");
		itemMap.put("1223", "归元仙露（脱离迷宫，瞬间回到入口）");
		itemMap.put("1224", "流霞仙酿（使用即可保存当前 的进度）");
		itemMap.put("1401", "飞镖");
		itemMap.put("1402", "燕子金镖");
		itemMap.put("1403", "乾坤夺命镖");
		itemMap.put("1404", "毒蒺藜");
		itemMap.put("1405", "子午向心钉");
		itemMap.put("1406", "木梅针");
		itemMap.put("1407", "火龙镖");
		itemMap.put("1408", "土魂砂");
		itemMap.put("1409", "金莲珠");
		itemMap.put("1410", "冰魄筒");
		itemMap.put("1411", "变木生杀符 高级攻击符");
		itemMap.put("1412", "引火燎原符 高级攻击符");
		itemMap.put("1413", "凝土撼地符 高级攻击符");
		itemMap.put("1414", "点金轰鸣符 高级攻击符");
		itemMap.put("1415", "降霜冻天符 高级攻击符");
		itemMap.put("1416", "棉里金针");
		itemMap.put("1417", "花雨满天");
		itemMap.put("1418", "流风散云");
		itemMap.put("1419", "神火飞鸦");
		itemMap.put("1420", "卷土滚石");
		itemMap.put("1421", "掌心雷");
		itemMap.put("1422", "飞蝗石");
		itemMap.put("1423", "龙须钩");
		itemMap.put("1424", "瘟癀伞");
		itemMap.put("1425", "戮魂幡");
		itemMap.put("1426", "缚妖索");
		itemMap.put("1427", "乱心尘");
		itemMap.put("1428", "袖炮");
		itemMap.put("1429", "双落霜");
		itemMap.put("1430", "六骰格");
		itemMap.put("1431", "乾坤针");
		itemMap.put("1432", "爆竹");
		itemMap.put("1601", "调料");
		itemMap.put("1602", "面粉");
		itemMap.put("1603", "稻米");
		itemMap.put("1604", "辣椒");
		itemMap.put("1605", "八角茴香");
		itemMap.put("1606", "桂皮");
		itemMap.put("1607", "嫩叶");
		itemMap.put("1608", "粽叶");
		itemMap.put("1609", "桃花");
		itemMap.put("1610", "牡丹");
		itemMap.put("1611", "茉莉");
		itemMap.put("1612", "荷花");
		itemMap.put("1613", "丹桂");
		itemMap.put("1614", "萱草");
		itemMap.put("1615", "菊花");
		itemMap.put("1616", "梅花");
		itemMap.put("1617", "昙花");
		itemMap.put("1618", "莲藕");
		itemMap.put("1619", "青菜");
		itemMap.put("1620", "黄瓜");
		itemMap.put("1621", "茄子");
		itemMap.put("1622", "萝卜");
		itemMap.put("1623", "禽蛋");
		itemMap.put("1624", "豆腐");
		itemMap.put("1625", "禽肉");
		itemMap.put("1626", "母鸡");
		itemMap.put("1627", "肥鸭");
		itemMap.put("1628", "鱼");
		itemMap.put("1629", "兽肉");
		itemMap.put("1630", "虾");
		itemMap.put("1631", "螃蟹");
		itemMap.put("1632", "嫩笋");
		itemMap.put("1633", "香蕈");
		itemMap.put("1634", "人参");
		itemMap.put("1635", "蜜糖（食材，恢复微量精）");
		itemMap.put("1636", "茶叶（食材，恢复微量精）");
		itemMap.put("1637", "果仁（食材，恢复微量精）");
		itemMap.put("1638", "蔬果（食材，恢复微量精）");
		itemMap.put("1639", "枸杞（食材，恢复微量神）");
		itemMap.put("1640", "莲子（食材，恢复微量神）");
		itemMap.put("1641", "银耳（食材，恢复微量神）");
		itemMap.put("1642", "女儿红（食材，恢复微量神，不能在战斗中使用）");
		itemMap.put("1651", "蔬果种子");
		itemMap.put("1652", "萝卜种子");
		itemMap.put("1653", "桂花种子");
		itemMap.put("1654", "菊花种子");
		itemMap.put("1655", "梅花种子");
		itemMap.put("1656", "桃花种子");
		itemMap.put("1657", "茉莉种子");
		itemMap.put("1658", "牡丹种子");
		itemMap.put("1659", "鱼虫");
		itemMap.put("1660", "草木灰");
		itemMap.put("1661", "花肥");
		itemMap.put("1701", "蜜糖山楂（恢复微量神，羡慕解混乱）");
		itemMap.put("1702", "水引");
		itemMap.put("1703", "火腿");
		itemMap.put("1704", "茶叶蛋（恢复少量精、神）");
		itemMap.put("1705", "龙井虾仁（恢复中量神，并解毒）");
		itemMap.put("1706", "宋嫂鱼羹（恢复少量精，不能在战斗中使用）");
		itemMap.put("1707", "猫耳朵（恢复少量精）");
		itemMap.put("1708", "金刚酥（一时提升防御）");
		itemMap.put("1709", "鱼头煲（恢复少量神，不能在战斗中使用）");
		itemMap.put("1710", "蛋炒饭（恢复中量精）");
		itemMap.put("1711", "拉不断面");
		itemMap.put("1712", "凤穿牡丹（单人复活，并恢复少量精、神）");
		itemMap.put("1713", "葵花献肉（单人复活，并恢复中量精）");
		itemMap.put("1714", "金钱虾饼（一时提升防御、吉运，并恢复中量精、神）");
		itemMap.put("1715", "麒麟鲈鱼（恢复中量精神）");
		itemMap.put("1716", "藕粥（恢复少量精）");
		itemMap.put("1717", "菊花羹（恢复少量精、神，并解混乱）");
		itemMap.put("1718", "梅花粥（一时提升吉运，恢复中量精，差解毒、衰弱）");
		itemMap.put("1719", "酉羹（恢复中量精、神，不能在战斗中使用）");
		itemMap.put("1720", "枸杞炖银耳（恢复中量神，并解毒，只能在战斗中使用）");
		itemMap.put("1721", "人参茉莉茶（恢复中量精，不能在战斗中使用）");
		itemMap.put("1722", "翰林鸡（一时进入法术吸收状态，并恢复中量精）");
		itemMap.put("1723", "昙花冻（恢复中量精、神，并解金属化、冰冻、残废）");
		itemMap.put("1724", "诗礼银杏（一时提升防御、吉运，并恢复大量神）");
		itemMap.put("1725", "元宝肉（一时提升金属性灵力，解金属化，并恢复中量精）");
		itemMap.put("1726", "玉带虾仁（一时提升水属性灵力、敏捷，并恢复大量神）");
		itemMap.put("1727", "糖元宝（恢复少量精）");
		itemMap.put("1728", "天花饆饠（恢复中量精，解毒、衰弱，并提升反击频率，持续五回合）");
		itemMap.put("1729", "蜜汁莲藕（解衰弱、混乱）");
		itemMap.put("1730", "老藕排骨汤（恢复中量精，不能在战斗中使用）");
		itemMap.put("1731", "蟹黄虾仁（大幅提升对各种攻击的耐性，持续三回合并解冰冻、金属化）");
		itemMap.put("1732", "老鸭汤（恢复中量精神，不能在战斗中使用）");
		itemMap.put("1733", "笋烩菊红（恢复中量精，并解毒、残废）");
		itemMap.put("1734", "荷花茶（恢复大量神，不能在战斗中使用）");
		itemMap.put("1735", "半月沉江（解冰冻、衰弱、残废、金属化）");
		itemMap.put("1736", "牡丹银耳汤（恢复中量精、神，并解毒）");
		itemMap.put("1737", "罗汉斋（一时提升攻击、防御，并解混乱）");
		itemMap.put("1738", "鱼香炒（恢复中量精、神，并解冰冻）");
		itemMap.put("1739", "樟茶鸭（解毒混乱、衰弱、金属化）");
		itemMap.put("1740", "寒门造福");
		itemMap.put("1741", "东安子鸡");
		itemMap.put("1742", "麻婆豆腐（一时提升攻击、敏捷，降低防御、吉运，并恢复中量精神）");
		itemMap.put("1743", "灯影牛肉（恢复中量精神，解冰冻）");
		itemMap.put("1744", "夫妻肺片（单人复活，恢复大量精，并提升反击频率，持续三回合）");
		itemMap.put("1745", "踏雪寻梅（恢复大量精神，不能在战斗中使用）");
		itemMap.put("1746", "茄鲞（一时提升五行各属性灵力）");
		itemMap.put("1747", "松鼠鳜鱼（恢复大量神，并解金属化、冰冻、残废）");
		itemMap.put("1748", "槐叶冷淘（恢复中量精、大量神，并解混乱）");
		itemMap.put("1749", "八宝鸭（解除全体所有不良状态）");
		itemMap.put("1750", "叫化鸡（全员恢复大量精、神）");
		itemMap.put("1751", "碎金饭（恢复大量精神）");
		itemMap.put("1752", "一品豆腐（全员完全恢复精并解毒）");
		itemMap.put("1753", "菊花鲈鱼羹（完全恢复单人的精、神，不能在战斗中使用）");
		itemMap.put("1754", "焦炭（恢复微量精，并降低对屠苏的好感度）");
		itemMap.put("1756", "糖葫芦（恢复微量精神）");
		itemMap.put("1757", "烂面疙瘩");
		itemMap.put("1758", "鬼见愁");
		itemMap.put("1759", "极臭豆腐");
		itemMap.put("1760", "松花弹");
		itemMap.put("1761", "一闻就醉虾");
		itemMap.put("1762", "一砸就晕酥");
		itemMap.put("1763", "难舍难分糖");
		itemMap.put("1764", "神仙豆腐（一时进入无敌、物理反弹、法术反弹状态）");
		itemMap.put("1768", "好逑汤（一时提升敏捷）");
		itemMap.put("1769", "环饼（一时提升攻击）");
		itemMap.put("1770", "青团（恢复少量精神）");
		itemMap.put("1771", "糯米角粽（恢复少量神、解毒）");
		itemMap.put("1772", "赐绯含香粽（恢复中量神，解毒）");
		itemMap.put("1774", "丹桂花糕（恢复大量神，解衰弱、残废）");
		itemMap.put("2001", "小辣椒");
		itemMap.put("2002", "小草团");
		itemMap.put("2003", "桃核");
		itemMap.put("2004", "翠葫芦");
		itemMap.put("2005", "红石蕊");
		itemMap.put("2006", "小石子");
		itemMap.put("2007", "大石块");
		itemMap.put("2008", "青凛艮");
		itemMap.put("2009", "化蛇佩");
		itemMap.put("2010", "毒犬齿");
		itemMap.put("2011", "铁令牌");
		itemMap.put("2012", "木令牌");
		itemMap.put("2013", "竹晴蜓");
		itemMap.put("2014", "大草团");
		itemMap.put("2015", "五色绒");
		itemMap.put("2016", "薄翼");
		itemMap.put("2017", "鼠尾");
		itemMap.put("2018", "小猪苔");
		itemMap.put("2019", "獠牙");
		itemMap.put("2020", "草帽");
		itemMap.put("2021", "破木棍");
		itemMap.put("2022", "骰子");
		itemMap.put("2023", "尘心");
		itemMap.put("2024", "粉葫芦");
		itemMap.put("2025", "烂木棍");
		itemMap.put("2026", "断匕首");
		itemMap.put("2027", "蜈蚣爪");
		itemMap.put("2028", "玉蜘蛛");
		itemMap.put("2029", "琥珀针");
		itemMap.put("2030", "鱼尖枪");
		itemMap.put("2031", "苍蛇翼");
		itemMap.put("2032", "首张凝晶");
		itemMap.put("2033", "魔眼");
		itemMap.put("2034", "犬齿");
		itemMap.put("2035", "赤针");
		itemMap.put("2036", "骨磷");
		itemMap.put("2037", "娃娃鼓");
		itemMap.put("2038", "鬼女白发");
		itemMap.put("2039", "残烛");
		itemMap.put("2040", "鬼脊");
		itemMap.put("2041", "鬼青玉");
		itemMap.put("2042", "血红袖");
		itemMap.put("2043", "朱丝角");
		itemMap.put("2044", "鬼哭棒");
		itemMap.put("2045", "秦陵遗骨");
		itemMap.put("2046", "青铜戈");
		itemMap.put("2047", "青铜箭");
		itemMap.put("2048", "青铜令牌");
		itemMap.put("2049", "青铜轴");
		itemMap.put("2050", "金鳌须");
		itemMap.put("2051", "瑶扇");
		itemMap.put("2052", "莔莔帽子");
		itemMap.put("2053", "龙翼");
		itemMap.put("2054", "硬石骨");
		itemMap.put("2055", "蝎须");
		itemMap.put("2056", "绯晶");
		itemMap.put("2057", "尸衣");
		itemMap.put("2058", "荧惑之角");
		itemMap.put("2059", "犬牙项链");
		itemMap.put("2060", "蟒鳞");
		itemMap.put("2061", "五色羽");
		itemMap.put("2062", "虬须");
		itemMap.put("2063", "柏枝");
		itemMap.put("2064", "藤条");
		itemMap.put("2065", "曼陀花");
		itemMap.put("2066", "猿毛");
		itemMap.put("2067", "赤火珠");
		itemMap.put("2068", "锁炎环");
		itemMap.put("2069", "火爪");
		itemMap.put("2070", "大还丹");
		itemMap.put("2071", "丧魂爪");
		itemMap.put("2072", "灵犀骨");
		itemMap.put("2073", "兽面木盔");
		itemMap.put("2074", "六棱雪花");
		itemMap.put("2075", "冰魂");
		itemMap.put("2076", "狮角");
		itemMap.put("2077", "白熊毛");
		itemMap.put("2078", "双纹翼");
		itemMap.put("2079", "青丝角");
		itemMap.put("2080", "霞袖");
		itemMap.put("2081", "鬼哭弦");
		itemMap.put("2082", "镇仙枰");
		itemMap.put("2083", "蓬莱旧闻抄");
		itemMap.put("2084", "仕女图");
		itemMap.put("2085", "锐趾");
		itemMap.put("2086", "幽炎羽");
		itemMap.put("2087", "苍云角");
		itemMap.put("2088", "冥灰");
		itemMap.put("2089", "烛龙铸钱");
		itemMap.put("2090", "小布老虎");
		itemMap.put("2091", "妆糕人");
		itemMap.put("2092", "风筝");
		itemMap.put("2093", "文房四宝");
		itemMap.put("2094", "雪人年画");
		itemMap.put("2095", "灵剑簪");
		itemMap.put("2096", "金丝箜篌");
		itemMap.put("2097", "君子扇");
		itemMap.put("2098", "金犬 袍");
		itemMap.put("2099", "碧波琉璃灯");
		itemMap.put("2100", "锈菜刀");
		itemMap.put("2101", "黑风眉");
		itemMap.put("2102", "精金护");
		itemMap.put("2103", "狐绒扇");
		itemMap.put("2104", "毛绒帽子");
		itemMap.put("2105", "喜帕");
		itemMap.put("2106", "棕熊毛");
		itemMap.put("2107", "精铁块");
		itemMap.put("2108", "寒玉剑柄");
		itemMap.put("2109", "玉扣");
		itemMap.put("2110", "七宝净灵符");
		itemMap.put("2111", "金丝绦");
		itemMap.put("2112", "妖藤魂精");
		itemMap.put("2113", "妖藤魂玉");
		itemMap.put("2114", "噬月银齿");
		itemMap.put("2115", "陈年女儿红");
		itemMap.put("2117", "道木穗");
		itemMap.put("2118", "龙鰭金冠");
		itemMap.put("2119", "东海鲲纱");
		itemMap.put("2120", "蓝木羽");
		itemMap.put("2121", "铜镜");
		itemMap.put("2122", "紫日雕羽");
		itemMap.put("2123", "赤蛇杖");
		itemMap.put("2124", "冰心");
		itemMap.put("2125", "三昧噬天翼");
		itemMap.put("2126", "九幽焰骨");
		itemMap.put("2127", "妖君焚魔角");
		itemMap.put("2128", "九霄环佩琴");
		itemMap.put("2129", "古榣木");
		itemMap.put("2130", "百胜刀");
		itemMap.put("2131", "红肚兜");
		itemMap.put("3001", "草扎");
		itemMap.put("3002", "玉横");
		itemMap.put("3003", "玉石碎片");
		itemMap.put("3004", "紫檀佛珠");
		itemMap.put("3005", "包袱");
		itemMap.put("3006", "焚寂");
		itemMap.put("3007", "泥人");
		itemMap.put("3008", "破烂的卷轴");
		itemMap.put("3009", "沙棠");
		itemMap.put("3010", "仙芝");
		itemMap.put("3011", "黑龙鳞片");
		itemMap.put("3012", "仙芝漱魂丹");
		itemMap.put("3013", "剑谱");
		itemMap.put("3014", "木头面具");
		itemMap.put("3015", "厅形钥匙");
		itemMap.put("3016", "含香紫玉珠");
		itemMap.put("3017", "夜明珠");
		itemMap.put("3018", "青铜钥匙");
		itemMap.put("3019", "千钧令");
		itemMap.put("3020", "呼呼果");
		itemMap.put("3021", "山庄钥匙");
		itemMap.put("4000", "神秘包袱（通关后获得的神秘礼包）");
		itemMap.put("4001", "神秘药1（全体精气神全恢复）");
		itemMap.put("4002", "神秘药2（开启全角色全技能）");
		itemMap.put("11001", "简陋木屋");
		itemMap.put("11002", "普通小屋");
		itemMap.put("11003", "华丽民居");
		itemMap.put("11101", "普通方桌");
		itemMap.put("11102", "华丽方桌");
		itemMap.put("11103", "竹方桌");
		itemMap.put("11201", "普通茶几");
		itemMap.put("11202", "华丽茶几");
		itemMap.put("11203", "竹茶几");
		itemMap.put("11301", "普通书桌");
		itemMap.put("11302", "吹雪小案");
		itemMap.put("11303", "吹雪小桌");
		itemMap.put("11304", "笔墨书香");
		itemMap.put("11305", "棋桌");
		itemMap.put("11307", "异域风情");
		itemMap.put("11401", "普通椅子");
		itemMap.put("11402", "华丽椅子");
		itemMap.put("11403", "吹雪小椅");
		itemMap.put("11404", "笔墨书香");
		itemMap.put("11405", "竹椅");
		itemMap.put("11501", "普通矮柜");
		itemMap.put("11502", "普通矮桌");
		itemMap.put("11503", "华丽矮桌");
		itemMap.put("11504", "阶梯矮桌");
		itemMap.put("11601", "长剑收藏架");
		itemMap.put("11602", "双剑收藏架");
		itemMap.put("11603", "重剑收藏架");
		itemMap.put("11604", "巨镰收藏架");
		itemMap.put("11605", "扇收藏架");
		itemMap.put("11606", "佛珠收藏架");
		itemMap.put("11701", "木榻");
		itemMap.put("11702", "木床");
		itemMap.put("11703", "竹床");
		itemMap.put("11704", "木帐床");
		itemMap.put("11709", "石床");
		itemMap.put("11710", "贝壳床");
		itemMap.put("11801", "古剑卷轴竖");
		itemMap.put("11802", "古剑卷轴横");
		itemMap.put("11803", "扇面");
		itemMap.put("11804", "山水");
		itemMap.put("11805", "蜻蜓点荷");
		itemMap.put("11806", "牡丹");
		itemMap.put("11807", "年年有鱼");
		itemMap.put("11808", "海图");
		itemMap.put("11809", "琴川");
		itemMap.put("11811", "甘泉村");
		itemMap.put("11812", "安陆");
		itemMap.put("11814", "龙绡宫");
		itemMap.put("11815", "青玉坛");
		itemMap.put("11817", "忘川蒿里");
		itemMap.put("11818", "童年记忆");
		itemMap.put("11820", "紫榕");
		itemMap.put("11821", "远眺");
		itemMap.put("11901", "对联甲");
		itemMap.put("11902", "对联乙");
		itemMap.put("11903", "对联丙");
		itemMap.put("11904", "对联丁");
		itemMap.put("11905", "对联戊");
		itemMap.put("11906", "对联已");
		itemMap.put("11907", "对联庚");
		itemMap.put("11908", "对联辛");
		itemMap.put("11909", "对联壬");
		itemMap.put("11910", "对联癸");
		itemMap.put("12001", "三彩花瓶");
		itemMap.put("12002", "三彩马俑");
		itemMap.put("12003", "三彩壶");
		itemMap.put("12004", "红灯笼");
		itemMap.put("12005", "花瓶");
		itemMap.put("12006", "烛灯");
		itemMap.put("12007", "精致花瓶");
		itemMap.put("12008", "金元宝");
		itemMap.put("12009", "白瓷花瓶");
		itemMap.put("12010", "精美铜镜");
		itemMap.put("12011", "铜烛台");
		itemMap.put("12012", "财神像");
		itemMap.put("12013", "荷花灯");
		itemMap.put("12017", "青铜灯");
		itemMap.put("12018", "梅花束");
		itemMap.put("12019", "牡丹束");
		itemMap.put("12020", "茉莉束");
		itemMap.put("12021", "菊花束");
		itemMap.put("12022", "桃花束");
		itemMap.put("12023", "守辛");
		itemMap.put("12024", "月如钩");
		itemMap.put("12101", "红地毯");
		itemMap.put("12102", "蓝地毯");
		itemMap.put("12103", "黄地毯");
		itemMap.put("12104", "家乡地毯");
		itemMap.put("12105", "西域地毯");
		itemMap.put("12201", "粗瓷茶具");
		itemMap.put("12202", "青瓷茶壶");
		itemMap.put("12203", "白瓷茶具");
		itemMap.put("12204", "竹茶具");
		itemMap.put("12205", "紫砂茶壶");
		itemMap.put("12206", "贝壳茶壶");
		itemMap.put("12207", "银器");
		itemMap.put("12301", "福字剪纸");
		itemMap.put("12302", "双喜剪纸");
		itemMap.put("12303", "凤凰剪纸");
		itemMap.put("12304", "花鸟剪纸甲");
		itemMap.put("12305", "花鸟剪纸乙");
		itemMap.put("12501", "鸟架");
		itemMap.put("12502", "武艺挂轴");
		itemMap.put("12503", "芦花鸡");
		itemMap.put("12504", "鹅");
		itemMap.put("12505", "兔子");
		itemMap.put("12506", "狗");
		itemMap.put("12507", "白猫");
		itemMap.put("12508", "黑猫");
		itemMap.put("12509", "黄猫");
		itemMap.put("12510", "公鸡");
		itemMap.put("12511", "母鸡");
		itemMap.put("12512", "小鸡");
		itemMap.put("12513", "鸭子");
		itemMap.put("12514", "草人屠苏");
		itemMap.put("12515", "草人兰生");
		itemMap.put("12516", "草人千觞");
		itemMap.put("12517", "草人晴雪");
		itemMap.put("12518", "草人襄铃");
		itemMap.put("12519", "草人红玉");
		itemMap.put("12520", "草人少恭");
		itemMap.put("21001", "树枝（攻+3，敏+1）");
		itemMap.put("21002", "黄铜剑（剑，攻+10）");
		itemMap.put("21003", "生铁剑（剑，攻+14）");
		itemMap.put("21004", "青钢剑（剑，攻+18）");
		itemMap.put("21005", "霄河（剑攻+49）");
		itemMap.put("21006", "噬月（剑，攻+44）");
		itemMap.put("21007", "松纹剑（剑，攻+25）");
		itemMap.put("21008", "鱼腹剑（剑，攻+40）");
		itemMap.put("21009", "盘云剑（剑，攻+45）");
		itemMap.put("21010", "定光剑（剑，攻+61）");
		itemMap.put("21011", "白虹（剑，攻+65）");
		itemMap.put("21012", "却邪剑（剑，攻+80，容易招架敌人的攻击）");
		itemMap.put("21013", "青冥（剑，攻+100）");
		itemMap.put("21014", "墨阳剑（剑，攻+124）");
		itemMap.put("21015", "秋水（剑，攻+145，基本攻击追加冰冻，容易招架敌人的攻击）");
		itemMap.put("21016", "照胆剑（tusu 攻+177）");
		itemMap.put("21017", "玄霜（tusu，攻+185，水属性灵力提升，容易招架敌人的攻击）");
		itemMap.put("21018", "思召（tusu,攻+220,金属性灵力提升)");
		itemMap.put("21019", "承影（tusu，攻+270，木属性灵力提升）");
		itemMap.put("21020", "鱼骨头（tusu，攻+199，战斗中自动恢复精）");
		itemMap.put("21021", "古剑流光（tusu,攻+320，土属性灵力提升）");
		itemMap.put("21022", "凶剑血残（tusu，攻+330，攻击时会吸收对手的生命力）");
		itemMap.put("21023", "劫剑红莲（tusu，攻+400，火属性灵力提升，非常容易招架敌人的攻击）");
		itemMap.put("21025", "古剑焚寂（tusu,攻+550，防-130，运-140）");
		itemMap.put("21101", "紫檀佛珠（攻+10）");
		itemMap.put("21102", "赤铜佛珠（攻+20）");
		itemMap.put("21103", "无患子珠（佛珠，攻+30）");
		itemMap.put("21104", "沉香珠（攻+42）");
		itemMap.put("21105", "太阳子珠（攻+56）");
		itemMap.put("21106", "珊瑚佩珠（攻+72，五行属性提升，对鬼的伤害提升）");
		itemMap.put("21107", "金丝菩提珠（攻+81）");
		itemMap.put("21108", "翡翠罗汉珠（攻+108）");
		itemMap.put("21109", "七宝琉璃珠（攻+120，基本攻击追加衰弱，五行属性灵力提升）");
		itemMap.put("21110", "五眼六通（佛珠,攻+135）");
		itemMap.put("21111", "砗磲佩珠（攻+148，五行属性灵力提升，对鬼灵的伤害提升）");
		itemMap.put("21112", "星月菩提珠（攻+168）");
		itemMap.put("21113", "五彩糖球（珠，攻+100，战斗中自动恢复神）");
		itemMap.put("21114", "无相缅茄珠（攻+175，五行属性灵力提升，对鬼妖的伤害提升）");
		itemMap.put("21115", "麒麟菩提珠（攻+200）");
		itemMap.put("21116", "天意金刚珠（攻+240.五行属性灵力提升，对鬼妖灵的伤害提升）");
		itemMap.put("21201", "夹铁（重剑，攻+135）");
		itemMap.put("21202", "青铜古剑（重剑，攻+150）");
		itemMap.put("21203", "八荒六合剑（攻+180，暴击效果强化）");
		itemMap.put("21204", "折铁剑（重剑，攻+205）");
		itemMap.put("21205", "昆五剑（攻+230，暴击效果强化）");
		itemMap.put("21206", "七尺玉具（重剑，攻+265）");
		itemMap.put("21207", "五方单符（攻+285，基本攻击追加金属化，暴击效果强化）");
		itemMap.put("21208", "沉水龙雀（攻+310，暴击效果强化）");
		itemMap.put("21209", "玄铁重剑（攻+340）");
		itemMap.put("21210", "镇岳尚方（攻+375，暴击效果强化）");
		itemMap.put("21211", "掩日剑（攻+420）");
		itemMap.put("21212", "青铜觥（攻+250，暴击时无视对手防御力）");
		itemMap.put("21213", "古剑巨阙（重剑，攻+450，暴击效果大幅强化）");
		itemMap.put("21214", "殇剑龙吟（重剑，攻+560，运-56）");
		itemMap.put("21215", "灭剑凰炎（重剑，攻+640，极容易出现暴击，暴击效果强化）");
		itemMap.put("21301", "精铁镰（攻+13）");
		itemMap.put("21302", "赤铜镰（攻+23）");
		itemMap.put("21303", "雁翅镰（攻+37）");
		itemMap.put("21304", "红叶镰（攻+56）");
		itemMap.put("21305", "新月镰（镰，攻+79）");
		itemMap.put("21306", "墨翼镰（攻+107）");
		itemMap.put("21307", "凤尾镰（攻+142，火属性灵力提升）");
		itemMap.put("21308", "交光清夜（镰，攻+149，攻击必宝命中）");
		itemMap.put("21309", "枯荷听雨（镰，攻+165，水属性灵力提升，命中率提升）——");
		itemMap.put("21310", "梧叶秋声（镰，攻+198,木属性灵力提升，命中率提升）");
		itemMap.put("21311", "冷月葬情（镰，攻+237，土属性灵力提升，命中率提升）");
		itemMap.put("21312", "千帆舞（镰，攻+181，金属性灵力提升）");
		itemMap.put("21313", "汤王勺（镰，攻+115，基本攻击变为全体攻击）");
		itemMap.put("21314", "离恨（镰，攻+223）");
		itemMap.put("21315", "残阳（镰，攻+271）");
		itemMap.put("21316", "西风（镰，攻+326，基本攻击追加毒，攻击必定命中）");
		itemMap.put("21401", "彩绢扇（攻+11）");
		itemMap.put("21402", "鹅毛扇（攻+21）");
		itemMap.put("21403", "白羽绸扇（攻+32）");
		itemMap.put("21404", "桃花扇（攻+45）");
		itemMap.put("21405", "百香扇（攻+61）");
		itemMap.put("21406", "锦绡扇（攻+70，逃跑非常容易成功）");
		itemMap.put("21407", "雉尾扇（攻+81）");
		itemMap.put("21408", "纤云扇（攻+100）");
		itemMap.put("21409", "条翮（扇，攻+123，基本攻击追加混乱，金钱攻击的伤害提升）");
		itemMap.put("21410", "罗绮香扇（攻+148）");
		itemMap.put("21411", "兮光（扇，攻+177）");
		itemMap.put("21412", "仄影（扇，攻+187，金属性灵力提升，金钱攻击的伤害提升）");
		itemMap.put("21413", "五火七禽扇（攻+207，火属性灵力提升）");
		itemMap.put("21414", "五香鸡翅扇（攻+110，可以更快地积累战意）");
		itemMap.put("21415", "灵鸟翩舞（扇，攻+233，土属性灵力提升，金钱攻击的伤害提升）");
		itemMap.put("21416", "芳菲荼糜（扇，攻+250，木属性灵力提升，金钱攻击的伤害提升）");
		itemMap.put("21417", "碧清晴天（扇，攻+275，水属性灵力提升，金钱攻击的伤害提升）");
		itemMap.put("21501", "鸳鸯剑（双剑，攻+16）");
		itemMap.put("21502", "灵蛇剑（双剑，攻+36，回避率提升）");
		itemMap.put("21503", "连理剑（双剑，攻+24）");
		itemMap.put("21504", "归燕剑（双剑，攻+40）");
		itemMap.put("21505", "朝露剑（双剑，攻+64）");
		itemMap.put("21506", "蝉翼剑（双剑，攻+80）");
		itemMap.put("21507", "相思剑（双剑，攻+110）");
		itemMap.put("21508", "流云飞雪（双剑，攻+122，基本攻击追加残废，回避率提升）");
		itemMap.put("21509", "紫电青霜（双剑，攻+136，回避率提升）");
		itemMap.put("21510", "鹭飞鱼跃（双剑，攻+150）");
		itemMap.put("21511", "干将莫邪（双剑，攻+172，回避率大幅提升）");
		itemMap.put("21512", "转魄灭魂（双剑，攻+244，运-44）");
		itemMap.put("21513", "月影星痕（双剑，攻+210）");
		itemMap.put("21514", "蟹钳钗（双剑，攻+88，战斗胜利时恢复精）");
		itemMap.put("21515", "古剑红玉（双剑，攻+200，回避率大幅提升）");
		itemMap.put("21516", "灵剑华舞（双剑攻+340）");
		itemMap.put("21518", "忘剑色空（双剑，攻+297，回避率大幅提升）");
		itemMap.put("21601", "青丝绣帕（女用，头，防+1）");
		itemMap.put("21602", "玉燕钗（女用，防+3）");
		itemMap.put("21603", "珊瑚簪（女用，防+6）");
		itemMap.put("21604", "金镶玉（女用，防+10）");
		itemMap.put("21605", "彩蝶纷飞（晴雪襄铃，头，防+18，神+50）");
		itemMap.put("21606", "银叶钗（晴雪红玉，头，防+18，神+50）");
		itemMap.put("21607", "青玉簪（襄铃红玉，防+18，神+50）");
		itemMap.put("21608", "描金带（女用，头，防+15）");
		itemMap.put("21609", "云霓彩带（女用，防+21）");
		itemMap.put("21610", "花解语（晴雪，头，防+30，神+90，运+10）");
		itemMap.put("21611", "如意簪（红玉,防+30，神+90，对灵的伤害提升）");
		itemMap.put("21612", "鸳鸯香铃（襄铃，头，防+30，神+90，减轻物理伤害）");
		itemMap.put("21613", "凿花银栉（女用，头，防+28）");
		itemMap.put("21614", "沉香簪（女用，防+36）");
		itemMap.put("21615", "纤云发带（女用，防+45）");
		itemMap.put("21616", "绿雪含芳簪（女用，防+55）");
		itemMap.put("21617", "凤翎珠冠（女用，防+95，神+100）");
		itemMap.put("21618", "娲皇灵蛇钗（晴雪，头，防+70，神+160，运+20）");
		itemMap.put("21619", "长庚清辉（红玉，头，防+70，神+160，对妖的伤害提升）");
		itemMap.put("21620", "落星环（襄铃，头，防+70，神+160，减轻物理伤害）");
		itemMap.put("21721", "头巾（男用，防+1）");
		itemMap.put("21722", "软藤笠（男用，头，防+4）");
		itemMap.put("21723", "羊皮罩帽（男用，防+7）");
		itemMap.put("21724", "精铁发箍（男用，头，防+12）");
		itemMap.put("21725", "兽骨笄（屠苏兰生，头，防+30，神+40）");
		itemMap.put("21726", "纶巾（兰生千殇防+30，神+40）");
		itemMap.put("21727", "桃木笄（屠苏千殇，头，防+30，神+40）");
		itemMap.put("21728", "青云帻（男用，头，防+20）");
		itemMap.put("21729", "浩然巾（男用，头，防+25）");
		itemMap.put("21730", "逍遥巾（男用，头，防+35）");
		itemMap.put("21731", "青铜盔（男用，防+45）");
		itemMap.put("21732", "麒麟盔（屠苏，头，防+60，神+70，气+10）");
		itemMap.put("21733", "云英冠（兰生，防+60，神+70，减轻五行属性伤害）");
		itemMap.put("21734", "偃月冠（千殇，防+60，神+70，对金属化的抗性提升）");
		itemMap.put("21735", "惠文冠（男用，防+55）");
		itemMap.put("21736", "闹龙银盔（男用，头，防+70）");
		itemMap.put("21737", "五岳灵图冠（男用，头，防+100，神+80）");
		itemMap.put("21738", "幽煌邪曜（屠苏专用，头，防+80，神+120，气+20）");
		itemMap.put("21739", "九天逍遥冠（兰生，头，防+80，神+120，减轻五行属性伤害）");
		itemMap.put("21740", "灵巫祭礼冠（千殇，防+80，神+120，免疫眩晕）");
		itemMap.put("21801", "青丝绣纱（女用，防+3）");
		itemMap.put("21802", "纹锦深衣（女用，防+8）");
		itemMap.put("21803", "红绸大氅（红玉，防+7，敏+2）");
		itemMap.put("21804", "翠缕云裳（女用，防+16）");
		itemMap.put("21805", "沉香素纱（女用，防+27）");
		itemMap.put("21806", "百香衫（晴雪，防+45，精+100，运+5）");
		itemMap.put("21807", "百绣锦袄（襄铃，防+45，精+100，减轻物理伤害）");
		itemMap.put("21808", "扫霞衣（红玉，防+45，精+100，对人的伤害提升）");
		itemMap.put("21809", "云锦华裳（女用，防+40）");
		itemMap.put("21810", "玄锦玉衣（晴雪，防+25，五行属性灵力提升）");
		itemMap.put("21811", "缂丝缎纱（女用，防+55）");
		itemMap.put("21812", "明霞锦衣（晴雪，防+75，精+180，运+10）");
		itemMap.put("21813", "鸳鸯兜（襄铃，防+75，精+180，减轻物理伤害）");
		itemMap.put("21814", "云影（红玉，衣，防+75，精+180，对人的伤害提升）");
		itemMap.put("21815", "描金羽纱（女用，防+70）");
		itemMap.put("21816", "昙华余韵（女用，防+90）");
		itemMap.put("21817", "紫凰衫（晴雪，防+125，精+270，运+15）");
		itemMap.put("21818", "凤羽明锦（襄铃，防+125，精+270，减轻物理伤害）");
		itemMap.put("21819", "紫绶仙衣（红玉，防+125，精+270，对人的伤害提升）");
		itemMap.put("21820", "赤水战袍（女用，防+115）");
		itemMap.put("21821", "瑶池仙袖（女用，防+140）");
		itemMap.put("21822", "百蝶穿花袖（晴雪，防+175，精+400.运+20）");
		itemMap.put("21823", "白羽鲛纱（襄铃，防+175，精+400，减轻物理伤害）");
		itemMap.put("21824", "清虚舞（红玉，防+175，精+400，对仙的伤害提升）");
		itemMap.put("21825", "夜月清霜（晴雪，衣，防+200，精+600，运+25）");
		itemMap.put("21826", "浣星纱（襄铃，防+200，精+600，减轻物理伤害）");
		itemMap.put("21827", "羲和幻裳（红玉，衣，防+200，精+600，对仙的伤害提升）");
		itemMap.put("21901", "短衣（男用，防+1）");
		itemMap.put("21902", "青得罗（男用，防+2）");
		itemMap.put("21903", "软藤甲（男用，防+4）");
		itemMap.put("21904", "襕衫（男用，衣，防+10）");
		itemMap.put("21905", "锦袍（男用，防+20）");
		itemMap.put("21906", "云锦劲衣（男用，防+30）");
		itemMap.put("21907", "铭袍（屠苏，防+50，精+120，气+5）");
		itemMap.put("21908", "方胜短襦（兰生，防+50，精+120，减轻木、水属性伤害）");
		itemMap.put("21909", "绛绸袍（千殇，防+50，精+120，对衰弱的抗性提升）");
		itemMap.put("21910", "赤练甲（男用，防+45）");
		itemMap.put("21911", "鲛革软甲（男用，防+65）");
		itemMap.put("21912", "黑貂裘（屠苏，防+100，精+220，气+10）");
		itemMap.put("21913", "霜纹锦袍（兰生，防+100，精+220，减轻火，土属性伤害）");
		itemMap.put("21914", "太极道袍（千殇，防+100，精+220，对混乱的抗性提升）");
		itemMap.put("21915", "云纹单衣（男用，防+90）");
		itemMap.put("21916", "白蟒衫（男用，防+115）");
		itemMap.put("21917", "噬魄妖铠（屠苏，防+150，精+360，气+15）");
		itemMap.put("21918", "赤金铁袍（兰生，防+150，精+360，减轻金、土属性伤害）");
		itemMap.put("21919", "流云法袍（千殇，防+150，精+360，对冰冻的抗性提升）");
		itemMap.put("21920", "青缎氅（男用，衣，防+140）");
		itemMap.put("21921", "天蚕法服（男用，防+175）");
		itemMap.put("21922", "幽煌软胄（屠苏，防+225，精+550，气+20）");
		itemMap.put("21923", "晓梦迷蝶（兰生，衣，防+225，精+550，减轻五行属性伤害）");
		itemMap.put("21924", "仙符罡衣（千殇，防+225，精+550，免疯即死）");
		itemMap.put("21925", "魔影鬼衣（屠苏，防+300，精+800，气+25）");
		itemMap.put("21926", "乾坤祭服（兰生，防+300，精+800，减轻五行属性伤害）");
		itemMap.put("21927", "混元宝衣（千殇，防+300，精+800，对所有不良状态的抗性提升）");
		itemMap.put("22004", "凤羲祭衣（晴雪，穿上即可改变角色形象）");
		itemMap.put("22006", "风雪初晴（晴雪，穿上即可改变角色形象）");
		itemMap.put("22007", "凫靥裘（襄铃，穿上即可改变角色形象）");
		itemMap.put("22009", "灵狐初现（襄铃，穿上即可改变角色形象）");
		itemMap.put("22010", "天墉道装（红玉，穿上即可改变角色形象）");
		itemMap.put("22012", "千年玉红（红玉）");
		itemMap.put("22016", "天墉道服（屠苏，穿上即可改变角色形象）");
		itemMap.put("22018", "南疆玄衫（屠苏，穿上即可改变角色形象）");
		itemMap.put("22020", "庖丁（兰生）");
		itemMap.put("22021", "表表子衿（兰生）");
		itemMap.put("22022", "灵巫祭衣（千殇）");
		itemMap.put("22024", "江湖布衣（千殇，穿上即可改变角色形象）");
		itemMap.put("22101", "丝麻鞋（女用，敏+4）");
		itemMap.put("22102", "青丝绣鞋（女用，敏+10）");
		itemMap.put("22103", "鹿皮短靴（女用，敏+72）");
		itemMap.put("22104", "锦靿靴（女用，敏+50）");
		itemMap.put("22105", "五彩履（女用，敏+20）");
		itemMap.put("22106", "红香鞋（女用，敏+35）");
		itemMap.put("22107", "金缕鞋（女用，敏+95）");
		itemMap.put("22108", "分梢玉履（晴雪，红玉，敏+100，防+12）");
		itemMap.put("22109", "醉芳丛（晴雪襄铃，敏+100，防+12）");
		itemMap.put("22110", "凤回首（襄铃红玉，敏+100，防+12）");
		itemMap.put("22111", "霞影靴（女用，敏+123）");
		itemMap.put("22112", "飞燕舞鞋（女用，敏+154）");
		itemMap.put("22113", "凤翔环（晴雪，敏+170，防+20，运+10）");
		itemMap.put("22114", "步步莲（红玉，敏+170，防+20，对鬼的伤害提升）");
		itemMap.put("22115", "英招羽鞋（襄铃，敏+170，防+20，减轻物理伤害）");
		itemMap.put("22116", "帝革软鞋（女用，敏+188）");
		itemMap.put("22117", "赤乌仙履（女用，敏+265，防+25）");
		itemMap.put("22118", "凤羲采胜环（晴雪，敏+200，防+30，运+20）");
		itemMap.put("22119", "凌云舞（红玉，敏+200，防+30，对兽的伤害提升）");
		itemMap.put("22120", "浣星屐（襄铃，敏+200，防+30，减轻物理伤害）");
		itemMap.put("22221", "芒鞋（男用，敏+3）");
		itemMap.put("22222", "布靴（男用，敏+8）");
		itemMap.put("22223", "革翁靴（男用，敏+16）");
		itemMap.put("22224", "六合靴（男用，敏+27）");
		itemMap.put("22225", "登云履（男用，敏+100）");
		itemMap.put("22226", "棠木屐（屠苏，兰生，敏+45，防+15）");
		itemMap.put("22227", "青缎靴（兰生，千殇，敏+45，防+15）");
		itemMap.put("22228", "太极道靴（屠苏千殇，敏+45，防+15）");
		itemMap.put("22229", "双梁鞋（男用，敏+57）");
		itemMap.put("22230", "踏火靴（男用，敏+41）");
		itemMap.put("22231", "十方鞋（男用，敏+76）");
		itemMap.put("22232", "盘云靴（男用，敏+125）");
		itemMap.put("22233", "青蛟裘靴（男用，敏+150）");
		itemMap.put("22234", "寒月冰履（屠苏，敏+135，防+25，气+10）");
		itemMap.put("22235", "丹烏（千殇（敏+135，防+25，对残废的抗性提升）");
		itemMap.put("22236", "天锦云鞋（兰生，敏+135，防+25，减轻五行属性伤害）");
		itemMap.put("22237", "鱼龙御云靴（男用，敏+220，防+32）");
		itemMap.put("22238", "幽煌战靴（屠苏，敏+170，防+40，气+20）");
		itemMap.put("22239", "蝴蝶花花鞋（兰生，敏+170，防+40.减轻五行属性伤害）");
		itemMap.put("22240", "灵巫仙履（千殇，敏+170，防+40，对毒的抗性提升）");
		itemMap.put("22303", "璎珞圈（女用，容易出现暴击）");
		itemMap.put("22304", "赤豹项链（对兽的伤害提升）");
		itemMap.put("22305", "珊瑚项链（战斗胜利时获得的经验增加）");
		itemMap.put("22306", "贝壳项圈(对冰冻的抗性提升）");
		itemMap.put("22308", "玉以龙挂璜（男用，暴击效果强化）");
		itemMap.put("22310", "赤珠金螭（回避率提升）");
		itemMap.put("22311", "翡翠葫芦（战斗胜利时恢复精气神）");
		itemMap.put("22315", "琥珀琉璃珠（减轻物理伤害）");
		itemMap.put("22316", "伽楠镶金环（精+60，减轻各种法术伤害少许）");
		itemMap.put("22317", "龙涎坠（攻击时会吸收对手的生命力）");
		itemMap.put("22318", "赤珠镶金链（对金属化的抗性提升）");
		itemMap.put("22319", "双蛇盘舞（反弹物理伤害）");
		itemMap.put("22320", "双龙戏珠（对仙的伤害提升）");
		itemMap.put("22401", "牛皮板带（男用，气+60）");
		itemMap.put("22402", "香囊（神+60）");
		itemMap.put("22403", "黄铜手套（受到攻击后自动反击）");
		itemMap.put("22404", "铁木护肩（男用，攻+60）");
		itemMap.put("22405", "相思扣（敏+60）");
		itemMap.put("22406", "铁臂钏（男用，防+60）");
		itemMap.put("22407", "金耳坠（女用，运+60）");
		itemMap.put("22408", "琉璃珰（襄铃，战斗胜利时容易得到战利品）");
		itemMap.put("22409", "羊脂扳指（男用，运+60）");
		itemMap.put("22410", "同心结（精+500）");
		itemMap.put("22411", "手指虎（容易招架敌人的攻击）");
		itemMap.put("22412", "秋香丝绦（女用，气+60）");
		itemMap.put("22413", "如意绦（战斗胜利时得到地金钱加倍）");
		itemMap.put("22414", "攒珠银带（反弹水属性伤害）");
		itemMap.put("22415", "九曲珠（对混乱的抗性提升）");
		itemMap.put("22416", "凤凰金翎（可以战斗中自动复活一次，之后此饰品消失）");
		itemMap.put("22417", "四神铭文镜（反弹金属性伤害）");
		itemMap.put("22418", "仙人杂宝镜（反弹各种法术伤害少许）");
		itemMap.put("22419", "凤尾罗（对即死的抗性提升）");
		itemMap.put("22420", "玛瑙葫芦（对残废的抗性提升）");
		itemMap.put("22421", "牡丹青玉镯（命中提升）");
		itemMap.put("22422", "暖玉圭璧（反弹火属性伤害）");
		itemMap.put("22423", "吓须镯（女用，防+60）");
		itemMap.put("22424", "锦兰香串（对衰弱的抗性提升）");
		itemMap.put("22425", "缠臂金（女用，攻+60）");
		itemMap.put("22426", "茜香罗（女用，战斗中自动恢复神）");
		itemMap.put("22427", "绛纹戒指（男用，战斗中自动恢复精）");
		itemMap.put("22428", "阴阳镜（晴雪，基本攻击追加即死）");
		itemMap.put("22429", "龙虎玉带钩（免疫眩晕）");
		itemMap.put("22430", "玉蝴蝶（反弹土属性伤害）");
		itemMap.put("22431", "沉香镂金囊（对毒的抗性提升）");
		itemMap.put("22432", "混元伞（对人的伤害提升）");
		itemMap.put("22433", "照妖鉴（对妖的伤害提升）");
		itemMap.put("22434", "青劳宝色旗（对鬼的伤害提升）");
		itemMap.put("22435", "五龙轮（对灵的伤害提升）");
		itemMap.put("22436", "减轻金属性伤害");
		itemMap.put("22437", "定风珠（减轻木属性伤害）");
		itemMap.put("22438", "玉龙环（减轻水属性伤害）");
		itemMap.put("22439", "三宝玉如意（减轻土属性伤害）");
		itemMap.put("22440", "珊瑚川椒（减轻火属性伤害）");
		itemMap.put("22441", "五曜神珠（五行属性灵力提升，减轻五行属性伤害，对各种不良状态的抗性提升");
		itemMap.put("22442", "八卦云光帕（反弹木属性伤害）");
		itemMap.put("22443", "五岳真形图（五行属性灵力提升）");
		itemMap.put("22444", "青木王鼎（木属性灵力提升）");
		itemMap.put("22445", "离火神珠（火属性灵力提升）");
		itemMap.put("22446", "紫金绶带（金属性灵力提升）");
		itemMap.put("22447", "冰凛凝华（水属性灵力提升）");
		itemMap.put("22448", "九转劫石（土属性灵力提升）");
		itemMap.put("22449", "建木残片（神-16，气-16，森属性灵力大幅提升，土金属性灵力下降）");
		itemMap.put("22450", "若木火实（神-16，气-16，火属性灵力大幅提升，金水属性灵力下降）");
		itemMap.put("22451", "肃杀金令（神-16，气-16，金属性灵力大幅提升，木火属性灵力下降）");
		itemMap.put("22452", "榣山水镜（神-16，气-16，水属性灵力大幅提升，火土属性灵力下降）");
		itemMap.put("22453", "忘川虚沙（神-16，气-16，土属性灵力大幅提升，水木属性灵力下降）");

	}
}
