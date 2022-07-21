import android.app.Activity;
import android.app.ActivityTaskManager;
import android.app.ActivityThread;
import android.app.Application;
import android.app.servertransaction.LaunchActivityItem;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.ServiceManager;
import android.view.ViewGroup;
import android.view.ViewRootImpl;

import com.android.internal.policy.DecorView;
import com.android.internal.policy.PhoneWindow;
import com.android.powermodel.AppActivity;
import com.android.server.SystemServer;
import com.android.server.wm.ActivityStackSupervisor;

import java.net.Proxy;

/**
 * @author asus
 */
public class MainActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        startActivity(new Intent());

        Handler handler;
        Message


    }
}

