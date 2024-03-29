public class UniData {
    private String year,rank_display,university,score,link,country,city,region,logo;
    
    
    
  
    public UniData(){

    }
    public UniData(String year,String rank_display,
                     String university, String score,String link, 
                     String country,String city, String region, String logo) {
        this.year = year;
        this.rank_display = rank_display;
        this.university = university;
        this.score = score;
        this.link = link;
        this.country = country;
        this.city = city;
        this.region = region;
        this.logo = logo;
       
    }
   

      public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getRank_display() {
        return rank_display;
    }
    public void setRank_display(String rank_display) {
        this.rank_display = rank_display;
    }
    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }
    @Override
    public String toString() {
        return "UniData [year=" + year + ", rank_display=" + rank_display + ", university=" + university + ", score="
                + score + ", link=" + link + ", country=" + country + ", city=" + city + ", region=" + region
                + ", logo=" + logo + "]";
    }

}
