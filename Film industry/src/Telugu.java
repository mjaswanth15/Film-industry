public class Telugu {
private String actor;
private String producer;
private String director;
private Bollywood bollywood;
public Telugu(String actor,String producer, String director, Bollywood bollywood) {
	this.actor = actor;
	this.producer = producer;
	this.director = director;
	this.bollywood = bollywood;
}
public void Tfi()
{
	System.out.println("Best actor award goes to " + actor);
	System.out.println("for the movie RRR produced by "+ producer);
	System.out.println("under the direction of " + director);
	System.out.println("alia" + " is the main lead" );
}
public String getActor() {
	return actor;
}
public String getProducer() {
	return producer;
}
public String getDirector() {
	return director;
	}
public Bollywood getbollywood() {
	return bollywood;
}
}
