/*
 *     This file is part of Telegram Server
 *     Copyright (C) 2015  Aykut Alparslan KOÇ
 *
 *     Telegram Server is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Telegram Server is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.telegram.tl;

import org.telegram.api.TLMethod;
import org.telegram.mtproto.ProtocolBuffer;

import java.io.Serializable;

/**
 * Created by aykut on 19/10/15.
 */
public abstract class TLObject implements Serializable {

    public void deserialize(ProtocolBuffer buffer){

    }

    public ProtocolBuffer serialize(){
        return null;
    }

    public void serializeTo(ProtocolBuffer buff){

    }

    public abstract int getConstructor();
}
