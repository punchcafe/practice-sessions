package jackson.practice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonGetter;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class JsonCandidate {
    private String movie;
    private int rating;
    private Map<String, String> moreValues = new HashMap<String,String>();

    @JsonProperty
    public String getMovie(){
        return this.movie;
    }

    @JsonGetter("rating")
    public int getRating(){
        return this.rating;
    }

    @JsonSetter
    public void setMovie(String movie){
        this.movie = movie;
    }

    @JsonAnySetter
    public void setMisc(Object key, Object value){
        this.moreValues.put(key.toString(), value.toString());
    }

    @JsonAnyGetter
    public Map<String, String> moreValues(){
        return moreValues;
    }



    public JsonCandidate(){
        this.moreValues.put("hi", "there");
    }

    private JsonCandidate(String movie, int rating){
        this.movie = movie;
        this.rating = rating;
    }

    public static Builder newBuilder(){
        return new Builder();
    }

    static public class Builder{
        private String movie = null;
        private int rating = 0;

        public Builder setMovie(String movie){
            this.movie = movie;
            return this;
        }

        public Builder setRating(int rating){
            this.rating = rating;
            return this;
        }

        public Builder(){}
        public JsonCandidate build(){
            return new JsonCandidate(this.movie, this.rating);
        }
    }
}
