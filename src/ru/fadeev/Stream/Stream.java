package ru.fadeev.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import ru.fadeev.Stream.geometry.Point;
import ru.fadeev.Stream.geometry.Polyline;

public class Stream {

	static public Polyline formPolyline(List<Point> list){
		List<Point> points = list.stream()
				.filter(Objects::nonNull)
				.distinct()
				.sorted(Comparator.comparingDouble(Point::getX))
				.map(p->new Point(p.getX(), Math.abs(p.getY())))
				.toList();
		return new Polyline(points.toArray(new Point[0]));
	}

	static public Map<Integer, List<String>> formPerson(String fileName){//  "src/ru/fadeev/Stream/people.txt"
		Map<Integer, List<String>> result = null;
		try (java.util.stream.Stream<String> lines =  Files.lines(Paths.get(fileName))){
			result = lines
					.map(line -> line.split(":", 2))
					.filter(parts -> parts.length == 2)
					.map(parts -> new String[]{parts[0].trim(), parts[1].trim()})
					.filter(parts -> !parts[1].isEmpty() && parts[1].matches("\\d+"))
					.collect(Collectors.groupingBy(
							parts->Integer.parseInt(parts[1]),
							Collectors.mapping(
									parts -> {
										String name = parts[0].trim();
										if(name.isEmpty()) return name;
										return name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
									},
									Collectors.toList()
							)
					));
		}catch (IOException e){
			e.printStackTrace();
		}

		return result;
	}
}
