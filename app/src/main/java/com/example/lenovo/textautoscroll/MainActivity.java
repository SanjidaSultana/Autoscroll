package com.example.lenovo.textautoscroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private WebView text;
    String text1="<marquee direction=\"up\">A wiki is run using wiki software, otherwise known as a wiki engine. A wiki engine is a type of content management system, but it differs from most other such systems, including blog software, in that the content is created without any defined owner or leader, and wikis have little inherent structure, allowing structure to emerge according to the needs of the users.[2] There are dozens of different wiki engines in use, both standalone and part of other software, such as bug tracking systems. Some wiki engines are open source, whereas others are proprietary. Some permit control over different functions (levels of access); for example, editing rights may permit changing, adding, or removing material. Others may permit access without enforcing access control. Other rules may be imposed to organize content. he online encyclopedia project Wikipedia is the most popular wiki-based website, and is one of the most widely viewed sites in the world, having been ranked in the top ten since 2007.[3] Wikipedia is not a single wiki but rather a collection of hundreds of wikis, with each one pertaining to a specific language. In addition to Wikipedia, there are tens of thousands of other wikis in use, both public and private, including wikis functioning as knowledge management resources, notetaking tools, community websites, and intranets. The English-language Wikipedia has the largest collection of articles; as of September 2016, it had over five million articles. Ward Cunningham, the developer of the first wiki software, WikiWikiWeb, originally described wiki </marquee>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.textViewId);
        text.loadDataWithBaseURL(null,text1,"text/html","utf-8",null);
    }

}
