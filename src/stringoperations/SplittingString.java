package stringoperations;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SplittingString {

    public static void main(String[] args) {

        String s="Hello world I am learning java";

        String sp[]=s.split(" ");

        for(int i=0;i<sp.length;i++){
            System.out.println(sp[i]);
        }
    }
}
