package com.chiksmedina.solar.bold.designtools

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
import com.chiksmedina.solar.bold.DesignToolsGroup

public val DesignToolsGroup.PaletteRound: ImageVector
    get() {
        if (_paletteRound != null) {
            return _paletteRound!!
        }
        _paletteRound = Builder(name = "PaletteRound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.8994f, 22.0f)
                curveTo(20.1086f, 22.0f, 21.8994f, 20.2091f, 21.8994f, 18.0f)
                curveTo(21.8994f, 15.7909f, 20.1086f, 14.0f, 17.8994f, 14.0f)
                horizontalLineTo(17.6797f)
                lineTo(11.878f, 19.798f)
                curveTo(11.636f, 20.0399f, 11.5f, 20.3391f, 11.5f, 20.6813f)
                curveTo(11.5f, 21.3936f, 12.0774f, 22.0f, 12.7897f, 22.0f)
                horizontalLineTo(17.8994f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2839f, 4.9588f)
                lineTo(12.2291f, 6.0136f)
                curveTo(11.7633f, 6.4811f, 11.5012f, 7.1138f, 11.5f, 7.7738f)
                lineTo(11.5f, 16.0119f)
                curveTo(11.5f, 17.0666f, 11.5f, 17.5939f, 11.8135f, 17.7199f)
                curveTo(12.1271f, 17.8459f, 12.492f, 17.4653f, 13.2219f, 16.704f)
                lineTo(19.0599f, 10.6144f)
                curveTo(20.5819f, 9.0269f, 20.5554f, 6.5139f, 19.0003f, 4.9588f)
                curveTo(17.4218f, 3.3803f, 14.8624f, 3.3803f, 13.2839f, 4.9588f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(10.0f, 20.2091f, 8.2091f, 22.0f, 6.0f, 22.0f)
                curveTo(3.7909f, 22.0f, 2.0f, 20.2091f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 3.7909f, 3.7909f, 2.0f, 6.0f, 2.0f)
                curveTo(8.2091f, 2.0f, 10.0f, 3.7909f, 10.0f, 6.0f)
                close()
                moveTo(6.0f, 19.0f)
                curveTo(6.5523f, 19.0f, 7.0f, 18.5523f, 7.0f, 18.0f)
                curveTo(7.0f, 17.4477f, 6.5523f, 17.0f, 6.0f, 17.0f)
                curveTo(5.4477f, 17.0f, 5.0f, 17.4477f, 5.0f, 18.0f)
                curveTo(5.0f, 18.5523f, 5.4477f, 19.0f, 6.0f, 19.0f)
                close()
            }
        }
        .build()
        return _paletteRound!!
    }

private var _paletteRound: ImageVector? = null
