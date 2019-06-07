/**
 * Creates the MIDI files from the text files generated by the computer
 */

package composer;
import java.io.File;
import java.io.IOException;
import javax.sound.midi.InvalidMidiDataException;

public class MidiFileCreator
{
	
	public static void main(String[] args) throws IOException, InvalidMidiDataException
	{
		// create new FileConverter
		FileConverter fileConverter = new FileConverter();
		
		// create new directory called "midi-files"
		File midi = new File("midi-files");
		midi.mkdir();
		
		// access files in "txt-files" and store them in an array of Files
		File text = new File("txt-files");
		File[] textFiles = text.listFiles();
		
		// create a MIDI file for each text file in "txt-files" using the midiFile() FileConverter method
		for (File textFile : textFiles)
		{
			File midiFile = fileConverter.midiFile(textFile, midi);
			midiFile.createNewFile();
		}
	}
	
}