package com.chiksmedina.solar.boldduotone.money

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
import com.chiksmedina.solar.boldduotone.MoneyGroup

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
                moveTo(8.5057f, 10.7144f)
                curveTo(8.5057f, 9.7939f, 9.2609f, 9.0477f, 10.1924f, 9.0477f)
                curveTo(11.124f, 9.0477f, 11.8792f, 9.7939f, 11.8792f, 10.7144f)
                curveTo(11.8792f, 11.6349f, 11.124f, 12.3811f, 10.1924f, 12.3811f)
                curveTo(9.2609f, 12.3811f, 8.5057f, 11.6349f, 8.5057f, 10.7144f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 10.7143f)
                curveTo(2.0f, 8.0206f, 2.0f, 6.6737f, 2.8469f, 5.8368f)
                curveTo(3.6938f, 5.0f, 5.0569f, 5.0f, 7.783f, 5.0f)
                horizontalLineTo(12.6022f)
                curveTo(15.3284f, 5.0f, 16.6914f, 5.0f, 17.5384f, 5.8368f)
                curveTo(18.3853f, 6.6737f, 18.3853f, 8.0206f, 18.3853f, 10.7143f)
                curveTo(18.3853f, 13.4081f, 18.3853f, 14.755f, 17.5384f, 15.5918f)
                curveTo(16.6914f, 16.4287f, 15.3284f, 16.4287f, 12.6022f, 16.4287f)
                horizontalLineTo(7.783f)
                curveTo(5.0569f, 16.4287f, 3.6938f, 16.4287f, 2.8469f, 15.5918f)
                curveTo(2.0f, 14.755f, 2.0f, 13.4081f, 2.0f, 10.7143f)
                close()
                moveTo(7.06f, 10.7144f)
                curveTo(7.06f, 9.0049f, 8.4624f, 7.6191f, 10.1924f, 7.6191f)
                curveTo(11.9225f, 7.6191f, 13.3249f, 9.0049f, 13.3249f, 10.7144f)
                curveTo(13.3249f, 12.4239f, 11.9225f, 13.8097f, 10.1924f, 13.8097f)
                curveTo(8.4624f, 13.8097f, 7.06f, 12.4239f, 7.06f, 10.7144f)
                close()
                moveTo(4.1685f, 12.6192f)
                curveTo(4.1685f, 13.0137f, 4.4921f, 13.3335f, 4.8913f, 13.3335f)
                curveTo(5.2906f, 13.3335f, 5.6142f, 13.0137f, 5.6142f, 12.6192f)
                lineTo(5.6142f, 8.8096f)
                curveTo(5.6142f, 8.4151f, 5.2906f, 8.0953f, 4.8913f, 8.0953f)
                curveTo(4.4921f, 8.0953f, 4.1685f, 8.4151f, 4.1685f, 8.8096f)
                lineTo(4.1685f, 12.6192f)
                close()
                moveTo(15.4936f, 13.3335f)
                curveTo(15.0943f, 13.3335f, 14.7707f, 13.0137f, 14.7707f, 12.6192f)
                verticalLineTo(8.8096f)
                curveTo(14.7707f, 8.4151f, 15.0943f, 8.0953f, 15.4936f, 8.0953f)
                curveTo(15.8928f, 8.0953f, 16.2164f, 8.4151f, 16.2164f, 8.8096f)
                verticalLineTo(12.6192f)
                curveTo(16.2164f, 13.0137f, 15.8928f, 13.3335f, 15.4936f, 13.3335f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0652f, 16.225f)
                curveTo(4.0782f, 16.3759f, 4.0939f, 16.5205f, 4.1127f, 16.6587f)
                curveTo(4.2293f, 17.516f, 4.4789f, 18.2378f, 5.059f, 18.811f)
                curveTo(5.1416f, 18.8926f, 5.2273f, 18.9676f, 5.3159f, 19.0366f)
                curveTo(5.8813f, 19.5505f, 6.5817f, 19.7785f, 7.4058f, 19.888f)
                curveTo(8.2415f, 19.999f, 9.3039f, 19.999f, 10.622f, 19.999f)
                horizontalLineTo(15.547f)
                curveTo(16.8651f, 19.999f, 17.9276f, 19.999f, 18.7632f, 19.888f)
                curveTo(19.6308f, 19.7727f, 20.3613f, 19.5262f, 20.9414f, 18.9529f)
                curveTo(21.5216f, 18.3796f, 21.7711f, 17.6579f, 21.8877f, 16.8006f)
                curveTo(22.0001f, 15.9749f, 22.0001f, 14.9251f, 22.0f, 13.6226f)
                verticalLineTo(13.5181f)
                curveTo(22.0001f, 12.2156f, 22.0001f, 11.1658f, 21.8877f, 10.3401f)
                curveTo(21.7711f, 9.4828f, 21.5216f, 8.761f, 20.9414f, 8.1878f)
                curveTo(20.8588f, 8.1062f, 20.7732f, 8.0312f, 20.6845f, 7.9622f)
                curveTo(20.1192f, 7.4483f, 19.4187f, 7.2203f, 18.5946f, 7.1108f)
                curveTo(18.4638f, 7.0934f, 18.3275f, 7.0788f, 18.1854f, 7.0664f)
                curveTo(18.3852f, 7.8998f, 18.3852f, 9.0499f, 18.3852f, 10.7142f)
                curveTo(18.3852f, 13.4079f, 18.3852f, 14.7548f, 17.5382f, 15.5916f)
                curveTo(16.6913f, 16.4285f, 15.3283f, 16.4285f, 12.6021f, 16.4285f)
                horizontalLineTo(7.7829f)
                curveTo(6.0812f, 16.4285f, 4.9106f, 16.4285f, 4.0652f, 16.225f)
                close()
            }
        }
        .build()
        return _banknote2!!
    }

private var _banknote2: ImageVector? = null
