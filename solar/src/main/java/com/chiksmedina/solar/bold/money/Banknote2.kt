package com.chiksmedina.solar.bold.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MoneyGroup

public val MoneyGroup.Banknote2: ImageVector
    get() {
        if (_banknote2 != null) {
            return _banknote2!!
        }
        _banknote2 = Builder(name = "Banknote2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9414f, 8.1888f)
                curveTo(21.5215f, 8.7621f, 21.771f, 9.4839f, 21.8877f, 10.3411f)
                curveTo(22.0f, 11.1668f, 22.0f, 12.2166f, 22.0f, 13.5191f)
                verticalLineTo(13.6236f)
                curveTo(22.0f, 14.9261f, 22.0f, 15.9759f, 21.8877f, 16.8016f)
                curveTo(21.771f, 17.6589f, 21.5215f, 18.3807f, 20.9414f, 18.9539f)
                curveTo(20.3612f, 19.5272f, 19.6307f, 19.7738f, 18.7632f, 19.889f)
                curveTo(17.9276f, 20.0f, 16.8651f, 20.0f, 15.547f, 20.0f)
                horizontalLineTo(10.622f)
                curveTo(9.3039f, 20.0f, 8.2414f, 20.0f, 7.4058f, 19.889f)
                curveTo(6.5382f, 19.7738f, 5.8078f, 19.5272f, 5.2276f, 18.9539f)
                curveTo(4.8757f, 18.6062f, 4.6453f, 18.2037f, 4.4926f, 17.7495f)
                curveTo(5.3641f, 17.8574f, 6.4422f, 17.8573f, 7.6879f, 17.8573f)
                horizontalLineTo(12.6974f)
                curveTo(13.979f, 17.8573f, 15.0833f, 17.8574f, 15.9676f, 17.7399f)
                curveTo(16.9154f, 17.614f, 17.8238f, 17.3301f, 18.5607f, 16.602f)
                curveTo(19.2975f, 15.8739f, 19.5848f, 14.9762f, 19.7123f, 14.0398f)
                curveTo(19.8312f, 13.166f, 19.8311f, 12.0748f, 19.831f, 10.8084f)
                verticalLineTo(10.6203f)
                curveTo(19.8311f, 9.3891f, 19.8311f, 8.3236f, 19.7219f, 7.4623f)
                curveTo(20.1818f, 7.6133f, 20.5893f, 7.8409f, 20.9414f, 8.1888f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1926f, 9.0477f)
                curveTo(9.2611f, 9.0477f, 8.5059f, 9.7938f, 8.5059f, 10.7143f)
                curveTo(8.5059f, 11.6348f, 9.2611f, 12.381f, 10.1926f, 12.381f)
                curveTo(11.1242f, 12.381f, 11.8793f, 11.6348f, 11.8793f, 10.7143f)
                curveTo(11.8793f, 9.7938f, 11.1242f, 9.0477f, 10.1926f, 9.0477f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.8469f, 5.8368f)
                curveTo(2.0f, 6.6737f, 2.0f, 8.0206f, 2.0f, 10.7143f)
                curveTo(2.0f, 13.4081f, 2.0f, 14.755f, 2.8469f, 15.5918f)
                curveTo(3.6938f, 16.4287f, 5.0569f, 16.4287f, 7.783f, 16.4287f)
                horizontalLineTo(12.6022f)
                curveTo(15.3284f, 16.4287f, 16.6914f, 16.4287f, 17.5384f, 15.5918f)
                curveTo(18.3853f, 14.755f, 18.3853f, 13.4081f, 18.3853f, 10.7143f)
                curveTo(18.3853f, 8.0206f, 18.3853f, 6.6737f, 17.5384f, 5.8368f)
                curveTo(16.6914f, 5.0f, 15.3284f, 5.0f, 12.6022f, 5.0f)
                horizontalLineTo(7.783f)
                curveTo(5.0569f, 5.0f, 3.6938f, 5.0f, 2.8469f, 5.8368f)
                close()
                moveTo(7.0602f, 10.7143f)
                curveTo(7.0602f, 9.0049f, 8.4626f, 7.6191f, 10.1926f, 7.6191f)
                curveTo(11.9226f, 7.6191f, 13.3251f, 9.0049f, 13.3251f, 10.7143f)
                curveTo(13.3251f, 12.4238f, 11.9226f, 13.8096f, 10.1926f, 13.8096f)
                curveTo(8.4626f, 13.8096f, 7.0602f, 12.4238f, 7.0602f, 10.7143f)
                close()
                moveTo(15.4937f, 13.3334f)
                curveTo(15.0945f, 13.3334f, 14.7709f, 13.0136f, 14.7709f, 12.6191f)
                verticalLineTo(8.8096f)
                curveTo(14.7709f, 8.4151f, 15.0945f, 8.0953f, 15.4937f, 8.0953f)
                curveTo(15.893f, 8.0953f, 16.2166f, 8.4151f, 16.2166f, 8.8096f)
                verticalLineTo(12.6191f)
                curveTo(16.2166f, 13.0136f, 15.893f, 13.3334f, 15.4937f, 13.3334f)
                close()
                moveTo(4.1686f, 12.6191f)
                curveTo(4.1686f, 13.0136f, 4.4923f, 13.3334f, 4.8915f, 13.3334f)
                curveTo(5.2908f, 13.3334f, 5.6144f, 13.0136f, 5.6144f, 12.6191f)
                lineTo(5.6144f, 8.8096f)
                curveTo(5.6144f, 8.4151f, 5.2908f, 8.0953f, 4.8915f, 8.0953f)
                curveTo(4.4923f, 8.0953f, 4.1686f, 8.4151f, 4.1686f, 8.8096f)
                lineTo(4.1686f, 12.6191f)
                close()
            }
        }
        .build()
        return _banknote2!!
    }

private var _banknote2: ImageVector? = null
