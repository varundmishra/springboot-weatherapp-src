package com.accenture.fra.weatherreporting.domain;

public class WeatherDetails {
    private volatile String id;
    
    private volatile String city;

    private volatile String tdegc;
    
    private volatile String tdegf;
    
    private volatile String twimage;
    
    private volatile String tplusonedegc;
    
    private volatile String tplusonedegf;
    
    private volatile String tplusonewimage;
    
    private volatile String tplustwodegc;
    
    private volatile String tplustwodegf;
    
    private volatile String tplustwowimage;
    
    private volatile String tplusthreedegc;
    
    private volatile String tplusthreedegf;
    
    private volatile String tplusthreewimage;
    
    private volatile String tplusfourdegc;
    
    private volatile String tplusfourdegf;
    
    private volatile String tplusfourwimage;
    
    private volatile String tplusfivedegc;
    
    private volatile String tplusfivedegf;
    
    private volatile String tplusfivewimage;
    
    private volatile String tplussixdegc;
    
    private volatile String tplussixdegf;
    
    private volatile String tplussixwimage;
    
    private volatile String percipation;
    
    private volatile String humidity;
    
    private volatile String wind;
    
    public WeatherDetails(){
    	
    }

	public WeatherDetails(String id, String city, String tdegc, String tdegf, String twimage, String tplusonedegc,
			String tplusonedegf, String tplusonewimage, String tplustwodegc, String tplustwodegf, String tplustwowimage,
			String tplusthreedegc, String tplusthreedegf, String tplusthreewimage, String tplusfourdegc, String tplusfourdegf,
			String tplusfourwimage, String tplusfivedegc, String tplusfivedegf, String tplusfivewimage, String tplussixdegc,
			String tplussixdegf, String tplussixwimage, String percipation, String humidity, String wind) {
		super();
		this.id = id;
		this.city = city;
		this.tdegc = tdegc;
		this.tdegf = tdegf;
		this.twimage = twimage;
		this.tplusonedegc = tplusonedegc;
		this.tplusonedegf = tplusonedegf;
		this.tplusonewimage = tplusonewimage;
		this.tplustwodegc = tplustwodegc;
		this.tplustwodegf = tplustwodegf;
		this.tplustwowimage = tplustwowimage;
		this.tplusthreedegc = tplusthreedegc;
		this.tplusthreedegf = tplusthreedegf;
		this.tplusthreewimage = tplusthreewimage;
		this.tplusfourdegc = tplusfourdegc;
		this.tplusfourdegf = tplusfourdegf;
		this.tplusfourwimage = tplusfourwimage;
		this.tplusfivedegc = tplusfivedegc;
		this.tplusfivedegf = tplusfivedegf;
		this.tplusfivewimage = tplusfivewimage;
		this.tplussixdegc = tplussixdegc;
		this.tplussixdegf = tplussixdegf;
		this.tplussixwimage = tplussixwimage;
		this.percipation = percipation;
		this.humidity = humidity;
		this.wind = wind;
	}

	

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the tdegc
	 */
	public String getTdegc() {
		return tdegc;
	}

	/**
	 * @return the tdegf
	 */
	public String getTdegf() {
		return tdegf;
	}

	/**
	 * @return the twimage
	 */
	public String getTwimage() {
		return twimage;
	}

	/**
	 * @return the tplusonedegc
	 */
	public String getTplusonedegc() {
		return tplusonedegc;
	}

	/**
	 * @return the tplusonedegf
	 */
	public String getTplusonedegf() {
		return tplusonedegf;
	}

	/**
	 * @return the tplusonewimage
	 */
	public String getTplusonewimage() {
		return tplusonewimage;
	}

	/**
	 * @return the tplustwodegc
	 */
	public String getTplustwodegc() {
		return tplustwodegc;
	}

	/**
	 * @return the tplustwodegf
	 */
	public String getTplustwodegf() {
		return tplustwodegf;
	}

	/**
	 * @return the tplustwowimage
	 */
	public String getTplustwowimage() {
		return tplustwowimage;
	}

	/**
	 * @return the tplusthreedegc
	 */
	public String getTplusthreedegc() {
		return tplusthreedegc;
	}

	/**
	 * @return the tplusthreedegf
	 */
	public String getTplusthreedegf() {
		return tplusthreedegf;
	}

	/**
	 * @return the tplusthreewimage
	 */
	public String getTplusthreewimage() {
		return tplusthreewimage;
	}

	/**
	 * @return the tplusfourdegc
	 */
	public String getTplusfourdegc() {
		return tplusfourdegc;
	}

	/**
	 * @return the tplusfourdegf
	 */
	public String getTplusfourdegf() {
		return tplusfourdegf;
	}

	/**
	 * @return the tplusfourwimage
	 */
	public String getTplusfourwimage() {
		return tplusfourwimage;
	}

	/**
	 * @return the tplusfivedegc
	 */
	public String getTplusfivedegc() {
		return tplusfivedegc;
	}

	/**
	 * @return the tplusfivedegf
	 */
	public String getTplusfivedegf() {
		return tplusfivedegf;
	}

	/**
	 * @return the tplusfivewimage
	 */
	public String getTplusfivewimage() {
		return tplusfivewimage;
	}

	/**
	 * @return the tplussixdegc
	 */
	public String getTplussixdegc() {
		return tplussixdegc;
	}

	/**
	 * @return the tplussixdegf
	 */
	public String getTplussixdegf() {
		return tplussixdegf;
	}

	/**
	 * @return the tplussixwimage
	 */
	public String getTplussixwimage() {
		return tplussixwimage;
	}

	/**
	 * @return the percipation
	 */
	public String getPercipation() {
		return percipation;
	}

	/**
	 * @return the humidity
	 */
	public String getHumidity() {
		return humidity;
	}

	/**
	 * @return the wind
	 */
	public String getWind() {
		return wind;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param tdegc the tdegc to set
	 */
	public void setTdegc(String tdegc) {
		this.tdegc = tdegc;
	}

	/**
	 * @param tdegf the tdegf to set
	 */
	public void setTdegf(String tdegf) {
		this.tdegf = tdegf;
	}

	/**
	 * @param twimage the twimage to set
	 */
	public void setTwimage(String twimage) {
		this.twimage = twimage;
	}

	/**
	 * @param tplusonedegc the tplusonedegc to set
	 */
	public void setTplusonedegc(String tplusonedegc) {
		this.tplusonedegc = tplusonedegc;
	}

	/**
	 * @param tplusonedegf the tplusonedegf to set
	 */
	public void setTplusonedegf(String tplusonedegf) {
		this.tplusonedegf = tplusonedegf;
	}

	/**
	 * @param tplusonewimage the tplusonewimage to set
	 */
	public void setTplusonewimage(String tplusonewimage) {
		this.tplusonewimage = tplusonewimage;
	}

	/**
	 * @param tplustwodegc the tplustwodegc to set
	 */
	public void setTplustwodegc(String tplustwodegc) {
		this.tplustwodegc = tplustwodegc;
	}

	/**
	 * @param tplustwodegf the tplustwodegf to set
	 */
	public void setTplustwodegf(String tplustwodegf) {
		this.tplustwodegf = tplustwodegf;
	}

	/**
	 * @param tplustwowimage the tplustwowimage to set
	 */
	public void setTplustwowimage(String tplustwowimage) {
		this.tplustwowimage = tplustwowimage;
	}

	/**
	 * @param tplusthreedegc the tplusthreedegc to set
	 */
	public void setTplusthreedegc(String tplusthreedegc) {
		this.tplusthreedegc = tplusthreedegc;
	}

	/**
	 * @param tplusthreedegf the tplusthreedegf to set
	 */
	public void setTplusthreedegf(String tplusthreedegf) {
		this.tplusthreedegf = tplusthreedegf;
	}

	/**
	 * @param tplusthreewimage the tplusthreewimage to set
	 */
	public void setTplusthreewimage(String tplusthreewimage) {
		this.tplusthreewimage = tplusthreewimage;
	}

	/**
	 * @param tplusfourdegc the tplusfourdegc to set
	 */
	public void setTplusfourdegc(String tplusfourdegc) {
		this.tplusfourdegc = tplusfourdegc;
	}

	/**
	 * @param tplusfourdegf the tplusfourdegf to set
	 */
	public void setTplusfourdegf(String tplusfourdegf) {
		this.tplusfourdegf = tplusfourdegf;
	}

	/**
	 * @param tplusfourwimage the tplusfourwimage to set
	 */
	public void setTplusfourwimage(String tplusfourwimage) {
		this.tplusfourwimage = tplusfourwimage;
	}

	/**
	 * @param tplusfivedegc the tplusfivedegc to set
	 */
	public void setTplusfivedegc(String tplusfivedegc) {
		this.tplusfivedegc = tplusfivedegc;
	}

	/**
	 * @param tplusfivedegf the tplusfivedegf to set
	 */
	public void setTplusfivedegf(String tplusfivedegf) {
		this.tplusfivedegf = tplusfivedegf;
	}

	/**
	 * @param tplusfivewimage the tplusfivewimage to set
	 */
	public void setTplusfivewimage(String tplusfivewimage) {
		this.tplusfivewimage = tplusfivewimage;
	}

	/**
	 * @param tplussixdegc the tplussixdegc to set
	 */
	public void setTplussixdegc(String tplussixdegc) {
		this.tplussixdegc = tplussixdegc;
	}

	/**
	 * @param tplussixdegf the tplussixdegf to set
	 */
	public void setTplussixdegf(String tplussixdegf) {
		this.tplussixdegf = tplussixdegf;
	}

	/**
	 * @param tplussixwimage the tplussixwimage to set
	 */
	public void setTplussixwimage(String tplussixwimage) {
		this.tplussixwimage = tplussixwimage;
	}

	/**
	 * @param percipation the percipation to set
	 */
	public void setPercipation(String percipation) {
		this.percipation = percipation;
	}

	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	/**
	 * @param wind the wind to set
	 */
	public void setWind(String wind) {
		this.wind = wind;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WeatherDetails [id=" + id + ", city=" + city + ", tdegc=" + tdegc + ", tdegf=" + tdegf + ", twimage="
				+ twimage + ", tplusonedegc=" + tplusonedegc + ", tplusonedegf=" + tplusonedegf + ", tplusonewimage="
				+ tplusonewimage + ", tplustwodegc=" + tplustwodegc + ", tplustwodegf=" + tplustwodegf + ", tplustwowimage="
				+ tplustwowimage + ", tplusthreedegc=" + tplusthreedegc + ", tplusthreedegf=" + tplusthreedegf + ", tplusthreewimage="
				+ tplusthreewimage + ", tplusfourdegc=" + tplusfourdegc + ", tplusfourdegf=" + tplusfourdegf + ", tplusfourwimage="
				+ tplusfourwimage + ", tplusfivedegc=" + tplusfivedegc + ", tplusfivedegf=" + tplusfivedegf + ", tplusfivewimage="
				+ tplusfivewimage + ", tplussixdegc=" + tplussixdegc + ", tplussixdegf=" + tplussixdegf + ", tplussixwimage="
				+ tplussixwimage + ", percipation=" + percipation + ", humidity=" + humidity + ", wind=" + wind + "]";
	}
    
}
