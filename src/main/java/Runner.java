import entity.*;

import org.apache.log4j.Logger;
import parser.Parser;

import java.util.ArrayList;
import java.util.List;



public class Runner {
    public static final Logger lOGGER = Logger.getLogger(Runner.class);
    public static void main(String[] args) {

        String s = "Lorem ipsum.\n" +
                " dolor sit amet, consectetur adipiscing elit.! Vivamus fringilla lectus eu lectus adipiscing pretium. In hac habitasse platea dictumst. Donec turpis tellus, tincidunt sed orci et, venenatis tempor orci. Quisque bibendum pharetra felis et rutrum. Nam luctus leo non tristique auctor. Ut molestie imperdiet lectus, sit amet faucibus felis lobortis feugiat. Curabitur laoreet ultrices arcu ac aliquam. Nunc tristique vestibulum lorem iaculis aliquet. Pellentesque imperdiet metus quis ante hendrerit pretium. Nullam eget dapibus libero, in sollicitudin arcu. Pellentesque malesuada scelerisque risus sit amet lobortis. Pellentesque sagittis eros at felis sollicitudin, at euismod justo hendrerit.\n" +
                "Nam elit nibh, commodo eu lorem a, dapibus tristique orci! Vestibulum aliquet, elit in commodo tristique, justo ipsum sagittis metus, ut malesuada diam massa vel nisi. Pellentesque condimentum scelerisque augue. Curabitur felis massa, rutrum in fermentum in, adipiscing in arcu. Cras hendrerit consequat auctor. Morbi at volutpat massa. Duis eleifend purus eu ullamcorper viverra. Praesent at volutpat felis. Curabitur lacus enim, scelerisque scelerisque urna quis, posuere faucibus massa. Donec hendrerit ligula nisi, id interdum justo bibendum quis. Maecenas eget commodo libero. Aliquam erat volutpat.\n" +
                "Fusce sodales elit a egestas tristique. Nam dapibus eu velit id euismod. Curabitur accumsan sem vel posuere feugiat. Morbi molestie arcu adipiscing metus porttitor bibendum. Donec tempor condimentum mattis. Donec sed varius purus, sit amet placerat lacus. Maecenas at eleifend nisl, eget aliquam tortor.\n" +
                "Nunc metus est, congue tristique malesuada non, mattis et ligula? ";


        Parser parser = new Parser();
        parser.outSentences(parser, s);
        parser.outParagraphs(parser, s);

    }


}
