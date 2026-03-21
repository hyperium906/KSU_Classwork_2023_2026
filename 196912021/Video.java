public class Video extends Media implements IImageStandard,IAudioStandard{
    private String imageCodec;
    private String audioCodec;

    Video(String name, String imageCodec, String audioCodec){
        super(name);
        this.imageCodec = imageCodec;
        this.audioCodec = audioCodec;
    }

    @Override
    public String getImageCodec() {
        return"Image codec: "+imageCodec;
    }

    @Override
    public String getAudioCodec() {
        return"Audio codec: "+ audioCodec;
    }

    @Override
    public String getMediaInfo() {
        return "Video ID: "+getId()
                +"\nVideo Name: "+getFileName()
                +"\n"+getImageCodec()
                +"\n"+getAudioCodec()+
                ("\n");

    }
}
