public class PUSHAttempt{
  public static void main(String[] args){
    // http://hc.apache.org/httpclient-3.x/authentication.html#Preemptive_Authentication
    // preemptive authentication
    client.getParams().setAuthenticationPreemptive(true);
    
    // default credentials
    Credentials defaultcreds = new UsernamePasswordCredentials("username", "password");
    client.getState().setCredentials(new AuthScope("myhost", 80, AuthScope.ANY_REALM), defaultcreds);
  }
}
