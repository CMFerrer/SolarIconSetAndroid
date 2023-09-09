package com.chiksmedina.solar.boldduotone.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.FoodKitchenGroup

public val FoodKitchenGroup.OvenMitts: ImageVector
    get() {
        if (_ovenMitts != null) {
            return _ovenMitts!!
        }
        _ovenMitts = Builder(name = "OvenMitts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2978f, 20.0262f)
                lineTo(20.0785f, 13.3965f)
                curveTo(22.6407f, 10.8913f, 22.6407f, 6.8295f, 20.0785f, 4.3243f)
                curveTo(17.5162f, 1.8191f, 13.3619f, 1.8191f, 10.7996f, 4.3243f)
                lineTo(10.3343f, 4.7793f)
                curveTo(9.915f, 3.1516f, 8.6678f, 1.9784f, 7.2132f, 2.0003f)
                curveTo(5.4411f, 2.0269f, 4.0323f, 3.8173f, 4.0666f, 5.9992f)
                lineTo(4.0345f, 9.3406f)
                curveTo(4.0272f, 10.0967f, 4.0236f, 10.4748f, 3.8898f, 10.8109f)
                lineTo(3.8857f, 10.8211f)
                lineTo(13.1931f, 20.1285f)
                lineTo(13.2978f, 20.0262f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0188f, 16.537f)
                lineTo(7.5876f, 20.0263f)
                curveTo(8.9334f, 21.3422f, 9.6064f, 22.0002f, 10.4426f, 22.0002f)
                curveTo(11.2568f, 22.0002f, 11.9163f, 21.3763f, 13.1929f, 20.1286f)
                lineTo(3.8856f, 10.8213f)
                curveTo(3.7499f, 11.1538f, 3.4544f, 11.4752f, 2.8692f, 12.1114f)
                curveTo(2.2897f, 12.7414f, 2.0f, 13.2091f, 2.0f, 13.7456f)
                curveTo(2.0f, 14.5632f, 2.6729f, 15.2211f, 4.0188f, 16.537f)
                close()
            }
        }
        .build()
        return _ovenMitts!!
    }

private var _ovenMitts: ImageVector? = null
