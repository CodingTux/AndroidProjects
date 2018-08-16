package planets.project.com.planets;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//import android.view.GestureDetector;//

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView3.setText("More");
            }
        });

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView3.setText("More");
                        TextView textView = (TextView)findViewById(R.id.textView);
                        textView.setMovementMethod(
                                new ScrollingMovementMethod());
                                textView.setText(                                         "SUN\n"+
                                        "The Sun is the star at the center of the Solar System and is by far the most important source of energy for" +
                                        " life on Earth." +
                                        " It is a nearly perfect sphere of hot plasma,with internal convective motion that generates a magnetic " +
                                        "field via a dynamo process.Its diameter is about 109 times that of Earth" +
                                        ", and its mass is about 330,000 times that of Earth, accounting for about 99.86% of the total mass of the Solar" +
                                        " System.About three quarters of the Sun's mass consists of hydrogen; " +
                                        "the rest is mostly helium, with much smaller quantities of heavier elements, including oxygen, carbon, neon, and iron." +
                                        "\n" +
                                        "\n" +
                                        "The Sun is a G-type main-sequence star (G2V) based on spectral class and it is informally referred to as a yellow dwarf. " +
                                        "It formed approximately 4.6 billion years ago" +
                                        " from the gravitational collapse of matter within a region of a large molecular cloud. Most of this matter gathered " +
                                        "in the center, whereas the rest flattened into an orbiting disk that became the Solar System. The central mass became" +
                                        " increasingly hot and dense, eventually initiating nuclear fusion in its core. It is thought that almost all stars form" +
                                        " by this process.\n" +
                                        "\n" +
                                        "The Sun is roughly middle aged and has not changed dramatically for over four billion years, and" +
                                        " will remain fairly stable for more than another five billion years. However, after hydrogen fusion " +
                                        "in its core has stopped, the Sun will undergo severe changes and become a red giant. It is calculated " +
                                        "that the Sun will become sufficiently");
                        final TextView textView3 = (TextView)findViewById(R.id.textView3);
                        textView3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                textView3.setText("More");
                                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Sun"));
                                startActivity(i);
                            }

                        });

                    }
                }
        );

        Button mercury = (Button)findViewById(R.id.mercury);
        mercury.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView3.setText("More");
                        TextView textView = (TextView)findViewById(R.id.textView);
                        textView.setMovementMethod(
                                new ScrollingMovementMethod());
                        textView.setText("\t\tMercury\n");

                        final TextView textView3 = (TextView)findViewById(R.id.textView3);
                        textView3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                textView3.setText("More");
                                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Mercury_(Planet)"));
                                startActivity(i);
                            }

                        });
                    }
                }
        );

        Button venus = (Button)findViewById(R.id.venus);
        venus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView3.setText("More");
                        TextView textView = (TextView)findViewById(R.id.textView);
                        textView.setMovementMethod(
                                new ScrollingMovementMethod());
                        textView.setText("\t\tVenus\n");/*Enter your message here*/

                        final TextView textView3 = (TextView)findViewById(R.id.textView3);
                        textView3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                textView3.setText("More");
                                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Venus"));
                                startActivity(i);
                            }

                        });
                    }
                }
        );

        Button earth = (Button)findViewById(R.id.earth);
        earth.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView3.setText("More");
                        TextView textView = (TextView)findViewById(R.id.textView);
                        textView.setMovementMethod(
                                new ScrollingMovementMethod());
                        textView.setText("\t\tEarth\n");                   /*Enter your message here*/

                        final TextView textView3 = (TextView)findViewById(R.id.textView3);
                        textView3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                textView3.setText("More");
                                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Earth"));
                                startActivity(i);
                            }

                        });
                    }
                }
        );

        Button mars = (Button)findViewById(R.id.mars);
        mars.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView3.setText("More");
                        TextView textView = (TextView)findViewById(R.id.textView);
                        textView.setMovementMethod(
                                new ScrollingMovementMethod());
                        textView.setText("\t\tMars\n");                   /*Enter your message here*/

                        final TextView textView3 = (TextView)findViewById(R.id.textView3);
                        textView3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                textView3.setText("More");
                                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Mars"));
                                startActivity(i);
                            }

                        });

                    }
                }
        );

        Button jupiter = (Button)findViewById(R.id.jupiter);
        jupiter.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView3.setText("More");
                        TextView textView = (TextView)findViewById(R.id.textView);
                        textView.setMovementMethod(
                                new ScrollingMovementMethod());
                        textView.setText("\t\tJupiter\n");                   /*Enter your message here*/

                        final TextView textView3 = (TextView)findViewById(R.id.textView3);
                        textView3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                textView3.setText("More");
                                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Jupiter"));
                                startActivity(i);
                            }

                        });

                    }
                }
        );


        Button saturn = (Button)findViewById(R.id.saturn);
        saturn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView3.setText("More");
                        TextView textView = (TextView)findViewById(R.id.textView);
                        textView.setMovementMethod(
                                new ScrollingMovementMethod());
                        textView.setText("\t\tSaturn\n");                   /*Enter your message here*/

                        final TextView textView3 = (TextView)findViewById(R.id.textView3);
                        textView3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                textView3.setText("More");
                                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Saturn"));
                                startActivity(i);
                            }

                        });

                    }
                }
        );


        Button urenus = (Button)findViewById(R.id.urenus);
        urenus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView3.setText("More");
                        TextView textView = (TextView)findViewById(R.id.textView);
                        textView.setMovementMethod(
                                new ScrollingMovementMethod());
                        textView.setText("\t\tUranus\n");                   /*Enter your message here*/

                        final TextView textView3 = (TextView)findViewById(R.id.textView3);
                        textView3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Uranus"));
                                startActivity(i);
                            }

                        });

                    }
                }
        );


        Button naptune = (Button)findViewById(R.id.naptune);
        naptune.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView textView = (TextView)findViewById(R.id.textView);
                        textView.setMovementMethod(
                                new ScrollingMovementMethod());
                        textView.setText("\t\tNaptune\n");                   /*Enter your message here*/

                        final TextView textView3 = (TextView)findViewById(R.id.textView3);
                        textView3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                textView3.setText("More");
                                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Naptune"));
                                startActivity(i);
                            }

                        });

                    }
                }
        );

        Button clearScr = (Button)findViewById(R.id.clearScr);
        clearScr.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView textView = (TextView)findViewById(R.id.textView);
                        textView.setText("");                   /*Enter your message here*/

                        final TextView textView3 = (TextView)findViewById(R.id.textView3);
                        textView3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                textView3.setText("Touch any planet!!!");
                            }
                        });
                    }
                }
        );

    }
}
