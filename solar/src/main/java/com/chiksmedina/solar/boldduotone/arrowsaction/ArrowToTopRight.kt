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

public val ArrowsActionGroup.ArrowToTopRight: ImageVector
    get() {
        if (_arrowToTopRight != null) {
            return _arrowToTopRight!!
        }
        _arrowToTopRight = Builder(name = "ArrowToTopRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.4697f, 10.0303f)
                curveTo(6.1768f, 9.7374f, 6.1768f, 9.2626f, 6.4697f, 8.9697f)
                lineTo(11.4697f, 3.9697f)
                curveTo(11.7626f, 3.6768f, 12.2374f, 3.6768f, 12.5303f, 3.9697f)
                lineTo(17.5303f, 8.9697f)
                curveTo(17.8232f, 9.2626f, 17.8232f, 9.7374f, 17.5303f, 10.0303f)
                curveTo(17.2374f, 10.3232f, 16.7626f, 10.3232f, 16.4697f, 10.0303f)
                lineTo(12.0f, 5.5607f)
                lineTo(7.5303f, 10.0303f)
                curveTo(7.2374f, 10.3232f, 6.7626f, 10.3232f, 6.4697f, 10.0303f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.25f, 14.5f)
                curveTo(11.25f, 15.4534f, 11.5298f, 16.8667f, 12.3913f, 18.0632f)
                curveTo(13.2804f, 19.298f, 14.7556f, 20.25f, 17.0f, 20.25f)
                curveTo(17.4142f, 20.25f, 17.75f, 19.9142f, 17.75f, 19.5f)
                curveTo(17.75f, 19.0858f, 17.4142f, 18.75f, 17.0f, 18.75f)
                curveTo(15.2444f, 18.75f, 14.2196f, 18.0353f, 13.6087f, 17.1868f)
                curveTo(12.9702f, 16.3f, 12.75f, 15.2133f, 12.75f, 14.5f)
                lineTo(12.75f, 6.3107f)
                lineTo(12.0f, 5.5607f)
                lineTo(11.25f, 6.3107f)
                verticalLineTo(14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.8023f, 3.7764f)
                curveTo(11.9568f, 3.7343f, 12.122f, 3.7425f, 12.2722f, 3.801f)
                curveTo(12.1879f, 3.768f, 12.096f, 3.75f, 12.0f, 3.75f)
                curveTo(11.9316f, 3.75f, 11.8653f, 3.7592f, 11.8023f, 3.7764f)
                close()
            }
        }
        .build()
        return _arrowToTopRight!!
    }

private var _arrowToTopRight: ImageVector? = null
