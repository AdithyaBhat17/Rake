package com.bapspatil.rake.ui

import android.os.Bundle
import com.bapspatil.rake.R
import com.bapspatil.rake.util.Constants
import com.heinrichreimersoftware.materialintro.app.IntroActivity
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide
import org.jetbrains.anko.defaultSharedPreferences
import org.jetbrains.anko.startActivity

class IntroActivity : IntroActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        buttonNextFunction = BUTTON_NEXT_FUNCTION_NEXT

        addSlide(SimpleSlide.Builder()
                .title("Rake")
                .description("Make your images smarter.")
                .background(R.color.white)
                .image(R.drawable.get_started)
                .build()
        )

        addSlide(SimpleSlide.Builder()
                .title("Recognize text")
                .description("Ever been out, seen a phone number or email on a banner in the real world and wanted it on your phone? Look no further, Rake can do just that for you! Click a pic, and let Rake recognize the text for you to save onto your phone.")
                .background(R.color.white)
                .image(R.drawable.text_recognition)
                .build()
        )

        addSlide(SimpleSlide.Builder()
                .title("Scan barcodes")
                .description("With Rake, you can scan barcodes and QR codes to get information in an instant!")
                .background(R.color.white)
                .image(R.drawable.barcode_scanning)
                .build()
        )

        addSlide(SimpleSlide.Builder()
                .title("Label images")
                .description("Use Rake today to scan your images and let the app give you more information on the scanned image!")
                .background(R.color.white)
                .image(R.drawable.image_labelling)
                .build()
        )

        addSlide(SimpleSlide.Builder()
                .title("Privacy Policy")
                .description("Please read the " + R.string.privacy_policy + " before proceeding further.")
                .background(R.color.white)
                .image(R.drawable.privacy)
                .buttonCtaLabel("AGREE")
                .buttonCtaClickListener {
                    defaultSharedPreferences.edit().putBoolean(Constants.KEY_PREFERENCE_FIRST_LAUNCH, false).apply()
                    startActivity<PickerActivity>()
                    finish()
                }
                .build()
        )
    }
}