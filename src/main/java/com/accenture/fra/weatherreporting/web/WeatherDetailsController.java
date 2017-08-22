package com.accenture.fra.weatherreporting.web;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.accenture.fra.weatherreporting.domain.WeatherDetails;

@CrossOrigin(origins = "*", methods = { RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.GET, RequestMethod.POST,
		RequestMethod.OPTIONS })
@Configuration
@EnableWebMvc
@Controller
public class WeatherDetailsController {


	@RequestMapping(method = { RequestMethod.GET }, value = { "/fra/weather_report" })
	public String getWeatherDetails(Model model, @RequestParam(value="id", required=false) String id)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		System.out.println("Calling getWeatherDetials------------>>");
		/*List<WeatherDetails> weatherDetailsList = weatherDetailsRepository.findAll();
		WeatherDetails weatherDetails = new WeatherDetails();
		if(id != null) {
			System.out.println("Id passed = " + id);
			weatherDetails = weatherDetailsRepository.findById(id);
		}*/
		List<WeatherDetails> weatherDetailsListWithoutDefault = new ArrayList<>();
		WeatherDetails weatherDetails = new WeatherDetails();
		weatherDetails.setCity("Mumbai");
		weatherDetails.setId("1");
		weatherDetails.setHumidity("88%");
		weatherDetails.setPercipation("2%");
		weatherDetails.setTdegc("27");
		weatherDetails.setTdegf("22");
		weatherDetails.setTplusfivedegc("26");
		weatherDetails.setTplusfivedegf("22");
		weatherDetails.setTplusfivewimage("images/Drizzle.png");
		weatherDetails.setTplusfourdegc("27");
		weatherDetails.setTplusfourdegf("21");
		weatherDetails.setTplusfourwimage("images/Drizzle.png");
		weatherDetails.setTplusonedegc("28");
		weatherDetails.setTplusonedegf("23");
		weatherDetails.setTplusonewimage("images/Drizzle.png");
		weatherDetails.setTplussixdegc("30");
		weatherDetails.setTplussixdegf("25");
		weatherDetails.setTplussixwimage("images/Drizzle.png");
		weatherDetails.setTplusthreedegc("25");
		weatherDetails.setTplusthreedegf("20");
		weatherDetails.setTplusthreewimage("images/Drizzle.png");
		weatherDetails.setTplustwodegc("29");
		weatherDetails.setTplustwodegf("24");
		weatherDetails.setTplustwowimage("images/Drizzle.png");
		weatherDetails.setTwimage("images/Drizzle.png");
		weatherDetails.setWind("23 kmph");
		weatherDetailsListWithoutDefault.add(weatherDetails);
		weatherDetails = new WeatherDetails();
		weatherDetails.setCity("Chennai");
		weatherDetails.setId("2");
		weatherDetails.setHumidity("88%");
		weatherDetails.setPercipation("2%");
		weatherDetails.setTdegc("27");
		weatherDetails.setTdegf("22");
		weatherDetails.setTplusfivedegc("26");
		weatherDetails.setTplusfivedegf("22");
		weatherDetails.setTplusfivewimage("images/Drizzle.png");
		weatherDetails.setTplusfourdegc("27");
		weatherDetails.setTplusfourdegf("21");
		weatherDetails.setTplusfourwimage("images/Drizzle.png");
		weatherDetails.setTplusonedegc("28");
		weatherDetails.setTplusonedegf("23");
		weatherDetails.setTplusonewimage("images/Drizzle.png");
		weatherDetails.setTplussixdegc("30");
		weatherDetails.setTplussixdegf("25");
		weatherDetails.setTplussixwimage("images/Drizzle.png");
		weatherDetails.setTplusthreedegc("25");
		weatherDetails.setTplusthreedegf("20");
		weatherDetails.setTplusthreewimage("images/Drizzle.png");
		weatherDetails.setTplustwodegc("29");
		weatherDetails.setTplustwodegf("24");
		weatherDetails.setTplustwowimage("images/Drizzle.png");
		weatherDetails.setTwimage("images/Drizzle.png");
		weatherDetails.setWind("23 kmph");
		weatherDetailsListWithoutDefault.add(weatherDetails);
		weatherDetails = new WeatherDetails();
		weatherDetails.setCity("Bengaluru");
		weatherDetails.setId("3");
		weatherDetails.setHumidity("88%");
		weatherDetails.setPercipation("2%");
		weatherDetails.setTdegc("27");
		weatherDetails.setTdegf("22");
		weatherDetails.setTplusfivedegc("26");
		weatherDetails.setTplusfivedegf("22");
		weatherDetails.setTplusfivewimage("images/Drizzle.png");
		weatherDetails.setTplusfourdegc("27");
		weatherDetails.setTplusfourdegf("21");
		weatherDetails.setTplusfourwimage("images/Drizzle.png");
		weatherDetails.setTplusonedegc("28");
		weatherDetails.setTplusonedegf("23");
		weatherDetails.setTplusonewimage("images/Drizzle.png");
		weatherDetails.setTplussixdegc("30");
		weatherDetails.setTplussixdegf("25");
		weatherDetails.setTplussixwimage("images/Drizzle.png");
		weatherDetails.setTplusthreedegc("25");
		weatherDetails.setTplusthreedegf("20");
		weatherDetails.setTplusthreewimage("images/Drizzle.png");
		weatherDetails.setTplustwodegc("29");
		weatherDetails.setTplustwodegf("24");
		weatherDetails.setTplustwowimage("images/Drizzle.png");
		weatherDetails.setTwimage("images/Drizzle.png");
		weatherDetails.setWind("23 kmph");
		weatherDetailsListWithoutDefault.add(weatherDetails);
		weatherDetails = new WeatherDetails();
		weatherDetails.setCity("Delhi");
		weatherDetails.setId("4");
		weatherDetails.setHumidity("88%");
		weatherDetails.setPercipation("2%");
		weatherDetails.setTdegc("27");
		weatherDetails.setTdegf("22");
		weatherDetails.setTplusfivedegc("26");
		weatherDetails.setTplusfivedegf("22");
		weatherDetails.setTplusfivewimage("images/Drizzle.png");
		weatherDetails.setTplusfourdegc("27");
		weatherDetails.setTplusfourdegf("21");
		weatherDetails.setTplusfourwimage("images/Drizzle.png");
		weatherDetails.setTplusonedegc("28");
		weatherDetails.setTplusonedegf("23");
		weatherDetails.setTplusonewimage("images/Drizzle.png");
		weatherDetails.setTplussixdegc("30");
		weatherDetails.setTplussixdegf("25");
		weatherDetails.setTplussixwimage("images/Drizzle.png");
		weatherDetails.setTplusthreedegc("25");
		weatherDetails.setTplusthreedegf("20");
		weatherDetails.setTplusthreewimage("images/Drizzle.png");
		weatherDetails.setTplustwodegc("29");
		weatherDetails.setTplustwodegf("24");
		weatherDetails.setTplustwowimage("images/Drizzle.png");
		weatherDetails.setTwimage("images/Drizzle.png");
		weatherDetails.setWind("23 kmph");
		weatherDetailsListWithoutDefault.add(weatherDetails);
		List<WeatherDetails> weatherDetailsList = weatherDetailsListWithoutDefault;
		System.out.println(weatherDetailsListWithoutDefault);
		for (WeatherDetails weatherDetail : weatherDetailsListWithoutDefault) {
			System.out.println(weatherDetail.getId());
			if (weatherDetail.getId().equals("1") && id == null) {
				model.addAttribute("wdsId",weatherDetail);
				weatherDetailsList.remove(weatherDetail);
				break;
			} else {
				model.addAttribute("wdsId",weatherDetails);
				weatherDetailsList.remove(weatherDetails);
				break;
			}
		}
		model.addAttribute("wds", weatherDetailsList);	
		System.out.println(model.toString());
		//model.addAttribute("nm", "Ravi");

		return "weatherDetail";
	}
	
/*	@RequestMapping(method = { RequestMethod.GET }, value = { "/fra/weather_report" })
	public String getWeatherDetails(Model model, @RequestParam(value="id", required=true) String id)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		System.out.println("Calling getWeatherDetials with Id------------>>" + id);
		List<WeatherDetails> weatherDetailsList = weatherDetailsRepository.findAll();
		WeatherDetails weatherDetails = weatherDetailsRepository.findById(id);
		weatherDetailsList.remove(weatherDetails);
		model.addAttribute("wdsId",weatherDetails);
		model.addAttribute("wds", weatherDetailsList);	
		System.out.println(model.toString());
		//model.addAttribute("nm", "Ravi");

		return "weatherDetail";
	}*/

}
