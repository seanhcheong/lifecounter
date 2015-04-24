package edu.washington.cheongs.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    private int player1 = 20;
    private int player2 = 20;
    private int player3 = 20;
    private int player4 = 20;
    private String loserMessage = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView player1life = (TextView) findViewById(R.id.textView2);
        final TextView player2life = (TextView) findViewById(R.id.textView3);
        final TextView player3life = (TextView) findViewById(R.id.textView4);
        final TextView player4life = (TextView) findViewById(R.id.textView5);

        player1life.setText("" + player1);
        player2life.setText("" + player2);
        player3life.setText("" + player3);
        player4life.setText("" + player4);

        Button p1up1 = (Button) findViewById(R.id.button);
        Button p1down1 = (Button) findViewById(R.id.button2);
        Button p1up5 = (Button) findViewById(R.id.button3);
        Button p1down5 = (Button) findViewById(R.id.button4);

        Button p2up1 = (Button) findViewById(R.id.button5);
        Button p2down1 = (Button) findViewById(R.id.button6);
        Button p2up5 = (Button) findViewById(R.id.button7);
        Button p2down5 = (Button) findViewById(R.id.button8);

        Button p3up1 = (Button) findViewById(R.id.button9);
        Button p3down1 = (Button) findViewById(R.id.button10);
        Button p3up5 = (Button) findViewById(R.id.button11);
        Button p3down5 = (Button) findViewById(R.id.button12);

        Button p4up1 = (Button) findViewById(R.id.button13);
        Button p4down1 = (Button) findViewById(R.id.button14);
        Button p4up5 = (Button) findViewById(R.id.button15);
        Button p4down5 = (Button) findViewById(R.id.button16);

        final TextView loserString = (TextView)findViewById(R.id.loserstring);
        loserString.setText(loserMessage);

        // FOR PLAYER 1 ------------------------------------------------------------
        p1up1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 > 0) {
                    player1++;
                    player1life.setText("" + player1);
                }

            }
        });

        p1down1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 > 1) {
                    player1--;
                    player1life.setText("" + player1);
                } else  {
                    player1--;
                    player1life.setText("" + player1);
                    loserMessage = "PLAYEER 1 LOSES!";
                    loserString.setText(loserMessage);
                }

            }
        });

        p1up5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 > 0) {
                    player1+=5;
                    player1life.setText("" + player1);
                }

            }
        });

        p1down5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 > 1) {
                    player1-=5;
                    player1life.setText("" + player1);
                    if(player1 <= 0) {
                        loserMessage = "PLAYEER 1 LOSES!";
                        loserString.setText(loserMessage);
                    }
                } else  {
                    player1-=5;
                    loserMessage = "PLAYEER 1 LOSES!";
                    loserString.setText(loserMessage);
                }
            }
        });

        // FOR PLAYER 2 ----------------------------------------------------
        p2up1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(player2 > 0) {
                    player2++;
                    loserMessage = "PLAYEER 2 LOSES!";
                    loserString.setText(loserMessage);
                }
            }
        });

        p2down1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player2 > 1) {
                    player2--;
                    player2life.setText("" + player2);
                } else  {
                    player2--;
                    player2life.setText("" + player2);
                    loserMessage = "PLAYEER 2 LOSES!";
                    loserString.setText(loserMessage);
                }

            }
        });

        p2up5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player2 > 0) {
                    player2+=5;
                    player2life.setText("" + player2);
                }

            }
        });

        p2down5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player2 > 1) {
                    player2-=5;
                    player2life.setText("" + player2);
                    if (player2 <= 0) {
                        loserMessage = "PLAYER 2 LOSES!";
                        loserString.setText(loserMessage);
                    }
                } else  {
                    player2-=5;
                    player2life.setText("" + player2);
                    loserMessage = "PLAYER 2 LOSES!";
                    loserString.setText(loserMessage);
                }
            }
        });

        // FOR PLAYER 3 ------------------------------------------------------
        p3up1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(player3 > 0) {
                    player3++;
                    player3life.setText("" + player3);
                }
            }
        });

        p3down1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player3 > 1) {
                    player3--;
                    player3life.setText("" + player3);
                } else  {
                    player3--;
                    player3life.setText("" + player3);
                    loserMessage = "PLAYER 3 LOSES!";
                    loserString.setText(loserMessage);
                }

            }
        });

        p3up5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player3 > 0) {
                    player3+=5;
                    player3life.setText("" + player3);
                }

            }
        });

        p3down5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player3 > 1) {
                    player3-=5;
                    player3life.setText("" + player3);
                    if (player3 <= 0) {
                        loserMessage = "PLAYER 3 LOSES!";
                        loserString.setText(loserMessage);
                    }
                } else  {
                    player3-=5;
                    player3life.setText("" + player3);
                    loserMessage = "PLAYER 3 LOSES!";
                    loserString.setText(loserMessage);
                }
            }
        });

        // FOR PLAYER 4 --------------------------------------------------------

        p4up1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(player4 > 0) {
                    player4++;
                    player4life.setText("" + player4);
                }
            }
        });

        p4down1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player4 > 1) {
                    player4--;
                    player4life.setText("" + player4);
                } else  {
                    player4--;
                    player4life.setText("" + player4);
                    loserMessage = "PLAYER 4 LOSES!";
                    loserString.setText(loserMessage);
                }

            }
        });

        p4up5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player4 > 0) {
                    player4+=5;
                    player4life.setText("" + player4);
                }

            }
        });

        p4down5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player4 > 1) {
                    player4-=5;
                    player4life.setText("" + player4);
                    if (player4 <= 0) {
                        loserMessage = "PLAYER 4 LOSES!";
                        loserString.setText(loserMessage);
                    }
                } else  {
                    player4-=5;
                    player4life.setText("" + player4);
                    loserMessage = "PLAYER 4 LOSES!";
                    loserString.setText(loserMessage);
                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void buttonOnClick(View v) {
        Button button1 = (Button) v;

    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("player1", player1);
        savedInstanceState.putInt("player2", player2);
        savedInstanceState.putInt("player3", player3);
        savedInstanceState.putInt("player4", player4);
        savedInstanceState.putString("loser", loserMessage);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        player1 = savedInstanceState.getInt("player1");
        player2 = savedInstanceState.getInt("player2");
        player3 = savedInstanceState.getInt("player3");
        player4 = savedInstanceState.getInt("player4");
        loserMessage = savedInstanceState.getString("loser");
    }
}
