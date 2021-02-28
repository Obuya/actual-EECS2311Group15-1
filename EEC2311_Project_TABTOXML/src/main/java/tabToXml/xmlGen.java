package tabToXml;

import java.io.File;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import musicXML.*;


public class xmlGen {
	
	Marshaller jaxbMarshaller;
    private ScorePartwise scorePartwise;
    
    // This section below needs work on automatic value entry
    
    private java.lang.String[][] attributeVals = {
        {"4"}, // divisions
        {"0"}, // fifths
        {"4","4"}, // beats and beat-type
        {"TAB","5"}, // sign and line
        {"6"}, // staff lines
        {"E","A","D","G","B","E"}, //tuning-step
        {"2","2","3","3","3","4"} // tuning-octave
    };

    
    
    /**
     * A constructor prepared for the future of this Class, it takes the instrument and makes xml stuff out of it based on instrument
     * this one is for guitar obviously
     * @param instrument
     * @param parserObject
     */
    public xmlGen(GuitarParser gp) {
    	guitarGenerator(gp.processor());
    }    

    /**
     * previously a constructor, this has now become a method the constructor call if the instrument is a guitar
     * @param gp
     */
    public void guitarGenerator(java.lang.String[][] info)
    {

    	// creating the outermost tag "score-partwise"
        this.scorePartwise = new ScorePartwise();
        scorePartwise.setMovementTitle("test"); // move to constuctor
        
        scorePartwise.setPartList( new PartList(new ScorePart("P1", "Instrument Name"))); // constructor sets ID and part-name
        Part part = new Part("P1"); // constructer sets ID
        

        // creating measure list that will hold all the measures which will each contain all the notes
        ArrayList<musicXML.Measure> measures = new ArrayList<musicXML.Measure>();
        // initializing the first measure
        musicXML.Measure measure = new musicXML.Measure("P1"); // constructor sets the measure number
           
        // creating the attributes section that goes into the first measure
        Attributes attributes = new Attributes();
        attributes.setDivisions(new BigDecimal(2));

        Key key = new Key();
        key.setFifths(new BigInteger("0"));
        attributes.setKey(key);

        attributes.setTime(new Time("4", "4")); // constructor takes beat and beat type
        attributes.setClef(new Clef("TAB", new BigInteger("5"))); // constuctor sets sign and line

        StaffDetails staffDetails = new StaffDetails(new BigInteger("6")); // constructor takes the number of lines

        //creating all the staff tunings that will go into the staff details tag above 
        ArrayList<StaffTuning> staffTunings = new ArrayList<>();        
    	for(int i = 0; i < attributeVals[5].length; i++)
            staffTunings.add(new StaffTuning(new BigInteger(Integer.toString(i + 1)),attributeVals[5][i],new BigInteger(attributeVals[6][i])));       
    		// loop above adds all information into a stafftuning object before inserting into stafftuning list
    		// the constructor takes line, tuning step and tuning octave
    	
    	//insert the arraylist of staff tunings into the stffdetails object
        staffDetails.setStaffTuning(staffTunings);
        // insert staff details into attributes
        attributes.setStaffDetails(staffDetails);
        // At this point attributes contains all the requried information, it is added to the first measure
        measure.setAttributes(attributes);

        // creating a list of notes to put into each measure object
        ArrayList<musicXML.Note> notes = new ArrayList<>();
        int measureNum = 1;
        for(int i = 1; i < info.length; i++)
        {
        	// if you happen to be at a "|", then you create a new measure object and store the previous one
        	if(info[i][0] == null ) {
        		measure.setNote(notes);
        		notes = new ArrayList<musicXML.Note>();
        		measures.add(measure);
        		measure = new musicXML.Measure();
        		measureNum++;
        		measure.setNumber(""+measureNum);
        	}
        	//if you happen to NOT get a "|", then you are at a note, so create a note and store it in the notes list
        	else {
        		musicXML.Note note = new musicXML.Note();
        		Chord c = new Chord();
        		if( info[i][7].equals("true"))
        			note.getDurationOrChordOrCue().add(c); // chord
            Pitch pitch = new Pitch(info[i][1],new BigInteger(info[i][3]));
            note.getDurationOrChordOrCue().add(pitch);
            note.getDurationOrChordOrCue().add(new BigDecimal(info[i][0])); // duration
            note.setVoice(info[i][2]);
            note.setType(new Type(info[i][4]));
            Notations notations = new Notations();
            Technical technical = new Technical();
            technical.setString( new musicXML.String(new BigInteger(info[i][5])));
            technical.setFret(new Fret(new BigInteger(info[i][6])));
            notations.setTechnical(technical);
            note.setNotations(notations);
            notes.add(note);
        	}
        }
        measure.setNote(notes);        
        part.setMeasure(measures);
        // at this point all the measures have been created along with all the notes inside them
        
        scorePartwise.setPart(part);
        // add the part and our process of creating objects is complete
        // now we just need to marshall
        
        // ADDED TO CONSTRUCTOR
        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(ScorePartwise.class);
            jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            

            //jaxbMarshaller.marshal(scorePartwise, System.out); //prints to console

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        
        
    }

    /**
     * This method replaces the contents of a file with the XML of a tablature, its used for creating a file to put on a music player
     * @param file
     * @return
     */
    @SuppressWarnings("finally")
	public File createFile(File file)
    {
    	try {
    		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    		jaxbMarshaller.marshal(scorePartwise, file); // return as a string???
    	}
    	catch(JAXBException e) {
    		e.printStackTrace();
    	}finally {
    		return file;
    	}
    }
    

    /**
     * This method gets the XML information as a string, its useful for printing on console or to GUI
     * @return
     */
    @SuppressWarnings("finally")
	public java.lang.String getXMLContent() {
    	StringWriter xml =  new StringWriter();
    	try {    		
            jaxbMarshaller.marshal(scorePartwise, xml); // return as a string???
        }
        catch(JAXBException e) {
        	e.printStackTrace();
        }finally {
        	return xml.toString();
        }
    }
}