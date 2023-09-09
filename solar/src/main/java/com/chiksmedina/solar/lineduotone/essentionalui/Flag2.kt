package com.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

public val EssentionalUiGroup.Flag2: ImageVector
    get() {
        if (_flag2 != null) {
            return _flag2!!
        }
        _flag2 = Builder(name = "Flag2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 22.0f)
                verticalLineTo(14.0f)
                verticalLineTo(4.0f)
                verticalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 14.0f)
                lineTo(7.4707f, 13.5059f)
                curveTo(9.1212f, 13.1758f, 10.8321f, 13.3329f, 12.3949f, 13.958f)
                curveTo(14.0885f, 14.6354f, 15.9524f, 14.7619f, 17.722f, 14.3195f)
                lineTo(17.8221f, 14.2945f)
                curveTo(18.4082f, 14.148f, 18.6861f, 13.4769f, 18.3753f, 12.9589f)
                lineTo(16.8147f, 10.3578f)
                curveTo(16.4732f, 9.7887f, 16.3024f, 9.5041f, 16.2619f, 9.1945f)
                curveTo(16.2451f, 9.0654f, 16.2451f, 8.9347f, 16.2619f, 8.8055f)
                curveTo(16.3024f, 8.496f, 16.4732f, 8.2114f, 16.8147f, 7.6423f)
                lineTo(18.0932f, 5.5114f)
                curveTo(18.4278f, 4.9536f, 17.9211f, 4.2698f, 17.2901f, 4.4275f)
                curveTo(15.8013f, 4.7997f, 14.2331f, 4.6933f, 12.8082f, 4.1233f)
                lineTo(12.3949f, 3.958f)
                curveTo(10.8321f, 3.3329f, 9.1212f, 3.1758f, 7.4707f, 3.5059f)
                lineTo(5.0f, 4.0f)
            }
        }
        .build()
        return _flag2!!
    }

private var _flag2: ImageVector? = null
