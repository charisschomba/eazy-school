package com.chariss.eazyschool.audit;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class EazySchoolInfoContributor implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        HashMap<String, String> eazyMap = new HashMap<>();
        eazyMap.put("App Name", "EazySchool");
        eazyMap.put("App Description", "Eazy School Web Application for Students and Admins.");
        eazyMap.put("App Version", "1.0.0");
        eazyMap.put("Contact Email", "info@eazyschool.com");
        eazyMap.put("Contact Mobile", "+(21) 673 6754");
        builder.withDetail("eazyschool-info", eazyMap);

    }
}
