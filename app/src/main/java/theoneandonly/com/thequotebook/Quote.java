package theoneandonly.com.thequotebook;

/**
 * Created by mjabati on 12/15/15.
 */
public class Quote {

    private String person;
    private String quote;

    public Quote(String mQuote, String mPerson){
        super();

        quote = mQuote;
        person = mPerson;
    }

    public String getPerson(){
        return person;
    }

    public String getQuote(){
        return quote;
    }
}
