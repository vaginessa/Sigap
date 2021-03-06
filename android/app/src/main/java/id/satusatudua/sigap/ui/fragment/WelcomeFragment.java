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

package id.satusatudua.sigap.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import id.satusatudua.sigap.R;
import id.zelory.benih.ui.fragment.BenihFragment;

/**
 * Created on : November 29, 2015
 * Author     : zetbaitsu
 * Name       : Zetra
 * Email      : zetra@mail.ugm.ac.id
 * GitHub     : https://github.com/zetbaitsu
 * LinkedIn   : https://id.linkedin.com/in/zetbaitsu
 */
public class WelcomeFragment extends BenihFragment {

    @Bind(R.id.image) ImageView imageView;
    @Bind(R.id.title) TextView title;
    @Bind(R.id.description) TextView description;

    private int page;

    public static WelcomeFragment newInstance(int page) {
        WelcomeFragment fragment = new WelcomeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("page", page);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected int getResourceLayout() {
        return R.layout.fragment_welcome;
    }

    @Override
    protected void onViewReady(@Nullable Bundle savedInstanceState) {
        page = getArguments().getInt("page", 1);
        initView();
    }

    private void initView() {
        switch (page) {
            case 1:
                imageView.setImageResource(R.drawable.pembukaan1);
                title.setText("Selamat Datang");
                description.setText("Sigap adalah sebuah aplikasi yang akan membantu anda pada saat kondisi darurat.");
                break;
            case 2:
                imageView.setImageResource(R.drawable.pembukaan2);
                title.setText("Tombol Darurat");
                description.setText("Beritahu orang terpercayamu dan orang disekitarmu untuk meminta bantuan mereka.");
                break;
            case 3:
                imageView.setImageResource(R.drawable.pembukaan6);
                title.setText("Saling Berkoordinasi");
                description.setText("Gunakan fitur percakapan untuk saling berkoordinasi dalam membantu pelapor.");
                break;
            case 4:
                imageView.setImageResource(R.drawable.pembukaan5);
                title.setText("Kontak Darurat Bersama");
                description.setText("Masukan kontak darurat wilayah anda untuk digunakan bersama.");
                break;
        }
    }
}
