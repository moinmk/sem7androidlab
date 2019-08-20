package com.asymtask.student.asynctask;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Toast;

class ProgressTask extends AsyncTask<Void,Integer,String> {
    ProgressDialog pdialogue;
    Context ct;

    public ProgressTask(Context c) {
        ct=c;
    }




    @Override
    protected String doInBackground(Void... voids) {
        try{
            for(int i=1;i<=100;i++){
                Thread.sleep(500);
                publishProgress(i);
            }
            return "success";
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "failure";
    }

    @Override
    protected void onPreExecute() {
        pdialogue=new ProgressDialog(ct);
        pdialogue.setTitle("running");
        pdialogue.setMessage("please wait while task complete");
        pdialogue.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pdialogue.setMax(100);

        pdialogue.setButton(ProgressDialog.BUTTON_NEGATIVE, "cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                cancel(true);
            }
        });
        pdialogue.show();
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        int val=values[0];
        pdialogue.setProgress(val);
    }

    @Override
    protected void onPostExecute(String s) {
        pdialogue.dismiss();
        Toast.makeText(ct,s, Toast.LENGTH_SHORT).show();
    }
}
