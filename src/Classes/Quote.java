package Classes;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.processing.Generated;
import java.util.Comparator;


@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote  {


    @JsonProperty("id")
    private int id;
    @JsonProperty("quote")
    private String quote;

    /**
     * No args constructor for use in serialization
     *
     */
    public Quote() {
    }

    /**
     *
     * @param quote цитата из книги
     * @param id id цитаты
     */
    public Quote(int id, String quote) {
        super();
        this.id = id;
        this.quote = quote;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("quote")
    public String getQuote() {
        return quote;
    }

    @JsonProperty("quote")
    public void setQuote(String quote) {
        this.quote = quote;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("id:"+this.id+"\n");
        sb.append("quote:"+this.quote+"\n");

        return sb.toString();

    }

    public static Comparator<Quote> byIDValueAsc = (o1, o2) -> o1.id > o2.id ? 1 : o1.id < o2.id ? -1 : 0;
    public static Comparator<Quote> byIDValueDesc = (o1, o2) -> o1.id < o2.id ? 1 : o1.id > o2.id ? -1 : 0;

    public static Comparator<Quote> byTextLengthAsc =  Comparator.comparing(obj -> obj.getQuote().length());
    public static Comparator<Quote>byTextLengthDesc = (o1, o2) -> o1.getQuote().length() < o2.getQuote().length()? 1 : o1.getQuote().length() > o2.getQuote().length() ? -1 : 0;

    public static Comparator<Quote> byTextAsc =Comparator.comparing(o -> o.quote);
    public static Comparator<Quote> byTextDesc = (o1, o2) -> o2.quote.compareTo(o1.quote);

}
