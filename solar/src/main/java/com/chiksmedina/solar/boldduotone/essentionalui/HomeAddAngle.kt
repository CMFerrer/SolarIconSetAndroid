package com.chiksmedina.solar.boldduotone.essentionalui

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
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

public val EssentionalUiGroup.HomeAddAngle: ImageVector
    get() {
        if (_homeAddAngle != null) {
            return _homeAddAngle!!
        }
        _homeAddAngle = Builder(name = "HomeAddAngle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.1061f, 22.0f)
                horizontalLineTo(10.8939f)
                curveTo(7.4474f, 22.0f, 5.7241f, 22.0f, 4.549f, 20.9882f)
                curveTo(3.374f, 19.9764f, 3.1302f, 18.2827f, 2.6428f, 14.8952f)
                lineTo(2.3641f, 12.9579f)
                curveTo(1.9846f, 10.3208f, 1.7949f, 9.0023f, 2.3354f, 7.8749f)
                curveTo(2.8758f, 6.7476f, 4.0262f, 6.0623f, 6.3269f, 4.6918f)
                lineTo(7.7118f, 3.8669f)
                curveTo(9.801f, 2.6223f, 10.8457f, 2.0f, 12.0f, 2.0f)
                curveTo(13.1543f, 2.0f, 14.199f, 2.6223f, 16.2882f, 3.8669f)
                lineTo(17.6731f, 4.6918f)
                curveTo(19.9738f, 6.0623f, 21.1242f, 6.7476f, 21.6646f, 7.8749f)
                curveTo(22.2051f, 9.0023f, 22.0154f, 10.3208f, 21.6359f, 12.9579f)
                lineTo(21.3572f, 14.8952f)
                curveTo(20.8697f, 18.2827f, 20.626f, 19.9764f, 19.451f, 20.9882f)
                curveTo(18.2759f, 22.0f, 16.5526f, 22.0f, 13.1061f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.25f)
                curveTo(12.4142f, 9.25f, 12.75f, 9.5858f, 12.75f, 10.0f)
                verticalLineTo(12.25f)
                lineTo(15.0f, 12.25f)
                curveTo(15.4142f, 12.25f, 15.75f, 12.5858f, 15.75f, 13.0f)
                curveTo(15.75f, 13.4142f, 15.4142f, 13.75f, 15.0f, 13.75f)
                lineTo(12.75f, 13.75f)
                verticalLineTo(16.0f)
                curveTo(12.75f, 16.4142f, 12.4142f, 16.75f, 12.0f, 16.75f)
                curveTo(11.5858f, 16.75f, 11.25f, 16.4142f, 11.25f, 16.0f)
                verticalLineTo(13.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 13.75f, 8.25f, 13.4142f, 8.25f, 13.0f)
                curveTo(8.25f, 12.5858f, 8.5858f, 12.25f, 9.0f, 12.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(10.0f)
                curveTo(11.25f, 9.5858f, 11.5858f, 9.25f, 12.0f, 9.25f)
                close()
            }
        }
        .build()
        return _homeAddAngle!!
    }

private var _homeAddAngle: ImageVector? = null
