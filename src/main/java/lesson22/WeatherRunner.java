package lesson22;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

public class WeatherRunner {
    public static void main(String[] args) throws URISyntaxException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите город, в котором хотите узнать текущую температуру:");
        while (scanner.hasNextLine()) {
            String City = scanner.nextLine();
            URI uri = new URI("https://api.openweathermap.org/data/2.5/weather?q=" + City + "&appid=8445d5250b7fa858f7f7c86e1271f07f&units=metric");
            URL url = uri.toURL();
            URLConnection urlConnection = url.openConnection();
            urlConnection.connect();
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            System.out.println("-----------------");

            JSONParser jsonParser = new JSONParser();
            try {
                JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
                JSONObject structure = (JSONObject) jsonObject.get("main");
                String temperatureAsString = String.format("%.2f", (double) structure.get("temp"));
                System.out.println("Текущая температура в городе " + City + " равна: " + temperatureAsString + " градусов Цельсия.");

            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }