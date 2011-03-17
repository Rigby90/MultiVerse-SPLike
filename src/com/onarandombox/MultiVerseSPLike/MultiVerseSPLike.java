package com.onarandombox.MultiVerseSPLike;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class MultiVerseSPLike extends JavaPlugin {

    // Useless stuff to keep us going.
    public static final Logger log = Logger.getLogger("Minecraft");
    public static final String logPrefix = "[MultiVerse-SPLike] ";
    public static final File dataFolder = new File("plugins" + File.separator + "MultiVerse");
    
    @Override
    public void onDisable() {
        log.info(logPrefix + "- Disabled");
    }

    @Override
    public void onEnable() {
        log.info(logPrefix + "- Version " + this.getDescription().getVersion() + " Enabled - By " + getAuthors());
    }

    /**
     * Parse the Authors Array into a readable String with ',' and 'and'.
     * @return
     */
    private String getAuthors(){
        String authors = "";
        ArrayList<String> auths = this.getDescription().getAuthors();
        
        if(auths.size()==1){
            return auths.get(0);
        }
        
        for(int i=0;i<auths.size();i++){
            if(i==this.getDescription().getAuthors().size()-1){
                authors += " and " + this.getDescription().getAuthors().get(i);
            } else {
                authors += ", " + this.getDescription().getAuthors().get(i);
            }
        }
        return authors.substring(2);
    }
    
}
