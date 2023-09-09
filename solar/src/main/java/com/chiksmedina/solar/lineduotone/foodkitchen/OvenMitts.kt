package com.chiksmedina.solar.lineduotone.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.FoodKitchenGroup

public val FoodKitchenGroup.OvenMitts: ImageVector
    get() {
        if (_ovenMitts != null) {
            return _ovenMitts!!
        }
        _ovenMitts = Builder(name = "OvenMitts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.3341f, 4.7793f)
                curveTo(9.9148f, 3.1516f, 8.6676f, 1.9784f, 7.213f, 2.0003f)
                curveTo(5.4409f, 2.0269f, 4.0322f, 3.8173f, 4.0665f, 5.9992f)
                lineTo(4.0343f, 9.3406f)
                curveTo(4.0271f, 10.0967f, 4.0234f, 10.4748f, 3.8897f, 10.8109f)
                curveTo(3.7559f, 11.1471f, 3.4604f, 11.4685f, 2.8692f, 12.1112f)
                curveTo(2.2897f, 12.7412f, 2.0f, 13.2089f, 2.0f, 13.7454f)
                curveTo(2.0f, 14.563f, 2.6729f, 15.221f, 4.0188f, 16.5368f)
                lineTo(7.5876f, 20.0262f)
                curveTo(8.9334f, 21.3421f, 9.6064f, 22.0f, 10.4426f, 22.0f)
                curveTo(11.2788f, 22.0f, 11.9518f, 21.342f, 13.2976f, 20.0262f)
                lineTo(20.0783f, 13.3965f)
                curveTo(22.6406f, 10.8913f, 22.6406f, 6.8295f, 20.0783f, 4.3243f)
                curveTo(17.516f, 1.8191f, 13.3618f, 1.8191f, 10.7995f, 4.3243f)
                lineTo(10.3341f, 4.7793f)
                close()
                moveTo(10.3341f, 4.7793f)
                lineTo(9.372f, 5.72f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.2974f, 20.0263f)
                lineTo(4.0185f, 10.9541f)
            }
        }
        .build()
        return _ovenMitts!!
    }

private var _ovenMitts: ImageVector? = null
