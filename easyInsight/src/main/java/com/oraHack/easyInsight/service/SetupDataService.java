package com.oraHack.easyInsight.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SetupDataService {

    public List<String> getSetupData(String findKeyword) throws FileNotFoundException {

        List<String> values = new ArrayList<String>();
        try {
            JSONParser parser = new JSONParser();
            //Use JSONObject for simple JSON and JSONArray for array of JSON.
            JSONObject data = (JSONObject) parser.parse(
                    new FileReader("/Users/sujisure/Documents/OraHacks/easyInsight/src/main/java/com/oraHack/easyInsight/Data/data.json"));//path to the JSON file.

            String json = data.toJSONString();

            String regex = "";
            Matcher m = Pattern.compile(regex).matcher(json);
            if (m.find()) {
                System.out.println(m.group(1));
            }


        } catch (IOException | ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
