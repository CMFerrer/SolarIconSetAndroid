package com.chiksmedina.solar.boldduotone.arrowsaction

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
import com.chiksmedina.solar.boldduotone.ArrowsActionGroup

public val ArrowsActionGroup.Reply: ImageVector
    get() {
        if (_reply != null) {
            return _reply!!
        }
        _reply = Builder(name = "Reply", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0303f, 6.4697f)
                curveTo(9.7374f, 6.1768f, 9.2626f, 6.1768f, 8.9697f, 6.4697f)
                lineTo(3.9697f, 11.4697f)
                curveTo(3.6768f, 11.7626f, 3.6768f, 12.2374f, 3.9697f, 12.5303f)
                lineTo(8.9697f, 17.5303f)
                curveTo(9.2626f, 17.8232f, 9.7374f, 17.8232f, 10.0303f, 17.5303f)
                curveTo(10.3232f, 17.2374f, 10.3232f, 16.7626f, 10.0303f, 16.4697f)
                lineTo(5.5607f, 12.0f)
                lineTo(10.0303f, 7.5303f)
                curveTo(10.3232f, 7.2374f, 10.3232f, 6.7626f, 10.0303f, 6.4697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.3107f, 11.25f)
                horizontalLineTo(14.5f)
                curveTo(15.4534f, 11.25f, 16.8667f, 11.5298f, 18.0632f, 12.3914f)
                curveTo(19.298f, 13.2804f, 20.25f, 14.7556f, 20.25f, 17.0f)
                curveTo(20.25f, 17.4142f, 19.9142f, 17.75f, 19.5f, 17.75f)
                curveTo(19.0858f, 17.75f, 18.75f, 17.4142f, 18.75f, 17.0f)
                curveTo(18.75f, 15.2444f, 18.0353f, 14.2196f, 17.1868f, 13.6087f)
                curveTo(16.3f, 12.9702f, 15.2133f, 12.75f, 14.5f, 12.75f)
                lineTo(6.3107f, 12.75f)
                lineTo(5.5607f, 12.0f)
                lineTo(6.3107f, 11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.8069f, 11.7129f)
                curveTo(3.7702f, 11.8013f, 3.75f, 11.8983f, 3.75f, 12.0f)
                curveTo(3.75f, 11.9023f, 3.769f, 11.8046f, 3.8069f, 11.7129f)
                close()
            }
        }
        .build()
        return _reply!!
    }

private var _reply: ImageVector? = null
