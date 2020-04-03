package pack;

interface Sponsor
{
    void getSponsorDetail();   
    void setSponsorDetail();   
}

public interface Org extends Sponsor
{
    
	void getEventDetails();
	void setEventDetails();

}