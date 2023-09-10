package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.HomeAngle2: ImageVector
    get() {
        if (_homeAngle2 != null) {
            return _homeAngle2!!
        }
        _homeAngle2 = Builder(
            name = "HomeAngle2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.3354f, 7.8749f)
                curveTo(1.7949f, 9.0023f, 1.9846f, 10.3208f, 2.3641f, 12.9579f)
                lineTo(2.6428f, 14.8952f)
                curveTo(3.1302f, 18.2827f, 3.374f, 19.9764f, 4.549f, 20.9882f)
                curveTo(5.7241f, 22.0f, 7.4474f, 22.0f, 10.8939f, 22.0f)
                horizontalLineTo(13.1061f)
                curveTo(16.5526f, 22.0f, 18.2759f, 22.0f, 19.451f, 20.9882f)
                curveTo(20.626f, 19.9764f, 20.8697f, 18.2827f, 21.3572f, 14.8952f)
                lineTo(21.6359f, 12.9579f)
                curveTo(22.0154f, 10.3208f, 22.2051f, 9.0023f, 21.6646f, 7.8749f)
                curveTo(21.1242f, 6.7476f, 19.9738f, 6.0623f, 17.6731f, 4.6918f)
                lineTo(16.2882f, 3.8669f)
                curveTo(14.199f, 2.6223f, 13.1543f, 2.0f, 12.0f, 2.0f)
                curveTo(10.8457f, 2.0f, 9.801f, 2.6223f, 7.7118f, 3.8669f)
                lineTo(6.3269f, 4.6918f)
                curveTo(4.0262f, 6.0623f, 2.8758f, 6.7476f, 2.3354f, 7.8749f)
                close()
                moveTo(12.0f, 18.75f)
                curveTo(11.5858f, 18.75f, 11.25f, 18.4142f, 11.25f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(11.25f, 14.5858f, 11.5858f, 14.25f, 12.0f, 14.25f)
                curveTo(12.4142f, 14.25f, 12.75f, 14.5858f, 12.75f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(12.75f, 18.4142f, 12.4142f, 18.75f, 12.0f, 18.75f)
                close()
            }
        }
            .build()
        return _homeAngle2!!
    }

private var _homeAngle2: ImageVector? = null
