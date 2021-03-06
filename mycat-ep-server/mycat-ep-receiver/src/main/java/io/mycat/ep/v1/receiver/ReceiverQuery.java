// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.0
//
// <auto-generated>
//
// Generated from file `receiver.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package io.mycat.ep.v1.receiver;

public class ReceiverQuery implements java.lang.Cloneable, java.io.Serializable
{
    public long userId;

    public String token;

    public ReceiverQuery()
    {
        token = "";
    }

    public ReceiverQuery(long userId, String token)
    {
        this.userId = userId;
        this.token = token;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        ReceiverQuery _r = null;
        if(rhs instanceof ReceiverQuery)
        {
            _r = (ReceiverQuery)rhs;
        }

        if(_r != null)
        {
            if(userId != _r.userId)
            {
                return false;
            }
            if(token != _r.token)
            {
                if(token == null || _r.token == null || !token.equals(_r.token))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::receiver::ReceiverQuery");
        __h = IceInternal.HashUtil.hashAdd(__h, userId);
        __h = IceInternal.HashUtil.hashAdd(__h, token);
        return __h;
    }

    public ReceiverQuery
    clone()
    {
        ReceiverQuery c = null;
        try
        {
            c = (ReceiverQuery)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeLong(userId);
        __os.writeString(token);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        userId = __is.readLong();
        token = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, ReceiverQuery __v)
    {
        if(__v == null)
        {
            __nullMarshalValue.__write(__os);
        }
        else
        {
            __v.__write(__os);
        }
    }

    static public ReceiverQuery
    __read(IceInternal.BasicStream __is, ReceiverQuery __v)
    {
        if(__v == null)
        {
             __v = new ReceiverQuery();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final ReceiverQuery __nullMarshalValue = new ReceiverQuery();

    public static final long serialVersionUID = -1340027066L;
}
