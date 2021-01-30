var body = {"response":0,"wifi-number":16,"wifi-list":[{"wifi-ssid":"Sprint-TREBL-44:8F:17:2D:EA:5A  ","wifi-band":"2.4G","wifi-rssi":-23,"wifi-security-mode":"NONE"},{"wifi-ssid":"Sprint-TREBL-44:8F:17:2D:EA:5A  ","wifi-band":"2.4G","wifi-rssi":-23,"wifi-security-mode":"NONE"},{"wifi-ssid":"!@#$","wifi-band":"2.4G","wifi-rssi":-47,"wifi-security-mode":"WPA2 PSK"},{"wifi-ssid":"!@#$","wifi-band":"2.4G","wifi-rssi":-47,"wifi-security-mode":"WPA2 PSK"},{"wifi-ssid":"gw_!@#$test_50","wifi-band":"5G","wifi-rssi":-51,"wifi-security-mode":"WPA2 PSK"},{"wifi-ssid":"HDATA","wifi-band":"2.4G","wifi-rssi":-60,"wifi-security-mode":"NONE"},{"wifi-ssid":"HDATA","wifi-band":"2.4G","wifi-rssi":-60,"wifi-security-mode":"NONE"},{"wifi-ssid":"Sprint-TREBL-44:8F:17:2D:EA:5A","wifi-band":"2.4G","wifi-rssi":-62,"wifi-security-mode":"WPA2 PSK"},{"wifi-ssid":"gm_middleware","wifi-band":"2.4G","wifi-rssi":-62,"wifi-security-mode":"WPA2 PSK"},{"wifi-ssid":"HGUEST","wifi-band":"2.4G","wifi-rssi":-64,"wifi-security-mode":"NONE"},{"wifi-ssid":"U3ByaW50LVRSRUJM  ","wifi-band":"2.4G","wifi-rssi":-64,"wifi-security-mode":"NONE"},{"wifi-ssid":"HGUEST","wifi-band":"2.4G","wifi-rssi":-64,"wifi-security-mode":"NONE"},{"wifi-ssid":"U3ByaW50LVRSRUJM  ","wifi-band":"2.4G","wifi-rssi":-64,"wifi-security-mode":"NONE"},{"wifi-ssid":"D-Link_DIR-600M-Rheem","wifi-band":"2.4G","wifi-rssi":-65,"wifi-security-mode":"WPA2 PSK"},{"wifi-ssid":"Sprint-TREBL-44:8F:17:2D:EA:5A","wifi-band":"2.4G","wifi-rssi":-65,"wifi-security-mode":"WPA2 PSK"},{"wifi-ssid":"Sprint-TREBL-44:8F:17:2D:EA:5A","wifi-band":"2.4G","wifi-rssi":-67,"wifi-security-mode":"NONE"}]}

var parseWiFiList = function (){
    console.log("Length : " +body["wifi-list"].length + " Current WiFi SSID List :" , body["wifi-list"] )
    for (var index =0; index < body["wifi-list"].length; ++index){
        var ssid = body["wifi-list"][index]["wifi-ssid"];
        console.log("SSID :" +ssid)
        if(ssid.search("Sprint") >=0 && ssid.search("TREBL")>=0){
            console.log("Remove SSID :" +ssid);
            body["wifi-list"].splice(index,1);
            if (index >= 0)
                index = index -1;
           
            body["wifi-number"] = body["wifi-number"] - 1;
        }
    } //End of Loop
    console.log("Length : " +body["wifi-list"].length + " New SSID List :" , body["wifi-list"])
}

parseWiFiList();