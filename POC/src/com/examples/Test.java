package com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ManishPareta";
		System.out.println("substring: "+s.substring(5));
		System.out.println(s);
		s = s.substring(3, 7);
		System.out.println(s);
		primeNoGenerator(100);
		int[] array = new int[100];
		for(int i=0;i<100;i++){
			if(i+1==56)
				continue;
			else
				array[i]=i+1;
		}
		System.out.println("$$$$$$$$$$$Find Missing Number$$$$$$$$$$$$$$$");
		System.out.println(findMissingNoFromSeqArray(array));
		int[] arr = new int[100];
		for(int i=0;i<100;i++){
			Random rand = new Random(); 
			arr[i] = rand.nextInt(200);
		}
		System.out.println("$$$$$$$$$$$Find Largest & Samllest Number$$$$$$$$$$$$$$$");
		findLargestAndSmalledElement(arr);
		System.out.println("$$$$$$$$$$$Find All Pairs$$$$$$$$$$$$$$$");
		findAllPairs(arr, 200);
		System.out.println("$$$$$$$$$$$Find All Pairs Using Set$$$$$$$$$$$$$$$");
		findAllPairsUsingSet(arr, 150);
		System.out.println("$$$$$$$$$$$findSumOfDiagonalAndHighest$$$$$$$$$$$$$$$");
		//findSumOfDiagonalAndHighest();
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(8819870);
		list.add(8876329);
		list.add(18819870);
		list.add(28819870);
		list.add(38819870);
		list.add(39092283);
		list.add(48819870);
		list.add(49092284);
		list.add(58819870);
		list.add(59092284);
		list.add(68819870);
		list.add(78819870);
		list.add(88819870);
		list.add(89026200);
		list.add(98819870);
		list.add(108819870);
		list.add(118819870);
		list.add(119092285);
		list.add(128819870);
		list.add(129092285);
		list.add(138513580);
		list.add(138819870);
		list.add(139092283);
		list.add(139092285);
		list.add(148819870);
		list.add(149092285);
		list.add(158819870);
		list.add(159092285);
		list.add(168819870);
		list.add(169092284);
		list.add(178819870);
		list.add(179092284);
		list.add(188819870);
		list.add(198819870);
		list.add(199092285);
		list.add(208819870);
		list.add(209092284);
		list.add(218819870);
		list.add(228819870);
		list.add(229092283);
		list.add(229092285);
		list.add(238819870);
		list.add(248819870);
		list.add(249092283);
		list.add(258819870);
		list.add(259026200);
		list.add(268819870);
		list.add(269092283);
		list.add(278819870);
		list.add(288819870);
		list.add(289026200);
		list.add(289092284);
		list.add(298819870);
		list.add(299092283);
		list.add(299092284);
		list.add(308819870);
		list.add(309026200);
		list.add(309092283);
		list.add(309092284);
		list.add(318819870);
		list.add(319026200);
		list.add(319092283);
		list.add(319092284);
		list.add(328819870);
		list.add(338819870);
		list.add(338874218);
		list.add(348819870);
		list.add(348874218);
		list.add(349092284);
		list.add(358819870);
		list.add(368819870);
		list.add(378819870);
		list.add(379092285);
		list.add(388819870);
		list.add(398819870);
		list.add(399092283);
		list.add(408819870);
		list.add(418819870);
		list.add(428819870);
		list.add(429092283);
		list.add(448819870);
		list.add(449026200);
		list.add(449092283);
		list.add(449092284);
		list.add(458819870);
		list.add(459026200);
		list.add(468819870);
		list.add(469026200);
		list.add(469092284);
		list.add(478819870);
		list.add(479026200);
		list.add(479092283);
		list.add(488819870);
		list.add(489026200);
		list.add(498819870);
		list.add(508819870);
		list.add(509092285);
		list.add(518819870);
		list.add(519092285);
		list.add(528819870);
		list.add(529092285);
		list.add(538819870);
		list.add(539092283);
		list.add(539092285);
		list.add(549092283);
		list.add(549092285);
		list.add(559026200);
		list.add(559092285);
		list.add(569092285);
		list.add(588874218);
		list.add(599092285);
		list.add(609092283);
		list.add(609092284);
		list.add(619092285);
		list.add(629092284);
		list.add(659092283);
		list.add(689092284);
		list.add(699092283);
		list.add(709092283);
		list.add(709092285);
		list.add(779092285);
		list.add(789092285);
		list.add(798490347);
		list.add(799092285);
		list.add(809092285);
		list.add(829092285);
		list.add(858819869);
		list.add(859092284);
		list.add(859092285);
		list.add(868819869);
		list.add(869092285);
		list.add(878819869);
		list.add(888819869);
		list.add(889092284);
		list.add(898819869);
		list.add(899092284);
		list.add(899092285);
		list.add(908819869);
		list.add(909092285);
		list.add(918713799);
		list.add(918819869);
		list.add(919092284);
		list.add(919092285);
		list.add(928819869);
		list.add(929092285);
		list.add(938713799);
		list.add(938819869);
		list.add(948819869);
		list.add(949092285);
		list.add(958819869);
		list.add(959092285);
		list.add(968785706);
		list.add(968819869);
		list.add(969092285);
		list.add(978819869);
		list.add(979092285);
		list.add(988819869);
		list.add(989092285);
		list.add(998819869);
		list.add(999092283);


		
		List<Integer> masterList = new ArrayList<Integer>();
		masterList.add(39092283);
		masterList.add(49092284);
		masterList.add(59092284);
		masterList.add(119092285);
		masterList.add(129092285);
		masterList.add(139092283);
		masterList.add(139092285);
		masterList.add(149092285);
		masterList.add(159092285);
		masterList.add(169092284);
		masterList.add(169092284);
		masterList.add(179092284);
		masterList.add(179092284);
		masterList.add(199092285);
		masterList.add(209092284);
		masterList.add(229092283);
		masterList.add(229092285);
		masterList.add(249092283);
		masterList.add(269092283);
		masterList.add(289092284);
		masterList.add(289092284);
		masterList.add(299092283);
		masterList.add(299092284);
		masterList.add(309092283);
		masterList.add(309092284);
		masterList.add(319092283);
		masterList.add(319092284);
		masterList.add(349092284);
		masterList.add(379092285);
		masterList.add(399092283);
		masterList.add(429092283);
		masterList.add(449092283);
		masterList.add(449092284);
		masterList.add(469092284);
		masterList.add(479092283);
		masterList.add(509092285);
		masterList.add(519092285);
		masterList.add(529092285);
		masterList.add(539092283);
		masterList.add(539092285);
		masterList.add(539092285);
		masterList.add(549092283);
		masterList.add(549092285);
		masterList.add(549092285);
		masterList.add(569092285);
		masterList.add(599092285);
		masterList.add(609092283);
		masterList.add(609092284);
		masterList.add(609092284);
		masterList.add(619092285);
		masterList.add(629092284);
		masterList.add(659092283);
		masterList.add(689092284);
		masterList.add(699092283);
		masterList.add(709092283);
		masterList.add(709092285);
		masterList.add(779092285);
		masterList.add(789092285);
		masterList.add(799092285);
		masterList.add(809092285);
		masterList.add(829092285);
		masterList.add(859092284);
		masterList.add(859092284);
		masterList.add(859092285);
		masterList.add(869092285);
		masterList.add(869092285);
		masterList.add(889092284);
		masterList.add(899092284);
		masterList.add(899092284);
		masterList.add(899092285);
		masterList.add(909092285);
		masterList.add(919092284);
		masterList.add(919092285);
		masterList.add(929092285);
		masterList.add(949092285);
		masterList.add(959092285);
		masterList.add(969092285);
		masterList.add(979092285);
		masterList.add(989092285);
		masterList.add(999092283);




		
		list.removeAll(masterList);
		
		System.out.println(list.size());
		for(Integer i : list){
			
				System.out.println(i);
		}
		
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	8689738	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	9071902	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	18689738	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	19071902	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	28689738	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	29071902	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	38689738	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	39071902	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	48689738	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	49071902	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	59071902	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	69071902	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	79071902	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	89071902	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	99071902	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1937 and Block IPS ID:10627	108959420	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	109071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1937 and Block IPS ID:10627	118959414	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	119071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4761 and Block IPS ID:6141	129054131	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	129071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1937 and Block IPS ID:10627	138959414	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	139071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1937 and Block IPS ID:10627	148959414	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1937 and Block IPS ID:10627	158267778	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	159071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1937 and Block IPS ID:10627	168959414	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	169071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1937 and Block IPS ID:10627	178959414	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4761 and Block IPS ID:6141	179054131	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	179071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1937 and Block IPS ID:10627	188959414	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4761 and Block IPS ID:6141	189054131	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	189071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1937 and Block IPS ID:10627	198959414	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4761 and Block IPS ID:6141	199054131	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	199071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4761 and Block IPS ID:6141	209054131	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	209071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4761 and Block IPS ID:6141	219054131	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	219071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4761 and Block IPS ID:6141	229054131	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	229071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4761 and Block IPS ID:6141	239054131	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	239071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4761 and Block IPS ID:6141	249054131	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	249071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4761 and Block IPS ID:6141	259054131	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	259071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4761 and Block IPS ID:6141	269054131	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4761 and Block IPS ID:6141	279054131	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	279071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4761 and Block IPS ID:6141	289054131	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	289071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	299071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	309071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	319071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	329071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	339071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	349071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	359071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	369071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	379071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	389071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	399071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	409071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	419071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	429071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	439071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	449071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	459071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	469071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	479071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	489071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:376 and Block IPS ID:75994	498290962	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	499071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:376 and Block IPS ID:75994	508290962	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	509071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	519071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	529071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	539071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	549071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	559071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	569071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	579071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	589071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	599071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	609071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	619071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	629071902	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:3146 and Block IPS ID:2827	658291067	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1445 and Block IPS ID:101467	659095956	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1445 and Block IPS ID:101467	669095956	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1445 and Block IPS ID:101467	679095956	1	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	758689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	768689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	778689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	788689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	798689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	808689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	818689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	828689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	838689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	848689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	858689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	868689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	878689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	888689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	898689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	908689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	918689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	928689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	938689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	948689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	958689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	968689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	978689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	979071901	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	988689737	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:4195 and Block IPS ID:19403	989071901	4	TG10037	");
		stringList.add("	MAR_MINI_HOTEL_TYPE is null while GB is active in Valhalla...SW PROP ID:1024 and Block IPS ID:23769	998689737	4	TG10037	");


		List<String> newList =  new ArrayList<String>();
		
		newList.add("9018846");
		newList.add("29039966");
		newList.add("29147266");
		newList.add("69111919");
		newList.add("69147266");
		newList.add("89191339");
		newList.add("99111919");
		newList.add("108920140");
		newList.add("109111919");
		newList.add("109141213");
		newList.add("119053284");
		newList.add("129053284");
		newList.add("129141213");
		newList.add("129147266");
		newList.add("139141213");
		newList.add("139147266");
		newList.add("149053284");
		newList.add("149141213");
		newList.add("149147266");
		newList.add("159053284");
		newList.add("169018846");
		newList.add("169053280");
		newList.add("169147266");
		newList.add("172636997");
		newList.add("189053280");
		newList.add("189053284");
		newList.add("189147266");
		newList.add("199053284");
		newList.add("209053280");
		newList.add("209147266");
		newList.add("219053280");
		newList.add("219147266");
		newList.add("228889319");
		newList.add("239113085");
		newList.add("239141213");
		newList.add("239191339");
		newList.add("249111919");
		newList.add("249113085");
		newList.add("249191339");
		newList.add("259113085");
		newList.add("262636997");
		newList.add("269113085");
		newList.add("279141213");
		newList.add("302652296");
		newList.add("309191305");
		newList.add("319113085");
		newList.add("319191305");
		newList.add("328990799");
		newList.add("329113085");
		newList.add("329191305");
		newList.add("339113085");
		newList.add("339191305");
		newList.add("349191305");
		newList.add("349191330");
		newList.add("359147265");
		newList.add("359191305");
		newList.add("362576025");
		newList.add("362611750");
		newList.add("369018846");
		newList.add("379191305");
		newList.add("389147265");
		newList.add("389191305");
		newList.add("398971174");
		newList.add("399191305");
		newList.add("418971174");
		newList.add("419191305");
		newList.add("429191305");
		newList.add("439191305");
		newList.add("449191305");
		newList.add("469191305");
		newList.add("478832194");
		newList.add("488832194");
		newList.add("499099399");
		newList.add("528832194");
		newList.add("529099399");
		newList.add("532637011");
		newList.add("539099399");
		newList.add("549018845");
		newList.add("549099399");
		newList.add("568826607");
		newList.add("569091664");
		newList.add("569099399");
		newList.add("569111918");
		newList.add("579091664");
		newList.add("579099399");
		newList.add("588889363");
		newList.add("589099399");
		newList.add("599099399");
		newList.add("609099399");
		newList.add("619018845");
		newList.add("619099399");
		newList.add("629099399");
		newList.add("639099399");
		newList.add("648971188");
		newList.add("649141213");
		newList.add("662479521");
		newList.add("679113086");
		newList.add("732472556");
		newList.add("752643671");
		newList.add("759168432");
		newList.add("799141213");
		newList.add("812619574");
		newList.add("832636997");
		newList.add("852579468");
		newList.add("859145830");
		newList.add("869141213");
		newList.add("879141213");
		newList.add("879145830");
		newList.add("889053275");
		newList.add("889111917");
		newList.add("909145830");
		newList.add("919039967");
		newList.add("919053275");
		newList.add("919141213");
		newList.add("928990798");
		newList.add("929053275");
		newList.add("929141213");
		newList.add("948889354");
		newList.add("959111917");
		newList.add("968889354");
		newList.add("969053278");
		newList.add("969141213");
		newList.add("978889354");
		newList.add("978990798");
		newList.add("998889354");

		for(String s1: newList){
			for(String s2: stringList){
				if(!s2.contains(s1)){
					
				}
			}
		}
		try{
			System.out.println("Try Begins");
			Thread.sleep(1000);
			System.exit(1);
			return;
		}catch(Exception e){
			System.out.println("In Catch");
		}finally{
			System.out.println("In Finally");
		}

	}

	/*
	 * 1. Nums 1,2,3 are 3 first prime num. We can direclty add them in the prime num list.
	 * 2. if num is greater than 3 then, to check the prime no, we need to check if the no is divisible by more than 2 nos between 1 to num/2.
	 * 3. run a loop up to n nums.
	 *  if the num is 
	 */
	public static void primeNoGenerator(int n){

		for(int i=1;i<=100;i++){
			int modCount = 0;
			int num = i;
			if(i>3){
				num=i/2;

				for(int j=1; j<=num;j++){
					if((i%j == 0)){
						modCount++; // to identify how many times a no is divisible 
						if(modCount>2)//additional check to stop processing if the num is divisible by more than 2 values.
							break;
					}
				}if(modCount<=1){
					System.out.println(String.format("%s is a Prime No", i));
				}else{
					System.out.println(String.format("%s is not a Prime No", i));
				}
			}else{
				System.out.println(String.format("%s is a Prime No", i));
			}
		}
	}
	
	public static int findMissingNoFromSeqArray(int[] array){
		
		int sum = 0;
		int arrSum = 0;
		for(int j=1;j<=100;j++){
			sum += j;
		}
		for(int k=0;k<array.length;k++){
			arrSum +=array[k];
		}
		return sum-arrSum;
	} 
	
	public static void findLargestAndSmalledElement(int[] array){
		int smallest =array[0];
		int largest = array[0];
		for(int i=1;i<array.length;i++){
			if(array[i]<smallest)
				smallest = array[i];
			if(array[i]>largest)
				largest=array[i];
		}
		System.out.println("Array:"+array);
		System.out.println("Largest: "+largest +" | Smallest: "+smallest);
	}
	
	public static void findAllPairs(int[] array, int num){

		for(int i=0; i<array.length;i++){
			if(!(array[i]>num)){
				for(int j=1;j<array.length;j++){
					if(array[j]+array[i]==num){
						System.out.println("("+array[i] +","+array[j]+")");
					}
				}
			}
		}

	}
	
	public static void findAllPairsUsingSet(int[] array, int num){

		Set<Integer> s = new HashSet<Integer>();
		
		for(int a : array){
			
		 int i = num - a;
		 if(s.contains(i)){
			 System.out.println(String.format("(%d,%d)", i,a));
		 }else{
			 s.add(i);
		 }
		 
		}

	}
	
	public static void findSumOfDiagonalAndHighest(){
		//code
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the size of 2D Array");
		
		int sizeOfArray = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Please Enter the elements, separated by comms");
		String elements = s2.nextLine();
		int[] _2DArray[] = new int[sizeOfArray][sizeOfArray];
		String[] splitElements = elements.split(",");
		int count = 0;
	    for(int i=0;i<sizeOfArray;i++){
	        for(int j=0;j<sizeOfArray;j++){
	        	_2DArray[i][j] = new Integer(splitElements[count++]);
	        }
	    }
	    
	    int dignoalSum = 0;
	    int highestNum = 0;
		for(int k=0;k<sizeOfArray;k++){
		    for(int l=0;l<sizeOfArray;l++){
		        if(l == k){
		        dignoalSum += _2DArray[k][l];
		        }
		        if(l == 0 && k==0){
		        highestNum = _2DArray[k][l];
		        }else if(_2DArray[k][l]>highestNum){
                    highestNum = _2DArray[k][l];		            
		        }
		        
		    }
		}
		System.out.println(String.format("Highest Number is: %d and Sum of Digonal Elements is %d: ",highestNum, dignoalSum));
	}
	
	public static int[] removeDuplicate(int[] array){
		
		Arrays.sort(array);
		
		for(int i = 0 ;i<array.length;i++){
			
			
		}
		
		return array;
	}
}
