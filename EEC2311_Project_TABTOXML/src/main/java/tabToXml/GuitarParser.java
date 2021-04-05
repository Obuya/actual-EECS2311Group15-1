package tabToXml;

import java.util.ArrayList;
import java.util.List;

public class GuitarParser {
	
	// all the arrays to contain information gathered by the notes
	public ArrayList<String> notes = new ArrayList<>();
	public ArrayList<String> alterArr = new ArrayList<>();
	public ArrayList<String> fretString = new ArrayList<>();
	public ArrayList<String> fretNum = new ArrayList<>();
    public ArrayList<String> durationArr = new ArrayList<String>();
    public ArrayList<String> typeArr = new ArrayList<String>();
    public ArrayList<String> chords = new ArrayList<String>();
    public ArrayList<String> graceArr = new ArrayList<String>();
    
    // current tuning, from top line to bottom line
    public String[] tuning = {"E4", "B3", "G3", "D3", "A2", "E2"};
    
    private int divisions = 4; //current default is 4
    private int padding = 1; // number of dashes used for padding, should be 0 or 1
    // merging
    
    public GuitarParser(ArrayList<String> tfrparsed) throws Exception {
    	translateParsed(tfrparsed);
    	parseToRhythm(tfrparsed);
    }
    
	/*This method takes the input file and parses that into a 2d array. 
	 *The result of that 2d array is used to obtain the fret and chord/note
	 *using the translate() method above. */
    
	public void translateParsed(ArrayList<String> parsedTab) throws Exception {
		
		//TextFileReader tabReader = new TextFileReader(inputfile);
		

		int row = parsedTab.size();
//		int col = tabReader.printParsed().get(0).size();

		int next = parsedTab.get(0).length();

		char fret2 = '\0';
		String tmp = "";
		int cal = 0;
			// go through each column
			for (int j = 0; j < next; j++) {
				
				String fretNumVar = "";   // reset the fret string checker on the iteration of each new column
				String chord = ""; 		// clear value of note before every column
				
				// go through each row
				for(int i = 0; i < row; i++) {
					
					String fretStringVar = "";
					
					fret2 = parsedTab.get(i).charAt(j);

					int fret = Character.getNumericValue(fret2);
					if (fret2 >= '0' && fret2 <= '9') {
						tmp = "";
						// make regular note 
						if (chord.isEmpty() && fretNumVar.isEmpty() && fretStringVar.isEmpty()) {
							chord = translate(tuning[i], fret);
							fretNumVar = fret + "";
							cal = i + 1;
							fretStringVar = cal + "";
							
						}else { // make a chord note
							notes.remove(notes.size() - 1);
							fretNum.remove(fretNum.size() - 1);
							//fretString.remove(fretString.size()-1);
							
							notes.add(chord);
							fretNum.add(fretNumVar);
							//fretString.add(fretStringVar);
							
							chord = "+" + translate(tuning[i], fret);
							fretNumVar = fret + "";
							fretStringVar = cal + "";
							
//							chord = translate("E4", fret) + "+" + chord;
//							fretNumVar = fretNumVar + "+" + fret;
//							fretStringVar = fretStringVar + "+" + cal;
						}
						notes.add(chord);
						fretNum.add(fretNumVar);
						fretString.add(String.valueOf(i+1));		
						
					}else if (fret2 == '|') {
						if (tmp.isEmpty()) {
							tmp = fret2 + "";
							notes.add(tmp);
							alterArr.add(tmp);
							fretNum.add(tmp);
							fretString.add(tmp);
						}
					}

				}	
			}
		
			notes.remove(notes.size() - 1);
			alterArr.remove(alterArr.size()-1);
			fretNum.remove(fretNum.size() - 1);
			fretString.remove(fretString.size()-1);
			notes.add("||");
			alterArr.add("||");
			fretNum.add("||");
			fretString.add("||");
//		System.out.print("Fret String: " + fretString + " Fret size: " + fretString.size() + "\n");
//		System.out.print("Fret Num: " + fretNum + " Fret size: " + fretNum.size() + "\n");
//		System.out.print("\nNote size: " + note.size());
    	
		//cleaning up the + in the chords and making a chords list
		for( int i = 0; i < notes.size(); i++) {
			if(notes.get(i).charAt(0) == '+'){
    			notes.set(i, notes.get(i).substring(1));
				chords.add("true");
    		}
    		else if( notes.get(i).charAt(0) == '|') {
    			chords.add("|");
    		}
    		else {
    			chords.add("false");
    		}
    	}
		
		// chords - add the double bars later
	}
	
	//CARRIED OVER FROM RHYTHMPARSER CLASS
	/**
     * Generates duration and type arrays from parsed array
     * @param parsedTab - a formatted tab (arrayList of Strings)
     */
    public void parseToRhythm(ArrayList<String> parsedTab) {
    	
//    	// For Debugging
//    	for(int i = 0; i < parsedTab.size(); i++) {
//    		System.out.println(parsedTab.get(i));
//    	}
        
        int counter = 0; // iterates horizontally
        int noteLength = 0; // in 16th notes
        int lines = parsedTab.size(); // number of lines in staff
        int currentLine = 0;
        int prevChordNum = 0; // number of notes in previous chord
        int curChordNum = 0; // number of notes in current chord
        
        boolean isDoubleDigit = false;
        
        int graceNoteNum = 0; // number of tracked grace notes, for backtracking to note before the grace notes start
        int graceNoteLength = 0; // note length of tracked grace notes, in 16th notes
        boolean trackingGrace = false; // if we are tracking grace notes
        
        while (counter < parsedTab.get(0).length()) { 
            
            currentLine = 0;
            
            // Skip "|" and padding "-"
            if (parsedTab.get(0).charAt(counter) == '|') {
                
                // Assuming note lengths end at barlines
                if(noteLength != 0) {
                	// Add all tracked notes to arrays
                	while (prevChordNum > 0) {
	                    durationArr.add("" + noteLength);
	                    typeArr.add(durationToType(noteLength, divisions));
	                    prevChordNum--;
                	}
                	
                	// since we have reached end of measure, reset and stop counting noteLength
                    noteLength = 0;
                }
                
                // Check for Double Barlines
                if(counter + 1 < parsedTab.get(0).length() && parsedTab.get(0).charAt(counter + 1) == '|') {
                	durationArr.add("||");
                    typeArr.add("||");
                    graceArr.add("||");
                    counter++;
                }
                else {
	                durationArr.add("|");
	                typeArr.add("|");
	                graceArr.add("|");
                }
                counter += padding; // skipping both '|' and padding '-', if padding exists
            }
                    
            // Should be run before encountering the first note/chord in a measure
            else if (prevChordNum == 0) {
            	
            	// Assume Frets are Single digit
                while(currentLine < lines) {
                	                  
                	// Add all notes to a chord
                    if(Character.isDigit(parsedTab.get(currentLine).charAt(counter))) {
                    	
                    	// check if fret is doubledigit
                    	if(Character.isDigit(parsedTab.get(currentLine).charAt(counter + 1))) {
                    		isDoubleDigit = true;
                    	}
                    	
                    	// starts counting noteLength, should only be done once
                    	if (prevChordNum == 0) {
                    		noteLength++;
                    	}
                    	
                        prevChordNum++;
                    }
                    
                    currentLine++;
                }
                
                // If DoubleDigit frets, recount using one's place
                if (isDoubleDigit) {
                	int totalFretNum = 0;
                	currentLine = 0;
                	
                	while (currentLine < lines) {
                		if(Character.isDigit(parsedTab.get(currentLine).charAt(counter + 1))) {
                			totalFretNum++;
                		}
                		
                		currentLine++;
                	}
                	
                	prevChordNum = totalFretNum;
                	
                	counter++;
                	isDoubleDigit = false;
                }
            }
            
            // Should be run after encountering the first note/chord in a measure
            else{
            	            	
            	// Check for Single Digit Frets
                while(currentLine < lines) {
                    
                	// Adds all previous chord notes to arrays, then adds current notes to current chord
                    if(Character.isDigit(parsedTab.get(currentLine).charAt(counter))) {
                    	
                    	// check if fret is doubledigit
                    	if(Character.isDigit(parsedTab.get(currentLine).charAt(counter+1))) {
                    		isDoubleDigit = true;
                    	}
                    	
                    	// Adding tracked notes to arrays
                    	while (prevChordNum > 0) {
	                        durationArr.add("" + noteLength);
	                        typeArr.add(durationToType(noteLength, divisions));
	                        prevChordNum--;
                    	}
                    	
                    	// reset note Length
                        noteLength = 0;
                        curChordNum++;
                    }
                    
                    currentLine++;
                }

                // If DoubleDigit frets, recount using one's place
                if(isDoubleDigit) {
                                	
                	int totalFretNum = 0;
                	currentLine = 0;
                	
                	while (currentLine < lines) {
                		if(Character.isDigit(parsedTab.get(currentLine).charAt(counter + 1))) {
                			totalFretNum++;
                		}
                		
                		currentLine++;
                	}
                	
                	prevChordNum = totalFretNum;
                	
                	// increment counter and reset isDoubleDigit
                	counter++;
                	isDoubleDigit = false;
                }
 
                // if there are notes in the current chord, copy them to previous chord and empty current chord
                if(curChordNum != 0) {
                	prevChordNum = curChordNum;
                	curChordNum = 0;
                }
                
                // increase note length by 1
                noteLength++; 

            }
            
            counter++;
        }
        
        // Last chord/note length and ending barline is added
        /*while (prevChordNum > 0) {
	        durationArr.add("" + noteLength);
	        typeArr.add(durationToType(noteLength, divisions));
	        prevChordNum--;
        }
        durationArr.add("||");
        typeArr.add("||");
        graceArr.add("||"); */
        
//      // For debugging
//      System.out.print("Duration Array: ");
//      System.out.println(durationArr);
//      System.out.print("Type Array: ");
//      System.out.println(typeArr);
        System.out.println("GraceArr: " + graceArr);
    }
    
    /**
     * CARRIED OVER FROM RHYTHM PARSER CLASS
     * returns the word representation of the duration amount
     * The method that calls this should throw an error if result is "unknown"
     * @param duration
     * @param divisions
     * @return
     */
    private String durationToType(int duration, int divisions) {
        
        double durOverDiv = (double) duration / divisions;
        String result = "";
        
        // Can't use switch since durOverDiv is double type
        if (durOverDiv >= 4.0) {
            result = "whole";
        }
        else if (durOverDiv >= 3.0) {	// note in musicXML needs <dot/> tag
        	result = "dotted half";
        }
        else if (durOverDiv >= 2.0) {
            result = "half";
        }
        else if (durOverDiv >= 1.5) {	// note in musicXML needs <dot/> tag
            result = "dotted quarter";
        }
        else if (durOverDiv >= 1.0) {
            result = "quarter";
        }
        else if (durOverDiv >= 0.75) {	// note in musicXML needs <dot/> tag
            result = "dotted eighth";
        }
        else if (durOverDiv >= 0.5) {
            result = "eighth";
        }
        else if (durOverDiv >= 0.25) {
            result = "16th";
        }
        else {
        	result = "16th"; //default, should be set to "unknown"
        	// Should throw minor error
        }
        
        return result;
    }    
    
	/**
	 * Converts a Note
	 * C > C#/Db > D > D#/Eb > E > F > F#/Gb > G > G#/Ab > A > A#/Bb > B > Loops back to C
	 * @param Note
	 * @return
	 * @throws Exception 
	 */
	public String translate(String string, int fret) throws Exception{
		if(fret > 12)
			throw new Exception("The fret must be between 1 and 12 (inclusive)");

		String[] table = {"C","C#","D","D#","E","F","F#","G","G#","A","A#","B"};			
		//find location in table
		int location = 0;
		for(int i = 0; i < table.length; i++) {
			if(string.substring(0,1).equals(table[i])) {
				location = i;
				break;
			}
		}
		
		int startingOctave = Integer.parseInt(string.substring(1));
		int octave = startingOctave;
		while(fret > 0) {
			location++;
			fret--;
			if(location == table.length) {
				location = 0;
				octave++;
			}
		}
		
		// Determining Alter - Hardcoded for C major
		if (table[location].length() == 2) { // check if # is part of the note
			alterArr.add("1");
		}
		else {
			alterArr.add(null);
		}
		
		String newNote = table[location].substring(0,1)+octave;
		return newNote;
	}
	
	// CARRIED OVER FROM XMLGENERATOR CLASS
    // A PROCESSING METHOD TO MAKE INFORMATION EASY TO ACCESS FOR JAXB
	// CHANGE LATER SO IT MAKES OBJECTS RATHER THAN STRINGS
    public String[][] processor() {
    	ArrayList<String> notes = this.notes;
    	ArrayList<String> alterArr = this.alterArr;
     	ArrayList<String> fretNums = this.fretNum;
		ArrayList<String> fretStrings = this.fretString;
		ArrayList<String> durationArr = this.durationArr;
		ArrayList<String> typeArr = this.typeArr;
		ArrayList<String> chordArr = this.chords;

    	// inserting into 2d array
    	//each row contains: duration, step, alter,octave,type,string,fret and CHORD in each row
    	String [][] infoArray = new String[notes.size()][8]; // added one to account for NEW chord property
    	
		System.out.println("Notes: " + getNotes() + " size of array: " + getNotes().size());
		System.out.println("Alters: " + getAlters() + " size of array: " + getAlters().size());
		System.out.println("Chord?: " + getChordArr() + " size of array: " + getChordArr().size() );
		System.out.println("Frets: " + getFretNums() + " size of array: " + getFretNums().size());
		System.out.println("Fret Strings: " + getFretStrings() + " size of array: " + getFretStrings().size());
        System.out.println("duration: \t" + getDurationArr() + " Length of Array:" + getDurationArr().size() );
	    System.out.println("type: \t" + getTypeArr() + " Length of Array:" + getTypeArr().size() );
    	
    	for(int i = 0; i < notes.size(); i++) {
    		if(notes.get(i).contains("|")){
    			infoArray[i][0] = null;
        		infoArray[i][1] = null; 
        		infoArray[i][2] = null;
        		infoArray[i][3] = null;
        		infoArray[i][4] = null;
        		infoArray[i][5] = null;
        		infoArray[i][6] = null; 
        		infoArray[i][7] = null;
    		}
    		else {    		
    			infoArray[i][0] = durationArr.get(i);   //duration
    			infoArray[i][1] = notes.get(i).substring(0,1); // step 
    			infoArray[i][2] = alterArr.get(i);
    			infoArray[i][3] = notes.get(i).substring(1); // octave
    			infoArray[i][4] = typeArr.get(i); //type
    			infoArray[i][5] = fretStrings.get(i); //string
    			infoArray[i][6] = fretNums.get(i); // fret 
    			infoArray[i][7] = chordArr.get(i); // "false" or "true" depending on if its a chord or not
    		}
    	}
    	
		return infoArray;
	}
    
    // METHODS TO SEND EACH OF THE ARRAYS OF INFORMATION TO XMLGEN 
    
	public ArrayList<String> getNotes(){
		return notes;
	}	
	public ArrayList<String> getAlters() {
		return alterArr;
	}
	public ArrayList<String> getFretStrings(){
		return fretString;
	}
	
	public ArrayList<String> getFretNums(){
		return fretNum;
	}
    public ArrayList<String> getTypeArr(){
    	return this.typeArr;
    }
    public ArrayList<String> getDurationArr(){
    	return this.durationArr;
    }
    public ArrayList<String> getChordArr(){
    	return this.chords;
    }
}
