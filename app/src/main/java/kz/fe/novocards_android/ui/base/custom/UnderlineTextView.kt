package kz.fe.novocards_android.ui.base.custom

import android.content.Context
import android.graphics.Paint
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class UnderlineTextView @JvmOverloads constructor(
	context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

	init {
		paintFlags = paintFlags or Paint.UNDERLINE_TEXT_FLAG
	}
}