package pl.edu.pwsztar.apiconection.dto.Order.dto;

import com.google.gson.Gson;
import pl.edu.pwsztar.domain.dto.BillDto;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class OrderClient {
    private static final String USER_AGENT = "Mozilla/5.0";
    private static  BillDto sendPostRequest(String endpointUrl, List<Integer> indexList) throws IOException {
        Gson gson = new Gson();
        String requestBody = gson.toJson(indexList); // konwertujemy listę Integer na format JSON
        URL url = new URL(endpointUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("User-Agent", USER_AGENT);
        connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        connection.setDoOutput(true);

        connection.getOutputStream().write(requestBody.getBytes()); // wysyłamy ciało żądania

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            Scanner scanner = new Scanner(connection.getInputStream());
            StringBuilder response = new StringBuilder();
            while (scanner.hasNextLine()) {
                response.append(scanner.nextLine());
            }
            scanner.close();
            BillDto billDto = gson.fromJson(response.toString(), BillDto.class);
            return billDto;
        } else {
            throw new RuntimeException("Failed to get bill data from endpoint, response code: " + responseCode);
        }
    }
}
