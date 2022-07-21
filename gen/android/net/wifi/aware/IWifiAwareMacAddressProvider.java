/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.net.wifi.aware;
/**
 * Callback for IWifiAwareManager.getMacAddressFromPeerHandle
 *
 * @hide
 */
public interface IWifiAwareMacAddressProvider extends android.os.IInterface
{
  /** Default implementation for IWifiAwareMacAddressProvider. */
  public static class Default implements android.net.wifi.aware.IWifiAwareMacAddressProvider
  {
    @Override public void macAddress(java.util.Map peerIdToMacMap) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.net.wifi.aware.IWifiAwareMacAddressProvider
  {
    private static final java.lang.String DESCRIPTOR = "android.net.wifi.aware.IWifiAwareMacAddressProvider";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.net.wifi.aware.IWifiAwareMacAddressProvider interface,
     * generating a proxy if needed.
     */
    public static android.net.wifi.aware.IWifiAwareMacAddressProvider asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.net.wifi.aware.IWifiAwareMacAddressProvider))) {
        return ((android.net.wifi.aware.IWifiAwareMacAddressProvider)iin);
      }
      return new android.net.wifi.aware.IWifiAwareMacAddressProvider.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_macAddress:
        {
          data.enforceInterface(descriptor);
          java.util.Map _arg0;
          java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
          _arg0 = data.readHashMap(cl);
          this.macAddress(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements android.net.wifi.aware.IWifiAwareMacAddressProvider
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void macAddress(java.util.Map peerIdToMacMap) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeMap(peerIdToMacMap);
          boolean _status = mRemote.transact(Stub.TRANSACTION_macAddress, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().macAddress(peerIdToMacMap);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static android.net.wifi.aware.IWifiAwareMacAddressProvider sDefaultImpl;
    }
    static final int TRANSACTION_macAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(android.net.wifi.aware.IWifiAwareMacAddressProvider impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static android.net.wifi.aware.IWifiAwareMacAddressProvider getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void macAddress(java.util.Map peerIdToMacMap) throws android.os.RemoteException;
}
