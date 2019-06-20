package com.java8.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import javax.sound.sampled.Line;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> groupIdList = Files.lines(Paths.get("C:\\Users\\manish.pareta\\Desktop\\SandBox\\Java8Basic\\src\\pom.xml"))
		.filter(line -> line.contains("groupId"))
		.map(line -> line.replaceAll("groupId", "")
				.replaceAll("<", "")
				.replaceAll(">", "")
				.replaceAll("/", "").trim())
		.collect(Collectors.toList());
		
		groupIdList.add(null);
		groupIdList.add("");
		groupIdList.add("   ");
		
		System.out.println("*******************Group Id List**************");
		groupIdList.stream()
		.forEach(System.out::println);
		List<String> artifactIdList = Files.lines(Paths.get("C:\\Users\\manish.pareta\\Desktop\\SandBox\\Java8Basic\\src\\pom.xml"))
				.filter(line -> line.contains("artifactId"))
				.map(line -> line.replaceAll("artifactId", "")
						.replaceAll("<", "")
						.replaceAll(">", "")
						.replaceAll("/", "").trim())
				.collect(Collectors.toList());
		
		System.out.println("*******************ArtifactId List**************");
		artifactIdList.stream()
		.forEach(System.out::println);
		
		List<List<String>> pomElementList = new ArrayList<List<String>>();
		pomElementList.add(groupIdList);
		pomElementList.add(artifactIdList);
		System.out.println("*******************MergedList**************");
		pomElementList.stream().flatMap(list -> list.stream()
				.filter(str -> str != null)
				.filter(str -> !str.trim().equals("")))	
				.forEach(System.out::println);
		
		//validateFirmName(sList);
		System.out.println("*******************After filter with Java 6 style**************");
		/*
		 * sList.stream() .forEach(System.out::println);
		 */
		
		List<String> l = groupIdList.stream()
				/*
				 * .map(string -> { if(string == null) return string; else { string =
				 * string.trim(); return string; } })
				 */
		.map(str -> {
			if(str == null || str.trim().equals(""))
				return str;
			else if(str.trim().length()>7) {
				str = str.trim().substring(0,6);
				return str;
			}else {
				return str;
			}
		})
		.collect(Collectors.toList());
		l.stream().forEach(System.out::println);
	}
	
	
	
	public static void validateFirmName(List<String> gbCmrclFirmList){
		if (gbCmrclFirmList != null	&& gbCmrclFirmList.size() > 0) {
			for (int i = 0; i < gbCmrclFirmList.size(); i++) {
				String compName = gbCmrclFirmList.get(i).trim();
				if(compName != null && !compName.trim().equalsIgnoreCase("")){
					if(compName.trim().length() > 7){
						compName = compName.trim().substring(0, 6);
						gbCmrclFirmList.remove(i);
						gbCmrclFirmList.add(i,compName);
					}
				}
			}
		}
	}

}
