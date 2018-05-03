package week2.day4;
// TODO: Auto-generated Javadoc
/**
 * Created by swarnalatha.valluru on 12/22/2017.
 */
public interface IopenTaps {

    /**
     * Login.
     *
     * @param user the user
     * @param password the password
     * @throws InterruptedException the interrupted exception
     */
    public  void login(String user, String password) throws InterruptedException;
    
    /**
     * Go to crm sfa page.
     */
    public  void  goToCrm_sfaPage ();
    
    /**
     * Go to leads page.
     */
    public  void  goToLeadsPage ();
    
    /**
     * Find lead.
     *
     * @param Email the email
     * @return the string
     */
    public  String FindLead(String Email);
    
    /**
     * Go to merge leads.
     */
    public  void  goToMergeLeads ();






}
