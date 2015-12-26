/*
 * Copyright (c) 2015 SatuSatuDua.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package id.satusatudua.sigap.data.model;

import android.os.Parcel;

/**
 * Created on : December 26, 2015
 * Author     : zetbaitsu
 * Name       : Zetra
 * Email      : zetra@mail.ugm.ac.id
 * GitHub     : https://github.com/zetbaitsu
 * LinkedIn   : https://id.linkedin.com/in/zetbaitsu
 */
public class CaseMessage extends MessageGroup {
    private String caseId;

    public CaseMessage() {

    }

    protected CaseMessage(Parcel in) {
        super(in);
        caseId = in.readString();
    }

    public static final Creator<CaseMessage> CREATOR = new Creator<CaseMessage>() {
        @Override
        public CaseMessage createFromParcel(Parcel in) {
            return new CaseMessage(in);
        }

        @Override
        public CaseMessage[] newArray(int size) {
            return new CaseMessage[size];
        }
    };

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CaseMessage && ((CaseMessage) o).caseId.equals(caseId);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(caseId);
    }

    @Override
    public String toString() {
        return "CaseMessage{" +
                "caseId='" + caseId + '\'' +
                ", messages=" + messages +
                '}';
    }
}